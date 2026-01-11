package ch11.study.s02;
public class LoginService {

	private String adminId = "java";
	private String adminPw = "1234";
	private int failCount = 0;
	
	public void login(String id, String pw) throws AuthException{
		if(failCount >= 3) throw new AccountLockedException("3회 이상 일치하지 않아 계정이 잠깁니다.");
		
		if(!id.equals(adminId)) { 
			throw new UserNotFoundException("사용자가 존재하지 않습니다.");
		}
		if(!pw.equals(adminPw)) {
			failCount++;
			throw new PasswordWrongException("비밀번호가 일치하지 않습니다.");
		}
		System.out.println("로그인 성공!");
		failCount = 0;
	}
}
