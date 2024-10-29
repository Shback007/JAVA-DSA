package Accenture;

import java.util.*;

public class DectoBase {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int num = sc.nextInt ();
        System.out.println (dectoNBase (n, num));
    }
    static String dectoNBase(int n,int num){
        String res="";
        int quoitent = num/n;
        ArrayList<Integer> rem = new ArrayList<>();
        rem.add(num%n);
        while(quoitent !=0){
            rem.add(quoitent %n );
            quoitent=quoitent/n;
        }
        for(int i=0;i<rem.size();i++){
            if(rem.get(i)>9){
                res = (char)(rem.get(i)-9+64)+res;
            }else{
                res = rem.get(i)+res;
            }
        }
        return res;
    }
}
