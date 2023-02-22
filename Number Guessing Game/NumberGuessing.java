import java.util.Scanner;

public class NumberGuessing {
    public static void NumberGuessing() {
        int correct_ans=1+(int)((Math.random()*100)) ;
        int trial=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("You can choose a number between 1 to 100 .");
        System.out.println("Guess the number within 5 trials");
        while(trial>0) {
        System.out.println("Guess the number :");
        int guess=sc.nextInt();
        if(guess>correct_ans){
            System.out.println("The number is less than "+guess);
            trial--;
        }
        else if(guess<correct_ans){
                System.out.println("The number is greater than "+guess);
                trial--;
        }
        else if(guess==correct_ans){
            System.out.println("Congratulations! You Guessed the number.");
            break;
        }
       
        if(trial==0){
            System.out.println("You have exhausted 5 trials");
            System.out.println("The number was "+correct_ans);
        }
    }
    }
    public static void main(String[] args) {
       
        NumberGuessing();

    }
}