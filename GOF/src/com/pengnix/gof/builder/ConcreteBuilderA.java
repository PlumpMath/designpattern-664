package com.pengnix.gof.builder;

public class ConcreteBuilderA implements BuilderInterface {

	private Product product;
	
	public ConcreteBuilderA() {
		product = new Product();
	}

	@Override
	public void buildModule() {
		// TODO Auto-generated method stub
		product.add("A");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return product;
	}
	
	

}
