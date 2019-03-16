package practiceexercise;

public class StringReverse {
    public static void main(String[] args) {

        String input = "This is a test String";
        String output = reserve(input);

        System.out.println("The reserve is " + output);
    }

    public static String reserve(String input){
        String reserve = "";

        if ( input.isEmpty() || input == null){
            System.out.println("Empty and null string are not accepted");
        }
        if (input.length() <= 1){
            reserve = input;
        }
        else {
            String [] originalArray = input.split("\\s+");

            for (String word : originalArray)
                reserve = word + " " +  reserve;
        }
        return reserve.trim();
    }
}
