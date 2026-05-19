import java.util.Scanner;

public class SegundoNumGrande {

    static int mayor(int num[], int inicio, int fin){

        if(inicio == fin){
            return num[inicio];
        }

        int mitad = (inicio + fin)/2;
        int mayorIzq = mayor(num, inicio, mitad);
        int mayorDer = mayor(num, mitad+1, fin);

        if(mayorIzq > mayorDer){
            return mayorIzq;
        }
        return mayorDer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad del arreglo:");
        int cant = sc.nextInt();
        int num[] = new int[cant];

        for(int i=0; i<cant; i++){
            System.out.println("Ingrese valor "+(i+1)+":");
            num[i] = sc.nextInt();
        }
	int numMayor = mayor(num,0,cant-1);
	int segundoMayor = num[0];

        if(segundoMayor == numMayor){
            segundoMayor = num[1];
        }
	for(int i=0;i<cant;i++){

            if(num[i] != numMayor &&
               num[i] > segundoMayor){

                segundoMayor = num[i];
            }
        }
	System.out.println(
        "Segundo numero mayor: "+segundoMayor);
    }
}