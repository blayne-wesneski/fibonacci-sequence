#include <stdio.h>
#include <gmp.h>

int sequence(int num);

int main()
{
    // declare variable
    int num;

    // get user input
    printf("Please enter how many times you would like to run the sequence\n");
    scanf("%d", &num);

    // call sequence function
    sequence(num);

    // terminate program
    return 0;
}

int sequence(int num)
{
    // declare variables
    mpz_t n1, n2, n3;

    // initialize gmp variables
    mpz_init(n1);
    mpz_init(n2);
    mpz_init(n3);

    // set n1 and n2 to 0 and 1 respectively
    mpz_set_ui(n1, 0);
    mpz_set_ui(n2, 1);

    // loop through the sequence
    for (int i = 1; i < num + 1; i++)
    {
        // add n1 and n2 and store in n3
        mpz_add(n3, n1, n2);
        mpz_set(n1, n2);
        mpz_set(n2, n3);

        // print the result
        if (mpz_cmp_ui(n3, 1000000000) > 0)
        {
            gmp_printf("%d. %.6e\n", i, mpz_get_d(n3));
        }
        else
        {
            gmp_printf("%d. %Zd\n", i, n3);
        }
    }
    // clear variables
    mpz_clear(n1);
    mpz_clear(n2);
    mpz_clear(n3);
}
