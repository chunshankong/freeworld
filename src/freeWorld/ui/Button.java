package freeWorld.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import freeWorld.utils.CollisionDetectionUtil;
import freeframe.system.GameObject;

public class Button implements GameObject {

	private int x;
	private int y;
	private int width;
	private int height;
	private String label;
	
	private Color bColor = Color.DARK_GRAY;
	
	public Button(String label,int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.label = label;
	}

	@Override
	public void keyDown(int keyCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyUp(int keyCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseLeftButtonDown(int x, int y) {
		if(CollisionDetectionUtil.containsPoint(new Rectangle(this.x, this.y, width, height),new Point(x, y))){
			System.out.println("ok");
		}
	}

	@Override
	public void mouseRightButtonDown(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMiddleButtonDown(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseLeftButtonUp(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseRightButtonUp(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMiddleButtonUp(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseHover(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseLeave(int x, int y) {
	}

	@Override
	public void mouseWheel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMove(int x, int y) {
		if(CollisionDetectionUtil.containsPoint(new Rectangle(this.x, this.y, width, height),new Point(x, y))){
			bColor = Color.LIGHT_GRAY;
		}else{
			bColor = Color.DARK_GRAY;
		}
	}

	@Override
	public void mouseDragged(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		Color c = g2d.getColor();
		
		int d = 100;
		g2d.setColor(bColor);
		g2d.fillRoundRect(x, y, width, height, d, d);
		
	 
		g2d.setFont(new Font("", 10, 25));
		g2d.setColor(Color.WHITE);
		g2d.drawString(label,x+width/5, y+height/2);

		g2d.setColor(c);
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
