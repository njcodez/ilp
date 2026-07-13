import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){

    }
    public static boolean isArmstrong(int num){
        int og = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num>0){
            int rem = num%10;
            sum += Math.pow(rem,digits);
            num /= 10;
        }
        return sum == og;

    }
}