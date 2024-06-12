//Simple keylogger
import java.util.*;
import java.io.*;
public class Task4
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the filename:");
      String filename=sc.nextLine();
      File file=new File(filename);
      FileWriter fw=null;
      BufferWriter bw=null;
      try
        {
        fw=new FileWriter(file);
        bw=new BufferWriter(fw);
        System.out.println("Enter keystrokes (type 'exit' to finish): ");
        while(true)
          {
            String key=sc.nextLine();
            if("exit".equalsIgnoreCase(key))
            {
              break;
            }
            bw.write(key);
            bw.newLine();
          }
        }
      catch(IOException e)
        {
          System.out.println("An error occured");
          e.printStackTrace();
        }
      finally
        {
          try
            {
              if (bw!=null)
              {
                bw.close();
              }
              if(fw!=null)
              {
                fw.close();
              }
              scanner.close();
            }
          catch(IoException e)
            {
              System.out.println("An occured while closing resources");
              e.printStackTrace();
            }
        }
    }
  }
