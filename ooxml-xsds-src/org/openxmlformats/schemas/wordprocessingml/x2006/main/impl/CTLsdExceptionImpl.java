/*
 * XML Type:  CT_LsdException
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_LsdException(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLsdExceptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException
{
    
    public CTLsdExceptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName LOCKED$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "locked");
    private static final javax.xml.namespace.QName UIPRIORITY$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "uiPriority");
    private static final javax.xml.namespace.QName SEMIHIDDEN$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "semiHidden");
    private static final javax.xml.namespace.QName UNHIDEWHENUSED$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "unhideWhenUsed");
    private static final javax.xml.namespace.QName QFORMAT$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "qFormat");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "locked" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "locked" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(LOCKED$2);
            return target;
        }
    }
    
    /**
     * True if has "locked" attribute
     */
    public boolean isSetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCKED$2) != null;
        }
    }
    
    /**
     * Sets the "locked" attribute
     */
    public void setLocked(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKED$2);
            }
            target.setEnumValue(locked);
        }
    }
    
    /**
     * Sets (as xml) the "locked" attribute
     */
    public void xsetLocked(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(LOCKED$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(LOCKED$2);
            }
            target.set(locked);
        }
    }
    
    /**
     * Unsets the "locked" attribute
     */
    public void unsetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCKED$2);
        }
    }
    
    /**
     * Gets the "uiPriority" attribute
     */
    public java.math.BigInteger getUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIPRIORITY$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "uiPriority" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(UIPRIORITY$4);
            return target;
        }
    }
    
    /**
     * True if has "uiPriority" attribute
     */
    public boolean isSetUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UIPRIORITY$4) != null;
        }
    }
    
    /**
     * Sets the "uiPriority" attribute
     */
    public void setUiPriority(java.math.BigInteger uiPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIPRIORITY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UIPRIORITY$4);
            }
            target.setBigIntegerValue(uiPriority);
        }
    }
    
    /**
     * Sets (as xml) the "uiPriority" attribute
     */
    public void xsetUiPriority(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber uiPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(UIPRIORITY$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(UIPRIORITY$4);
            }
            target.set(uiPriority);
        }
    }
    
    /**
     * Unsets the "uiPriority" attribute
     */
    public void unsetUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UIPRIORITY$4);
        }
    }
    
    /**
     * Gets the "semiHidden" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMIHIDDEN$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "semiHidden" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SEMIHIDDEN$6);
            return target;
        }
    }
    
    /**
     * True if has "semiHidden" attribute
     */
    public boolean isSetSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEMIHIDDEN$6) != null;
        }
    }
    
    /**
     * Sets the "semiHidden" attribute
     */
    public void setSemiHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum semiHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMIHIDDEN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEMIHIDDEN$6);
            }
            target.setEnumValue(semiHidden);
        }
    }
    
    /**
     * Sets (as xml) the "semiHidden" attribute
     */
    public void xsetSemiHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff semiHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SEMIHIDDEN$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(SEMIHIDDEN$6);
            }
            target.set(semiHidden);
        }
    }
    
    /**
     * Unsets the "semiHidden" attribute
     */
    public void unsetSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEMIHIDDEN$6);
        }
    }
    
    /**
     * Gets the "unhideWhenUsed" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNHIDEWHENUSED$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "unhideWhenUsed" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(UNHIDEWHENUSED$8);
            return target;
        }
    }
    
    /**
     * True if has "unhideWhenUsed" attribute
     */
    public boolean isSetUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNHIDEWHENUSED$8) != null;
        }
    }
    
    /**
     * Sets the "unhideWhenUsed" attribute
     */
    public void setUnhideWhenUsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum unhideWhenUsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNHIDEWHENUSED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNHIDEWHENUSED$8);
            }
            target.setEnumValue(unhideWhenUsed);
        }
    }
    
    /**
     * Sets (as xml) the "unhideWhenUsed" attribute
     */
    public void xsetUnhideWhenUsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff unhideWhenUsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(UNHIDEWHENUSED$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(UNHIDEWHENUSED$8);
            }
            target.set(unhideWhenUsed);
        }
    }
    
    /**
     * Unsets the "unhideWhenUsed" attribute
     */
    public void unsetUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNHIDEWHENUSED$8);
        }
    }
    
    /**
     * Gets the "qFormat" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QFORMAT$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "qFormat" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(QFORMAT$10);
            return target;
        }
    }
    
    /**
     * True if has "qFormat" attribute
     */
    public boolean isSetQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QFORMAT$10) != null;
        }
    }
    
    /**
     * Sets the "qFormat" attribute
     */
    public void setQFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum qFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QFORMAT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QFORMAT$10);
            }
            target.setEnumValue(qFormat);
        }
    }
    
    /**
     * Sets (as xml) the "qFormat" attribute
     */
    public void xsetQFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff qFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(QFORMAT$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(QFORMAT$10);
            }
            target.set(qFormat);
        }
    }
    
    /**
     * Unsets the "qFormat" attribute
     */
    public void unsetQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QFORMAT$10);
        }
    }
}
