import java.util.*;

class program95
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String:");
    String str = sobj.nextLine();

    char Arr[] = str.toCharArray();

    for(int i = Arr.length-1;i>=0;i--)
    {
      System.out.print(Arr[i]);
    }
  }
}