package vong_lap_for_do_while;

import java.util.Scanner;

public class HienThiHaiSoKhacNhau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number1, number2;
	        Scanner scanner = new Scanner(System.in);
	        for (number1 = 0, number2 = number1 + 3; number2 < 8; number1++, number2++) {
	            System.out.println(number1 + ", " + number2);
	            scanner.close();
	        }

	}

}
