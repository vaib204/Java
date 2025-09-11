import java.util.*;

class program91
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the String:");
    String str = sobj.nextLine();

    str = str.trim();

    str = str.replaceAll("\\s+", " ");

    String tokens[] = str.split(" ");

    int imax = 0,maxindex = 0;
   

    for(int i = 0;i<tokens.length;i++)
    {
       if(tokens[i].length() > imax)
       {
          imax = tokens[i].length();
          maxindex = i;
       }
    }

     System.out.println("Largest word is:" +tokens[maxindex]+ " having length :"+imax);
  }
}

