package unit_testing.First_one;

public class calculator {
	public static int add (int n1, int n2)
	{
	return n1+n2;
	}
	public static int sub (int n1,int n2)
	{
		if(n1<n2) {
			return 0;
		}
		return n1-n2;
	}
	public static int mul(int n1, int  n2) 
	{
		return n1*n2;
	}
	public static int div(int n1, int n2)
	{
		if(n1<n2)
		{
			return 0;
		}
		return n1/n2;
	}

}
