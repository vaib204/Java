import java.util.*;

class program84
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
    boolean bFlag = false;

    for(i = 0;i<Arr.length;i++)
    {
      if(Arr[i] != ' ')
      {
        Brr[j] = Arr[i];
         j++;
         bFlag = false;
      }
      else if(Arr[i] == ' ')
      {
        if(bFlag == false)
        {
          Brr[j] = ' ';
          j++;
          bFlag = true;
        }
      }
    }
    String Output = new String(Brr);
    Output.trim();

    char crr[] = Output.toCharArray();
    int icount = 0;

    for(i = 0;i< crr.length;i++)
    {
      if(crr[i] == ' ')
      {
        icount++;
      }
    }
    System.out.println("Number of words Are:"+(icount+1));
  }
}