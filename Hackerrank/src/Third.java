import java.util.Scanner;

public class Third {
    public static void main(String[] args) throws Exception {
    Scanner read= new Scanner(System.in);
    int N = read.nextInt();
        for(int i=0;i<=10;i++){
            System.out.printf("%d x %d = %d\n",N,i,N*i);
        }
    read.close();
    }
}
