package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Layout {
	
	private String width;
	private String height;
	private String color;
	private String fontSize;
	
	@XmlAttribute
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	
	@XmlAttribute
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	@XmlAttribute
	public String getFontSize() {
		return fontSize;
	}
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}
	@XmlAttribute
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}
