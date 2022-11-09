import java.util.Scanner;

public class BMExercicio03{
    public static void main(String[] args){
        Scanner lerNotas = new Scanner(System.in);

        float[] notas = new float[10];
        int tamArray = notas.length;
        float aux = 0;
        int notasAltas = 0;
        int notasBaixas = 0;

        for(int i = 0; i < tamArray; i++){
            System.out.printf("Insira a nota do aluno %d: ", (i+1));
            notas[i] = lerNotas.nextInt();
            aux = aux + notas[i];
        }

        float media = aux/tamArray;

        for(int j = 0; j < tamArray; j++){
            if(notas[j] > media){
                notasAltas += 1;
            } else if(notas[j] < media){
                notasBaixas += 1;
            }
        }

        System.out.println("\nQuantidade de notas acima da média: " + notasAltas);
        System.out.println("Quantidade de notas abaixo da média: " + notasBaixas);
    }
}