/* Denne opgave er skrevet af Kritoffer Baumgarten. Under Biografi kan man finde hvilken sider jeg er blevet inspireret af. */
// har arbejdet meget ud fra https://brennan.io/2015/01/16/write-a-shell-in-c/

#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>
#include <string.h>

// hvis det er true skal den forsæt
#define TRUE 1

/*Vi gemmer en konstant som vi senere definere hvor stor pladsen skal være for kommandoer,
vi kan give det så meget vi har lyst til men vi vælger et tal som er 2^n da vi er i base 2 system.
*/
#define userCmdSize 128
#define TOKEN_DELIMITER " \t\r\n\a" // bruges til at finde (mellemrum)

// Funktioner Deklaration af shell kommandoer
/* Vi laver disse kommandoer, da de er bygget direkte ind i shell og ikke vil virke ordenligt, hvis vi ikke gør brug af dem. 
   eks. vore "cd" skal gøre brug af "chdir", det kan gør vores shell gør brug af dem med disse metoder */ 

int command_cd(char **args);
int command_help(char **args);
int command_exit(char **args);
int command_pipe(char **input, int inputL);


// ------------------------------------------------------- List af commands -----------------------------------------------------------------------
//List af shell commands, som skal tilføjes.
char *shell_command[] = {
    "cd",
    "help",
    "exit",
    "|"
    };

// ---------------------------------------------- antal af commandoer vi har lavet ------------------------------------------------------------------
// returnere størrelsen af antal af shell kommandoer ovenfor.
int shell_commands_amount()
{
    return sizeof(shell_command) / sizeof(char *);
}

// ------------------------------------------------------ COMMANDO FUNKTIONER ----------------------------------------------------------------------------------------------------------

// -------------------------------------------------------------- cd -------------------------------------------------------------------------------

//cd - betyder change directory.
// vore args[0] er command (her "cd") og args[1] hvilken directory brugeren skriver
// vi returnere 1 hele tide for at vi kan forsætte med vores commandoer!
int command_cd(char **args)
{
    if (args[1] == NULL)
    {
        printf("expected argument to \"cd\"\n");
    }
    else
    {
        if (chdir(args[1]) != 0)
        {
            perror("error");
        }
    }
    return 1;
}

// -------------------------------------------------------------- help -------------------------------------------------------------------------------

//help - printer help.
// Den viser hvilken shell commandoer vi har med.
// -||-
int command_help(char **args)
{
    int i;
    printf("The following are built in:\n");

    for (i = 0; i < shell_commands_amount(); i++)
    {
        printf("  %s\n", shell_command[i]);
    }

    return 1;
}

// -------------------------------------------------------------- exit -------------------------------------------------------------------------------

//Exit - lukker programmet
// Vi returnere 0 for at lukke programmet
int command_exit(char **args)
{
    return 0;
}

// -------------------------------------------------------------- pipe -------------------------------------------------------------------------------

//check if input contains a '|' symbol, runs in O(n)
int is_pipe(char **input, int inputL)
{
    for (int i = 0; i < inputL; i++)
    {
        if (strstr(input[i], "|") != NULL)
        {
            return 1;
        }
    }
    return 0;
}

//takes a user input and its length
//creates a process, a pipe and create a unidirectional pipe, copying the value of STDOUT_FILENO into pipe.
int command_pipe(char **input, int inputL)
{
    pid_t pid;
    //pipe has 2 ends, 0 is read, 1 is write
    int fd[2];
    int READ_END = 0;
    int WRITE_END = 1;
    //make a pipe from fd
    pipe(fd);
    int pipeidx = 0;
    //find words of left and right pipe
    char **leftside = next_pipe(input, &pipeidx, inputL);
    char **rightside = next_pipe(input, &pipeidx, inputL);

    //start a proces
    pid = fork();

    if (pid == 0) //child 
    {
        printf("here");
        //copy value of fd[WRITE_END] into stdout
        dup2(fd[WRITE_END], STDOUT_FILENO);
        //close ends
        close(fd[WRITE_END]);
        close(fd[READ_END]);
        //call a new process that replaces the current one
        //leftside[0] will be cmd to be executed to leftside of "|"
        execvp(leftside[0], leftside);
        //exit the current progress, made from execvp
        exit(1);
    }
    else //parent
    {   
        //make a new progress
        pid = fork();
        if (pid == 0) //second child of fork
        {
            //copy value of fd[READ_END] into stdin
            dup2(fd[READ_END], STDIN_FILENO);
            //rightside[0] is the cmd of left side of pipe
            execvp(rightside[0], rightside);
            //exit the current progress, made from execvp
            exit(1);
        }
    }
    //reset left and rightside
    free(leftside);
    free(rightside);
    return 0; 
}


// ------------------------------------------------ funktionerne til commandoerne --------------------------------------------------------------------
//Listen af til de funktioner som er til kommandoerne.
int (*shell_cmd_functions[])(char **) = {
    &command_cd,
    &command_help,
    &command_exit,
    &command_pipe
    };



// ----------------------------------------------------- TERMINAL FUNKTIONER --------------------------------------------------------------------------

// --------------------------------------------------------- type_prompt -----------------------------------------------------------------------------

