import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativo{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        int n,cont;
    cont = 0;
    
    System.out.printf("Quantos a ordem da matriz: ");
    n = sc.nextInt();
    
    int [][] mat = new int [n][n];
    
    for(int i = 0; i < n; i++){
        for( int j= 0; j < n; j++){
        System.out.println("Elemento" + "[" + i  + "," + j +"]" + ":" );
        mat[i][j]=sc.nextInt();
        if (mat [i][j] < 0){
            cont ++ ;
        }
        }
    }
    
    System.out.println("Diagonal principal :");

    for( int i = 0; i < n; i++){
        System.out.println(mat [i][i] +" ");
    }

    System.out.println();
    System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

    sc.close();
    }
}