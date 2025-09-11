import java.util.*;

class program88
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    str = str.trim();

    str = str.replaceAll("\\s+", " ");

    String tokens[] = str.split(" ");

    System.out.println("Number of Words Are:"+tokens.length);

    
  }
}