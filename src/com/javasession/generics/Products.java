package com.javasession.generics;

public class Products<L1, L2> {

	L1 item1;
	L2 item2;

	public Products(L1 item1, L2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}

	public L1 getItem1() {
		return item1;
	}

	public void setItem1(L1 item1) {
		this.item1 = item1;
	}

	public L2 getItem2() {
		return item2;
	}

	public void setItem2(L2 item2) {
		this.item2 = item2;
	}

	@Override
	public String toString() {
		return "Products [item1=" + item1 + ", item2=" + item2 + "]";
	}

}
