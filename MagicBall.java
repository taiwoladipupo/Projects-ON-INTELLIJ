package App;

import java.util.*;




public class MagicBall {
    public static void main(String[] args) {
        // calling the static methods of class AsciiChars
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner sc = new Scanner(System.in);
        String continueOption;
        // simple interaction
        System.out.print("\nPlease enter your name : ");
        String name = sc.next();
        System.out.println("Hello "+name);
        System.out.print("If you wish to continue to the ineractive portion. Enter yes/no : ");
        String option = sc.next();
        if(option.equals("yes") || option.equals("y")){
            do{

                // continue to the interaction
                System.out.print("Do you have a red car?(yes, no) : ");
                String redCar = sc.next();

                System.out.print("What is the name of your favorate pet : ");
                String petName = sc.next();

                System.out.print("What is the age of your favorite pet : ");
                int petAge = sc.nextInt();

                System.out.print("What is your lucky number : ");
                int luckyNumber = sc.nextInt();

                System.out.print("Do you have a favorite quarterback?(yes, no)  : ");
                option = sc.next();
                int jerseyNumber = 0;
                if(option.equals("yes") || option.equals("y")){
                    System.out.print("What is the ajersey number : ");
                    jerseyNumber = sc.nextInt();
                }

                System.out.print("What is the two digit model year of your car?  : ");
                int modelyear = sc.nextInt();

                System.out.print("What is the first name of the their favorite actor or actress?  : ");
                String actressFirstName = sc.next();


                System.out.print("Enter a random number between 1 and 50  : ");
                int randomNumber = sc.nextInt();

                // Generating output :
                Random rand = new Random();
                int magicballNumber;

                int rand1 = rand.nextInt(50);
                int rand2 = rand.nextInt(50);
                int rand3 = rand.nextInt(50);
                if((rand.nextInt(2) == 1) && (jerseyNumber != 0) ) {
                    // choose the jersey number else choose the lucky number
                    magicballNumber = jerseyNumber * rand1;
                }
                else{
                    magicballNumber = luckyNumber * rand1;
                }
                if(magicballNumber > 75){
                    // substract 75 from it
                    magicballNumber = magicballNumber - 75;
                }
                //    generate other 5 numbers
                int number1 , number2, number3, number4, number5;
                // choosing the options =  modelnumber + luckynumber

                number1 =  modelyear + luckyNumber;
                // checking if the numbers are in range
                if(number1>65)
                    number1 = number1 - 65;
                if(number1<1)
                    number1 = number1 + 65;
                // choosing the options =  random numbers between 1 and 50 and substract rand2
                number2 =  rand2 - rand.nextInt(50);
                // checking if the numbers are in range
                if(number2>65)
                    number2 = number2 - 65;
                if(number2<1)
                    number2 = number2 + 65;
                // choosing the options =  use a value 42
                number3 =  42;

                // choosing the options = age of the favorite pet + model year
                number4 =  petAge + modelyear;
                // checking if the numbers are in range
                if(number4>65)
                    number4 = number4 - 65;
                if(number4<1)
                    number4 = number4 + 65;
                // choosing the options =  first letter of favoriate actress
                number5 =  (int)actressFirstName.charAt(0);
                // checking if the numbers are in range
                if(number5>65)
                    number5 = number5 - 65;
                if(number5<1)
                    number5 = number5 + 65;
                System.out.print("\nLottery numbers : ");
                System.out.print(number1+", ");
                System.out.print(number2+", ");
                System.out.print(number3+", ");
                System.out.print(number4+", ");
                System.out.print(number5+", ");
                System.out.print(" Magic ball: "+magicballNumber);
                System.out.println("\nIf you like to answer question to generate another set of numbers, (yes ,no)? :");
                continueOption = sc.next();

            }while(continueOption.equals("yes"));
        }
        else{
            System.out.println("\nPlease return later to complete the survey");
        }
        System.out.println();
    }

}