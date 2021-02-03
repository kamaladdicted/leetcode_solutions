class Solution
{
    public int reverse(int x)
	{
		long result = 0;
		while(x != 0 )
		{
			int remainder = x % 10;
			x = x / 10;
			result = (result * 10) + remainder;
		}
		if( result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
		{
			return 0;
		}
		return (int)result;
    }
}