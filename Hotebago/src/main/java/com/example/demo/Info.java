package com.example.demo;

import javax.validation.constraints.NotNull;

public class Info {
	@NotNull
	private String place;
	@NotNull
	private String date;
	@NotNull
	private int time;
	@NotNull
	private String type;

	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
