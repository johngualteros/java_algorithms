import java.utils.ArrayList;

public class Sixteen{

    public static int getAmountOfDifferents(ArrayList<Integer> list){
        ArrayList<Integer> resList = new ArrayList<>();
        for(Integer number : list){
            if (!resList.contains(number)) resList.add(number);
        }
        return resList.size();
    }

    //or
    
    public static int getAmountOfDifferentsSecondForm(ArrayList<Integer> list){
        return new HashSet<Integer>(list).size();
    }

    public static void main(String[] args){
        System.out.println("Hello world");
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(1);

        System.out.println(getAmountOfDifferents(testList));
        System.out.println(getAmountOfDifferentsSecondForm(testList);
    }
}
