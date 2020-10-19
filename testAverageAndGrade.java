//Cody Yenney

//test average and grade

import java.util.Scanner;

public class testAverageAndGrade
{
  public static void main(String[] args)
  {
    System.out.println("Enter 5 grades and I'll tell you the letter grade and average.");

    Scanner scan = new Scanner(System.in);

    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;

    grade1 = scan.nextInt();
    grade2 = scan.nextInt();
    grade3 = scan.nextInt();
    grade4 = scan.nextInt();
    grade5 =scan.nextInt();

    char letter1 = grades(grade1);
    char letter2 = grades(grade2);
    char letter3 = grades(grade3);
    char letter4 = grades(grade4);
    char letter5 = grades(grade5);
    double average = gradeAverage(grade1, grade2, grade3, grade4, grade5);

    System.out.println(letter1);
    System.out.println(letter2);
    System.out.println(letter3);
    System.out.println(letter4);
    System.out.println(letter5);
    System.out.println(average);


  }

  static double gradeAverage(int grade1, int grade2, int grade3, int grade4, int grade5)
  {
    return (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
  }

  public static char grades(double grade)
  {
    char letter;
    if (grade >= 90 )
    {
      letter = 'A';
    }
    else if (grade < 90 && grade >=80)
    {
      letter = 'B';
    }
    else if (grade < 80 && grade >= 70)
    {
      letter = 'C';
    }
    else if (grade < 70 && grade >= 60)
    {
      letter = 'D';
    }
    else
    {
      letter = 'F';
    }
    return letter;


  }










}
