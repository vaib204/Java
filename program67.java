import java.util.*;

class program67
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    char Arr[] = {'a','b','c','d','e','f'};

    String s = new String(Arr);

    s = new String(Arr,1,4);

    System.out.println(s);
  }
}