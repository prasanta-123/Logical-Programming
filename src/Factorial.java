import java.util.Scanner;

public class Factorial {
   // public  Factorial(int num){ // constructor..
    public void calculateFact(int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("fact"+fact);
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number:");
//        int fact=1;
//        int num=sc.nextInt();
//        for (int i=1;i<=num;i++){
//            fact=fact*i;
//
//        }
//        System.out.print("factorial of the number is "+fact);

         Factorial f1=new Factorial();
         f1.calculateFact(5);
       // Factorial f1=new Factorial(6);  by using constructor ..

    }

}
