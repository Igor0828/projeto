import java.util.Locale;
import java.util.Scanner;

public class soma_vetor{    
public static void main(String[] args){
    
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
    
int N, i,soma=0;
float media;
    
    System.out.printf("Quantos numeros voce vai digitar? ");
    N = sc.nextInt();

    double[] vet = new double [N];

    for (i = 0; i < N; i++) {
    System.out.printf("Digite um numero: ");
    vet[i] = sc.nextDouble();
    }
    System.out.println("NUMEROS DO VETOR: ");
    for (i = 0; i < N; i++) {
        System.out.println(vet[i]);   
    }
    System.out.printf("SOMA VETOR: ");
    for (i = 0; i < N; i++) {
        soma += (vet[i]);
    }
    
    System.out.println(soma );
    media = soma /N;
    System.out.printf("MEDIA VETOR:");
    System.out.println(media);

    sc.close();
    }
}