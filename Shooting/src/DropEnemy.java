
public class DropEnemy extends Enemy {
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x, y, 30, 10);
		f.fillRect(x + 10, y + 10, 10, 20);
	}

	public DropEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life = 1 + (GameWorld.stage - 1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void move() {
		super.move();
		vy = vy + (GameWorld.stage * 0.1);
	}

}
