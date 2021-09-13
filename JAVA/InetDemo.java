import java.io.*;    
import java.net.*;    
public class InetDemo{    
public static void main(String[] args){    
try{    
InetAddress ip=InetAddress.getByName("8.8.8.8");    
  
System.out.println("Host Name: "+ip.getHostName());    
}catch(Exception e){System.out.println(e);}    
}    
}