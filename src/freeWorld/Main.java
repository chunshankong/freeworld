package freeWorld;

import freeframe.system.WindowsKernel;

public class Main{
	
	public static void main(String[] args) {
		
		System.out.println("free World");
		WindowsKernel windows = new WindowsKernel();
		windows.runApp(new GameTest(),1000,1000,30);
		
	}
}