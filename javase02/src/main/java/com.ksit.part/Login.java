class Login{
	
	
	public static void main(String args[]){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("�������û���");
		String username = scanner.next();
		System.out.println("����������");
		String password = scanner.next();
		
		Util.login(username,password);
	}
	
}