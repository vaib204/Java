import java.util.*;
import java.io.*;



class program15
{
  public static void main(String[] args)
  {
    try
    {
       String header = "rajesh.txt 30";
       
      System.out.println("Header size is:"+header.length());

      int i = 0;

      for(i = header.length();i<100;i++)
      {
       header = header+" ";
      }
      System.out.println("header size after edit:"+header.length());
      System.out.println("updated header is:"+header);

      header = header.trim();

      System.out.println("header size after trim:"+header.length());
      System.out.println("updated header is:"+header);

    }
    catch(Exception eobj)
    {}
  }
}