import java.util.*;
 
class program61
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    int i = 0,icount = 0;

    char Arr[] = str.toCharArray();

    for(i = 0;i<str.length();i++)
    {
      if(Arr[i] == ' ')
      {
        icount++;
      }
    }
    System.out.println("Number of White Spaces are:"+icount);
  }
}