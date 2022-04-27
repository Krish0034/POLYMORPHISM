class MyThis1
{
	int x=100;
	void getData(MyThis1 this, int x)
	{
		System.out.println(this+"GetData Fun.");
		System.out.println(this.x);
		System.out.println(x);
	}
	public static void main(String []args)
	{
		MyThis1 mt=new MyThis1();
		System.out.println(mt+"Main Fun.");
		mt.getData(300);
	}
}