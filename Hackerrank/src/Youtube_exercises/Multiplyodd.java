package Youtube_exercises;

public class Multiplyodd {
    public static void main(String[] args){
        long acumulator=1;
        for(int i=1;i<=19;i+=2){
            acumulator*=i;
        }
        System.out.printf("Acumulator: %d",acumulator);
    }
}
