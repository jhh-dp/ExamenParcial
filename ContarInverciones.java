import java.util.Scanner;

public class ContarInverciones{

    static int contar(int num[],int inicio,int fin){

        if(inicio>=fin){
            return 0;
        }

        int mitad=(inicio+fin)/2;
        int izq=contar(num,inicio,mitad);
        int der=contar(num,mitad+1,fin);
        int inv=izq+der;

        for(int i=inicio;i<=mitad;i++){
            for(int j=mitad+1;j<=fin;j++){

                if(num[i]>num[j]){
                    inv++;
                }
            }
        }
        return inv;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
	System.out.println("ingrese cantidad del arreglo: ");

        int cant=sc.nextInt();
        int num[]=new int[cant];

        for(int i=0;i<cant;i++){
	    System.out.println("ingrese numero: "+(i+1));
            num[i]=sc.nextInt();
        }
        System.out.println("Inversiones: "+contar(num,0,cant-1));
    }
}