/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StatusOptions.
 */
public enum StatusOptions {
    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Pending. */
    PENDING("Pending");

    /** The actual serialized value for a StatusOptions instance. */
    private String value;

    StatusOptions(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a StatusOptions instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a StatusOptions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StatusOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static StatusOptions fromValue(String value) {
        StatusOptions[] items = StatusOptions.values();
        for (StatusOptions item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}