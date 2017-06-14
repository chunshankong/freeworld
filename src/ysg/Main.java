package ysg;

import freeframe.system.WindowsKernel;
import freeframe.test.GameDemo;

public class Main {
	
	
	public static void main(String[] args) {
		
//		WindowsKernel win = new WindowsKernel();
//		win.runApp(new GameDemo(), 1000, 1000);
		
//		freeframe.test.TestMain.main(args);
		
		WindowsKernel windowsKernel = new WindowsKernel();
        windowsKernel.runApp(new GameDemo(),1000,900,300);
	}

}
