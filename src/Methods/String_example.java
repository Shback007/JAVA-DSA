package Methods;

public class String_example {

    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);

        String personalised =myGreet("Sagnik Hore");
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message="Hello "+ name;
        return message;
    }

//    static String greet(){
//        String greeting="How are you";
//        return greeting;
//    }
}
