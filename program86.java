import java.util.*;

class program86
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    str = str.trim();

    str = str.replaceAll(" ", "");

    System.out.println(str);
  }
}