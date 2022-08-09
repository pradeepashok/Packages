import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {

        ArrayList <Integer> box = new ArrayList <Integer> ();



        for (int i=0 ; i<=10; i++){
            box.add(i);

        }
        System.out.println(box);


        ArrayList box1 = new ArrayList<>();
        box1.add("billa");
        box1.add(10);
        box1.add(2,500);
        box1.add('c');
        box1.add(false);

        System.out.println(box1.get(1));



        for (int j=0; j<=10;j++){
            box1.add(j);
        }
        System.out.println(box1);

        Iterator <Integer> i= box1.iterator();
        System.out.println(i.next());

    }
}
