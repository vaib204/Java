import java.util.*;



class program72
{
  public static void main(String a[])
  {
    Scanner sobj  = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    char Arr[] = str.toCharArray();

    int i = 0;
    int icount[] = {0,0,0};

    for(i = 0;i <Arr.length;i++)
    {
      if(Arr[i] == 'a'||Arr[i] == 'b' || Arr[i] == 'c')
      {
        icount[Arr[i] - 'a']++;
      }
    }
     System.out.println("frequency of a is:"+icount[0]);
     System.out.println("frequency of b is:"+icount[1]);
      System.out.println("frequency of c is:"+icount[2]);

  }
}