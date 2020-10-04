SELVE PROGRAMMET/PROGRAM ENVIRONMENT: 
Har lavet programmet på windows 10 bærbar i visual studio code kørende WSL: Ubuntu

I have programmed in Windows 10, Visual studio running WSL: Ubuntu

KØR PROGRAMMET/ hOW TO RUN THE CODE:
Før at køre pogrammet følg disse indstruktioner:
1. Når du har hente zip-filen, være sikker i terminalen du står på dens path.
2. skriv: " gcc -o shell mandatory.c " i terminalen 
3. skriv: " ./shell " for at køre programmet. 

nu kan du gøre brug af shell.

Follow these intructions to run the program:
1. chose the path you're on when you have downloaded the zip-file
2. write: "gcc -o shell mandatory.c " in the terminal
3. Write: "./shell" to run the program.

Now you can use the shell.

COMMANDOER/COMMANDS:
Der er blevet lavet disse kommandoer: 

cd - betyder change directory. Her skriver du: "cd {ønskende directory}" og du rykker dig derover
cd .. - bevæger dig en directory tilbage. 
Help - help indeholder de kommandoer der er 
exit - stopper programmet.
ls - give en liste af filer i den givende directory du befinder dig i

cd -  change directory. Write cd and the directory you want to go to.
cd .. - go a directory back.
Help - help includes all commands
exit - stop the program.
ls - gives a list of files in the directory you're on.


KONCEPTET AF SYSTEMCALL:

et system call er en programmatisk måde at få computeren til at lave et request en services fra kernel af en OS den er blevet executed på. System Calls er måden at interact med OS på. Computeren laver et system call når den laver et request til OS kernel. System calls er den eneste måde at komme ind til kernel systemet. All programmer som skal bruge ressources skal bruge System Calls


a system call is the programmatic way in which a computer program requests a service from the kernel of the operating system it is executed on. A system call is a way for programs to interact with the operating system. A computer program makes a system call when it makes a request to the operating system’s kernel. System calls are the only entry points into the kernel system. All programs needing resources must use system calls.


I/O REDIRECTION:

C giver muligheden for "stdin" og "stdout". Vi gør brug af Printf(). Jeg  har lavet det sådan at brugeren skriver på noget i terminalen, ved hjælp af "stdin" tager vi det indput.
Deler sætningen op (fjerner mellemrum) og gør det nemmere at producere til metoder hvorpå vi så kan printf()/vise det som brugeren ber om. 

C provides some opportunities such as "stdin" or "stdout". We use Printf(). I have made is, such as a user writes in the terminal and the "stdin" helps to take the input. 
it seperate the line (removes (whitespaces) and make it easier to compute in the methodes. Where we can printf() the output. 
