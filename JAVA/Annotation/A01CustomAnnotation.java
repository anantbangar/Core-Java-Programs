import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation
{
	int value1();

	String value2() default " ";

	String value3() default "anant";
}

class Hello
{
	@MyAnnotation(value1=4,value3="gulab")
	public void helloMethod()
	{
		System.out.println("Hello Class method is running ");

	}
}

class A01CustomAnnotation
{
	public static void main(String args[]) throws Exception
	{
		Hello h=new Hello();

		h.helloMethod();

		Method m=h.getClass().getMethod("helloMethod");

		MyAnnotation myAnno=m.getAnnotation(MyAnnotation.class);

		System.out.println("value1 is "+myAnno.value1());

		System.out.println("value2 is "+myAnno.value2());

		System.out.println("value3 is "+myAnno.value3());

	}
}