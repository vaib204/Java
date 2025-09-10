import java.util.*;

class program82
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String:");
    String str = sobj.nextLine();

    str = str.trim();

    char Arr[]  = str.toCharArray();

    int icount = 0,i = 0;

    for(i = 0;i<Arr.length;i++)
    {
      if(Arr[i] == ' ')
      {
        icount++;
      }
    }
    System.out.println("Number of Words Are:"+(icount+1));
  }
}