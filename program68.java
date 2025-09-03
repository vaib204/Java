import java.util.*;

class Stringx
{
   public static String Trim(String str)
   {
    int i = 0,istart = 0,iend = 0;

    char Arr[] = str.toCharArray();

    if(Arr[0] == ' ')
    {
       while ((Arr[i] == ' ') && (i < Arr.length))
       {
        i++;
       }
    }
     istart = i;

     i = Arr.length-1;

     if(Arr[Arr.length-1] == ' ')
     {
       while (Arr[i] == ' ')
       {
         i--;
       }
     }
       iend = i;

       return new String(Arr,istart,iend-istart+1);
   }
}

class program68
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    String sret = Stringx.Trim(str);

   System.out.println("updated string is:"+sret);
   System.out.println("updated string is:"+sret.length());
  }
}