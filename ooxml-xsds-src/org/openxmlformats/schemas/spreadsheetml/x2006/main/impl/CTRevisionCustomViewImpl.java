/*
 * XML Type:  CT_RevisionCustomView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionCustomView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionCustomViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView
{
    
    public CTRevisionCustomViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GUID$0 = 
        new javax.xml.namespace.QName("", "guid");
    private static final javax.xml.namespace.QName ACTION$2 = 
        new javax.xml.namespace.QName("", "action");
    
    
    /**
     * Gets the "guid" attribute
     */
    public java.lang.String getGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GUID$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(GUID$0);
            }
            target.set(guid);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction)get_store().find_attribute_user(ACTION$2);
            return target;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$2);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction)get_store().add_attribute_user(ACTION$2);
            }
            target.set(action);
        }
    }
}
