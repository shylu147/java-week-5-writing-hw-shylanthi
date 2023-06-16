import java.util.ArrayList;
import java.util.Scanner;

/**Write a Java program to retrieve an element (at a specified index) from a given array list
 *
 */

public class Programme_6_RetrieveArrayListAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList=new ArrayList<>();
        vegetableList.add("Potato");
        vegetableList.add("Tomaato");
        vegetableList.add("Carrot");
        vegetableList.add("Okra");
        vegetableList.add("Leeks");
        vegetableList.add("Cabbage");
        vegetableList.add("Onion");
        System.out.println(vegetableList);
        Scanner s= new Scanner(System.in);
        System.out.println(" Please enter an index number : ");
        int index= s.nextInt();
        if(index<vegetableList.size()){
            System.out.println(vegetableList.get(index));
        }else {
            System.out.println("Invalid index!!");
    }
        s.close();


}}
