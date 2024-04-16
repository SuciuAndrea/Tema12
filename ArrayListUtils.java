import java.util.ArrayList;

public class ArrayListUtils {
    
    public static void swapFirstLast(ArrayList<String> list) {
        if (list.size() > 1) { 
            String first = list.get(0); 
            String last = list.get(list.size() - 1); 
            
           
            list.set(0, last); 
            list.set(list.size() - 1, first); 
        }
    }

    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        swapFirstLast(list1);
        System.out.println(list1); 
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        swapFirstLast(list2);
        
        ArrayList<String> list3 = new ArrayList<>();
        swapFirstLast(list3);
        System.out.println(list3); 
    }
}
