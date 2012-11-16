/*
 * XML Type:  CT_OdsoFieldMapData
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_OdsoFieldMapData(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTOdsoFieldMapDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData
{
    
    public CTOdsoFieldMapDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName MAPPEDNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mappedName");
    private static final javax.xml.namespace.QName COLUMN$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "column");
    private static final javax.xml.namespace.QName LID$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lid");
    private static final javax.xml.namespace.QName DYNAMICADDRESS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dynamicAddress");
    
    
    /**
     * Gets the "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeOdsoFMDFieldType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "mappedName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(MAPPEDNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mappedName" element
     */
    public boolean isSetMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPEDNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "mappedName" element
     */
    public void setMappedName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString mappedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(MAPPEDNAME$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(MAPPEDNAME$4);
            }
            target.set(mappedName);
        }
    }
    
    /**
     * Appends and returns a new empty "mappedName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(MAPPEDNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "mappedName" element
     */
    public void unsetMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPEDNAME$4, 0);
        }
    }
    
    /**
     * Gets the "column" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(COLUMN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "column" element
     */
    public boolean isSetColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMN$6) != 0;
        }
    }
    
    /**
     * Sets the "column" element
     */
    public void setColumn(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(COLUMN$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(COLUMN$6);
            }
            target.set(column);
        }
    }
    
    /**
     * Appends and returns a new empty "column" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(COLUMN$6);
            return target;
        }
    }
    
    /**
     * Unsets the "column" element
     */
    public void unsetColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMN$6, 0);
        }
    }
    
    /**
     * Gets the "lid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang getLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().find_element_user(LID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lid" element
     */
    public boolean isSetLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LID$8) != 0;
        }
    }
    
    /**
     * Sets the "lid" element
     */
    public void setLid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang lid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().find_element_user(LID$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().add_element_user(LID$8);
            }
            target.set(lid);
        }
    }
    
    /**
     * Appends and returns a new empty "lid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang addNewLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().add_element_user(LID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "lid" element
     */
    public void unsetLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LID$8, 0);
        }
    }
    
    /**
     * Gets the "dynamicAddress" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDynamicAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DYNAMICADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dynamicAddress" element
     */
    public boolean isSetDynamicAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DYNAMICADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "dynamicAddress" element
     */
    public void setDynamicAddress(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff dynamicAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DYNAMICADDRESS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DYNAMICADDRESS$10);
            }
            target.set(dynamicAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "dynamicAddress" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDynamicAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DYNAMICADDRESS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "dynamicAddress" element
     */
    public void unsetDynamicAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DYNAMICADDRESS$10, 0);
        }
    }
}
