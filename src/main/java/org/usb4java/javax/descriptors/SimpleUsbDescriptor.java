/*
 * Copyright (C) 2011 Klaus Reimer <k@ailis.de>
 * See LICENSE.md for licensing information.
 */

package org.usb4java.javax.descriptors;

import java.io.Serializable;
import java.util.Objects;

import javax.usb.UsbDescriptor;

/**
 * Base class for all simple USB descriptors.
 * 
 * @author Klaus Reimer (k@ailis.de)
 */
public abstract class SimpleUsbDescriptor implements UsbDescriptor,
    Serializable
{
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;

    /** The descriptor length. */
    private final byte bLength;

    /** The descriptor type. */
    private final byte bDescriptorType;

    /**
     * Constructor.
     * 
     * @param bLength
     *            The descriptor length.
     * @param bDescriptorType
     *            The descriptor type.
     */
    public SimpleUsbDescriptor(final byte bLength, final byte bDescriptorType)
    {
        this.bLength = bLength;
        this.bDescriptorType = bDescriptorType;
    }

    @Override
    public final byte bLength()
    {
        return this.bLength;
    }

    @Override
    public final byte bDescriptorType()
    {
        return this.bDescriptorType;
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (obj == null || getClass() != obj.getClass()) return false;
        final SimpleUsbDescriptor other = (SimpleUsbDescriptor) obj;
        return bLength == other.bLength && bDescriptorType == other.bDescriptorType;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(bLength, bDescriptorType);
    }
}
