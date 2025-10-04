import java.util.Scanner;
public class PrimeNum {



    public void  findPrime(int num){
        ///int num=11;
        int count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                count ++;

            }

        }
        if (count==2){
            System.out.println("this is a prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
    public static void main(String[] args) {
//       // int num=13;
//         Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number:");
//        int num=sc.nextInt();
//        int count=0;
//        for (int i=1;i<=num;i++){
//            if (num%i==0){
//                count++;
//
//            }
//        }
//        if (count==2){
//            System.out.println(num+"this is prime number");
//        }
//        else {
//            System.out.println("not prime number");
//        }
     PrimeNum p1=new PrimeNum();
     p1.findPrime(13);



    }
}
