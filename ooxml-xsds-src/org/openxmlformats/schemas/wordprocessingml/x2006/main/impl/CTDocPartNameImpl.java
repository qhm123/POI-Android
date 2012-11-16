/*
 * XML Type:  CT_DocPartName
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocPartName(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName
{
    
    public CTDocPartNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    private static final javax.xml.namespace.QName DECORATED$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "decorated");
    
    
    /**
     * Gets the "val" attribute
     */
    public java.lang.String getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(java.lang.String val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setStringValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Gets the "decorated" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDecorated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECORATED$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "decorated" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDecorated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DECORATED$2);
            return target;
        }
    }
    
    /**
     * True if has "decorated" attribute
     */
    public boolean isSetDecorated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECORATED$2) != null;
        }
    }
    
    /**
     * Sets the "decorated" attribute
     */
    public void setDecorated(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum decorated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECORATED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECORATED$2);
            }
            target.setEnumValue(decorated);
        }
    }
    
    /**
     * Sets (as xml) the "decorated" attribute
     */
    public void xsetDecorated(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff decorated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DECORATED$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(DECORATED$2);
            }
            target.set(decorated);
        }
    }
    
    /**
     * Unsets the "decorated" attribute
     */
    public void unsetDecorated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECORATED$2);
        }
    }
}
