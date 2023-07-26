import java.util.Locale;
import java.util.Scanner;

public class retangulo{
public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
    double area,perimetro,diagonal,base,altura;

    System.out.println ("Base do retangulo:");
    base = sc.nextDouble();
    System.out.println("Altura do retangulo:");
    altura = sc.nextDouble();

    area = (Double)base * altura;
    perimetro = (Double)(2*base)+(2*altura);
    diagonal=Math.sqrt((Math.pow(base,2.0) + Math.pow(altura,2.0)));

    System.out.println("AREA: " + String.format ("%.2f", area));
    System.out.println("PERIMETRO:" + String.format ("%.2f", perimetro) );
    System.out.println("DIAGONAL: " + String.format ("%.2f", diagonal));

    sc.close();

    }
}