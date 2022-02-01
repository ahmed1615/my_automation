package ooptest;

import org.openqa.selenium.WebDriver;

public interface enter extends entereten , WebDriver {
	public void anaenter(String wahed);

	public default void ehyagd3an() {
		System.out.println("m3nah eh el klam dah ");
	}
}
