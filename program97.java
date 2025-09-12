import java.util.*;

class program97
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String:");
    String str = sobj.nextLine();

    str = str.trim();

    str = str.replaceAll("\\s+", " ");

    StringBuilder sb = null;

    String tokens[] = str.split(" ");

    for(String s:tokens)
    {
      sb = new StringBuilder(s);

      System.out.print(sb.reverse());
    }
  }
}