import java.util.*;
class Check
{
  public static boolean CheckAnagram(String str1,String str2)
  {
    boolean bflag = true;
    int i = 0;

    char Arr[] = str1.toCharArray();
    char Brr[] = str2.toCharArray();

    int count1[] = new int[26];
    int count2[] = new int[26];

    for(i = 0;i<Arr.length;i++)
    {
      if(Arr[i] >= 'a' && Arr[i]<= 'z')
            {
               count1[Arr[i]- 'a']++;         
            }
    }
    for(i = 0; i < Brr.length; i++)
        {
            if(Brr[i] >= 'a' && Brr[i]<= 'z')
            {
               count2[Brr[i]- 'a']++;         
            }
        } 

        for(i = 0; i < 26; i++)
        {
            if(count1[i] != count2[i])
            {
                bflag = false;
                break;
            }
        }

        return bflag;
    }
}




class program74
{
  public static void main(String a[])
  {
    Scanner sobj  = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    System.out.println("Enter the String:");
    String str1 = sobj.nextLine();
   
    boolean bret = false;

    if(bret == true)
    {
      System.out.println("Strings are anagram");
    }
    else
    {
      System.out.println("String are not anagram");
    }



  }
}