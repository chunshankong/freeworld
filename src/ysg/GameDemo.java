package ysg;

import freeframe.system.FreeFrame;
import freeframe.system.Scene;

public class GameDemo extends FreeFrame{

	Scene gameScene = null;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		 
		gameScene = new GameScene(0,0,500,FreeFrame.HEIGHT);
		super.registerScene(gameScene);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
		gameScene.render();
		
		super.UpdateWindow();
	}

}
