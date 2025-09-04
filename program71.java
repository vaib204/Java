import java.util.*;

class program71
{
  public static void main(String a[])
  {
    int i = 0,icount = 0,icount1 = 0,icount2 = 0;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter The String:");
    String str = sobj.nextLine();


    char Arr[] = str.toCharArray();

    for(i = 0; i< str.length();i++)
    {
      if(Arr[i] == 'A')
      {
        icount++;
      }
       if(Arr[i] == 'B')
      {
        icount1++;
      }
       if(Arr[i] == 'C')
      {
        icount2++;
      }
    }
    System.out.println("Frequency of A is:"+icount);
    System.out.println("Frequency of B is:"+icount1);
    System.out.println("Frequency of C is:"+icount2);


  }
}