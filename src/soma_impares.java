import java.util.Locale;
import java.util.Scanner;

public class soma_impares{
     
public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
        
    int numero, soma;
    soma=0;

    do{
    System.out.printf("Digite um numero: ");
    numero = sc.nextInt();
    if(numero%2 != 0){
        soma = numero + numero;
    }
    }while(numero%2 != 0);
    System.out.println("Soma dos numeros imapares: " + soma);
    System.out.println();

    sc.close();
    }
}