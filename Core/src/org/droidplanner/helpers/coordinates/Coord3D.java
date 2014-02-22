package org.droidplanner.helpers.coordinates;

import org.droidplanner.helpers.units.Altitude;

public class Coord3D extends Coord2D {
	private Altitude alt;

	public Coord3D(double x, double y, Altitude alt) {
		super(x, y);
		this.alt = alt;
	}

	public Coord3D(Coord2D point, Altitude alt) {
		this(point.getX(), point.getY(), alt);
	}

	public void set(double x, double y, Altitude alt) {
		super.set(x, y);
		this.alt = alt;
	}

	public Altitude getAltitude() {
		return alt;
	}
}