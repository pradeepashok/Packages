import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEg1 {

    public static void main(String args[]){
        ArrayList box =new ArrayList <> ();//Creating arraylist
        box.add(100);
        box.add(1002);
        box.add(0,200);
        System.out.println(box);

        box.add(3,"bat");

        System.out.println(box);
        box.get(2);
        System.out.println(box.get(2));

        box.clone();
        System.out.println(box.clone());
        box.contains(100);
        System.out.println(box.contains(100));

        ArrayList<String>arrlist = new ArrayList<String>();
        arrlist.add("a");
        arrlist.add("ab");
        arrlist.add("abc");
        arrlist.add("abcd");
        arrlist.add("abcde");
        for (String i:arrlist){
            System.out.println(i);
        }
        System.out.println(arrlist);

        }
    }




