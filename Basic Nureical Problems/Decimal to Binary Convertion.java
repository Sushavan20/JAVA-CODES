import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int x = sc.nextInt();
        int[] sum = new int[20];
        int i=0;
        while(x>0){
            sum[i]=x%2;
            x=x/2;
            i++;
        }
        System.out.print("Binary Value: ");
        for(int a=i-1;a>=0;a--){
            System.out.print(sum[a]);
        }
        sc.close();
    }
}

