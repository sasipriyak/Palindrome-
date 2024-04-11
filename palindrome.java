import java.util.Scanner;
public class palindrome
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
		Scanner tr = new Scanner(System.in);
        System.out.println("Enter String to check if it is palindrome or not?");
        String s = tr.nextLine();
		boolean a = palindrome(s);
		System.out.println(a);
		
	}
}
