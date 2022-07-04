import java.util.ArrayList;
import java.util.Scanner;
public class Algorithm_2 {
    public static void main(String[] args){
        int number,suma=0,counter=0;
        Double promedio;
        Scanner read= new Scanner(System.in);
        System.out.println("Please enter the number: ");
        number= read.nextInt();
        while(number>=0){
            suma+=number;
            counter++;
            System.out.println("Please enter the number: ");
            number= read.nextInt();
        }
        promedio= Double.valueOf(suma/counter);
        System.out.printf("El promedio es: %f ",promedio);
        read.close();
    }
}
