package com.mycom.view;

public class View {
	String top;
	String center;
	String bottom;
	String right;

	public View() {
		top = "topPage";
		center = "centerPage";
		bottom = "bottomPage";
		right = "rightPage";
	}

	public View(String top, String center, String bottom, String right) {
		this.top = top;
		this.center = center;
		this.bottom = bottom;
		this.right = right;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getBottom() {
		return bottom;
	}

	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

}
