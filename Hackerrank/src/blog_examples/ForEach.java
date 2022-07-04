package blog_examples;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args){
        int [] exampleName = new int [] {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(exampleName).forEach(item->{
            System.out.println(item);
        });
    }
}
