import java.util.*;


class program56
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);
    int icnt = 0;

    System.out.println("Enter Your Name:");
    String name  = sobj.nextLine();

    char Arr[] = name.toCharArray();

    System.out.println(Arr);

    System.out.println(Arr.length);

  }
}