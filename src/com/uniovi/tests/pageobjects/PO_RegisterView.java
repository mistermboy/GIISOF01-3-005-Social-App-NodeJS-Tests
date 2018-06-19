/*
 * This source file is part of the NotaneitorTests open source project.
 *
 * Copyright (c) 2018 willy and the NotaneitorTests project authors.
 * Licensed under GNU General Public License v3.0.
 *
 * See /LICENSE for license information.
 * 
 */
package com.uniovi.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Instance of PO_RegisterView.java
 * 
 * @author
 * @version
 */
public class PO_RegisterView extends PO_NavView {

	public static void fillForm(WebDriver driver, String userEmail, String userName, String userPassword,
			String userPasswordConfirm) {

		// Fill the email of the user.
		WebElement email = driver.findElement(By.name("email"));
		email.click();
		email.clear();
		email.sendKeys(userEmail);

		// Fill the name of the user.
		WebElement name = driver.findElement(By.name("nombre"));
		name.click();
		name.clear();
		name.sendKeys(userName);

		// Fill the password of the user.
		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.clear();
		password.sendKeys(userPassword);

		// Fill the passwordConfirm of the user
		WebElement passwordConfirm = driver.findElement(By.name("password2"));
		passwordConfirm.click();
		passwordConfirm.clear();
		passwordConfirm.sendKeys(userPasswordConfirm);

		// Press the button to send data and register the user.
		By boton = By.className("btn");
		driver.findElement(boton).click();
	}

}