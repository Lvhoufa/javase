class Util{
	
	 //��½
	public static void login(String username,String password){
		
		//�ڴ˴���ʼ�߼��ж�
		if(!"tom".equals(username)){
			System.out.println("�û������������");
			
			//����˺���ȷ
		}else{
			if(!"tom".equals(password)){
				System.out.println("�û������������");
			
			//���������ȷ
			}else{
				System.out.println("��ӭ��: " + username);
			}
		}
	}
	
	//ÿ��100-10
	public static int subTractMoney(int totalNumber){
		
		if(totalNumber<100){
			return totalNumber;
		}
		
		int count = totalNumber/100;
		totalNumber -= count*10;
		return totalNumber;
	}
	
	
}