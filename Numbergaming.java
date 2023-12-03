import java.util.Scanner;
import java.lang.Math;
public class Numbergaming {
public static void main(String[] args) {
    int x=(int)(Math.random()*99)+1;
    int k=5;
    boolean attemps=false;
     try (Scanner Sc = new Scanner(System.in)) {
        {
            System.out.println("***WELCOME TO NUMBER GAME***");
            System.out.println("You have to guess the number between 1 to 100");
            System.out.println("You have 5 tries to guess the correct number");
            System.out.println("|--------------------------------------------|");
            while(k>0){
                 System.out.println("\nEnter your guessed Number:");
                 int guess = Sc.nextInt();
                 if(guess==x){
                     System.out.println("You guessed correct Number \n CONGRATS!!!");
                     break;
                 }
                 else if(guess>x){
                     System.out.println("You guessed Number is 'TOO HIGH'");
                      System.out.println("You have "+(k-1)+" tires are left out");
                      k--;  
                 }
                 else {
                     System.out.println("You guessed number is'TOO LOW'");
                     System.out.println("You have "+(k-1)+" tires are left out");
                     k--;
                 }
            }
              if(attemps==false){
                    System.out.println("\nThe correct answer was :"+(x)+(" THANK YOU!!!"));
              }
                     System.out.println("__GAME OVER__");           
       }
    }

   }
}
 