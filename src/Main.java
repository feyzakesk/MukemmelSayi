import java.util.Scanner;

public class Main {
    public static void main(String[] ags){
        int total = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int n = input.nextInt();

        for (int i = 1 ; i <=n-1 ; i++ ){
            if (n % i == 0 ){
                total += i ;

            }
        }
        if (total == n){
            System.out.println("Mükemmel sayıdır.");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }

    }
}
