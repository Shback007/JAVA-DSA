package conditions_and_loops;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int salary= in.nextInt();
        if( salary > 20000 )
            salary=salary+2000;
        else salary =salary+1000;
        System.out.println(salary);
    }
}
