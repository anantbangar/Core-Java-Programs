class Reentrant {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    }  
}  

public class ReentrantExample implements Runnable{
public void run()
{
	Reentrant re=new Reentrant();
		re.m();
} 
 

public static void main(String args[]){  
final ReentrantExample re1=new ReentrantExample();  
Reentrant re=new Reentrant();

Thread t=new Thread(re1);
  
t.start();
}

}  