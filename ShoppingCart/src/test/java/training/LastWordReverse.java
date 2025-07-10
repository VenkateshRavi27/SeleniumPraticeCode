package training;

public class LastWordReverse {

    public static void main(String[] args) {

        String input = "I love peaceful place";

        // Find the position of the last space
        int lastSpace = input.lastIndexOf(" ");

        // Get the part before the last word
        String first = input.substring(0, lastSpace + 1);

        // Get the last word
        String last = input.substring(lastSpace + 1);

        // Print the result
        System.out.println(first + new StringBuilder(last).reverse());
    }
}
