package Class;
import java.util.Scanner;

public class hinhtron extends Figure
{
	public double bankinh;
	public hinhtron()
	{
		bankinh=bankinh;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào bán kính : ");
	    bankinh = scanner.nextDouble();
	    super.S=((this.bankinh)* this.bankinh)*3.14;
	    super.P=this.bankinh*2*3.14; 
	    scanner.close();
	}
	public void printhinhtron() {
		System.out.println("Diện tích hình tròn la: " +this.S);
		System.out.println("Chu vi hình tròn là: " +this.P);
		
	}
	public static void main(String[] args)
	{

		hinhtron hinh = new hinhtron();
		hinh.printhinhtron();
	}

}