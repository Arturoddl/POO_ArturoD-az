
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arturo Díaz de León
 */

public class Lista {
    
    public static void main(String[] args){
    ArrayList<String> al = new ArrayList<>();
    al.add("Arturo");
    al.add("Yes");
    al.add("OlaCrayola");
    al.add("1");
    al.add("2");
    al.add("3");
    al.add(0, "Jeje");
    al.size();
    al.get(3);
    al.contains("No");
    al.remove("Yes");
    
    Iterator<String> itl = al.iterator();
    while(itl.hasNext()){
        String elemento = itl.next();
        System.out.println(elemento+"-");
    }
    
    LinkedList<String> ll = new LinkedList<>();
    ll.add("1");
    ll.add("2");
    ll.add("0");
    ll.add("4");
    ll.add(2,"3");
    ll.add("5");
    ll.add("3");
    ll.remove("3");
    System.out.println("Linked list: "+ ll);
}

}
