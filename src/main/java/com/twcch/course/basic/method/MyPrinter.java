package com.twcch.course.basic.method;

public class MyPrinter extends Printer { // 有直接的繼承關係才可 override

	public MyPrinter(int count) {
		super(count);
	}

	@Override
	public void print(String msg) throws RuntimeException { // override 下，exception 可以放大，不可縮小
		super.print(msg);
	}

	@Override
	protected void print(String msg, int times) { // override 下，存取權限修飾子可以放大，不可縮小
		super.print(msg, times);
	}

	@Override
	public int getCount() {
		return super.getCount();
	}

	@Override
	public void setCount(int count) {
		super.setCount(count);
	}
	
}
