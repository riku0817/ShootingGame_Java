
public class StraightEnemy extends Enemy {
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillRect(x + 8, y + 0, 14, 15);
		f.fillRect(x + 10, y + 15, 10, 15);
	}

	public StraightEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life = 5;
		// TODO 自動生成されたコンストラクター・スタブ
	}
}
