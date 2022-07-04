import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
            Scanner read=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String word=read.next();
                int x=read.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", word,x);
            }
            read.close();
            System.out.println("================================");

    }
}



