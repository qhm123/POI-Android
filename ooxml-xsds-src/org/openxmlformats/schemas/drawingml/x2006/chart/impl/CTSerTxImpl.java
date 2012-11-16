/*
 * XML Type:  CT_SerTx
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_SerTx(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTSerTxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx
{
    
    public CTSerTxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRREF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strRef");
    private static final javax.xml.namespace.QName V$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "v");
    
    
    /**
     * Gets the "strRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef getStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().find_element_user(STRREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strRef" element
     */
    public boolean isSetStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRREF$0) != 0;
        }
    }
    
    /**
     * Sets the "strRef" element
     */
    public void setStrRef(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef strRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().find_element_user(STRREF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().add_element_user(STRREF$0);
            }
            target.set(strRef);
        }
    }
    
    /**
     * Appends and returns a new empty "strRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef addNewStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().add_element_user(STRREF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "strRef" element
     */
    public void unsetStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRREF$0, 0);
        }
    }
    
    /**
     * Gets the "v" element
     */
    public java.lang.String getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(V$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "v" element
     */
    public boolean isSetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(V$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(V$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().add_element_user(V$2);
            }
            target.set(v);
        }
    }
    
    /**
     * Unsets the "v" element
     */
    public void unsetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V$2, 0);
        }
    }
}
