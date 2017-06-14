package ysg;

import java.awt.Color;
import java.awt.Graphics2D;

import freeframe.system.Scene;

public class GameScene extends Scene{

	public GameScene(int x, int y, int width, int height) {
		super(x, y, width, height,0.5f);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x, y, width, height);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
