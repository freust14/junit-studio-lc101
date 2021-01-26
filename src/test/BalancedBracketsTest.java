package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void testEmptyString() {
        assertEquals(hasBalancedBrackets(""), true);
    }

    @Test
    public void testForOnlyTwoBalancedBrackets(){
        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test
    public void testForOnlyTwoUnbalancedBrackets(){
        assertFalse(hasBalancedBrackets("]["));
    }

    @Test
    public void testForOneBracket(){
        assertFalse(hasBalancedBrackets("["));
        assertFalse(hasBalancedBrackets("]"));
    }

    @Test
    public void testForBracketsInString(){
        assertTrue(hasBalancedBrackets("[LaunchCode]"));
        assertTrue(hasBalancedBrackets("Launch[Code]"));
        assertFalse(hasBalancedBrackets("Launch]Code["));
        assertFalse(hasBalancedBrackets("[LaunchCode"));
        assertFalse(hasBalancedBrackets("LaunchCode]"));
        assertTrue(hasBalancedBrackets("[]LaunchCode"));
        assertTrue(hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void testStringWithNoBrackets(){
        assertTrue(hasBalancedBrackets("LaunchCode"));
    }
}
