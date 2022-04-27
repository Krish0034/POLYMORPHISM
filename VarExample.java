/*From JDK11 only local variable defiend by var Keywords in JAVA, and have any Type Variables Are Defiend By it*/
class VarExample
{
	//var s=10; Error-> "var is Not Allowed Here."
	public static void main(String []arg)
	{
		var s=new VarExample();
		System.out.println(s);
		var ch=10;
		//ch=true;
		var z="Hello";
		var b=true;
		System.out.println(ch);
		System.out.println(z);
		System.out.println(b);
	}
}