// det er vores "promp". Når den køre første gang clear den alt tekst fra den man har skrevet før også skriver den $
void type_prompt()
{
    static int first_time = 1;
    if (first_time)
    {
        const char *CLEAR_SCREEN_ANSI = " \e[1;1H\e[2J ";
        write(STDOUT_FILENO, CLEAR_SCREEN_ANSI, 12);
        first_time = 0;
    }
    printf("\n$ ");
}

// ---------------------------------------------------------- read_line ----------------------------------------------------------------------------
//Denne metode læser vi fra stdin (bruger input fra keyboardet)
char *read_line(void)
{

    //Declare variables
    int buffersize = userCmdSize;
    int position = 0;
    // Vi allokere plas i memory og vores *buffer er pointeren til vores memory.
    char *buffer = malloc(sizeof(char) * buffersize);
    int c;

    if (!buffer)
    {
        // hvis det ikke var muligt at alokere plas i memorien, så vi printer meddelsen under.
        printf("allocation error\n");
        exit(EXIT_FAILURE);
    }

    // fgets tager det givende indput (som vil være en brugers kommando) og gemme det i cmdUserHolder.
    // Vi sætter den til at stoppe med at læse inputet ved 128 bytes aka. userCmdSize.
    // hvis den er null skal den break
    if (fgets(buffer, userCmdSize, stdin) == NULL)
    {
        printf("error in reading input\n");
        perror("err");

    }
}
// --------------------------------------------------------- split_line ---------------------------------------------------------------------------

// denne metode deler vi vores string i read_command ind i tokens, så vi kan se command og parameteren.
char **split_line(char *line)
{
    //Deklarer variablerne
    int buffersize = userCmdSize, position = 0;
    char **tokens = malloc(buffersize * sizeof(char *)); //Alokere memory til tokens
    char *token;

    if (!tokens)
    {
        printf("allocation error for tokens\n"); //Print error hvis den ikke kan alokere memory
        exit(EXIT_FAILURE);
    }

    // nu splittes vores linje op fra read_command og lagt in i array af argumenter.
    // vores TOKEN_DELIMITER tager " " (mellemrum) og deler dem op for det
    token = strtok(line, TOKEN_DELIMITER);
    while (token != NULL)
    {
        tokens[position] = token;
        position++;

        // her reallocater vi arrayen af pointers hvis det bliver nødvendigt.
        // dette bliver ved indtil der ikke er flere tokens, hvor vi så null-terminater listen med tokens
        token = strtok(NULL, TOKEN_DELIMITER);
    }
    tokens[position] = NULL;
    return tokens;
}

// ----------------------------------------------------------- launch ---------------------------------------------------------------------------

int launch(char **args)
{

    //Deklarer variable
    pid_t pid, wpid; // pid_t er en data type som står for "process identification" og bruges til at representere processenes id'er
    int status;

    // Fork() er en system call som laver en ny processer af parenten som kaldes child process, som løber "langs" med parenten.
    pid = fork();

    //-1: problemer ved at lave en child af parent.
    // 0: returnere den nye created child process.
    // positiv værdi: returner parents ID.

   
    if (pid == 0)
    {
        printf("we're in the child process. PID = %d\n", getpid());
        if (execvp(args[0], args) == -1){
        perror("err");
     }
    exit(EXIT_FAILURE);
    }
    else if (pid == -1){
    perror("fork failed");
    } else{
        printf("We are in the parent process. PID = %d\n", getpid());
        int status;
        //We use waitpid() for at vente på at processen ændre sig   
        (void)waitpid(pid, &status, 0);
    }
    return 1;
}

// ----------------------------------------------------------- execute ---------------------------------------------------------------------------

int execute(char **args)
{
    //Declare variables
    int i;

    // først sikre vi os at der er en commando
    if (args[0] == NULL)
    {

        return 1;
    }

    // i Dette loop tjekker vi længden af vores kommandoer (under shell_commands_amount)
    for (i = 0; i < shell_commands_amount(); i++)
    {
        // vi går gennem vores shell kommandoer og tjekker om det, brugeren har skrevet passer til dem der står i vores shell_command
        if (strcmp(args[0], shell_command[i]) == 0)
        {
            return (*shell_cmd_functions[i])(args);
        }
    }

    // vi giver vores info videre til launch_command, nu hvor vi ved at args er en kommando som vi har indbygget
    return launch(args);
}

// ------------------------------------------------------------ loop ----------------------------------------------------------------------------
/* Loop er her hvor vi sætter den til at køre i ring, indtil du skriver exit, så stopper programmet. */
void loop(void)
{

    // vi deklarere nogen variable
    char *line;
    char **args;
    int status = 1 ;
    
    
    do
    {
        type_prompt();           // Her sætter vi en prompt op.
        line = read_line();      // her læser vi indput fra brugeren.
        args = split_line(line); // her splitter vi vores commando ind til commando og parameter
        status = execute(args);  // Her vil vi execute commandoen.

        free(line);   // her free vi memory for cmdUserHolder
        free(args);   // her free vi momory for args
    } while (status); // her får vi en variable til at bestemme hvornår loopen skal slutte, (når exit, bliver skrevet)
}

// ------------------------------------------------------------ Main ----------------------------------------------------------------------------
int main(int argc, char **argv)
{

    printf("made by Kristoffer Baumgarten - s180500");

    loop();

    return EXIT_SUCCESS;
}