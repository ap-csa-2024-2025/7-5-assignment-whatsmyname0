import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String arr[] = {"forest", "apple", "willow", "lake", "trees"};
    sortAndPrintDescending(arr);

  }


  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    int min = 0;
    String minx = "a";
    int tempx = 0;
    for (int i = 0; i < arr.length - 1; i++)
    {
      for (int j = i + 1; j < arr.length; j++)
      {
        if (arr[i].compareTo(arr[j]) < min)
        {
          min = arr[i].compareTo(arr[j]);
          minx = arr[j];
          tempx = j;
        }
        if (j == arr.length - 1)
        {
          String temp = arr[i];
          arr[i] = minx;
          arr[tempx]= arr[i];
        }
      }
    }
    for (int x = 0; x < arr.length; x++)
    {
      System.out.println(arr[x]);
    }
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void selectSortDescending(ArrayList<Integer> list)
  {
    System.out.println("Implement me!");
  }
}
