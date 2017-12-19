package com.shoppinglist.api;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Emil Karlsson
 *
 * Beskriver ett element i en shopping lista.
 * 
 * @version 1.0
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShoppingListElementDTO {
	@XmlElement private String text;
	@XmlElement private Priority priority;

	@XmlElementWrapper(name="products")
	@XmlElement(name="product") 
	private List<ProductDTO> products;

	
	public ShoppingListElementDTO() {}
	public ShoppingListElementDTO(String text, Priority priority, List<ProductDTO> products) {
		this.text = text;
		this.priority = priority;
		this.products = products;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<ProductDTO> getProducts() {
		return products;
	}
	public void setProductId(List<ProductDTO> products) {
		this.products = products;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
}
