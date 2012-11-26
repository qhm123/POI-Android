/*
 * XML Type:  CT_AlphaOutsetEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AlphaOutsetEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAlphaOutsetEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect
{
    
    public CTAlphaOutsetEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RAD$0 = 
        new javax.xml.namespace.QName("", "rad");
    
    
    /**
     * Gets the "rad" attribute
     */
    public long getRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RAD$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rad" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_default_attribute_value(RAD$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "rad" attribute
     */
    public boolean isSetRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RAD$0) != null;
        }
    }
    
    /**
     * Sets the "rad" attribute
     */
    public void setRad(long rad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RAD$0);
            }
            target.setLongValue(rad);
        }
    }
    
    /**
     * Sets (as xml) the "rad" attribute
     */
    public void xsetRad(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate rad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(RAD$0);
            }
            target.set(rad);
        }
    }
    
    /**
     * Unsets the "rad" attribute
     */
    public void unsetRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RAD$0);
        }
    }
}
