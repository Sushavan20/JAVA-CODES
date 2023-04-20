import java.util.*;

class Test {
    public static void PerfectCheck(int n) {
        if(n<=1){
            System.out.println("Not Perfect");
        }
        int ans=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                ans+=i;
            }
        }
        if(ans==n){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not Perfect");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = sc.nextInt();
        PerfectCheck(a);
        sc.close();
    }
}
