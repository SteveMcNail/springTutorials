package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

  private String coursePrefix;

   public void initialize(CourseCode courseCode) {
     coursePrefix = courseCode.value();
   }

   public boolean isValid(String theCode, ConstraintValidatorContext context) {

     if(Objects.isNull(theCode)) {
       return true;
     }
     return theCode.startsWith(coursePrefix);
   }
}
