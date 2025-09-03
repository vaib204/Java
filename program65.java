import java.util.*;

class Stringx
{
  public static void trim(String str)
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

     System.out.println("istart is :"+istart);
     System.out.println("iend is :"+iend);

     for(i = istart;i<iend;i++)
     {
      System.out.print(Arr[i]);
     }
  }
}


class program65
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    Stringx.trim(str);
}
}