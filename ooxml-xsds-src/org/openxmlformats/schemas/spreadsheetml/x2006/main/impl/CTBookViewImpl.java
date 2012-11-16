/*
 * XML Type:  CT_BookView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_BookView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBookViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView
{
    
    public CTBookViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName VISIBILITY$2 = 
        new javax.xml.namespace.QName("", "visibility");
    private static final javax.xml.namespace.QName MINIMIZED$4 = 
        new javax.xml.namespace.QName("", "minimized");
    private static final javax.xml.namespace.QName SHOWHORIZONTALSCROLL$6 = 
        new javax.xml.namespace.QName("", "showHorizontalScroll");
    private static final javax.xml.namespace.QName SHOWVERTICALSCROLL$8 = 
        new javax.xml.namespace.QName("", "showVerticalScroll");
    private static final javax.xml.namespace.QName SHOWSHEETTABS$10 = 
        new javax.xml.namespace.QName("", "showSheetTabs");
    private static final javax.xml.namespace.QName XWINDOW$12 = 
        new javax.xml.namespace.QName("", "xWindow");
    private static final javax.xml.namespace.QName YWINDOW$14 = 
        new javax.xml.namespace.QName("", "yWindow");
    private static final javax.xml.namespace.QName WINDOWWIDTH$16 = 
        new javax.xml.namespace.QName("", "windowWidth");
    private static final javax.xml.namespace.QName WINDOWHEIGHT$18 = 
        new javax.xml.namespace.QName("", "windowHeight");
    private static final javax.xml.namespace.QName TABRATIO$20 = 
        new javax.xml.namespace.QName("", "tabRatio");
    private static final javax.xml.namespace.QName FIRSTSHEET$22 = 
        new javax.xml.namespace.QName("", "firstSheet");
    private static final javax.xml.namespace.QName ACTIVETAB$24 = 
        new javax.xml.namespace.QName("", "activeTab");
    private static final javax.xml.namespace.QName AUTOFILTERDATEGROUPING$26 = 
        new javax.xml.namespace.QName("", "autoFilterDateGrouping");
    
    
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
     * Gets the "visibility" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility.Enum getVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISIBILITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VISIBILITY$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "visibility" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility xgetVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility)get_store().find_attribute_user(VISIBILITY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility)get_default_attribute_value(VISIBILITY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "visibility" attribute
     */
    public boolean isSetVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VISIBILITY$2) != null;
        }
    }
    
    /**
     * Sets the "visibility" attribute
     */
    public void setVisibility(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility.Enum visibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISIBILITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISIBILITY$2);
            }
            target.setEnumValue(visibility);
        }
    }
    
    /**
     * Sets (as xml) the "visibility" attribute
     */
    public void xsetVisibility(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility visibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility)get_store().find_attribute_user(VISIBILITY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility)get_store().add_attribute_user(VISIBILITY$2);
            }
            target.set(visibility);
        }
    }
    
    /**
     * Unsets the "visibility" attribute
     */
    public void unsetVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VISIBILITY$2);
        }
    }
    
    /**
     * Gets the "minimized" attribute
     */
    public boolean getMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMIZED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINIMIZED$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimized" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINIMIZED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MINIMIZED$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "minimized" attribute
     */
    public boolean isSetMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINIMIZED$4) != null;
        }
    }
    
    /**
     * Sets the "minimized" attribute
     */
    public void setMinimized(boolean minimized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMIZED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINIMIZED$4);
            }
            target.setBooleanValue(minimized);
        }
    }
    
    /**
     * Sets (as xml) the "minimized" attribute
     */
    public void xsetMinimized(org.apache.xmlbeans.XmlBoolean minimized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINIMIZED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MINIMIZED$4);
            }
            target.set(minimized);
        }
    }
    
    /**
     * Unsets the "minimized" attribute
     */
    public void unsetMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINIMIZED$4);
        }
    }
    
    /**
     * Gets the "showHorizontalScroll" attribute
     */
    public boolean getShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWHORIZONTALSCROLL$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showHorizontalScroll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWHORIZONTALSCROLL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "showHorizontalScroll" attribute
     */
    public boolean isSetShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6) != null;
        }
    }
    
    /**
     * Sets the "showHorizontalScroll" attribute
     */
    public void setShowHorizontalScroll(boolean showHorizontalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWHORIZONTALSCROLL$6);
            }
            target.setBooleanValue(showHorizontalScroll);
        }
    }
    
    /**
     * Sets (as xml) the "showHorizontalScroll" attribute
     */
    public void xsetShowHorizontalScroll(org.apache.xmlbeans.XmlBoolean showHorizontalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWHORIZONTALSCROLL$6);
            }
            target.set(showHorizontalScroll);
        }
    }
    
    /**
     * Unsets the "showHorizontalScroll" attribute
     */
    public void unsetShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWHORIZONTALSCROLL$6);
        }
    }
    
    /**
     * Gets the "showVerticalScroll" attribute
     */
    public boolean getShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWVERTICALSCROLL$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showVerticalScroll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWVERTICALSCROLL$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "showVerticalScroll" attribute
     */
    public boolean isSetShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWVERTICALSCROLL$8) != null;
        }
    }
    
    /**
     * Sets the "showVerticalScroll" attribute
     */
    public void setShowVerticalScroll(boolean showVerticalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWVERTICALSCROLL$8);
            }
            target.setBooleanValue(showVerticalScroll);
        }
    }
    
    /**
     * Sets (as xml) the "showVerticalScroll" attribute
     */
    public void xsetShowVerticalScroll(org.apache.xmlbeans.XmlBoolean showVerticalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWVERTICALSCROLL$8);
            }
            target.set(showVerticalScroll);
        }
    }
    
    /**
     * Unsets the "showVerticalScroll" attribute
     */
    public void unsetShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWVERTICALSCROLL$8);
        }
    }
    
    /**
     * Gets the "showSheetTabs" attribute
     */
    public boolean getShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSHEETTABS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWSHEETTABS$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showSheetTabs" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSHEETTABS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWSHEETTABS$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "showSheetTabs" attribute
     */
    public boolean isSetShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWSHEETTABS$10) != null;
        }
    }
    
    /**
     * Sets the "showSheetTabs" attribute
     */
    public void setShowSheetTabs(boolean showSheetTabs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSHEETTABS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWSHEETTABS$10);
            }
            target.setBooleanValue(showSheetTabs);
        }
    }
    
    /**
     * Sets (as xml) the "showSheetTabs" attribute
     */
    public void xsetShowSheetTabs(org.apache.xmlbeans.XmlBoolean showSheetTabs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSHEETTABS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWSHEETTABS$10);
            }
            target.set(showSheetTabs);
        }
    }
    
    /**
     * Unsets the "showSheetTabs" attribute
     */
    public void unsetShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWSHEETTABS$10);
        }
    }
    
    /**
     * Gets the "xWindow" attribute
     */
    public int getXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XWINDOW$12);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "xWindow" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(XWINDOW$12);
            return target;
        }
    }
    
    /**
     * True if has "xWindow" attribute
     */
    public boolean isSetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XWINDOW$12) != null;
        }
    }
    
    /**
     * Sets the "xWindow" attribute
     */
    public void setXWindow(int xWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XWINDOW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XWINDOW$12);
            }
            target.setIntValue(xWindow);
        }
    }
    
    /**
     * Sets (as xml) the "xWindow" attribute
     */
    public void xsetXWindow(org.apache.xmlbeans.XmlInt xWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(XWINDOW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(XWINDOW$12);
            }
            target.set(xWindow);
        }
    }
    
    /**
     * Unsets the "xWindow" attribute
     */
    public void unsetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XWINDOW$12);
        }
    }
    
    /**
     * Gets the "yWindow" attribute
     */
    public int getYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YWINDOW$14);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "yWindow" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(YWINDOW$14);
            return target;
        }
    }
    
    /**
     * True if has "yWindow" attribute
     */
    public boolean isSetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(YWINDOW$14) != null;
        }
    }
    
    /**
     * Sets the "yWindow" attribute
     */
    public void setYWindow(int yWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YWINDOW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YWINDOW$14);
            }
            target.setIntValue(yWindow);
        }
    }
    
    /**
     * Sets (as xml) the "yWindow" attribute
     */
    public void xsetYWindow(org.apache.xmlbeans.XmlInt yWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(YWINDOW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(YWINDOW$14);
            }
            target.set(yWindow);
        }
    }
    
    /**
     * Unsets the "yWindow" attribute
     */
    public void unsetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(YWINDOW$14);
        }
    }
    
    /**
     * Gets the "windowWidth" attribute
     */
    public long getWindowWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWWIDTH$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "windowWidth" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetWindowWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWWIDTH$16);
            return target;
        }
    }
    
    /**
     * True if has "windowWidth" attribute
     */
    public boolean isSetWindowWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WINDOWWIDTH$16) != null;
        }
    }
    
    /**
     * Sets the "windowWidth" attribute
     */
    public void setWindowWidth(long windowWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWWIDTH$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WINDOWWIDTH$16);
            }
            target.setLongValue(windowWidth);
        }
    }
    
    /**
     * Sets (as xml) the "windowWidth" attribute
     */
    public void xsetWindowWidth(org.apache.xmlbeans.XmlUnsignedInt windowWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWWIDTH$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(WINDOWWIDTH$16);
            }
            target.set(windowWidth);
        }
    }
    
    /**
     * Unsets the "windowWidth" attribute
     */
    public void unsetWindowWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WINDOWWIDTH$16);
        }
    }
    
    /**
     * Gets the "windowHeight" attribute
     */
    public long getWindowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWHEIGHT$18);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "windowHeight" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetWindowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWHEIGHT$18);
            return target;
        }
    }
    
    /**
     * True if has "windowHeight" attribute
     */
    public boolean isSetWindowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WINDOWHEIGHT$18) != null;
        }
    }
    
    /**
     * Sets the "windowHeight" attribute
     */
    public void setWindowHeight(long windowHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWHEIGHT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WINDOWHEIGHT$18);
            }
            target.setLongValue(windowHeight);
        }
    }
    
    /**
     * Sets (as xml) the "windowHeight" attribute
     */
    public void xsetWindowHeight(org.apache.xmlbeans.XmlUnsignedInt windowHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWHEIGHT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(WINDOWHEIGHT$18);
            }
            target.set(windowHeight);
        }
    }
    
    /**
     * Unsets the "windowHeight" attribute
     */
    public void unsetWindowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WINDOWHEIGHT$18);
        }
    }
    
    /**
     * Gets the "tabRatio" attribute
     */
    public long getTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABRATIO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TABRATIO$20);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "tabRatio" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TABRATIO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(TABRATIO$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "tabRatio" attribute
     */
    public boolean isSetTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABRATIO$20) != null;
        }
    }
    
    /**
     * Sets the "tabRatio" attribute
     */
    public void setTabRatio(long tabRatio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABRATIO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABRATIO$20);
            }
            target.setLongValue(tabRatio);
        }
    }
    
    /**
     * Sets (as xml) the "tabRatio" attribute
     */
    public void xsetTabRatio(org.apache.xmlbeans.XmlUnsignedInt tabRatio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TABRATIO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(TABRATIO$20);
            }
            target.set(tabRatio);
        }
    }
    
    /**
     * Unsets the "tabRatio" attribute
     */
    public void unsetTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABRATIO$20);
        }
    }
    
    /**
     * Gets the "firstSheet" attribute
     */
    public long getFirstSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTSHEET$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTSHEET$22);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstSheet" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFirstSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTSHEET$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(FIRSTSHEET$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstSheet" attribute
     */
    public boolean isSetFirstSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTSHEET$22) != null;
        }
    }
    
    /**
     * Sets the "firstSheet" attribute
     */
    public void setFirstSheet(long firstSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTSHEET$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTSHEET$22);
            }
            target.setLongValue(firstSheet);
        }
    }
    
    /**
     * Sets (as xml) the "firstSheet" attribute
     */
    public void xsetFirstSheet(org.apache.xmlbeans.XmlUnsignedInt firstSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTSHEET$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIRSTSHEET$22);
            }
            target.set(firstSheet);
        }
    }
    
    /**
     * Unsets the "firstSheet" attribute
     */
    public void unsetFirstSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTSHEET$22);
        }
    }
    
    /**
     * Gets the "activeTab" attribute
     */
    public long getActiveTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVETAB$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTIVETAB$24);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeTab" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetActiveTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVETAB$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ACTIVETAB$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "activeTab" attribute
     */
    public boolean isSetActiveTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVETAB$24) != null;
        }
    }
    
    /**
     * Sets the "activeTab" attribute
     */
    public void setActiveTab(long activeTab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVETAB$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVETAB$24);
            }
            target.setLongValue(activeTab);
        }
    }
    
    /**
     * Sets (as xml) the "activeTab" attribute
     */
    public void xsetActiveTab(org.apache.xmlbeans.XmlUnsignedInt activeTab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVETAB$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ACTIVETAB$24);
            }
            target.set(activeTab);
        }
    }
    
    /**
     * Unsets the "activeTab" attribute
     */
    public void unsetActiveTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVETAB$24);
        }
    }
    
    /**
     * Gets the "autoFilterDateGrouping" attribute
     */
    public boolean getAutoFilterDateGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOFILTERDATEGROUPING$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoFilterDateGrouping" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoFilterDateGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOFILTERDATEGROUPING$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoFilterDateGrouping" attribute
     */
    public boolean isSetAutoFilterDateGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26) != null;
        }
    }
    
    /**
     * Sets the "autoFilterDateGrouping" attribute
     */
    public void setAutoFilterDateGrouping(boolean autoFilterDateGrouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFILTERDATEGROUPING$26);
            }
            target.setBooleanValue(autoFilterDateGrouping);
        }
    }
    
    /**
     * Sets (as xml) the "autoFilterDateGrouping" attribute
     */
    public void xsetAutoFilterDateGrouping(org.apache.xmlbeans.XmlBoolean autoFilterDateGrouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOFILTERDATEGROUPING$26);
            }
            target.set(autoFilterDateGrouping);
        }
    }
    
    /**
     * Unsets the "autoFilterDateGrouping" attribute
     */
    public void unsetAutoFilterDateGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOFILTERDATEGROUPING$26);
        }
    }
}
