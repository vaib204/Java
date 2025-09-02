import java.util.*;


class program57
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);
    int icnt = 0,icount = 0;

    System.out.println("Enter Your Name:");
    String name  = sobj.nextLine();

    char Arr[] = name.toCharArray();

    for(icnt = 0;icnt<Arr.length;icnt++)
    {
      if(Arr[icnt] >= 'a' && Arr[icnt] <= 'z')
      {
       icount++;
      }
    }
    System.out.println("Number of small charchters are:"+icount);
  }
}