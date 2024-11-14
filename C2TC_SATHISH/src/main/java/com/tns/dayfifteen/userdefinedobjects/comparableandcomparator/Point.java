package com.tns.dayfifteen.userdefinedobjects.comparableandcomparator;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Point {
	float x,y;
	Point()
	{}
	Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
