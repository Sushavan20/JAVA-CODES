import java.util.*;

class Test {
    public static int GCD(int a,int b) {
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return GCD(a-b,b);
        }
        return GCD(a,b-a);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.println("GCD: "+GCD(a,b));
        System.out.println("LCM: "+((a*b)/GCD(a,b)));
        sc.close();
    }
}
