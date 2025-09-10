import java.util.*;

class program83
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    str = str.trim();

    char Arr[] = str.toCharArray();
    char Brr[] = new char[Arr.length];

    int i = 0,j = 0;

    for(i = 0;i<Arr.length;i++)
    {
      if(Arr[i] != ' ')
      {
        Brr[j] = Arr[i];
         j++;
      }
    }
    String Output = new String(Brr);
    Output.trim();

    System.out.println("Updated String is:"+Output);
    System.out.println("Updated String is:"+Output.length());

  }
}