import java.util.*;

class program64
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    String sret  = str.replaceAll("A", "a");

    System.out.println("Updated String is :"+sret);
  }
}