package com.ksit.part;

class PopSort{

	public static void main(String args[]){
	
		int[] array = {1,0,6,9,3,8,2,5,4};

		//循环趟数为数组元素数量,不减1会越界
		for(int i=0; i<array.length -1; i++){
			//将每一次比较趟数中相邻的两个元素比较,随着趟数增加1,两两相比的次数减少1
			for(int j =i; j <array.length-1 ;j++){
				if(array[j]>array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}

		for(int i = 0;i <array.length;i++){
			System.out.println(array[i]);
		}
	}
}
