import java.util.Scanner;
public class Algorithm_1 {
    public static void main (String[] args){
        Scanner read=new Scanner(System.in);
        int numberStart,numberEnd,diference,validateOddOrEven;
        int acumulatorOdd=0,acumulatorEven=0;
        System.out.println("Please enter the number with start: ");
            numberStart=read.nextInt();
        System.out.println("Please enter the number with end: ");
            numberEnd=read.nextInt();
        //Validation if the numbers is positive
        if(numberStart>0 && numberEnd>0) {
            for (int i = numberStart+1; i <= numberEnd-1; i++) {
                if(i%2==0){
                    acumulatorEven+=i;
                }else if(i%2!=0){
                    acumulatorOdd+=i;
                }
            }
                diference=acumulatorOdd-acumulatorEven;
                System.out.printf("suma pares = %d \nsuma inpares = %d \nDiferencia = %d",acumulatorEven,acumulatorOdd,diference);
        }else{
            System.out.println("Please enter the numbers just positive");
        }
    }
}