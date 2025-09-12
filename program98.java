import java.util.*;


class program98
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String");
    String str = sobj.nextLine();

    str = str.trim();

    str = str.replaceAll("//s+", " ");

    StringBuilder sb = new StringBuilder(str);

    sb.reverse();

    if(str.equals(new String(sb)))
    {
       System.out.println("String is palindrome");
    }
    else
    {
      System.out.println("String is not palindrome");
    }

  }
}