package practiceexercise;

import java.util.Scanner;

public class ReverseChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (input == null || input.isEmpty() ){
            System.out.println("Please enter a vaild String ");
            input = scanner.nextLine();
        }
        scanner.close();

        System.out.println(reverseCharacters(input));

    }//end of main method

    public static String reverseCharacters(String input){
        String reserve = "";

        for (int i = input.length() -1; i >= 0; i--){
            reserve = reserve + input.charAt(i);
        }
        return reserve;
    }

}//end of class
