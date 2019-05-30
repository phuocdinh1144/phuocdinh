package toan_tu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tinhdientichvathetich {
	public static final float PI =3.14f; //khai báo hằng số 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Khai báo lớp DecimalFormat dùng để định dạng số 
		DecimalFormat decimalFormat = new DecimalFormat("#,##");
		System.out.println("Nhập vào bán kính hình cầu (r>0):");
		float radius = scanner.nextFloat();
		//Tính diện tích bề mặt hình cầu 
		float area = 4 * PI * radius * radius ;
		System.out.println("Diện tích hình cầu =" + decimalFormat.format(area));
		
		//Tính thể tích hình cầu
		float vol = (float) 4/3 * PI * radius * radius * radius;
		System.out.println("Thể tích hình cầu =" + decimalFormat.format(vol));
		scanner.close();
		
	}

}
