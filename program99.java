import java.util.*;


class program99
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String");
    String str = sobj.nextLine();

    str = str.trim();

    str = str.replaceAll("//s+", " ");

    char arr[] = str.toCharArray();
    char brr[]  = str.toCharArray();


    for(int i = arr.length-1;i>=0;i--)
    { 
     for(int j = 0;j<brr.length;j++)
    {
        if(arr[i] == arr[j])
        {
          System.out.println("s is pali");
        }
        else
        {
          System.out.println("s is  not pali");
        }
       } 
    }
  }
}