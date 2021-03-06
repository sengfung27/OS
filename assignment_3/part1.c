#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <wait.h>

int main(int argc, char **argv)
{
    int child = fork();
    int pid;
    int status;
    if (child == 0)
    {
        printf("I am child, my pid is %d\n", getpid());
        execl("/bin/date", "/bin/date", NULL);
    }
    else
    {
        printf("I am the parent, my pid is: %d\n", getpid());
        while ((pid = waitpid(-1, &status, 0)) != -1)
        {
            printf("I am the parent, my child with pid: %d has terminated.\n", pid);
        }
    }
}