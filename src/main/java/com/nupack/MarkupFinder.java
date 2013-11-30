package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * Defines generic markup lookup contract.
 */
public interface MarkupFinder {
    @NotNull
    Markup find(@NotNull Job job);
}
