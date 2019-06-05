import java.util.*;

public class Pattern29
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(1 + j * rows - (j - 1) * j / 2 + i - j + " ");
                } else
                {
                    System.out.print(1 + j * rows - (j - 1) * j / 2 + rows - 1 - i + " ");
                }
            }
         System.out.println();
        }
    }
}
