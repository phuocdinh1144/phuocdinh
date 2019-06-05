package continuee;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count;
		    for (count = 1; count <= 5; count++) {
		        System.out.println("Lần lặp " + count);
	
		        if (count < 4) {
		            continue;
		        }

		        System.out.println("Chào bạn!");

		    }
	}
}

