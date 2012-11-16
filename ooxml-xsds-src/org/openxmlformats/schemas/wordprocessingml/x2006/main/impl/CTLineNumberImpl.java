/*
 * XML Type:  CT_LineNumber
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_LineNumber(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLineNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber
{
    
    public CTLineNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTBY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "countBy");
    private static final javax.xml.namespace.QName START$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "start");
    private static final javax.xml.namespace.QName DISTANCE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "distance");
    private static final javax.xml.namespace.QName RESTART$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "restart");
    
    
    /**
     * Gets the "countBy" attribute
     */
    public java.math.BigInteger getCountBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTBY$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "countBy" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCountBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COUNTBY$0);
            return target;
        }
    }
    
    /**
     * True if has "countBy" attribute
     */
    public boolean isSetCountBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNTBY$0) != null;
        }
    }
    
    /**
     * Sets the "countBy" attribute
     */
    public void setCountBy(java.math.BigInteger countBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTBY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTBY$0);
            }
            target.setBigIntegerValue(countBy);
        }
    }
    
    /**
     * Sets (as xml) the "countBy" attribute
     */
    public void xsetCountBy(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber countBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COUNTBY$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(COUNTBY$0);
            }
            target.set(countBy);
        }
    }
    
    /**
     * Unsets the "countBy" attribute
     */
    public void unsetCountBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNTBY$0);
        }
    }
    
    /**
     * Gets the "start" attribute
     */
    public java.math.BigInteger getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(START$2);
            return target;
        }
    }
    
    /**
     * True if has "start" attribute
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(START$2) != null;
        }
    }
    
    /**
     * Sets the "start" attribute
     */
    public void setStart(java.math.BigInteger start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$2);
            }
            target.setBigIntegerValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" attribute
     */
    public void xsetStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(START$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(START$2);
            }
            target.set(start);
        }
    }
    
    /**
     * Unsets the "start" attribute
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(START$2);
        }
    }
    
    /**
     * Gets the "distance" attribute
     */
    public java.math.BigInteger getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "distance" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(DISTANCE$4);
            return target;
        }
    }
    
    /**
     * True if has "distance" attribute
     */
    public boolean isSetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTANCE$4) != null;
        }
    }
    
    /**
     * Sets the "distance" attribute
     */
    public void setDistance(java.math.BigInteger distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCE$4);
            }
            target.setBigIntegerValue(distance);
        }
    }
    
    /**
     * Sets (as xml) the "distance" attribute
     */
    public void xsetDistance(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(DISTANCE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(DISTANCE$4);
            }
            target.set(distance);
        }
    }
    
    /**
     * Unsets the "distance" attribute
     */
    public void unsetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTANCE$4);
        }
    }
    
    /**
     * Gets the "restart" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart.Enum getRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "restart" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart xgetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart)get_store().find_attribute_user(RESTART$6);
            return target;
        }
    }
    
    /**
     * True if has "restart" attribute
     */
    public boolean isSetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESTART$6) != null;
        }
    }
    
    /**
     * Sets the "restart" attribute
     */
    public void setRestart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart.Enum restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESTART$6);
            }
            target.setEnumValue(restart);
        }
    }
    
    /**
     * Sets (as xml) the "restart" attribute
     */
    public void xsetRestart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart)get_store().find_attribute_user(RESTART$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineNumberRestart)get_store().add_attribute_user(RESTART$6);
            }
            target.set(restart);
        }
    }
    
    /**
     * Unsets the "restart" attribute
     */
    public void unsetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESTART$6);
        }
    }
}
