package labten.experiment;

import java.io.File;
import java.util.Scanner;

public class Main {

  //  declare the stuff
  public static int input = -1;
  Experiment exp = new Experiment();

  public static int getNextInt(Scanner scanner) {
    int input = -1;
    int loop = 0;
    while (loop == 0) {
      if(scanner.hasNext()) {
        if (scanner.hasNextInt()) {
          input = scanner.nextInt();
          scanner.nextLine();
          return input;
        }
        else{
          System.out.println("Please enter an integer.");
          scanner.nextLine();
        }
      }
    }
    return input;
  }

  //  main method
  public static void main(String[] args) throws Exception {
    //  greeting massage
    System.out.println("Hi, this is RoboKapfhammer. I will assist you with completing performance evaluations of different computations and data types.");
    System.out.println("");
    System.out.println("Types of computations:");
    //  give the opptions
    System.out.println("Type 1 for IterativeFibonacciComputation Experiment.");
    System.out.println("Type 2 for ResursiveFibonacciComputation Ex[eriment.");
    System.out.println("Type 3 for IterativeFactorialComputation Experiment.");
    System.out.println("Type 4 for ResursiveFactorialComputation Ex[eriment.");
    System.out.println("Type 0 to end the program.");
    System.out.println("Please pick a computation experiment: ");
    //  scan inputs and lead the players to different games
    Scanner scanner = new Scanner(System.in);
    while(input < 0 || input > 4) {
      input = getNextInt(scanner);
      if(input < 0 || input > 4) {
        System.out.println("Your number is not in the desired range.");
      }
    }
    /** Run the experiment campaigns for a different number of rounds. */
    if(input == 1) {
    Experiment.runIterativeFibonacciExperiment();
    } else if (input == 2) {
    Experiment.runRecursiveFibonacciExperiment();
    } else if (input == 3) {
    Experiment.runRecursiveFactorialExperiment();
    } else if (input == 4) {
    Experiment.runRecursiveFactorialExperiment();
    } else if (input == 0) {
      System.out.println("Thanks very much for using our program!");
      System.out.println("Have a good day!");
      System.exit(0);
    }
  }
}