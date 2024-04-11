public class Main
{
    public static boolean palindrome(String s)
    {
        int left =0;
        int right = s.length() - 1;
        while(right>left)
        {
            if (s.charAt(right) != s.charAt(left))
                return false;
                
            left++;
            right--;
        }
        return true;
    }

	public static void main(String[] args) {
		String s = "abkdkb";
		boolean a = palindrome(s);
		System.out.println(a);
		
	}
}
