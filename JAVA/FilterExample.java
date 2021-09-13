import java.io.*;  
public class FilterExample {  
    public static void main(String[] args) throws IOException {  
        //File data = new File("anant.txt");  
      //  FileInputStream  file = new FileInputStream("anant.txt");  
        FilterInputStream filter = new BufferedInputStream(new FileInputStream("anant.txt"));  
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  
       // file.close();  
        filter.close();  
    }  
}  