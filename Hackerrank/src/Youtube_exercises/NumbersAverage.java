package Youtube_exercises;
import java.util.Scanner;
public class NumbersAverage {
    public static void main(String[] arg){
        Scanner read=new Scanner(System.in);
        int number;
        int positiveCount=0, negativeCount=0,positiveAcumulator=0,negativeAcumulator=0,countZero=0;
        int averageOdd,averageEven;
        for(int i=0;i<6;i++){
            System.out.println("Please enter the number: ");
            number= read.nextInt();
            if(number<0){
                negativeCount++;
                negativeAcumulator+=number;
            } else if (number==0){countZero++;}
            else if (number>0) {
                positiveCount++;
                positiveAcumulator+=number;
            }
        }
        System.out.printf("the average for negative numbers is = %d\n",negativeAcumulator/negativeCount);
        System.out.printf("the count of numbers zero is = %d\n",countZero);
        System.out.printf("the average for positive numbers is = %d\n",positiveAcumulator/positiveCount);
    }
}
