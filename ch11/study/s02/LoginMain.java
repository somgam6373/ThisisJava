package ch11.study.s02;
import java.util.Scanner;
public class LoginMain {
	private static Scanner sc = new Scanner(System.in);
	private static LoginService loginservice = new LoginService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.print("id: ");
			String id = sc.nextLine();
			System.out.print("pw: ");
			String pw = sc.nextLine();
			
			try {
				loginservice.login(id, pw);
			}catch(UserNotFoundException e) {
				System.out.println(e.getMessage());
			}catch(PasswordWrongException e) {
				System.out.println(e.getMessage());
			}catch(AccountLockedException e) {
				System.out.println(e.getMessage());
				break;
			}catch(AuthException e) {
				System.out.println("인증오류: " + e.getMessage());
			}finally {
				System.out.println("로그인 시도 종료.");
			}
		}
		sc.close();

	}

}
