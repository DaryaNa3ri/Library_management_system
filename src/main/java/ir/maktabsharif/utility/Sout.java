package ir.maktabsharif.utility;

import java.util.List;

public class Sout {
    public static void print(String message){
        System.out.println(message);
    }

    public static void printList(List list){
        for(Object o : list){
            print(o.toString());
        }
    }
}
