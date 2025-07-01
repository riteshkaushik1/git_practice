import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void add(int a, int b){
        int c = b + a;
        System.out.println(c);
    }
    public static void subtract(int a, int b){

        int c = a - b;
        System.out.println(c);
    }
    public static void multiply(int a, int b){

        int c = b * a;
        System.out.println(c);
    }
    public static void division(int a, int b){

        int c = b / a;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
        subtract(a,b);
        multiply(a,b);
        division(a,b);
    }
}