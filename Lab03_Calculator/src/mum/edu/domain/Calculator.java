package mum.edu.domain;

public class Calculator {

	private Double add1, add2, prod1, prod2;

	public Double getAdd1() {
		return add1;
	}

	public void setAdd1(Double add1) {
		this.add1 = add1;
	}

	public Double getAdd2() {
		return add2;
	}

	public void setAdd2(Double add2) {
		this.add2 = add2;
	}

	public Double getProd1() {
		return prod1;
	}

	public void setProd1(Double prod1) {
		this.prod1 = prod1;
	}

	public Double getProd2() {
		return prod2;
	}

	public void setProd2(Double prod2) {
		this.prod2 = prod2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getAdd1() + " " + getAdd2() + " " + getProd1() + " " + getProd2();
	}
}
