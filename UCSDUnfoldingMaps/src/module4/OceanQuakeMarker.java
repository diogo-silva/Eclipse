package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Drawing a centered square for Ocean earthquakes
		// DO NOT set the fill color.  That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered square.
		
		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor
		
		pg.pushStyle();
		
		// TODO: Add code to draw a triangle to represent the CityMarker
		
		
		//triangle size ( base = size, height = 2*size)
		float side_size = this.getRadius() ; 
		
		//pg.rect(x,y,10,10);
		//pg.ellipse(x, y, radium, radium);
		pg.rect(x, y, side_size, side_size);
		// Restore previous drawing style
		pg.popStyle();
		
		// TODO: Implement this method
		
	}
	


	

}
