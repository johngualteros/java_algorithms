import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_3 {
    public static void main(String[] args){
        int [] container= new int[5];
        int number;
        Scanner read = new Scanner(System.in);
        for(int i=0;i<container.length;i++) {
            System.out.println("Please enter the number: ");
            container[i] = read.nextInt();
        }
        Arrays.stream(container).forEach(item-> {
                System.out.print("["+item+"],");
        });
    }
}
