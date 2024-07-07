package Methods;

public class Scoping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="Sagnik";

        {
            a=100;
            int c=99;
            name="Hore";
            //values initialised in this block remains in block
        }
        int c=990;
        System.out.println(a);
        System.out.print(name);
    }

    static void random(){
        int num=67;
        System.out.println(num);
    }
}
