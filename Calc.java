import java.io.Console;

public class Calc {

  public static void main(String[] args) {

    Console myConsole = System.console();

   // System.out.println("Enter 'M' for multiplication, 'S' for subtraction, 'A' for addition or 'D' for division");
   // Make some kind of switch statement so they can choose a letter to run proper calculations.

    System.out.println("Let's try some addition! Enter a number: ");
    String stringNum1 = myConsole.readLine();
    System.out.println("Enter another number: ");
    String stringNum2 = myConsole.readLine();

    Integer num1 = Integer.parseInt(stringNum1);
    Integer num2 = Integer.parseInt(stringNum2);
    Integer result = num1 + num2;

    String stringedResult = Integer.toString(result);

    System.out.println("The result is: " + stringedResult);


  }
}