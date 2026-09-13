package com.zakaria.katas.password;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();
    @Test void rejectsTooShortPassword() { assertFalse(validator.isValid("Ab1!")); }
    @Test void acceptsStrongPassword() { assertTrue(validator.isValid("Interview1!")); }
    // Add one rule at a time: uppercase, lowercase, digit, special char, spaces, etc.
}
