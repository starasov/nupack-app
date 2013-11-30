package com.nupack;

import java.math.BigDecimal;

/**
 * User: starasov
 * Date: 11/29/13
 * Time: 11:48 PM
 */
public interface Markup {
    BigDecimal calculate(Job job);
}
