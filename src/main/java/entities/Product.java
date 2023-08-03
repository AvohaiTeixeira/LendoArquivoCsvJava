package entities;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double pryce;
	private Integer quantity;
	
	public Product () {	
	}

	public Product(String name, Double pryce, Integer quantity) {
		super();
		this.name = name;
		this.pryce = pryce;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPryce() {
		return pryce;
	}

	public void setPryce(Double pryce) {
		this.pryce = pryce;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "name: " + name + ", pryce: " + pryce + ", quantity: " + quantity;
	}
	
	
	
}
