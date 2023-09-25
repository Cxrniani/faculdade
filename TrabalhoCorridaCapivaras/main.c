#include <stdio.h>
#include <stdlib.h>

/* Armazena informações de uma capivara */
typedef struct
{
    int numero;    /* Número da capivara = posição na largada */
    int ultrapass; /* Quantidade de ultrapassagens feitas */
} capivara;

int main()
{
    int quantidadeCapivaras = 0, numCapivara = 0;

    
    scanf("%d", &quantidadeCapivaras); // lenght do vetor de capivaras;
    // instânciando um vetor de capivaras através do struct;
    capivara capi[quantidadeCapivaras];
    capivara aux[quantidadeCapivaras];
    // criando um fim para o meu vetor;
    capi[0].numero = -1;

    for (int i = 1; i <= quantidadeCapivaras; capi[i].numero = i, i++)
        ; // colocando números de 1 a N para as capivarinhas;
    for (int i = 1; i <= quantidadeCapivaras; capi[i].ultrapass = 0, i++)
        ; // inicializando valores para a variavel "ultrapass" das capivarinhas;

    while (scanf("%d", &numCapivara) != EOF) // lendo ultrapassagens das capivas até o EOF;
    {
        for (int i = 1; i <= quantidadeCapivaras; i++)
        {
            if (numCapivara == capi[i].numero)
            {
                if (capi[i - 1].numero == -1)
                {
                    break;
                }
                else
                {
                    capi[i].ultrapass++;
                    // trocando as capivas de lugar com base na ordem de chegada utilizando um selection sort;
                    aux[i] = capi[i];
                    capi[i] = capi[i - 1];
                    capi[i - 1] = aux[i];
                }
            }
        }
    }

    for (int i = 1; i < quantidadeCapivaras + 1; printf("%d ", capi[i].numero), i++)
        ;
    printf("\n");

    for (int i = 1; i <= quantidadeCapivaras; i++)
    {
        for (int j = i + 1; j <= quantidadeCapivaras; j++)
        {
            if (capi[i].ultrapass > capi[j].ultrapass || // critério de pontuação padrão;
                (capi[i].ultrapass == capi[j].ultrapass && capi[i].numero < capi[j].numero)) // critério de desempate;
            {
                // trocando as capivas de lugar com base na ordem por pontuação, através da capi[i].ultrapass++;
                aux[i] = capi[i];
                capi[i] = capi[j];
                capi[j] = aux[i];
            }
        }
    }

    for (int i = 1; i <= quantidadeCapivaras; printf("%d ", capi[quantidadeCapivaras + 1 - i].numero), i++)
        ;

    return 0;
}