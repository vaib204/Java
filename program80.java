import java.util.*;

class program80
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
     for(char ch:hobj.keySet())
     {
      System.out.println("frequency of ch"+ch+"is:"+hobj.get(ch));
     }
  }
}