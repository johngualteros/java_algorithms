package Youtube_exercises;
import java.util.Scanner;
public class ArrayInvert {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int[] numbers= new int[5];
        for(int i =0;i< numbers.length;i++) {
            System.out.println("Digite el numero: ");
            numbers[i] = read.nextInt();
        }
        for(int j=numbers.length-1;j>=0;j--) {
            System.out.print(""+numbers[j]);
        }
    }
}
