/*
 * XML Type:  CT_PaperSource
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PaperSource(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPaperSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource
{
    
    public CTPaperSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "first");
    private static final javax.xml.namespace.QName OTHER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "other");
    
    
    /**
     * Gets the "first" attribute
     */
    public java.math.BigInteger getFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "first" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(FIRST$0);
            return target;
        }
    }
    
    /**
     * True if has "first" attribute
     */
    public boolean isSetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRST$0) != null;
        }
    }
    
    /**
     * Sets the "first" attribute
     */
    public void setFirst(java.math.BigInteger first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRST$0);
            }
            target.setBigIntegerValue(first);
        }
    }
    
    /**
     * Sets (as xml) the "first" attribute
     */
    public void xsetFirst(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(FIRST$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(FIRST$0);
            }
            target.set(first);
        }
    }
    
    /**
     * Unsets the "first" attribute
     */
    public void unsetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRST$0);
        }
    }
    
    /**
     * Gets the "other" attribute
     */
    public java.math.BigInteger getOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OTHER$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "other" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(OTHER$2);
            return target;
        }
    }
    
    /**
     * True if has "other" attribute
     */
    public boolean isSetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OTHER$2) != null;
        }
    }
    
    /**
     * Sets the "other" attribute
     */
    public void setOther(java.math.BigInteger other)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OTHER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OTHER$2);
            }
            target.setBigIntegerValue(other);
        }
    }
    
    /**
     * Sets (as xml) the "other" attribute
     */
    public void xsetOther(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber other)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(OTHER$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(OTHER$2);
            }
            target.set(other);
        }
    }
    
    /**
     * Unsets the "other" attribute
     */
    public void unsetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OTHER$2);
        }
    }
}
