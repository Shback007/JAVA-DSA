package Accenture;

public class GetCarry {
    public static void main(String[] args) {
        System.out.println(numberOfCaries(451,349));
    }
    static int numberOfCaries(int num1,int num2){
        int count=0;
        int carry = 0;
        while(num1 >0 && num2 >0){
            int digit1=num1%10;
            int digit2 = num2%10;

            int sum = digit1+digit2+carry;
            if(sum >9){
                carry =1;
                count++;
            }
            else{
                carry=0;
            }
            num1/=10;
            num2/=10;
        }
        return count;
    }
}
