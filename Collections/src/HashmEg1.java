
import java.util.*;
public class HashmEg1 {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"car");  //Put elements in Map
        map.put(2,"bus");
        map.put(3,"van");
        map.put(1,"bike"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> a1 =new HashMap<Integer,String>();
        System.out.println("Initial list of elements: "+a1);
        a1.put(100,"raj");
        a1.put(101,"Vijay");
        a1.put(102,"ram");

        System.out.println("After invoking put() method ");


    }
}