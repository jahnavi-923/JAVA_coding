package mathematics;
import java.util.*;
public class lcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();
        System.out.println("LCM of a and b is : " + lcm(a,b));
    }
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
