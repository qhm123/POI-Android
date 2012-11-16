/*
 * XML Type:  CT_NumDataSource
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_NumDataSource(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTNumDataSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource
{
    
    public CTNumDataSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMREF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numRef");
    private static final javax.xml.namespace.QName NUMLIT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numLit");
    
    
    /**
     * Gets the "numRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef getNumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().find_element_user(NUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numRef" element
     */
    public boolean isSetNumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMREF$0) != 0;
        }
    }
    
    /**
     * Sets the "numRef" element
     */
    public void setNumRef(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef numRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().find_element_user(NUMREF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().add_element_user(NUMREF$0);
            }
            target.set(numRef);
        }
    }
    
    /**
     * Appends and returns a new empty "numRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef addNewNumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().add_element_user(NUMREF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "numRef" element
     */
    public void unsetNumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMREF$0, 0);
        }
    }
    
    /**
     * Gets the "numLit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData getNumLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().find_element_user(NUMLIT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numLit" element
     */
    public boolean isSetNumLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMLIT$2) != 0;
        }
    }
    
    /**
     * Sets the "numLit" element
     */
    public void setNumLit(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData numLit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().find_element_user(NUMLIT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().add_element_user(NUMLIT$2);
            }
            target.set(numLit);
        }
    }
    
    /**
     * Appends and returns a new empty "numLit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData addNewNumLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().add_element_user(NUMLIT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "numLit" element
     */
    public void unsetNumLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMLIT$2, 0);
        }
    }
}
