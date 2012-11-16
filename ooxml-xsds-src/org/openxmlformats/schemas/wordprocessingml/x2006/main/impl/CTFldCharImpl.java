/*
 * XML Type:  CT_FldChar
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FldChar(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFldCharImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar
{
    
    public CTFldCharImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLDDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldData");
    private static final javax.xml.namespace.QName FFDATA$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ffData");
    private static final javax.xml.namespace.QName NUMBERINGCHANGE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numberingChange");
    private static final javax.xml.namespace.QName FLDCHARTYPE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldCharType");
    private static final javax.xml.namespace.QName FLDLOCK$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldLock");
    private static final javax.xml.namespace.QName DIRTY$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dirty");
    
    
    /**
     * Gets the "fldData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText getFldData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(FLDDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fldData" element
     */
    public boolean isSetFldData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLDDATA$0) != 0;
        }
    }
    
    /**
     * Sets the "fldData" element
     */
    public void setFldData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText fldData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(FLDDATA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().add_element_user(FLDDATA$0);
            }
            target.set(fldData);
        }
    }
    
    /**
     * Appends and returns a new empty "fldData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText addNewFldData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().add_element_user(FLDDATA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fldData" element
     */
    public void unsetFldData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLDDATA$0, 0);
        }
    }
    
    /**
     * Gets the "ffData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData getFfData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData)get_store().find_element_user(FFDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ffData" element
     */
    public boolean isSetFfData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FFDATA$2) != 0;
        }
    }
    
    /**
     * Sets the "ffData" element
     */
    public void setFfData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData ffData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData)get_store().find_element_user(FFDATA$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData)get_store().add_element_user(FFDATA$2);
            }
            target.set(ffData);
        }
    }
    
    /**
     * Appends and returns a new empty "ffData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData addNewFfData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData)get_store().add_element_user(FFDATA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ffData" element
     */
    public void unsetFfData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FFDATA$2, 0);
        }
    }
    
    /**
     * Gets the "numberingChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering getNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().find_element_user(NUMBERINGCHANGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numberingChange" element
     */
    public boolean isSetNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERINGCHANGE$4) != 0;
        }
    }
    
    /**
     * Sets the "numberingChange" element
     */
    public void setNumberingChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering numberingChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().find_element_user(NUMBERINGCHANGE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().add_element_user(NUMBERINGCHANGE$4);
            }
            target.set(numberingChange);
        }
    }
    
    /**
     * Appends and returns a new empty "numberingChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering addNewNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().add_element_user(NUMBERINGCHANGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "numberingChange" element
     */
    public void unsetNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERINGCHANGE$4, 0);
        }
    }
    
    /**
     * Gets the "fldCharType" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType.Enum getFldCharType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLDCHARTYPE$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fldCharType" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType xgetFldCharType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType)get_store().find_attribute_user(FLDCHARTYPE$6);
            return target;
        }
    }
    
    /**
     * Sets the "fldCharType" attribute
     */
    public void setFldCharType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType.Enum fldCharType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLDCHARTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLDCHARTYPE$6);
            }
            target.setEnumValue(fldCharType);
        }
    }
    
    /**
     * Sets (as xml) the "fldCharType" attribute
     */
    public void xsetFldCharType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType fldCharType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType)get_store().find_attribute_user(FLDCHARTYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType)get_store().add_attribute_user(FLDCHARTYPE$6);
            }
            target.set(fldCharType);
        }
    }
    
    /**
     * Gets the "fldLock" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getFldLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLDLOCK$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fldLock" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetFldLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FLDLOCK$8);
            return target;
        }
    }
    
    /**
     * True if has "fldLock" attribute
     */
    public boolean isSetFldLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLDLOCK$8) != null;
        }
    }
    
    /**
     * Sets the "fldLock" attribute
     */
    public void setFldLock(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum fldLock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLDLOCK$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLDLOCK$8);
            }
            target.setEnumValue(fldLock);
        }
    }
    
    /**
     * Sets (as xml) the "fldLock" attribute
     */
    public void xsetFldLock(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff fldLock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FLDLOCK$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(FLDLOCK$8);
            }
            target.set(fldLock);
        }
    }
    
    /**
     * Unsets the "fldLock" attribute
     */
    public void unsetFldLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLDLOCK$8);
        }
    }
    
    /**
     * Gets the "dirty" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRTY$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dirty" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DIRTY$10);
            return target;
        }
    }
    
    /**
     * True if has "dirty" attribute
     */
    public boolean isSetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRTY$10) != null;
        }
    }
    
    /**
     * Sets the "dirty" attribute
     */
    public void setDirty(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum dirty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRTY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRTY$10);
            }
            target.setEnumValue(dirty);
        }
    }
    
    /**
     * Sets (as xml) the "dirty" attribute
     */
    public void xsetDirty(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff dirty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DIRTY$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(DIRTY$10);
            }
            target.set(dirty);
        }
    }
    
    /**
     * Unsets the "dirty" attribute
     */
    public void unsetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRTY$10);
        }
    }
}
