package com.boot.injection.model;

import org.springframework.stereotype.Component;

@Component(value="my")
public class InjectedModel implements InterfaceInjectedModel {

	/* (non-Javadoc)
	 * @see com.boot.injection.model.InterfaceInjectedModel#show()
	 */
	@Override
	public void show() {
		System.out.println("This is from model class");
	}
}
