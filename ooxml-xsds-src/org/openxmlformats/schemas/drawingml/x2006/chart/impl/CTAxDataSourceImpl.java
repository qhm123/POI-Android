/*
 * XML Type:  CT_AxDataSource
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_AxDataSource(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTAxDataSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource
{
    
    public CTAxDataSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTILVLSTRREF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "multiLvlStrRef");
    private static final javax.xml.namespace.QName NUMREF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numRef");
    private static final javax.xml.namespace.QName NUMLIT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numLit");
    private static final javax.xml.namespace.QName STRREF$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strRef");
    private static final javax.xml.namespace.QName STRLIT$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strLit");
    
    
    /**
     * Gets the "multiLvlStrRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef getMultiLvlStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef)get_store().find_element_user(MULTILVLSTRREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "multiLvlStrRef" element
     */
    public boolean isSetMultiLvlStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTILVLSTRREF$0) != 0;
        }
    }
    
    /**
     * Sets the "multiLvlStrRef" element
     */
    public void setMultiLvlStrRef(org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef multiLvlStrRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef)get_store().find_element_user(MULTILVLSTRREF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef)get_store().add_element_user(MULTILVLSTRREF$0);
            }
            target.set(multiLvlStrRef);
        }
    }
    
    /**
     * Appends and returns a new empty "multiLvlStrRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef addNewMultiLvlStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef)get_store().add_element_user(MULTILVLSTRREF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "multiLvlStrRef" element
     */
    public void unsetMultiLvlStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTILVLSTRREF$0, 0);
        }
    }
    
    /**
     * Gets the "numRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef getNumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().find_element_user(NUMREF$2, 0);
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
            return get_store().count_elements(NUMREF$2) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().find_element_user(NUMREF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().add_element_user(NUMREF$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef)get_store().add_element_user(NUMREF$2);
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
            get_store().remove_element(NUMREF$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().find_element_user(NUMLIT$4, 0);
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
            return get_store().count_elements(NUMLIT$4) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().find_element_user(NUMLIT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().add_element_user(NUMLIT$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData)get_store().add_element_user(NUMLIT$4);
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
            get_store().remove_element(NUMLIT$4, 0);
        }
    }
    
    /**
     * Gets the "strRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef getStrRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().find_element_user(STRREF$6, 0);
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
            return get_store().count_elements(STRREF$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().find_element_user(STRREF$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().add_element_user(STRREF$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef)get_store().add_element_user(STRREF$6);
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
            get_store().remove_element(STRREF$6, 0);
        }
    }
    
    /**
     * Gets the "strLit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData getStrLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData)get_store().find_element_user(STRLIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strLit" element
     */
    public boolean isSetStrLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRLIT$8) != 0;
        }
    }
    
    /**
     * Sets the "strLit" element
     */
    public void setStrLit(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData strLit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData)get_store().find_element_user(STRLIT$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData)get_store().add_element_user(STRLIT$8);
            }
            target.set(strLit);
        }
    }
    
    /**
     * Appends and returns a new empty "strLit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData addNewStrLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData)get_store().add_element_user(STRLIT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "strLit" element
     */
    public void unsetStrLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRLIT$8, 0);
        }
    }
}
