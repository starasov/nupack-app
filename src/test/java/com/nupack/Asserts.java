package com.nupack;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

/**
 * Complementary asserts for JUnit
 */
final class Asserts {
    private Asserts() {
    }

    static void assertBigDecimalEquals(BigDecimal expected, BigDecimal actual) {
        assertTrue(expected.compareTo(actual) == 0);
    }

    static void assertBigDecimalEquals(BigDecimal expected, String actual) {
        assertTrue(expected.compareTo(new BigDecimal(actual)) == 0);
    }
}
