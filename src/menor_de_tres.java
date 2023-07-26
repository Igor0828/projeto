import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres{

public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    float x1,x2,x3;

    System.out.println("Primeiro valor: ");
    x1 = sc.nextFloat();
    System.out.println("Segundo valor: ");
    x2 = sc.nextFloat();
    System.out.println("Terceiro valor: ");
    x3 = sc.nextFloat();

    System.out.println("Maoir valor:");
    if (x1 > x2){
        System.out.println(x1);   
    }else{
        System.out.println(x2); 
       if(x2<x3)
        System.out.println(x3);

        sc.close();

    }
}
}