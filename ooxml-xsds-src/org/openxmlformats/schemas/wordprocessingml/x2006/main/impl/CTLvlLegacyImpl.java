/*
 * XML Type:  CT_LvlLegacy
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_LvlLegacy(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLvlLegacyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy
{
    
    public CTLvlLegacyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGACY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "legacy");
    private static final javax.xml.namespace.QName LEGACYSPACE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "legacySpace");
    private static final javax.xml.namespace.QName LEGACYINDENT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "legacyIndent");
    
    
    /**
     * Gets the "legacy" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGACY$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "legacy" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(LEGACY$0);
            return target;
        }
    }
    
    /**
     * True if has "legacy" attribute
     */
    public boolean isSetLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEGACY$0) != null;
        }
    }
    
    /**
     * Sets the "legacy" attribute
     */
    public void setLegacy(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum legacy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGACY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEGACY$0);
            }
            target.setEnumValue(legacy);
        }
    }
    
    /**
     * Sets (as xml) the "legacy" attribute
     */
    public void xsetLegacy(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff legacy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(LEGACY$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(LEGACY$0);
            }
            target.set(legacy);
        }
    }
    
    /**
     * Unsets the "legacy" attribute
     */
    public void unsetLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEGACY$0);
        }
    }
    
    /**
     * Gets the "legacySpace" attribute
     */
    public java.math.BigInteger getLegacySpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGACYSPACE$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "legacySpace" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetLegacySpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(LEGACYSPACE$2);
            return target;
        }
    }
    
    /**
     * True if has "legacySpace" attribute
     */
    public boolean isSetLegacySpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEGACYSPACE$2) != null;
        }
    }
    
    /**
     * Sets the "legacySpace" attribute
     */
    public void setLegacySpace(java.math.BigInteger legacySpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGACYSPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEGACYSPACE$2);
            }
            target.setBigIntegerValue(legacySpace);
        }
    }
    
    /**
     * Sets (as xml) the "legacySpace" attribute
     */
    public void xsetLegacySpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure legacySpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(LEGACYSPACE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(LEGACYSPACE$2);
            }
            target.set(legacySpace);
        }
    }
    
    /**
     * Unsets the "legacySpace" attribute
     */
    public void unsetLegacySpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEGACYSPACE$2);
        }
    }
    
    /**
     * Gets the "legacyIndent" attribute
     */
    public java.math.BigInteger getLegacyIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGACYINDENT$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "legacyIndent" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetLegacyIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(LEGACYINDENT$4);
            return target;
        }
    }
    
    /**
     * True if has "legacyIndent" attribute
     */
    public boolean isSetLegacyIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEGACYINDENT$4) != null;
        }
    }
    
    /**
     * Sets the "legacyIndent" attribute
     */
    public void setLegacyIndent(java.math.BigInteger legacyIndent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEGACYINDENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEGACYINDENT$4);
            }
            target.setBigIntegerValue(legacyIndent);
        }
    }
    
    /**
     * Sets (as xml) the "legacyIndent" attribute
     */
    public void xsetLegacyIndent(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure legacyIndent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(LEGACYINDENT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(LEGACYINDENT$4);
            }
            target.set(legacyIndent);
        }
    }
    
    /**
     * Unsets the "legacyIndent" attribute
     */
    public void unsetLegacyIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEGACYINDENT$4);
        }
    }
}
