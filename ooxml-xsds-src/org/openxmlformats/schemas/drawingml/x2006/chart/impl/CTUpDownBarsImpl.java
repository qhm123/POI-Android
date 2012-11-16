/*
 * XML Type:  CT_UpDownBars
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_UpDownBars(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTUpDownBarsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars
{
    
    public CTUpDownBarsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GAPWIDTH$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "gapWidth");
    private static final javax.xml.namespace.QName UPBARS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "upBars");
    private static final javax.xml.namespace.QName DOWNBARS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "downBars");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "gapWidth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount getGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPWIDTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gapWidth" element
     */
    public boolean isSetGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GAPWIDTH$0) != 0;
        }
    }
    
    /**
     * Sets the "gapWidth" element
     */
    public void setGapWidth(org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount gapWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPWIDTH$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPWIDTH$0);
            }
            target.set(gapWidth);
        }
    }
    
    /**
     * Appends and returns a new empty "gapWidth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount addNewGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPWIDTH$0);
            return target;
        }
    }
    
    /**
     * Unsets the "gapWidth" element
     */
    public void unsetGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GAPWIDTH$0, 0);
        }
    }
    
    /**
     * Gets the "upBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar getUpBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().find_element_user(UPBARS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "upBars" element
     */
    public boolean isSetUpBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPBARS$2) != 0;
        }
    }
    
    /**
     * Sets the "upBars" element
     */
    public void setUpBars(org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar upBars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().find_element_user(UPBARS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().add_element_user(UPBARS$2);
            }
            target.set(upBars);
        }
    }
    
    /**
     * Appends and returns a new empty "upBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar addNewUpBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().add_element_user(UPBARS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "upBars" element
     */
    public void unsetUpBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPBARS$2, 0);
        }
    }
    
    /**
     * Gets the "downBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar getDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().find_element_user(DOWNBARS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "downBars" element
     */
    public boolean isSetDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOWNBARS$4) != 0;
        }
    }
    
    /**
     * Sets the "downBars" element
     */
    public void setDownBars(org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar downBars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().find_element_user(DOWNBARS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().add_element_user(DOWNBARS$4);
            }
            target.set(downBars);
        }
    }
    
    /**
     * Appends and returns a new empty "downBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar addNewDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBar)get_store().add_element_user(DOWNBARS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "downBars" element
     */
    public void unsetDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOWNBARS$4, 0);
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
