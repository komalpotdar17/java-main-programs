
import java.util.ArrayList;
import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String userInput;

        System.out.println("Enter numbers (type 'stop' to finish):");

        while (true) {
            System.out.print("Enter a number: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'stop' to finish.");
            }
        }
        int zero = 0, pos = 0, neg = 0;
        System.out.println("These is the count");
        for (int number : numbers) {
        	
           if ( number == 0){
        	   zero++;
           }
           else if(number > 0){
        	   pos++;
           }
           else
        	   neg++;
        }
        
        
        System.out.println("Positive =" + pos);
        System.out.println("Neg =" + neg);
        System.out.println("Zer0 =" + zero);
        
        
        

        scanner.close();
    }
}
