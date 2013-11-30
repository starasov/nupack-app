package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * Job materials.
 */
public enum Material {
    DEFAULT("<default>", Markup.valueOf("0.0")),
    FOOD("food", Markup.valueOf("13.0")),
    ELECTRONICS("electronics", Markup.valueOf("2.0")),
    DRUGS("drugs", Markup.valueOf("7.5"));

    private final String name;
    private final Markup markup;

    private Material(@NotNull String name, @NotNull Markup markup) {
        this.name = name;
        this.markup = markup;
    }

    @NotNull
    public static Material findByName(@NotNull String name) {
        for (Material material : values()) {
            if (material.name.equals(name)) {
                return material;
            }
        }

        return DEFAULT;
    }

    @NotNull
    public Markup getMarkup() {
        return markup;
    }

}
