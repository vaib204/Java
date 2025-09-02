import java.util.*;
 
class program62
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    int i = 0;

    char Arr[] = str.toCharArray();

    for(i = 0;i<str.length();i++)
    {
      if(Arr[i] == ' ')
      {
       Arr[i] = '_';
      }
    }
    String newstr = new String(Arr);

    System.out.println("Updates string:"+newstr);
  }
}