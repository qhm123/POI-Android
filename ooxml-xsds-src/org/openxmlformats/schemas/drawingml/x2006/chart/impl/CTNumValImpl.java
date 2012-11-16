/*
 * XML Type:  CT_NumVal
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_NumVal(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTNumValImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal
{
    
    public CTNumValImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "v");
    private static final javax.xml.namespace.QName IDX$2 = 
        new javax.xml.namespace.QName("", "idx");
    private static final javax.xml.namespace.QName FORMATCODE$4 = 
        new javax.xml.namespace.QName("", "formatCode");
    
    
    /**
     * Gets the "v" element
     */
    public java.lang.String getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "v" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.STXstring xgetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(V$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "v" element
     */
    public void setV(java.lang.String v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(V$0);
            }
            target.setStringValue(v);
        }
    }
    
    /**
     * Sets (as xml) the "v" element
     */
    public void xsetV(org.openxmlformats.schemas.drawingml.x2006.chart.STXstring v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(V$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().add_element_user(V$0);
            }
            target.set(v);
        }
    }
    
    /**
     * Gets the "idx" attribute
     */
    public long getIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDX$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "idx" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IDX$2);
            return target;
        }
    }
    
    /**
     * Sets the "idx" attribute
     */
    public void setIdx(long idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDX$2);
            }
            target.setLongValue(idx);
        }
    }
    
    /**
     * Sets (as xml) the "idx" attribute
     */
    public void xsetIdx(org.apache.xmlbeans.XmlUnsignedInt idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IDX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(IDX$2);
            }
            target.set(idx);
        }
    }
    
    /**
     * Gets the "formatCode" attribute
     */
    public java.lang.String getFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCODE$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_attribute_user(FORMATCODE$4);
            return target;
        }
    }
    
    /**
     * True if has "formatCode" attribute
     */
    public boolean isSetFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATCODE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATCODE$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_attribute_user(FORMATCODE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().add_attribute_user(FORMATCODE$4);
            }
            target.set(formatCode);
        }
    }
    
    /**
     * Unsets the "formatCode" attribute
     */
    public void unsetFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATCODE$4);
        }
    }
}
