package blog_examples;

public class ForArray {
    public static void main(String[] args){
        int [] exampleName = new int [] {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < exampleName.length; i++) {
            System.out.printf("index : %d [%d] \n",i, exampleName[i]);
//Or more Sample
            System.out.println(exampleName [i]);
        }
    }
}