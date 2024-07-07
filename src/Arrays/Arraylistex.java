package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistex {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(687);
//        list.add(627);
//        list.add(657);
//        list.add(267);
//        list.add(678);
//        list.add(677);
//        list.add(675);
//
//        System.out.println(list.contains(4587));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(5);
//        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
//        System.out.println(list);
    }
}
