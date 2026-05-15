import java.util.Scanner;
public class matrixAddition {
	public static void main(String[] arg) {
		int a[][]=new int [2][2];
		int b[][]=new int [2][2];
		int c[][]=new int [2][2];
		Scanner firstMat=new Scanner(System.in);
		System.out.print("Enter 1st Matrix:\n");
		for(int i=0;i<2;i++) {//row
			for(int j=0;j<2;j++) {//column
				a[i][j]=firstMat.nextInt();
			}
		}
		Scanner secondMat=new Scanner(System.in);
		System.out.println("Enter 2nd Matrix:");
		for(int i=0;i<2;i++) {//row
			for(int j=0;j<2;j++) {//column
				b[i][j]=secondMat.nextInt();
			}
		}
		System.out.print("1st Matrix:\n");
		for(int i=0;i<2;i++) {//row
			for(int j=0;j<2;j++) {//column
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}System.out.print("2nd Matrix:\n");
		for(int i=0;i<2;i++) {//row
			for(int j=0;j<2;j++) {//column
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition of Matrix:");
		for(int i=0;i<2;i++){//row
			for(int j=0;j<2;j++) {//Column
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
		
		firstMat.close();
		secondMat.close();
	}
}
