package Youtube_exercises;
import java.util.Scanner;
public class EstudentNote {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int numberStudent,noteStudent,count=1;
        for (int i = 0; i <5;i++){
            System.out.printf("Please enter the number of student %d: ",(count+i));
            numberStudent = reader.nextInt();
            System.out.printf("Please enter the note of student %d: ",numberStudent);
            noteStudent = reader.nextInt();
            if(noteStudent>6){
                System.out.printf("The student %d is aprobed \n",numberStudent);
            }else{
                System.out.printf("The student %d is reprobated \n",numberStudent);
            }
        }
    }
}
