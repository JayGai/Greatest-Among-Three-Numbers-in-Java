import java.util.*;

public class Main{
    public static int jay(int a[]){
        int k = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            if(k< a[i]){
                k = a[i];
            }
        }
        return k;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int [3];
        System.out.print("First Number = ");
        a[0] = sc.nextInt();
        System.out.print("Second Number = ");
        a[1] = sc.nextInt();
        System.out.print("Thrid Number = ");
        a[2] = sc.nextInt();
        System.out.println("Greatest Number is = " + jay(a));
    }
}
        
   