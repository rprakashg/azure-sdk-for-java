/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DomainType.
 */
public enum DomainType {
    /** Enum value Regular. */
    REGULAR("Regular"),

    /** Enum value SoftDeleted. */
    SOFTDELETED("SoftDeleted");

    /** The actual serialized value for a DomainType instance. */
    private String value;

    DomainType(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a DomainType instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a DomainType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DomainType object, or null if unable to parse.
     */
    @JsonCreator
    public static DomainType fromValue(String value) {
        DomainType[] items = DomainType.values();
        for (DomainType item : items) {
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