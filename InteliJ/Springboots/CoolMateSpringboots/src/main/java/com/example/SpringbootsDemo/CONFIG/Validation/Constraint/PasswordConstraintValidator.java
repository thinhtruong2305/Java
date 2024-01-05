package com.example.CoolMateSpringboots.CONFIG.Validation.Constraint;

import com.example.CoolMateSpringboots.CONFIG.Validation.Annotation.ValidPassword;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.passay.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {
    @Override
    public void initialize(ValidPassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null)
            return false;
        PasswordValidator validator = new PasswordValidator(Arrays.asList(
                // at least 8 characters and maximum is 32
                new LengthRule(8, 32),
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
        if(result.isValid())
            return true;
        List<String> messages = validator.getMessages(result);
        String messagesTemplate = messages.stream().collect(Collectors.joining(","));
        constraintValidatorContext.buildConstraintViolationWithTemplate(messagesTemplate)
                .addConstraintViolation()
                .disableDefaultConstraintViolation();
        return false;
    }
}
