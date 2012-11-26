/*
 * XML Type:  CT_ShowInfoBrowse
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ShowInfoBrowse(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTShowInfoBrowseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse
{
    
    public CTShowInfoBrowseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHOWSCROLLBAR$0 = 
        new javax.xml.namespace.QName("", "showScrollbar");
    
    
    /**
     * Gets the "showScrollbar" attribute
     */
    public boolean getShowScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSCROLLBAR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWSCROLLBAR$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showScrollbar" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSCROLLBAR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWSCROLLBAR$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "showScrollbar" attribute
     */
    public boolean isSetShowScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWSCROLLBAR$0) != null;
        }
    }
    
    /**
     * Sets the "showScrollbar" attribute
     */
    public void setShowScrollbar(boolean showScrollbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSCROLLBAR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWSCROLLBAR$0);
            }
            target.setBooleanValue(showScrollbar);
        }
    }
    
    /**
     * Sets (as xml) the "showScrollbar" attribute
     */
    public void xsetShowScrollbar(org.apache.xmlbeans.XmlBoolean showScrollbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSCROLLBAR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWSCROLLBAR$0);
            }
            target.set(showScrollbar);
        }
    }
    
    /**
     * Unsets the "showScrollbar" attribute
     */
    public void unsetShowScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWSCROLLBAR$0);
        }
    }
}
