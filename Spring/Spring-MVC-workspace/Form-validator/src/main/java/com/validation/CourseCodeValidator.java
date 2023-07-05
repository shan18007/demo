package com.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String> {
	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {

		boolean result;
		if (theCode != null) {
			result = theCode.startsWith("JSP");
		} else {
			return true;
		}
		return result;
	}

}
