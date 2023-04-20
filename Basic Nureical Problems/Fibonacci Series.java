import java.util.*;

class Test {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series: 0 1 ");
        int a=0,b=1;
        for(int i=2;i<n;i++){
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
        sc.close();
    }
}
