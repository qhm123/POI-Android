/*
 * XML Type:  CT_AlphaBiLevelEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AlphaBiLevelEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAlphaBiLevelEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect
{
    
    public CTAlphaBiLevelEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THRESH$0 = 
        new javax.xml.namespace.QName("", "thresh");
    
    
    /**
     * Gets the "thresh" attribute
     */
    public int getThresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRESH$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "thresh" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetThresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(THRESH$0);
            return target;
        }
    }
    
    /**
     * Sets the "thresh" attribute
     */
    public void setThresh(int thresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRESH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THRESH$0);
            }
            target.setIntValue(thresh);
        }
    }
    
    /**
     * Sets (as xml) the "thresh" attribute
     */
    public void xsetThresh(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage thresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(THRESH$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(THRESH$0);
            }
            target.set(thresh);
        }
    }
}
