import java.util.Objects;
import java.util.Scanner;

public class What_mode {
    public static void main(String[] args) {

        System.out.println("What mode are you in Wendigo?");
        Scanner scanner = new Scanner(System.in);
        String mode = scanner.nextLine();

        System.out.println("You chose mode " + mode + ".");


        System.out.println("Enter a word (Input anything if you're in mode 6):");
        String word = scanner.nextLine();


        //Mode 1

        if (Objects.equals(mode, "1"))
            for (int i = 0; i < word.length(); i++)
                System.out.println(word.charAt(i));
        else

        //Mode 2

        if (Objects.equals(mode, "2"))
            for (int i = 0; i < word.length(); i++)
                System.out.println("tap");

        else

        //Mode 3

        if (Objects.equals(mode, "3"))
            for (int i = 0; i < word.length(); i++)
                System.out.print(word.charAt(i) + "__");

        else
        //Mode 4

        if (Objects.equals(mode, "4"))
            for (int i=0; i < word.length(); i++)
                System.out.println(word.charAt(i) + " " + word.charAt(i) + " " + word.charAt(i));

        else
        //Mode 5

        if (Objects.equals(mode, "5")) {
            System.out.println("Cheer: " + word);
            for (int i = 0; i < word.length(); i++)
                System.out.println("Give me a: " + word.charAt(i) + "," + word.charAt(i) + "!");
            System.out.println("What does that spell?");
            System.out.println(word + "!");
        }

        else
        //Mode 6

        if (Objects.equals(mode, "6")){
            System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println(sentence + " backwards is " + new StringBuilder(sentence).reverse());}

        else
        //Mode 7

        if (Objects.equals(mode, "7")){
            System.out.println("Enter a secret message:");
        String secret = scanner.nextLine();
        for (int i = 0; i < secret.length(); i +=2)
            System.out.print(secret.charAt(i) + " ");}

        else
            System.out.println("A mode was not selected. Please try again.");





            }

            }

