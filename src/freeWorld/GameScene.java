package freeWorld;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import freeWorld.obj.Direction;
import freeWorld.obj.FpsLabel;
import freeWorld.obj.Missile;
import freeframe.system.FreeFrame;
import freeframe.system.GameObject;
import freeframe.system.Scene;
import freeframe.test.Tank;

public class GameScene extends Scene{

	private static final long serialVersionUID = 1L;
	
	ArrayList<GameObject> objs = null; 
	
	public GameScene(int x, int y,int width, int height) {
		super( x, y,width, height);
		// TODO Auto-generated constructor stub
		objs = new ArrayList<GameObject>();
		FpsLabel fps = new FpsLabel();
		Tank tank = new Tank(50, 50, 100, 100);
		objs.add(fps);
		objs.add(tank);
	}

	long renderAccumilatedTime = 0;//上次渲染的时间
	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		long starttime = System.nanoTime();
		starttime = starttime / 1000000;// 当前毫秒

		if (33 <= (starttime - renderAccumilatedTime)) {//每33ms绘制一帧图像
			
			renderAccumilatedTime = starttime;
			
			//draw background
			g2d.setColor(Color.BLACK);
			g2d.fillRect(0, 0, FreeFrame.WIDTH, FreeFrame.HEIGHT);
			
			// draw spirit
			for (GameObject obj : objs) {
				obj.draw(g2d);
			}
		}
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		for (GameObject obj : objs) {
			obj.update();
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
