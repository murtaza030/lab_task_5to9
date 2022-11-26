import java.util.Scanner;
public class Login
{
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
  String username,password;//variable declaration
  System.out.println("Enter username");
  username=in.next();//input username
  System.out.println("Enter password");
  password=in.next();//input password
  if(username.equals("easy@gmail.com") && password.equals("12345"))
      System.out.println("Login Success");
  else
         System.out.println("Wrong username or password");
	}
}