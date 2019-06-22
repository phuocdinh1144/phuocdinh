package Abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movingobject ball = new Movingball();
		ball.Move(1);
		ball.Draw();
		Movingobject hero = new Movinghero(2,5);
		hero.Move(3);
		hero.Draw();

	}

}
