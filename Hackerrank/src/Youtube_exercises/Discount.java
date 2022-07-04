package Youtube_exercises;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        double total=0;
        int cantPiezas;
        Scanner read=new Scanner(System.in);
        System.out.println("Digita el número de piezas de pan a comprar: ");
        cantPiezas= read.nextInt();
        if(cantPiezas>50 && cantPiezas<100){
            total=cantPiezas*4.5;
        }else if(cantPiezas>100){
            total=cantPiezas*4;
        }else{
            total=cantPiezas*5;
        }
        System.out.printf("La cantidad de piezas %d y el total a pagar es: $ %f",cantPiezas,total);
    }
}
