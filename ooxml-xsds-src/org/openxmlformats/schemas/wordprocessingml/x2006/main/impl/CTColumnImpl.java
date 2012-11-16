/*
 * XML Type:  CT_Column
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Column(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn
{
    
    public CTColumnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName W$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
    private static final javax.xml.namespace.QName SPACE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "space");
    
    
    /**
     * Gets the "w" attribute
     */
    public java.math.BigInteger getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "w" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(W$0);
            return target;
        }
    }
    
    /**
     * True if has "w" attribute
     */
    public boolean isSetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(W$0) != null;
        }
    }
    
    /**
     * Sets the "w" attribute
     */
    public void setW(java.math.BigInteger w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(W$0);
            }
            target.setBigIntegerValue(w);
        }
    }
    
    /**
     * Sets (as xml) the "w" attribute
     */
    public void xsetW(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(W$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(W$0);
            }
            target.set(w);
        }
    }
    
    /**
     * Unsets the "w" attribute
     */
    public void unsetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(W$0);
        }
    }
    
    /**
     * Gets the "space" attribute
     */
    public java.math.BigInteger getSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "space" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(SPACE$2);
            return target;
        }
    }
    
    /**
     * True if has "space" attribute
     */
    public boolean isSetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPACE$2) != null;
        }
    }
    
    /**
     * Sets the "space" attribute
     */
    public void setSpace(java.math.BigInteger space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$2);
            }
            target.setBigIntegerValue(space);
        }
    }
    
    /**
     * Sets (as xml) the "space" attribute
     */
    public void xsetSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(SPACE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(SPACE$2);
            }
            target.set(space);
        }
    }
    
    /**
     * Unsets the "space" attribute
     */
    public void unsetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPACE$2);
        }
    }
}
