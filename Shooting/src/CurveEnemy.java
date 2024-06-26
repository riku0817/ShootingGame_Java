
public class CurveEnemy extends Enemy {
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillOval(x, y, 30, 30);
		f.setColor(255, 255, 255);
		f.fillOval(x + 5, y, 20, 30);
	}

	public CurveEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life = 3 + (GameWorld.stage - 1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void move() {
		super.move();
		if (x < GameWorld.player.x) {
			x += GameWorld.stage;
		}
		if (x > GameWorld.player.x) {
			x -= GameWorld.stage;
		}
	}
}
