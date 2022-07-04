package Youtube_exercises;
//calification 9 to 10 excelent
import java.util.Scanner;
public class Calification {
    public static void main(String[] args) throws Exception {
        Scanner read=new Scanner(System.in);
        int aprobated=0;
        int reprobated=0;
        int excelent=0;

        for (int i=0;i<6;i++){
            System.out.println("Please enter The Note: ");
            int note=read.nextInt();
            if(note>=9 && note<=10){
                excelent++;
            }else if(note>=7 && note<9){
                aprobated++;
            }else if(note<7 && note>=0){
                reprobated++;
            }else{
                System.out.println("The note not is valid");
            }
        }
        System.out.printf("The total notes excelent are %d\n The total notes aprobated are %d\n the total notes reprobated are %d",excelent,aprobated,reprobated);
    }
}
