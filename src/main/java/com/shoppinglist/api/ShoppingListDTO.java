package com.shoppinglist.api;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShoppingListDTO {
	
	@XmlElementWrapper(name="elements")
	@XmlElement(name="element")
	List<ShoppingListElementDTO> elements = new ArrayList<ShoppingListElementDTO>();

	public ShoppingListDTO() {}
	public ShoppingListDTO(List<ShoppingListElementDTO> elements){
		this.elements = elements;
	}
	public ShoppingListDTO(ShoppingListElementDTO element) {
		elements.add(element);
	}
	
	public List<ShoppingListElementDTO> getElements() {
		return elements;
	}

	public void setElements(List<ShoppingListElementDTO> elements) {
		this.elements = elements;
	}
}
