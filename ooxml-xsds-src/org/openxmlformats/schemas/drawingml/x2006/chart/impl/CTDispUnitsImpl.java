/*
 * XML Type:  CT_DispUnits
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_DispUnits(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTDispUnitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits
{
    
    public CTDispUnitsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTUNIT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "custUnit");
    private static final javax.xml.namespace.QName BUILTINUNIT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "builtInUnit");
    private static final javax.xml.namespace.QName DISPUNITSLBL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dispUnitsLbl");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "custUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getCustUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(CUSTUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custUnit" element
     */
    public boolean isSetCustUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTUNIT$0) != 0;
        }
    }
    
    /**
     * Sets the "custUnit" element
     */
    public void setCustUnit(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble custUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(CUSTUNIT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(CUSTUNIT$0);
            }
            target.set(custUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "custUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewCustUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(CUSTUNIT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "custUnit" element
     */
    public void unsetCustUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTUNIT$0, 0);
        }
    }
    
    /**
     * Gets the "builtInUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit getBuiltInUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit)get_store().find_element_user(BUILTINUNIT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "builtInUnit" element
     */
    public boolean isSetBuiltInUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUILTINUNIT$2) != 0;
        }
    }
    
    /**
     * Sets the "builtInUnit" element
     */
    public void setBuiltInUnit(org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit builtInUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit)get_store().find_element_user(BUILTINUNIT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit)get_store().add_element_user(BUILTINUNIT$2);
            }
            target.set(builtInUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "builtInUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit addNewBuiltInUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBuiltInUnit)get_store().add_element_user(BUILTINUNIT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "builtInUnit" element
     */
    public void unsetBuiltInUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUILTINUNIT$2, 0);
        }
    }
    
    /**
     * Gets the "dispUnitsLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl getDispUnitsLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl)get_store().find_element_user(DISPUNITSLBL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispUnitsLbl" element
     */
    public boolean isSetDispUnitsLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPUNITSLBL$4) != 0;
        }
    }
    
    /**
     * Sets the "dispUnitsLbl" element
     */
    public void setDispUnitsLbl(org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl dispUnitsLbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl)get_store().find_element_user(DISPUNITSLBL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl)get_store().add_element_user(DISPUNITSLBL$4);
            }
            target.set(dispUnitsLbl);
        }
    }
    
    /**
     * Appends and returns a new empty "dispUnitsLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl addNewDispUnitsLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnitsLbl)get_store().add_element_user(DISPUNITSLBL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "dispUnitsLbl" element
     */
    public void unsetDispUnitsLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPUNITSLBL$4, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$6) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$6);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$6, 0);
        }
    }
}
