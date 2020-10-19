import java.util.Scanner;
public class sortNames
{
    public static void main(String[] args)
    {
        int count = 3;
        String temp;
        Scanner scan = new Scanner(System.in);


        String names[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        //User is entering the strings and they are stored in an array
        System.out.println("Enter the names one by one:");
        for(int i = 0; i < count; i++)
        {
            names[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();

        //Sorting the strings
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.print(names[i] + ", ");
        }
    }
}
