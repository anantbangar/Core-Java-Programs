import java.io.*;    
class Input1{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("anant.txt");    
   FileInputStream fin2=new FileInputStream("anant1.txt");    
   FileOutputStream fout=new FileOutputStream("anant2.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);        
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}    