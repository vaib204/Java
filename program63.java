import java.util.*;

class Stringx
{
  public String replace(String str,char A,char B)
  {
    int i = 0;

    char Arr[] = str.toCharArray();

    for(i = 0;i<Arr.length;i++)
    {
      if(Arr[i] == A)
      {
        Arr[i] = B;
      }
    }
      String newstr = new String(Arr);

      return newstr;
  }
}
class program63
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    Stringx strobj = new Stringx(); 

    String sret = strobj.replace(str, 'A', 'a');

    System.out.println("Updated String is :"+sret);

  }
}