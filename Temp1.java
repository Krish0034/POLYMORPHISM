/* Without pass Argument in constructor*/
class Temp1
{
	void show()
	{
		System.out.println("Show");
		
	}
	Temp1(int x)
	{
		System.out.println("Parmeterize Constructor"+x);
	}
	Temp1()
	{
		System.out.println("Default Constructor");
	}
	public static void main(String []args)
	{
		Temp1 t=new Temp1();
		t.show();
		Temp1 t1=new Temp1(100);
	}
}
/**error: constructor Temp1 in class Temp1 cannot be applied to given types;
                Temp1 t=new Temp1();
                        ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length**/