import java.util.Random;

public class Java03 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 循环结构
		int a = 0;
		// 循环条件:a<5
		while (a < 5) { // 循环条件(次数)
			System.out.println("做一次"); // 循环体(做什么)
			a++; // 循环增量(计数)

		}
		System.out.println("-----------------");
		// 1.打印输出10个1
		// 2.打印输出1-10
		// 3.打印输出1-10中所有偶数
		// 4.打印1-100间能被7整除的数
		int a1 = 0;
		while (a1 < 10) {
			System.out.println(1);
			a1++;
		}
		System.out.println("-----------------");
		int a2 = 0;
		while (a2 < 10) {
			a2++;
			System.out.println(a2);

		}
		System.out.println("-----------------");
		int a3 = 0;
		while (a3 < 10) {

			if (a3 % 2 == 0) {
				System.out.println(a3);
			}
			a3++;

		}
		System.out.println("-----------------");

		int a4 = 1;
		while (a4 < 101) {
			a4++;
			if (a4 % 7 == 0) {
				System.out.println(a4);
			}

		}
		System.out.println("-----------------");

		// 不管循环条件是否满足
		// 都会先执行一次循环体
		// 然后再依据条件决定是否继续执行

		// do {
		// 循环体
		// 循环增量

		// } while ();//循环条件

		// for循环
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------");

		// 与while对比

		// 练习1,打印1-100间所有个位数为7的数
		// 练习2,打印1-100

		for (int i = 1; i < 101; i++) {
			if (i % 10 == 7) {
				System.out.println(i);
			}
		}

		System.out.println("-----------------");

		for (int i = 1; i < 101; i++) {
			

			System.out.print(i + " ");
			if (i%5==0) {
				System.out.println();
			}
		}
		System.out.println("-----------------");
		
		
		//内层循环与外层循环,99乘法表
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j <=i-1; j++) {
				System.out.print(i+"*"+(j+1)+"="+(j+1)*(i)+" ");
			}
			System.out.println();
			
		}
		
		//break-退出整个循环
		for (int i = 0; i < 5; i++) {
			if (2==i) {
				break;
			}
			System.out.println("Location");
		}
		//continue-退出本次循环
				for (int i = 0; i < 5; i++) {
					if (2==i) {
						//break;
						continue;
					}
					System.out.println("Location"+i);
				}
		//功能:生成随机数
				//产生范围a-b的随机数
				//int num=ran.nextInt(b-a+1)+a;
				//Random ran=new Random();
			//	int num=ran.nextInt(1);
				//System.out.println(num);
		
	//	System.out.println(16>>3);
		// int r = ran.nnext(31);
		
				Random ran1=new Random();
				//产生20个随机数并打印,范围10-100
				for (int i = 0; i < 20; i++) {
					
					int num1=ran1.nextInt(100-10+1)+10;
					System.out.println(num1);
				}
				
				
		
		
	}

}
