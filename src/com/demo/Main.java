package com.demo;

public class Main {

    public static void main(String[] args) {
	/*int[][] i=new int[2][];
	i[0]=new int[5];
	i[1]=new int[] {7,9,8,78,54,47};
	for(int[]h:i){
	    for(int n:h){
	        System.out.print(n+"\t");
        }
	    System.out.println();
    }*/
    /*cc
        for(int[]h:i){
        	for(int m:h){
        		System.out.print(m+"\t");
			}
        	System.out.println();
		}*/

		int[][] i= new int[2][2];
		//申请一个二维数组 大小为2 2
		i[0][0]=31;
		i[0][1]=21;
		i[1][0]=18;
		i[1][1]=45;
		//给二维数组赋值
		int length=0;
		for(int[]k:i){
			length+=k.length;
		}
		//计算累计长度
		int[] y=new int[length];
		//申请一个新的一维数组
		int index=0;
		for(int[] k:i){
			for(int k1:k){
				y[index++]=k1;
			}
    }
		//将二维数组的值放入一维数组

		for(int q=0;q<y.length-1;q++){
			for(int w=y.length-1;w>q;w--){
				if(y[w]<y[w-1]){
					int r=y[w];
					y[w]=y[w-1];
					y[w-1]=r;
				}
			}
		}
		//冒泡排序法
		for(int p:y){
			//用for each做循环
			System.out.print(p+"\t");
			//输出一维数组的值并制表
	}
	}
}


