/*
 * XML Type:  CT_CustomChartsheetView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomChartsheetView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomChartsheetViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetView
{
    
    public CTCustomChartsheetViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGEMARGINS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
    private static final javax.xml.namespace.QName PAGESETUP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
    private static final javax.xml.namespace.QName HEADERFOOTER$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
    private static final javax.xml.namespace.QName GUID$6 = 
        new javax.xml.namespace.QName("", "guid");
    private static final javax.xml.namespace.QName SCALE$8 = 
        new javax.xml.namespace.QName("", "scale");
    private static final javax.xml.namespace.QName STATE$10 = 
        new javax.xml.namespace.QName("", "state");
    private static final javax.xml.namespace.QName ZOOMTOFIT$12 = 
        new javax.xml.namespace.QName("", "zoomToFit");
    
    
    /**
     * Gets the "pageMargins" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins getPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageMargins" element
     */
    public boolean isSetPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEMARGINS$0) != 0;
        }
    }
    
    /**
     * Sets the "pageMargins" element
     */
    public void setPageMargins(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins pageMargins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$0);
            }
            target.set(pageMargins);
        }
    }
    
    /**
     * Appends and returns a new empty "pageMargins" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins addNewPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pageMargins" element
     */
    public void unsetPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEMARGINS$0, 0);
        }
    }
    
    /**
     * Gets the "pageSetup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup getPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().find_element_user(PAGESETUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageSetup" element
     */
    public boolean isSetPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGESETUP$2) != 0;
        }
    }
    
    /**
     * Sets the "pageSetup" element
     */
    public void setPageSetup(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup pageSetup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().find_element_user(PAGESETUP$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().add_element_user(PAGESETUP$2);
            }
            target.set(pageSetup);
        }
    }
    
    /**
     * Appends and returns a new empty "pageSetup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup addNewPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().add_element_user(PAGESETUP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pageSetup" element
     */
    public void unsetPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGESETUP$2, 0);
        }
    }
    
    /**
     * Gets the "headerFooter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter getHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "headerFooter" element
     */
    public boolean isSetHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERFOOTER$4) != 0;
        }
    }
    
    /**
     * Sets the "headerFooter" element
     */
    public void setHeaderFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter headerFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$4);
            }
            target.set(headerFooter);
        }
    }
    
    /**
     * Appends and returns a new empty "headerFooter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter addNewHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "headerFooter" element
     */
    public void unsetHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERFOOTER$4, 0);
        }
    }
    
    /**
     * Gets the "guid" attribute
     */
    public java.lang.String getGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$6);
            return target;
        }
    }
    
    /**
     * Sets the "guid" attribute
     */
    public void setGuid(java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GUID$6);
            }
            target.setStringValue(guid);
        }
    }
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    public void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(GUID$6);
            }
            target.set(guid);
        }
    }
    
    /**
     * Gets the "scale" attribute
     */
    public long getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCALE$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SCALE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(SCALE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "scale" attribute
     */
    public boolean isSetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALE$8) != null;
        }
    }
    
    /**
     * Sets the "scale" attribute
     */
    public void setScale(long scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALE$8);
            }
            target.setLongValue(scale);
        }
    }
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    public void xsetScale(org.apache.xmlbeans.XmlUnsignedInt scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SCALE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SCALE$8);
            }
            target.set(scale);
        }
    }
    
    /**
     * Unsets the "scale" attribute
     */
    public void unsetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALE$8);
        }
    }
    
    /**
     * Gets the "state" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STATE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_store().find_attribute_user(STATE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_default_attribute_value(STATE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "state" attribute
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATE$10) != null;
        }
    }
    
    /**
     * Sets the "state" attribute
     */
    public void setState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$10);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" attribute
     */
    public void xsetState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_store().find_attribute_user(STATE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_store().add_attribute_user(STATE$10);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "state" attribute
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATE$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMTOFIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZOOMTOFIT$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZOOMTOFIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ZOOMTOFIT$12);
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
            return get_store().find_attribute_user(ZOOMTOFIT$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMTOFIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMTOFIT$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZOOMTOFIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ZOOMTOFIT$12);
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
            get_store().remove_attribute(ZOOMTOFIT$12);
        }
    }
}
