package Interface;

import java.util.Scanner;

public class HCN implements Figure2
{
	public double chieudai;
	public double chieurong;
	public HCN()
	{
		chieudai=chieudai;
		chieurong=chieurong;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		chieudai =scanner.nextDouble();
		System.out.println("Nhap chieu rong: ");
		chieurong =scanner.nextDouble();
		scanner.close();
		
	}
	
	public double calS()
	{
		return this.chieudai* this.chieurong;
	}
	public double calP()
	{
		return 2*(this.chieudai +this.chieurong);
	}
	public void output()
	{
		System.out.println("Dien tich la :" + calS());
		System.out.println("Chu vi la :" + calP());
	}

	public static void main(String[] args) {
		HCN hinh =new HCN();
		hinh.output();
	
	}

}
