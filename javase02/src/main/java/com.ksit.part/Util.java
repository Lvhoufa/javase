class Util{
	
	 //登陆
	public static void login(String username,String password){
		
		//在此处开始逻辑判断
		if(!"tom".equals(username)){
			System.out.println("用户名或密码错误");
			
			//如果账号正确
		}else{
			if(!"tom".equals(password)){
				System.out.println("用户名或密码错误");
			
			//如果密码正确
			}else{
				System.out.println("欢迎您: " + username);
			}
		}
	}
	
	//每满100-10
	public static int subTractMoney(int totalNumber){
		
		if(totalNumber<100){
			return totalNumber;
		}
		
		int count = totalNumber/100;
		totalNumber -= count*10;
		return totalNumber;
	}
	
	
}