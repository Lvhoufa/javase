class Login{
	
	
	public static void main(String args[]){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("请输入用户名");
		String username = scanner.next();
		System.out.println("请输入密码");
		String password = scanner.next();
		
		Util.login(username,password);
	}
	
}