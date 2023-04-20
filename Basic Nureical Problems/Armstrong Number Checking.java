import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp =n;
        int rem,sum=0;
        while(temp>0){
            rem=temp%10;
            sum+=(rem*rem*rem);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Armstrong Number.");
        }
        else{
            System.out.println("Not Armstrong Number.");
        }
    }
}
