package Youtube_exercises;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args){
        int number,count=0,acumulator=0;
        double promedio;
        Scanner read= new Scanner(System.in);
        do{
            System.out.println("Please enter a number");
            number=read.nextInt();
            if(number>0){
                count++;
                acumulator+=number;
            }
        }while(number>0);
        promedio=acumulator/count;
        System.out.printf("El contador es: %d el acumulador es: %d promedio es: %f",count,acumulator,promedio);
    }
}
