/*
 * XML Type:  CT_SoftEdgesEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_SoftEdgesEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSoftEdgesEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect
{
    
    public CTSoftEdgesEffectImpl(org.apache.xmlbeans.SchemaType sType)
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
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rad" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetRad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(RAD$0);
            return target;
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
    public void xsetRad(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate rad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(RAD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(RAD$0);
            }
            target.set(rad);
        }
    }
}
