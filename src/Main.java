import java.util.Scanner;

public class Main {
    public static void chanle(int n){
        if (n%2==0){
            System.out.println("n là só chẳn "+n);
        }
        else {
            System.out.println("n la số lẽ : "+n);
        }
    }
    public static void kiemtran(int n){
        if (n<0){
            System.out.println("n la số âm "+n);
        }
        else {
            System.out.println("n là số dương : "+n);
        }
        if (n==0){
            System.out.println("n là 0 "+n);
        }
    }
    public static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void xuli(int n){
        if (isprime(n)){
            System.out.println("n là số nguyên tố "+n);
        }
        else {
            System.out.println("n không phải lá số nguyên tó : "+n);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        chanle(n);
        kiemtran(n);
        xuli(n);
    }
}