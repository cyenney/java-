import java.util.Scanner;


// Cody Yenney


public class testAverage
{
  public static void main (String[] args)
  {

    System.out.println("Enter the grade of your first test.");
    Scanner in = new Scanner(System.in);
    int test1 = in.nextInt();
    System.out.println("Enter the grade of your second test.");
    int test2 = in.nextInt();
    System.out.println("Enter the grade of your third test.");
    int test3 = in.nextInt();

    int average = (test1 + test2 + test3) / 3;


    System.out.println("Your score for test 1 is " + test1);
    System.out.println("Your score for test 2 is " + test2);
    System.out.println("Your score for test 3 is " + test3);
    System.out.println("Your average is " + average);

  }


}
