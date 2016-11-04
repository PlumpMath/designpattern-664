package com.pengnix.gof.state;

public interface State {
	public void changeState(Director director);
	public void showState(Director director);
}
