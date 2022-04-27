class LockBlock
{
	static public void main(String []arg)
	{
		int y=49;
		{
			int x=100;
			System.out.println("x:"+x);
			System.out.println("y into local block:"+y);
		}
		System.out.println("y:"+y);
		/**System.out.println("x:"+x);
		        /** error: cannot find symbol
                System.out.println("x:"+x);***/
	}
}