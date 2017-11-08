package com.ksit.part;

class X9X9{
	public static void main(String args[]){
		
		//循环9次
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				int sum = i * j;
				if(sum<10){
					System.out.print(j+"*"+i+"="+sum+"\t");
				}else{
					System.out.print(j+"*"+i+"="+sum+"\t");
				}

			}
			System.out.println();
		}
	
	}
}

