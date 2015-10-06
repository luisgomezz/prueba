# prueba
#include <stdio.h>
#include <string.h>
 
int main()
{
    char pal[20];
    int i, j;
    int palindromo = 1;
    printf("Escribe la palabra: ");
    fflush(stdout);
    gets(pal);
    j=strlen(pal)-1;
    for(i=0; i<strlen(pal)/2; i++, j--) {
        printf("Comprobando %c==%c\n", *(pal+i), *(pal+j));
        if (*(pal+i)!=*(pal+j)) {
            palindromo = 0;
            break;
        }
    }
    if (palindromo)
        printf("\nLa palabra es  un palíndrimo.\n");
    else
        printf("\nLa palabra no es un palíndrimo.\n");
 
    return (0);
}

