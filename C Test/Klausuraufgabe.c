#include <stdio.h>

int main()
{
    double c=0;
    printf("Umrechnungstabelle:\n");
    while (c<=100)
    {
        printf("%lf Celsius /t %lf Fahrenheit",c,(c*9/5+32));
        c+=10;
    }
}