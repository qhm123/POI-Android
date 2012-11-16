/*
 * XML Type:  CT_Spacing
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Spacing(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSpacingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing
{
    
    public CTSpacingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEFORE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "before");
    private static final javax.xml.namespace.QName BEFORELINES$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "beforeLines");
    private static final javax.xml.namespace.QName BEFOREAUTOSPACING$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "beforeAutospacing");
    private static final javax.xml.namespace.QName AFTER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "after");
    private static final javax.xml.namespace.QName AFTERLINES$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "afterLines");
    private static final javax.xml.namespace.QName AFTERAUTOSPACING$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "afterAutospacing");
    private static final javax.xml.namespace.QName LINE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "line");
    private static final javax.xml.namespace.QName LINERULE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lineRule");
    
    
    /**
     * Gets the "before" attribute
     */
    public java.math.BigInteger getBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEFORE$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "before" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(BEFORE$0);
            return target;
        }
    }
    
    /**
     * True if has "before" attribute
     */
    public boolean isSetBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BEFORE$0) != null;
        }
    }
    
    /**
     * Sets the "before" attribute
     */
    public void setBefore(java.math.BigInteger before)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEFORE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEFORE$0);
            }
            target.setBigIntegerValue(before);
        }
    }
    
    /**
     * Sets (as xml) the "before" attribute
     */
    public void xsetBefore(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure before)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(BEFORE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(BEFORE$0);
            }
            target.set(before);
        }
    }
    
    /**
     * Unsets the "before" attribute
     */
    public void unsetBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BEFORE$0);
        }
    }
    
    /**
     * Gets the "beforeLines" attribute
     */
    public java.math.BigInteger getBeforeLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEFORELINES$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "beforeLines" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetBeforeLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(BEFORELINES$2);
            return target;
        }
    }
    
    /**
     * True if has "beforeLines" attribute
     */
    public boolean isSetBeforeLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BEFORELINES$2) != null;
        }
    }
    
    /**
     * Sets the "beforeLines" attribute
     */
    public void setBeforeLines(java.math.BigInteger beforeLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEFORELINES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEFORELINES$2);
            }
            target.setBigIntegerValue(beforeLines);
        }
    }
    
    /**
     * Sets (as xml) the "beforeLines" attribute
     */
    public void xsetBeforeLines(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber beforeLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(BEFORELINES$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(BEFORELINES$2);
            }
            target.set(beforeLines);
        }
    }
    
    /**
     * Unsets the "beforeLines" attribute
     */
    public void unsetBeforeLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BEFORELINES$2);
        }
    }
    
    /**
     * Gets the "beforeAutospacing" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getBeforeAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEFOREAUTOSPACING$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "beforeAutospacing" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetBeforeAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(BEFOREAUTOSPACING$4);
            return target;
        }
    }
    
    /**
     * True if has "beforeAutospacing" attribute
     */
    public boolean isSetBeforeAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BEFOREAUTOSPACING$4) != null;
        }
    }
    
    /**
     * Sets the "beforeAutospacing" attribute
     */
    public void setBeforeAutospacing(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum beforeAutospacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEFOREAUTOSPACING$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEFOREAUTOSPACING$4);
            }
            target.setEnumValue(beforeAutospacing);
        }
    }
    
    /**
     * Sets (as xml) the "beforeAutospacing" attribute
     */
    public void xsetBeforeAutospacing(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff beforeAutospacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(BEFOREAUTOSPACING$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(BEFOREAUTOSPACING$4);
            }
            target.set(beforeAutospacing);
        }
    }
    
    /**
     * Unsets the "beforeAutospacing" attribute
     */
    public void unsetBeforeAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BEFOREAUTOSPACING$4);
        }
    }
    
    /**
     * Gets the "after" attribute
     */
    public java.math.BigInteger getAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTER$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "after" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(AFTER$6);
            return target;
        }
    }
    
    /**
     * True if has "after" attribute
     */
    public boolean isSetAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AFTER$6) != null;
        }
    }
    
    /**
     * Sets the "after" attribute
     */
    public void setAfter(java.math.BigInteger after)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AFTER$6);
            }
            target.setBigIntegerValue(after);
        }
    }
    
    /**
     * Sets (as xml) the "after" attribute
     */
    public void xsetAfter(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure after)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(AFTER$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(AFTER$6);
            }
            target.set(after);
        }
    }
    
    /**
     * Unsets the "after" attribute
     */
    public void unsetAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AFTER$6);
        }
    }
    
    /**
     * Gets the "afterLines" attribute
     */
    public java.math.BigInteger getAfterLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTERLINES$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "afterLines" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetAfterLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(AFTERLINES$8);
            return target;
        }
    }
    
    /**
     * True if has "afterLines" attribute
     */
    public boolean isSetAfterLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AFTERLINES$8) != null;
        }
    }
    
    /**
     * Sets the "afterLines" attribute
     */
    public void setAfterLines(java.math.BigInteger afterLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTERLINES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AFTERLINES$8);
            }
            target.setBigIntegerValue(afterLines);
        }
    }
    
    /**
     * Sets (as xml) the "afterLines" attribute
     */
    public void xsetAfterLines(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber afterLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(AFTERLINES$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(AFTERLINES$8);
            }
            target.set(afterLines);
        }
    }
    
    /**
     * Unsets the "afterLines" attribute
     */
    public void unsetAfterLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AFTERLINES$8);
        }
    }
    
    /**
     * Gets the "afterAutospacing" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getAfterAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTERAUTOSPACING$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "afterAutospacing" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetAfterAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(AFTERAUTOSPACING$10);
            return target;
        }
    }
    
    /**
     * True if has "afterAutospacing" attribute
     */
    public boolean isSetAfterAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AFTERAUTOSPACING$10) != null;
        }
    }
    
    /**
     * Sets the "afterAutospacing" attribute
     */
    public void setAfterAutospacing(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum afterAutospacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTERAUTOSPACING$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AFTERAUTOSPACING$10);
            }
            target.setEnumValue(afterAutospacing);
        }
    }
    
    /**
     * Sets (as xml) the "afterAutospacing" attribute
     */
    public void xsetAfterAutospacing(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff afterAutospacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(AFTERAUTOSPACING$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(AFTERAUTOSPACING$10);
            }
            target.set(afterAutospacing);
        }
    }
    
    /**
     * Unsets the "afterAutospacing" attribute
     */
    public void unsetAfterAutospacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AFTERAUTOSPACING$10);
        }
    }
    
    /**
     * Gets the "line" attribute
     */
    public java.math.BigInteger getLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINE$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "line" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(LINE$12);
            return target;
        }
    }
    
    /**
     * True if has "line" attribute
     */
    public boolean isSetLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINE$12) != null;
        }
    }
    
    /**
     * Sets the "line" attribute
     */
    public void setLine(java.math.BigInteger line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINE$12);
            }
            target.setBigIntegerValue(line);
        }
    }
    
    /**
     * Sets (as xml) the "line" attribute
     */
    public void xsetLine(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(LINE$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(LINE$12);
            }
            target.set(line);
        }
    }
    
    /**
     * Unsets the "line" attribute
     */
    public void unsetLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINE$12);
        }
    }
    
    /**
     * Gets the "lineRule" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule.Enum getLineRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINERULE$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lineRule" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule xgetLineRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule)get_store().find_attribute_user(LINERULE$14);
            return target;
        }
    }
    
    /**
     * True if has "lineRule" attribute
     */
    public boolean isSetLineRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINERULE$14) != null;
        }
    }
    
    /**
     * Sets the "lineRule" attribute
     */
    public void setLineRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule.Enum lineRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINERULE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINERULE$14);
            }
            target.setEnumValue(lineRule);
        }
    }
    
    /**
     * Sets (as xml) the "lineRule" attribute
     */
    public void xsetLineRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule lineRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule)get_store().find_attribute_user(LINERULE$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule)get_store().add_attribute_user(LINERULE$14);
            }
            target.set(lineRule);
        }
    }
    
    /**
     * Unsets the "lineRule" attribute
     */
    public void unsetLineRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINERULE$14);
        }
    }
}
