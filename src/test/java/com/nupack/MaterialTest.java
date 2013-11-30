package com.nupack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 7:58 AM
 */
public class MaterialTest {

    @Test
    public void shouldFindDefaultMaterialForUnknownMaterialName() {
        assertThat(Material.findByName("unicorn"), is(Material.DEFAULT));
    }

    @Test
    public void shouldFindMaterialForKnownMaterialName() {
        assertThat(Material.findByName("food"), is(Material.FOOD));
    }

    @Test
    public void materialNameShouldBeCaseSensitive() {
        assertThat(Material.findByName("Food"), is(Material.DEFAULT));
    }
}
