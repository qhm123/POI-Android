/*
 * XML Type:  CT_RecipientData
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_RecipientData(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRecipientDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRecipientData
{
    
    public CTRecipientDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "active");
    private static final javax.xml.namespace.QName COLUMN$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "column");
    private static final javax.xml.namespace.QName UNIQUETAG$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "uniqueTag");
    
    
    /**
     * Gets the "active" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ACTIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "active" element
     */
    public boolean isSetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVE$0) != 0;
        }
    }
    
    /**
     * Sets the "active" element
     */
    public void setActive(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff active)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ACTIVE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ACTIVE$0);
            }
            target.set(active);
        }
    }
    
    /**
     * Appends and returns a new empty "active" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ACTIVE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "active" element
     */
    public void unsetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVE$0, 0);
        }
    }
    
    /**
     * Gets the "column" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(COLUMN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "column" element
     */
    public void setColumn(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(COLUMN$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(COLUMN$2);
            }
            target.set(column);
        }
    }
    
    /**
     * Appends and returns a new empty "column" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(COLUMN$2);
            return target;
        }
    }
    
    /**
     * Gets the "uniqueTag" element
     */
    public byte[] getUniqueTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUETAG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueTag" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetUniqueTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(UNIQUETAG$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "uniqueTag" element
     */
    public void setUniqueTag(byte[] uniqueTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUETAG$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUETAG$4);
            }
            target.setByteArrayValue(uniqueTag);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueTag" element
     */
    public void xsetUniqueTag(org.apache.xmlbeans.XmlBase64Binary uniqueTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(UNIQUETAG$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(UNIQUETAG$4);
            }
            target.set(uniqueTag);
        }
    }
}
