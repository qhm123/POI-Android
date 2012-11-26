/*
 * XML Type:  CT_LineJoinMiterProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_LineJoinMiterProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLineJoinMiterPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties
{
    
    public CTLineJoinMiterPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIM$0 = 
        new javax.xml.namespace.QName("", "lim");
    
    
    /**
     * Gets the "lim" attribute
     */
    public int getLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIM$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lim" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage xgetLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().find_attribute_user(LIM$0);
            return target;
        }
    }
    
    /**
     * True if has "lim" attribute
     */
    public boolean isSetLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIM$0) != null;
        }
    }
    
    /**
     * Sets the "lim" attribute
     */
    public void setLim(int lim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIM$0);
            }
            target.setIntValue(lim);
        }
    }
    
    /**
     * Sets (as xml) the "lim" attribute
     */
    public void xsetLim(org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage lim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().find_attribute_user(LIM$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().add_attribute_user(LIM$0);
            }
            target.set(lim);
        }
    }
    
    /**
     * Unsets the "lim" attribute
     */
    public void unsetLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIM$0);
        }
    }
}
