/**
 Welcome to the grade calculator! This program
 will determine your allowance based off your 
 grades.
*/
import javax.swing.JOptionPane;

public class GradeCalculator 
{
  public static void main(String[] args) 
  {
    int course, grade;
    double pay, totalPay;
    String input;

    // Get number of courses
    input = JOptionPane.showInputDialog("How many classes are you taking?");
    course = Integer.parseInt(input);

    // Set accumulator 
    totalPay = 0.0;

    // Get grades 
    for (int count = 1; count <= course; count++) 
    {
      input = JOptionPane.showInputDialog("Enter your grade for course " + count + ": ");

      grade = Integer.parseInt(input);
      if (grade == 100)
        pay = 20.00;
      else if (grade >= 95 && grade <= 99)
        pay = 15.00;
      else if (grade >= 90 && grade <= 94) 
        pay = 10.00;
      else if (grade >= 85 && grade <= 89)
        pay = 8.00;
      else if (grade >= 80 && grade <= 84) 
        pay = 5.00;
      else 
        pay = 0.00;

      totalPay += pay; // Add pay to totalPay
    }

    // Display the total pay 
    JOptionPane.showMessageDialog(null, String.format("Your total pay for this grading period is $%,.2f", totalPay));

    System.exit(0);
  }
}