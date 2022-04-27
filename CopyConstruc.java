class CopyConstruc
{
	int x,y;
	CopyConstruc(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	CopyConstruc(CopyConstruc z)
	{
		this.x=z.x;
		this.y=z.y;
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String k[])
	{
		CopyConstruc c=new CopyConstruc(353,454);
		c.show();
		CopyConstruc c2=new CopyConstruc(c);
		c2.show();
	}
}