import java.util.*;


abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}

class G05WildCard
{
	static void drawShape(List<? extends Shape> list)
	{
		for(Shape s : list)
		{
			s.draw();
		}
	}

	public static void main(String args[])
	{
		List<Rectangle> listRect=new ArrayList<Rectangle>();
		
		List<Circle> listCir=new ArrayList<Circle>();

		listRect.add(new Rectangle());

		listCir.add(new Circle());
		listCir.add(new Circle());

		drawShape(listRect);

		drawShape(listCir);
	}
}