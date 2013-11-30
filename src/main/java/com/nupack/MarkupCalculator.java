package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * Defines generic markup calculation contract.
 */
public interface MarkupCalculator {
    @NotNull
    Job calculate(@NotNull Job job);
}
