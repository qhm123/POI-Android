/*
 * XML Type:  CT_Tx
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTTx
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Tx(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTTxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTTx
{
    
    public CTTxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRREF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strRef");
    private static final javax.xml.namespace.QName RICH$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "rich");
    
    
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
     * Gets the "rich" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getRich()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(RICH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rich" element
     */
    public boolean isSetRich()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RICH$2) != 0;
        }
    }
    
    /**
     * Sets the "rich" element
     */
    public void setRich(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody rich)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(RICH$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(RICH$2);
            }
            target.set(rich);
        }
    }
    
    /**
     * Appends and returns a new empty "rich" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewRich()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(RICH$2);
            return target;
        }
    }
    
    /**
     * Unsets the "rich" element
     */
    public void unsetRich()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RICH$2, 0);
        }
    }
}
