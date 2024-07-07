package Methods;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Sagnik Hore");
        fun(3);
        fun("Sagnik");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
