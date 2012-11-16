/*
 * XML Type:  CT_TLTimeAnimateValue
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTimeAnimateValue(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTimeAnimateValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValue
{
    
    public CTTLTimeAnimateValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "val");
    private static final javax.xml.namespace.QName TM$2 = 
        new javax.xml.namespace.QName("", "tm");
    private static final javax.xml.namespace.QName FMLA$4 = 
        new javax.xml.namespace.QName("", "fmla");
    
    
    /**
     * Gets the "val" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().find_element_user(VAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "val" element
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAL$0) != 0;
        }
    }
    
    /**
     * Sets the "val" element
     */
    public void setVal(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().find_element_user(VAL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().add_element_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Appends and returns a new empty "val" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant addNewVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().add_element_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "val" element
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAL$0, 0);
        }
    }
    
    /**
     * Gets the "tm" attribute
     */
    public java.lang.Object getTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TM$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "tm" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime xgetTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime)get_store().find_attribute_user(TM$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime)get_default_attribute_value(TM$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "tm" attribute
     */
    public boolean isSetTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TM$2) != null;
        }
    }
    
    /**
     * Sets the "tm" attribute
     */
    public void setTm(java.lang.Object tm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TM$2);
            }
            target.setObjectValue(tm);
        }
    }
    
    /**
     * Sets (as xml) the "tm" attribute
     */
    public void xsetTm(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime tm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime)get_store().find_attribute_user(TM$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeAnimateValueTime)get_store().add_attribute_user(TM$2);
            }
            target.set(tm);
        }
    }
    
    /**
     * Unsets the "tm" attribute
     */
    public void unsetTm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TM$2);
        }
    }
    
    /**
     * Gets the "fmla" attribute
     */
    public java.lang.String getFmla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMLA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FMLA$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmla" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFmla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FMLA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FMLA$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "fmla" attribute
     */
    public boolean isSetFmla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FMLA$4) != null;
        }
    }
    
    /**
     * Sets the "fmla" attribute
     */
    public void setFmla(java.lang.String fmla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMLA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FMLA$4);
            }
            target.setStringValue(fmla);
        }
    }
    
    /**
     * Sets (as xml) the "fmla" attribute
     */
    public void xsetFmla(org.apache.xmlbeans.XmlString fmla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FMLA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FMLA$4);
            }
            target.set(fmla);
        }
    }
    
    /**
     * Unsets the "fmla" attribute
     */
    public void unsetFmla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FMLA$4);
        }
    }
}
