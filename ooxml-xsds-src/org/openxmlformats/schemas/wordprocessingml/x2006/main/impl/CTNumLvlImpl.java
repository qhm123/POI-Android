/*
 * XML Type:  CT_NumLvl
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_NumLvl(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNumLvlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl
{
    
    public CTNumLvlImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTOVERRIDE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "startOverride");
    private static final javax.xml.namespace.QName LVL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvl");
    private static final javax.xml.namespace.QName ILVL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ilvl");
    
    
    /**
     * Gets the "startOverride" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getStartOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(STARTOVERRIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "startOverride" element
     */
    public boolean isSetStartOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTOVERRIDE$0) != 0;
        }
    }
    
    /**
     * Sets the "startOverride" element
     */
    public void setStartOverride(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber startOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(STARTOVERRIDE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(STARTOVERRIDE$0);
            }
            target.set(startOverride);
        }
    }
    
    /**
     * Appends and returns a new empty "startOverride" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewStartOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(STARTOVERRIDE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "startOverride" element
     */
    public void unsetStartOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTOVERRIDE$0, 0);
        }
    }
    
    /**
     * Gets the "lvl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl getLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().find_element_user(LVL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl" element
     */
    public boolean isSetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL$2) != 0;
        }
    }
    
    /**
     * Sets the "lvl" element
     */
    public void setLvl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl lvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().find_element_user(LVL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().add_element_user(LVL$2);
            }
            target.set(lvl);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl addNewLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().add_element_user(LVL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl" element
     */
    public void unsetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL$2, 0);
        }
    }
    
    /**
     * Gets the "ilvl" attribute
     */
    public java.math.BigInteger getIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ILVL$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ilvl" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ILVL$4);
            return target;
        }
    }
    
    /**
     * Sets the "ilvl" attribute
     */
    public void setIlvl(java.math.BigInteger ilvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ILVL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ILVL$4);
            }
            target.setBigIntegerValue(ilvl);
        }
    }
    
    /**
     * Sets (as xml) the "ilvl" attribute
     */
    public void xsetIlvl(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber ilvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ILVL$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(ILVL$4);
            }
            target.set(ilvl);
        }
    }
}
