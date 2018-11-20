package gui.controller;

import gui.model.DumbestModel;
import gui.view.FirstFrame;

public class GUIController
{
	private DumbestModel myThing;
	private FirstFrame appFrame;
	
	public GUIController()
	{
		myThing = new DumbestModel();
		appFrame = new FirstFrame(this);
	}
	
	public void start()
	{
		
	}
}
