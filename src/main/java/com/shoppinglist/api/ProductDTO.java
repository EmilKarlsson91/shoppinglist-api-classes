package com.shoppinglist.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Emil Karlsson
 * 
 * Beskriver en produkt.
 * 
 * @version 1.0
 *
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductDTO {
	@XmlElement private String name;	
	@XmlElement private String producer;	
	@XmlElement private float price;

	public ProductDTO () {}
	public ProductDTO (String name, String producer, float price) {
		this.name = name;
		this.producer = producer;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
