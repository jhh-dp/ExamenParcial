import java.util.Scanner;

public class ArregloOrdenado {

    static void ordenado(int[] a, int i){

        // si esta en orden
        if(i == a.length-1){
            System.out.println("true");
            return;
        }
        // Si esta desordenado
        if(a[i] > a[i+1]){
            System.out.println("false");
            return;
        }
        ordenado(a, i+1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
	System.out.println("ingrese cuantos elementos en lista:");

        int n = sc.nextInt();

        int[] a = new int[n];
	
        for(int i=0;i<n;i++){
	    System.out.println("ingrese elemento :"+ (i+1));
            a[i]=sc.nextInt();
        }

        ordenado(a,0);
    }
}