package package_test;

import processing.core.*;

public class MyPApplet extends PApplet {
//	private String URL = "/home/diogo/Pictures/teste.png";
	private String URL = "http://cseweb.ucsd.edu/~minnes/palmTrees.jpg";
	private PImage backgroundImg;

	public void setup() {
		//size(500, 500);
		size(400, 400);
		backgroundImg = loadImage(URL, "jpg");
		backgroundImg.resize(0, height);
		image(backgroundImg,0,0);
	}

	public void draw() {
		/*
		backgroundImg.resize(0,height);
		image(backgroundImg, 0, 0);
		fill(255,255,0);
		ellipse(width/2,height/2,width/3,height/3);

		fill(0,0,0);
//		ellipse((width-80)/2,(height-90)/2,width/25,height/25);
		ellipse((width-80)/2,(height-90)/2,width/25,height/20);
		ellipse((width-80+165)/2,(height-90)/2,width/25,height/20);
		arc((width)/2,(height + 80)/2,75,75,0,PI);
		*/
		
		int[]  color = sunColorSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,width/4,height/5);
	}
	
	public int[] sunColorSec(float seconds)
	{
		int [] rgb = new int[3];
		
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio =diffFrom30/30; 
		
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;

		return rgb; 
		
	}
}	