import java.util.*;

class program81
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter The String:");
    String str = sobj.nextLine();

    str  = str.replaceAll(" ", "");

    HashMap <Character,Integer>hobj = new HashMap<Character,Integer>();

    char Arr[] = str.toCharArray();
    int frequency = 0;

    for(char ch:Arr)
    {
      if(hobj.containsKey(ch))
      {
        frequency = hobj.get(ch);
        hobj.put(ch, frequency+1);
      }
      else
      {
        hobj.put(ch, 1);
      }
    }
    int imax = 0;
    char cmax = '\0';
     for(char ch:hobj.keySet())
     {
       if(imax <hobj.get(ch))
       {
        imax = hobj.get(ch);
        cmax = ch;
       }
     }
     System.out.println("maximum occured element is :"+ cmax +" with frequency:"+imax);
  }
}