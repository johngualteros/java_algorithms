package Youtube_exercises;
import java.util.Scanner;
public class SueldoMax {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int max=0;
        int salary,count;
        System.out.println("Please enter the quantity for register salary's: ");
        count=reader.nextInt();
        for (int i=0;i<count;i++){
            System.out.println("Please enter the salary: ");
            salary=reader.nextInt();

            if(salary>max) {
                max = salary;
            }
        }
        System.out.printf("The Salary more expensive is %d",max);
    }
}
