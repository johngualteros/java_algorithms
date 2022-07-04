package Youtube_exercises;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMax {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int[] numbers= new int[5];
        int mayor=numbers[0];
        for(int i =0;i< numbers.length;i++) {
            System.out.println("Digite el numero: ");
            numbers[i] = read.nextInt();
            if (numbers[i] > mayor) {
                mayor=numbers[i];
            }
        }
        System.out.println("El numero mayor es: "+mayor);
    }
}
