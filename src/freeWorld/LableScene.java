package freeWorld;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import freeframe.system.Scene;

public class LableScene extends Scene{

	public LableScene(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillRect(0, 0, width, height);
		g2d.setFont(new Font("", 20, 20));
		g2d.setColor(Color.WHITE);
		g2d.drawString("开始游戏", 30, 30);
		
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
