package mathematics;
import java.util.*;
public class sumOfnNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //recursion formula
        //int result = n(n-1)/2;
        //using a loop
        int result = 0;
        for(int i=1; i<=n;i++){
            result = result+ i;
        }
        System.out.println(result);
    }
}
