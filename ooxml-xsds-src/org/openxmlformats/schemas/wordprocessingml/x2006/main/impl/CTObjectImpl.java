/*
 * XML Type:  CT_Object
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Object(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTObjectImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTPictureBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject
{
    
    public CTObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "control");
    private static final javax.xml.namespace.QName DXAORIG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dxaOrig");
    private static final javax.xml.namespace.QName DYAORIG$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dyaOrig");
    
    
    /**
     * Gets the "control" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl getControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().find_element_user(CONTROL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "control" element
     */
    public boolean isSetControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROL$0) != 0;
        }
    }
    
    /**
     * Sets the "control" element
     */
    public void setControl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl control)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().find_element_user(CONTROL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().add_element_user(CONTROL$0);
            }
            target.set(control);
        }
    }
    
    /**
     * Appends and returns a new empty "control" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl addNewControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().add_element_user(CONTROL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "control" element
     */
    public void unsetControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROL$0, 0);
        }
    }
    
    /**
     * Gets the "dxaOrig" attribute
     */
    public java.math.BigInteger getDxaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXAORIG$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dxaOrig" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetDxaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(DXAORIG$2);
            return target;
        }
    }
    
    /**
     * True if has "dxaOrig" attribute
     */
    public boolean isSetDxaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DXAORIG$2) != null;
        }
    }
    
    /**
     * Sets the "dxaOrig" attribute
     */
    public void setDxaOrig(java.math.BigInteger dxaOrig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXAORIG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DXAORIG$2);
            }
            target.setBigIntegerValue(dxaOrig);
        }
    }
    
    /**
     * Sets (as xml) the "dxaOrig" attribute
     */
    public void xsetDxaOrig(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure dxaOrig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(DXAORIG$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(DXAORIG$2);
            }
            target.set(dxaOrig);
        }
    }
    
    /**
     * Unsets the "dxaOrig" attribute
     */
    public void unsetDxaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DXAORIG$2);
        }
    }
    
    /**
     * Gets the "dyaOrig" attribute
     */
    public java.math.BigInteger getDyaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DYAORIG$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dyaOrig" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetDyaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(DYAORIG$4);
            return target;
        }
    }
    
    /**
     * True if has "dyaOrig" attribute
     */
    public boolean isSetDyaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DYAORIG$4) != null;
        }
    }
    
    /**
     * Sets the "dyaOrig" attribute
     */
    public void setDyaOrig(java.math.BigInteger dyaOrig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DYAORIG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DYAORIG$4);
            }
            target.setBigIntegerValue(dyaOrig);
        }
    }
    
    /**
     * Sets (as xml) the "dyaOrig" attribute
     */
    public void xsetDyaOrig(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure dyaOrig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(DYAORIG$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(DYAORIG$4);
            }
            target.set(dyaOrig);
        }
    }
    
    /**
     * Unsets the "dyaOrig" attribute
     */
    public void unsetDyaOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DYAORIG$4);
        }
    }
}
