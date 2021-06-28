package App;
//import the scannar library
import java.util.Scanner;
public class ifElse {

    public static void main(String[] args) {
	// write your code here


        //declare the variable and initialize it

        int num1 = (int)(Math.random() *100);


        System.out.println(" Guess a number: \n");

        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int diff = guess - num1;
        if(guess > num1){

            System.out.println("You are " + diff + " units above the  number \n");
            System.out.println("The number is " + num1);

        }
        else if( guess < num1  ) {

            System.out.println("Your guess is " + diff + " units below the number \n");
        }
        else
            System.out.println("You Are correct!");




        System.out.println("what is your grade score: \n");
        int userInput = input.nextInt();

        if(userInput >= 60) {
            System.out.printf("You passed!");
        }

        else
            System.out.println("You will have to take the class again!");
    }
}
