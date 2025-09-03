import java.util.*;

class Stringx
{
  public static String trim(String str)
  {
     int i = 0,istart = 0,iend = 0;

     char Arr[] = str.toCharArray();

     if(Arr[0] == ' ')
     {
        System.out.println("Inside First If");

        while ((Arr[i] == ' ') && (i < Arr.length))
        {
           i++;
        }
     }
     istart = i;

     i = Arr.length-1;

     if(Arr[Arr.length-1] == ' ')
     {
      System.out.println("Inside second if :");

      while (Arr[i] == ' ')
       {
         i--;
       }
     }

     iend = i;

     char Brr[] = new char[iend-istart+1];
     int j = 0;

     for(i = istart,j = 0;i <= iend;i++,j++)
     {
      Brr[j] = Arr[i];
     }
     return new String(Brr);
  }
}


class program66
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    String sret = Stringx.trim(str);

    System.out.println("Updated string is:"+sret);
    System.out.println("updates string is:"+sret.length());
}
}