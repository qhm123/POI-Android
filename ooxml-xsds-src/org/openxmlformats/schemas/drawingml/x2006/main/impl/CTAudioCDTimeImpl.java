/*
 * XML Type:  CT_AudioCDTime
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AudioCDTime(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAudioCDTimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime
{
    
    public CTAudioCDTimeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACK$0 = 
        new javax.xml.namespace.QName("", "track");
    private static final javax.xml.namespace.QName TIME$2 = 
        new javax.xml.namespace.QName("", "time");
    
    
    /**
     * Gets the "track" attribute
     */
    public short getTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACK$0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "track" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(TRACK$0);
            return target;
        }
    }
    
    /**
     * Sets the "track" attribute
     */
    public void setTrack(short track)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRACK$0);
            }
            target.setShortValue(track);
        }
    }
    
    /**
     * Sets (as xml) the "track" attribute
     */
    public void xsetTrack(org.apache.xmlbeans.XmlUnsignedByte track)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(TRACK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(TRACK$0);
            }
            target.set(track);
        }
    }
    
    /**
     * Gets the "time" attribute
     */
    public long getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TIME$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "time" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TIME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(TIME$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "time" attribute
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIME$2) != null;
        }
    }
    
    /**
     * Sets the "time" attribute
     */
    public void setTime(long time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$2);
            }
            target.setLongValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "time" attribute
     */
    public void xsetTime(org.apache.xmlbeans.XmlUnsignedInt time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TIME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(TIME$2);
            }
            target.set(time);
        }
    }
    
    /**
     * Unsets the "time" attribute
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIME$2);
        }
    }
}
