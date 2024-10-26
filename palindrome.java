package mathematics;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        int rev=0;
        int c;
        while(n!=0){
            c=n%10;
            rev=rev*10+c;
            n=n/10;
        }
        if(num==rev){
            System.err.print("Is palindrome");
        }
        else
            System.out.print("false");
    }
    
}
