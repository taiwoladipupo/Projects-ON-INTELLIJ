        package App;

        import java.util.Scanner;

        public class Animal {

            public static void main(String[] args) {
                // write your code here
                String cat = "meow";
                String dog = "barks";
                String lion = "roars";

                do {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter an animal:\n");
                    String response = input.next();
                    if (response.equals("meow")) {
                        System.out.println("The animal is a cat " + cat);
                    }
                    if (response.equals("barks")) {
                        System.out.println("The animal is a dog " + dog);
                    }
                    if (response.equals("roars")) {
                        System.out.println("The animal is a lion " + lion);
                    }

                        else {
                        System.out.println("Not in the program");
                    }
                }
                while (true);


            }
        }

