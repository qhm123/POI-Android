/*
 * XML Type:  CT_DdeLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DdeLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDdeLinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink
{
    
    public CTDdeLinkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DDEITEMS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ddeItems");
    private static final javax.xml.namespace.QName DDESERVICE$2 = 
        new javax.xml.namespace.QName("", "ddeService");
    private static final javax.xml.namespace.QName DDETOPIC$4 = 
        new javax.xml.namespace.QName("", "ddeTopic");
    
    
    /**
     * Gets the "ddeItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems getDdeItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems)get_store().find_element_user(DDEITEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ddeItems" element
     */
    public boolean isSetDdeItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DDEITEMS$0) != 0;
        }
    }
    
    /**
     * Sets the "ddeItems" element
     */
    public void setDdeItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems ddeItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems)get_store().find_element_user(DDEITEMS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems)get_store().add_element_user(DDEITEMS$0);
            }
            target.set(ddeItems);
        }
    }
    
    /**
     * Appends and returns a new empty "ddeItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems addNewDdeItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems)get_store().add_element_user(DDEITEMS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ddeItems" element
     */
    public void unsetDdeItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DDEITEMS$0, 0);
        }
    }
    
    /**
     * Gets the "ddeService" attribute
     */
    public java.lang.String getDdeService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DDESERVICE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ddeService" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDdeService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DDESERVICE$2);
            return target;
        }
    }
    
    /**
     * Sets the "ddeService" attribute
     */
    public void setDdeService(java.lang.String ddeService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DDESERVICE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DDESERVICE$2);
            }
            target.setStringValue(ddeService);
        }
    }
    
    /**
     * Sets (as xml) the "ddeService" attribute
     */
    public void xsetDdeService(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring ddeService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DDESERVICE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DDESERVICE$2);
            }
            target.set(ddeService);
        }
    }
    
    /**
     * Gets the "ddeTopic" attribute
     */
    public java.lang.String getDdeTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DDETOPIC$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ddeTopic" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDdeTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DDETOPIC$4);
            return target;
        }
    }
    
    /**
     * Sets the "ddeTopic" attribute
     */
    public void setDdeTopic(java.lang.String ddeTopic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DDETOPIC$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DDETOPIC$4);
            }
            target.setStringValue(ddeTopic);
        }
    }
    
    /**
     * Sets (as xml) the "ddeTopic" attribute
     */
    public void xsetDdeTopic(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring ddeTopic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DDETOPIC$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DDETOPIC$4);
            }
            target.set(ddeTopic);
        }
    }
}
