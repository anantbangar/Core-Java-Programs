class MyGeneric<T>
{
	T obj;

	void add(T obj)
	{
		this.obj=obj;
	}

	T get()
	{
		return obj;
	}
}


class G03CreateGenericClass
{
	public static void main(String args[])
	{
		MyGeneric<Integer> mgInt=new MyGeneric<Integer>();
		mgInt.add(12);
		System.out.println(mgInt.get());

		MyGeneric<String> mgStr=new MyGeneric<String>();
		mgStr.add("anant");
		System.out.println(mgStr.get());
	}
}