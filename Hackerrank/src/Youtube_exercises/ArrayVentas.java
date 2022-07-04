package Youtube_exercises;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
public class ArrayVentas{
    public static void main(String[] args){
        double[] ventas= new double[5];
        AtomicInteger count= new AtomicInteger();
        Scanner read= new Scanner(System.in);
        for(int i =0;i< ventas.length;i++) {
            System.out.println("Ingrese las ventas de cada dia");
            ventas[i] = read.nextDouble();
        }
            System.out.println("Las ventas mayores a 2000 son:");
        Arrays.stream(ventas).forEach(item->{
            if(item>=2000) {
                System.out.println(item);
                count.getAndIncrement();
            }
        });
        System.out.print("El total es: "+count);
    }
}
