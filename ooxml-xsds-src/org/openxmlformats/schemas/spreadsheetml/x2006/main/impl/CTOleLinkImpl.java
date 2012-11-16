/*
 * XML Type:  CT_OleLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_OleLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTOleLinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink
{
    
    public CTOleLinkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLEITEMS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleItems");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    private static final javax.xml.namespace.QName PROGID$4 = 
        new javax.xml.namespace.QName("", "progId");
    
    
    /**
     * Gets the "oleItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems getOleItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems)get_store().find_element_user(OLEITEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oleItems" element
     */
    public boolean isSetOleItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLEITEMS$0) != 0;
        }
    }
    
    /**
     * Sets the "oleItems" element
     */
    public void setOleItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems oleItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems)get_store().find_element_user(OLEITEMS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems)get_store().add_element_user(OLEITEMS$0);
            }
            target.set(oleItems);
        }
    }
    
    /**
     * Appends and returns a new empty "oleItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems addNewOleItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItems)get_store().add_element_user(OLEITEMS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "oleItems" element
     */
    public void unsetOleItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLEITEMS$0, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "progId" attribute
     */
    public java.lang.String getProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "progId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROGID$4);
            return target;
        }
    }
    
    /**
     * Sets the "progId" attribute
     */
    public void setProgId(java.lang.String progId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROGID$4);
            }
            target.setStringValue(progId);
        }
    }
    
    /**
     * Sets (as xml) the "progId" attribute
     */
    public void xsetProgId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring progId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROGID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PROGID$4);
            }
            target.set(progId);
        }
    }
}
