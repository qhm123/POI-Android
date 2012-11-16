/*
 * XML Type:  CT_ChartsheetView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ChartsheetView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTChartsheetViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetView
{
    
    public CTChartsheetViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName TABSELECTED$2 = 
        new javax.xml.namespace.QName("", "tabSelected");
    private static final javax.xml.namespace.QName ZOOMSCALE$4 = 
        new javax.xml.namespace.QName("", "zoomScale");
    private static final javax.xml.namespace.QName WORKBOOKVIEWID$6 = 
        new javax.xml.namespace.QName("", "workbookViewId");
    private static final javax.xml.namespace.QName ZOOMTOFIT$8 = 
        new javax.xml.namespace.QName("", "zoomToFit");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "tabSelected" attribute
     */
    public boolean getTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABSELECTED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TABSELECTED$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tabSelected" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TABSELECTED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TABSELECTED$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "tabSelected" attribute
     */
    public boolean isSetTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABSELECTED$2) != null;
        }
    }
    
    /**
     * Sets the "tabSelected" attribute
     */
    public void setTabSelected(boolean tabSelected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABSELECTED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABSELECTED$2);
            }
            target.setBooleanValue(tabSelected);
        }
    }
    
    /**
     * Sets (as xml) the "tabSelected" attribute
     */
    public void xsetTabSelected(org.apache.xmlbeans.XmlBoolean tabSelected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TABSELECTED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TABSELECTED$2);
            }
            target.set(tabSelected);
        }
    }
    
    /**
     * Unsets the "tabSelected" attribute
     */
    public void unsetTabSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABSELECTED$2);
        }
    }
    
    /**
     * Gets the "zoomScale" attribute
     */
    public long getZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOMSCALE$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoomScale" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ZOOMSCALE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "zoomScale" attribute
     */
    public boolean isSetZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOMSCALE$4) != null;
        }
    }
    
    /**
     * Sets the "zoomScale" attribute
     */
    public void setZoomScale(long zoomScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMSCALE$4);
            }
            target.setLongValue(zoomScale);
        }
    }
    
    /**
     * Sets (as xml) the "zoomScale" attribute
     */
    public void xsetZoomScale(org.apache.xmlbeans.XmlUnsignedInt zoomScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ZOOMSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ZOOMSCALE$4);
            }
            target.set(zoomScale);
        }
    }
    
    /**
     * Unsets the "zoomScale" attribute
     */
    public void unsetZoomScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOMSCALE$4);
        }
    }
    
    /**
     * Gets the "workbookViewId" attribute
     */
    public long getWorkbookViewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKVIEWID$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "workbookViewId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetWorkbookViewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WORKBOOKVIEWID$6);
            return target;
        }
    }
    
    /**
     * Sets the "workbookViewId" attribute
     */
    public void setWorkbookViewId(long workbookViewId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKVIEWID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WORKBOOKVIEWID$6);
            }
            target.setLongValue(workbookViewId);
        }
    }
    
    /**
     * Sets (as xml) the "workbookViewId" attribute
     */
    public void xsetWorkbookViewId(org.apache.xmlbeans.XmlUnsignedInt workbookViewId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WORKBOOKVIEWID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(WORKBOOKVIEWID$6);
            }
            target.set(workbookViewId);
        }
    }
    
    /**
     * Gets the "zoomToFit" attribute
     */
    public boolean getZoomToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMTOFIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOMTOFIT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoomToFit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetZoomToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZOOMTOFIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ZOOMTOFIT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "zoomToFit" attribute
     */
    public boolean isSetZoomToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOMTOFIT$8) != null;
        }
    }
    
    /**
     * Sets the "zoomToFit" attribute
     */
    public void setZoomToFit(boolean zoomToFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMTOFIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMTOFIT$8);
            }
            target.setBooleanValue(zoomToFit);
        }
    }
    
    /**
     * Sets (as xml) the "zoomToFit" attribute
     */
    public void xsetZoomToFit(org.apache.xmlbeans.XmlBoolean zoomToFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZOOMTOFIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ZOOMTOFIT$8);
            }
            target.set(zoomToFit);
        }
    }
    
    /**
     * Unsets the "zoomToFit" attribute
     */
    public void unsetZoomToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOMTOFIT$8);
        }
    }
}
