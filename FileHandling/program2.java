import java.util.*;
import java.io.*;


class program2
{
  public static void main(String a[])throws Exception
  { 
    try{
    File fobj = new File("vaibhav.txt");

    if(fobj.exists())
    {
      System.out.println("File already exist");
    }
    else
    {
      fobj.createNewFile();
      System.out.println("file succesfully created");
    }
  }
  catch(IOException iobj)
  {}
  catch(Exception eobj)
  {}
}
}