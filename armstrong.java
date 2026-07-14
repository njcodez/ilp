import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        if (isArmstrong(num)){
            System.out.println(num+" is an Armstrong number");
        }
        else{
System.out.println(num+" is not an Armstrong number");
        }
        sc.close();

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