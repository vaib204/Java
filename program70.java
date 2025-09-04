import java.util.*;

class program70
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter The String:");
    String str = sobj.nextLine();

    String sret = str.replaceAll("A","a");

    System.out.println("Updated String is :"+sret);
    System.out.println("Updates String is:"+sret.length());
  }

}