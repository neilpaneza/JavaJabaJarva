//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;



public class dicegame {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);


      System.out.println("      _______           ");
      System.out.println("     /O     /\\         ");
      System.out.println("    /   O  /O \\        ");
      System.out.println(" ((/_____O/    \\      ");
      System.out.println("   \\O    O\\    /      ");
      System.out.println("    \\O    O\\ O/       ");
      System.out.println("     \\O____O\\/ ))       ");
      System.out.println("   ((                     ");
      System.out.println("                         ");


       int dice = random.nextInt(6) + 1;

      System.out.print("Enter Number Of Dice: ");
      int choice = scanner.nextInt();

      if (choice == dice) {
          System.out.println("The Answer is: "  + dice +  " YOU DID IT NIGG4!!! ");
      }
          else {
          System.out.println("You Wrong Nigg4, the Answer is: " + dice);
      }


      scanner.close();
    }
}