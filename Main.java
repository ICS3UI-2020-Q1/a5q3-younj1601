import java.util.Scanner;
/**
 *Calculate the factorial of an inserted number
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get the interger
    System.out.println("Please enter an integer to calculate the factorial of");
    int num = input.nextInt();

    //declare factorial variable
    int factorial = 1;

    //create for loop for calculating factorial
    for(int count = 1; count <= num; count++){
      factorial = count*factorial;

    }
    System.out.println(num + "! = " + factorial);
  }
}
