/*
 * XML Type:  CT_TabStop
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TabStop(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTabStopImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop
{
    
    public CTTabStopImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    private static final javax.xml.namespace.QName LEADER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "leader");
    private static final javax.xml.namespace.QName POS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pos");
    
    
    /**
     * Gets the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc.Enum getVal()
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
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc.Enum val)
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
            target.setEnumValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Gets the "leader" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc.Enum getLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEADER$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "leader" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc xgetLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc)get_store().find_attribute_user(LEADER$2);
            return target;
        }
    }
    
    /**
     * True if has "leader" attribute
     */
    public boolean isSetLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEADER$2) != null;
        }
    }
    
    /**
     * Sets the "leader" attribute
     */
    public void setLeader(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc.Enum leader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEADER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEADER$2);
            }
            target.setEnumValue(leader);
        }
    }
    
    /**
     * Sets (as xml) the "leader" attribute
     */
    public void xsetLeader(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc leader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc)get_store().find_attribute_user(LEADER$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc)get_store().add_attribute_user(LEADER$2);
            }
            target.set(leader);
        }
    }
    
    /**
     * Unsets the "leader" attribute
     */
    public void unsetLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEADER$2);
        }
    }
    
    /**
     * Gets the "pos" attribute
     */
    public java.math.BigInteger getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "pos" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(POS$4);
            return target;
        }
    }
    
    /**
     * Sets the "pos" attribute
     */
    public void setPos(java.math.BigInteger pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POS$4);
            }
            target.setBigIntegerValue(pos);
        }
    }
    
    /**
     * Sets (as xml) the "pos" attribute
     */
    public void xsetPos(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(POS$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(POS$4);
            }
            target.set(pos);
        }
    }
}
