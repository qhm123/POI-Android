/*
 * XML Type:  CT_Height
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Height(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTHeightImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight
{
    
    public CTHeightImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    private static final javax.xml.namespace.QName HRULE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hRule");
    
    
    /**
     * Gets the "val" attribute
     */
    public java.math.BigInteger getVal()
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
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * True if has "val" attribute
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VAL$0) != null;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(java.math.BigInteger val)
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
            target.setBigIntegerValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Unsets the "val" attribute
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VAL$0);
        }
    }
    
    /**
     * Gets the "hRule" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum getHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRULE$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hRule" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule xgetHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule)get_store().find_attribute_user(HRULE$2);
            return target;
        }
    }
    
    /**
     * True if has "hRule" attribute
     */
    public boolean isSetHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRULE$2) != null;
        }
    }
    
    /**
     * Sets the "hRule" attribute
     */
    public void setHRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum hRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRULE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRULE$2);
            }
            target.setEnumValue(hRule);
        }
    }
    
    /**
     * Sets (as xml) the "hRule" attribute
     */
    public void xsetHRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule hRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule)get_store().find_attribute_user(HRULE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule)get_store().add_attribute_user(HRULE$2);
            }
            target.set(hRule);
        }
    }
    
    /**
     * Unsets the "hRule" attribute
     */
    public void unsetHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRULE$2);
        }
    }
}
