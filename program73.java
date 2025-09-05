import java.util.*;

class program73
{
  public static void main(String a[])
  {
    Scanner sobj  = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    char Arr[] = str.toCharArray();

    int i = 0;
    int icount[] = new int[26];

    for(i = 0;i <Arr.length;i++)
    {
      icount[Arr[i] - 'a']++;
    }
    
    for(i = 0;i<26;i++)
    {
      if(icount[i] != 0)
      {
        System.out.println("frequency of "+(char)(i+'a')+"is:"+icount[i]);
      }
    }

  }
}