package Youtube_exercises;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int number, acumulator=0;
        Scanner read=new Scanner(System.in);
        do{
            System.out.println("Please enter a number: ");
            number=read.nextInt();
            acumulator+=number;
        }while(number!=0);
        System.out.printf("The sum of numbers is: %d",acumulator);
    }
}
