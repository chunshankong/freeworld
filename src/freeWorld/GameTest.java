package freeWorld;

import freeframe.system.FreeFrame;
import freeframe.system.Log;
import freeframe.system.Scene;

public class GameTest extends FreeFrame {
	
	Scene gameScene = null;
	Scene lableScene = null;
	
	@Override
	public void init() {
		
		lableScene = new LableScene(200, 200, 300,200);
		super.registerScene(lableScene);
		gameScene = new GameScene(0,0,FreeFrame.WIDTH,FreeFrame.HEIGHT);
		super.registerScene(gameScene);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(null != gameScene)gameScene.update();
	}
	
	
	@Override
	public void render() {
		if(null != gameScene)gameScene.render();
		lableScene.render();
		super.UpdateWindow();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	@Override
	public void mouseDragged(int x, int y) {
		// TODO Auto-generated method stub
		super.mouseDragged(x, y);
		Log.error("dragged y:  " + y);
		
	}

}
