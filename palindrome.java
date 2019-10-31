package practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "My name is isha";
		String t="";
		System.out.println(s.length());
		for(int i=s.length()-1; i>=0; i--){
			System.out.println(s.charAt(i));
			t=t+s.charAt(i);
		}
		
		
		if(t==s){
			System.out.println("It is palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}

	}

}
