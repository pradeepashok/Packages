import java.util.HashSet;
import java.util.Iterator;

class HashSet2{
    public static void main(String args[]){
        //Creating HashSet and adding elements  
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("ram");
        set.add("siva");
        set.add("ramash");
        //Traversing elements  
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        HashSet<String> box1=new HashSet<String>();
        set.add("Keyboard");
        set.add("mouse");
        set.add("monitor");
        set.add("cpu");
        //Traversing elements
        Iterator<String> box2=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

