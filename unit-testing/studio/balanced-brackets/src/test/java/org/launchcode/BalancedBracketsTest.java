package org.launchcode;

import org.junit.jupiter.api.Test;
import org.launchcode.BalancedBrackets;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true, "Both values must be true");
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneOpenBracket() {
        String message = "A single open bracket returns false";
        String str = "[Hello";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }

    @Test
    public void oneOpenBracket2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello["), "A single open bracket returns false");

    }
    @Test
    public void doubleBracket(){
        String message = "Double brackets return false";
        String str = "[[Hello]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }
//    @Test
//    public void backwardsBrackets(){
//        String message = "Backwards brackets return false";
//        String str ="]Hello[";
//        boolean result = BalancedBrackets.hasBalancedBrackets(str);
//        assertFalse(result, message);

    }

