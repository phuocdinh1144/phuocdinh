package Class;
class Rectangle
{
	public float w,h;
	public Rectangle ()
	{
		w=0.0f;
		h=0.0f;
	}
	public float calSquare()
	{
		return w*h;
	}
}

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r;
		r = new Rectangle();
		r.h=15.0f;
		r.w=77777.0f;
		float dt = r.calSquare();
		System.out.println( " Diện tich hình chữ nhật là:" + dt);
	}

}
