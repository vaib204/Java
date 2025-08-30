import java.util.*;

class program44
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Number");
    int isize = sobj.nextInt();

    int Arr[] = new int[isize];

    System.out.println("Enter the Elements in array:");
    for(int i = 0;i<isize;i++)
    {
       Arr[i] = sobj.nextInt();
    }

    System.out.println("Elements from the Array are:");
    for(int i = 0;i<isize;i++)
    {
      System.out.println(Arr[i]);
    }

  }

}