package com.example.RestfulAPIAndPostgre.Common.Model.Valid.Constraint;

import com.example.RestfulAPIAndPostgre.Common.Model.Valid.Annotation.ValidPassword;
import org.passay.*;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {
    /**
     * @param constraintAnnotation
     */
    @Override
    public void initialize(ValidPassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    /**
     * @param s is password
     * @param constraintValidatorContext is context
     * @return
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null)
            return false;
        PasswordValidator validator = new PasswordValidator(Arrays.asList(
                // at least 8 characters
                new LengthRule(8, 30),
                // at least one upper-case character
                new CharacterRule(EnglishCharacterData.UpperCase, 1),
                // at least one lower-case character
                new CharacterRule(EnglishCharacterData.LowerCase, 1),
                // at least one digit character
                new CharacterRule(EnglishCharacterData.Digit, 1),
                /*// at least one symbol (special character)
                new CharacterRule(EnglishCharacterData.Special, 1),*/
                // no whitespace
                new WhitespaceRule()
        ));
        RuleResult result = validator.validate(new PasswordData(s));
        if (result.isValid()) {
            return true;
        }
        List<String> messages = validator.getMessages(result);
        String messageTemplate = messages.stream().collect(Collectors.joining(","));
        constraintValidatorContext.buildConstraintViolationWithTemplate(messageTemplate)
                .addConstraintViolation()
                .disableDefaultConstraintViolation();
        return false;
    }
}
