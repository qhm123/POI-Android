/*
 * XML Type:  CT_NumFmt
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_NumFmt(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTNumFmtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt
{
    
    public CTNumFmtImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMATCODE$0 = 
        new javax.xml.namespace.QName("", "formatCode");
    private static final javax.xml.namespace.QName SOURCELINKED$2 = 
        new javax.xml.namespace.QName("", "sourceLinked");
    
    
    /**
     * Gets the "formatCode" attribute
     */
    public java.lang.String getFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatCode" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.STXstring xgetFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_attribute_user(FORMATCODE$0);
            return target;
        }
    }
    
    /**
     * Sets the "formatCode" attribute
     */
    public void setFormatCode(java.lang.String formatCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATCODE$0);
            }
            target.setStringValue(formatCode);
        }
    }
    
    /**
     * Sets (as xml) the "formatCode" attribute
     */
    public void xsetFormatCode(org.openxmlformats.schemas.drawingml.x2006.chart.STXstring formatCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_attribute_user(FORMATCODE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().add_attribute_user(FORMATCODE$0);
            }
            target.set(formatCode);
        }
    }
    
    /**
     * Gets the "sourceLinked" attribute
     */
    public boolean getSourceLinked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCELINKED$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceLinked" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSourceLinked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOURCELINKED$2);
            return target;
        }
    }
    
    /**
     * True if has "sourceLinked" attribute
     */
    public boolean isSetSourceLinked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCELINKED$2) != null;
        }
    }
    
    /**
     * Sets the "sourceLinked" attribute
     */
    public void setSourceLinked(boolean sourceLinked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCELINKED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCELINKED$2);
            }
            target.setBooleanValue(sourceLinked);
        }
    }
    
    /**
     * Sets (as xml) the "sourceLinked" attribute
     */
    public void xsetSourceLinked(org.apache.xmlbeans.XmlBoolean sourceLinked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOURCELINKED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SOURCELINKED$2);
            }
            target.set(sourceLinked);
        }
    }
    
    /**
     * Unsets the "sourceLinked" attribute
     */
    public void unsetSourceLinked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCELINKED$2);
        }
    }
}
