class Emp1
{
	int salary;
	Emp1()
	{
		/*Only write return, u Not return any value. it's return "this" by compiler.
		if u want to not write return then compiler return by default.*/
		this.salary=1000;
		return;
	}
	public static void main(String []arg)
	{
		Emp1 e=new Emp1();
		
		System.out.println(e.salary);
	}
}