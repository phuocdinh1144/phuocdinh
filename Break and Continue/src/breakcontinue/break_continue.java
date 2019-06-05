package breakcontinue;

import java.util.Scanner;

public class break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i, sum = 0;
		    Scanner scanner = new Scanner(System.in);   
		     
		    do {
		        System.out.println("Nhập vào số:");
		        i = scanner.nextInt();
		        if (i < 0) {
		            break;
		        }
		        sum += i;
		    } while (i >= 0);    // i còn lớn hơn hoặc bằng 0 thì còn tiếp tục
		         
		    System.out.println("Kết quả = " + sum);
		    scanner.close();
		}
		

	}


