package mathematics;
import java.util.*;
public class Factrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res= fact(n);
        System.out.print(res);

    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
