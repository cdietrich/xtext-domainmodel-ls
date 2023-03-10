/*
 * generated by Xtext 2.30.0.M2
 */
package org.xtext.example.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkGreetingStartsWithCapital(Type greeting) {
		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
			warning("Name should start with a capital",
					MyDslPackage.Literals.ABSTRACT_ELEMENT__NAME,
					INVALID_NAME);
		}
	}
	
}
