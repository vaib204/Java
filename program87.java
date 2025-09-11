import java.util.*;

class program87
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    str = str.trim();

    str = str.replaceAll("\\s+", "");

    System.out.println(str);
  }
}