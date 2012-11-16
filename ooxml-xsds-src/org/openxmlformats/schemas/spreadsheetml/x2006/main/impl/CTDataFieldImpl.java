/*
 * XML Type:  CT_DataField
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataField(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField
{
    
    public CTDataFieldImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName FLD$4 = 
        new javax.xml.namespace.QName("", "fld");
    private static final javax.xml.namespace.QName SUBTOTAL$6 = 
        new javax.xml.namespace.QName("", "subtotal");
    private static final javax.xml.namespace.QName SHOWDATAAS$8 = 
        new javax.xml.namespace.QName("", "showDataAs");
    private static final javax.xml.namespace.QName BASEFIELD$10 = 
        new javax.xml.namespace.QName("", "baseField");
    private static final javax.xml.namespace.QName BASEITEM$12 = 
        new javax.xml.namespace.QName("", "baseItem");
    private static final javax.xml.namespace.QName NUMFMTID$14 = 
        new javax.xml.namespace.QName("", "numFmtId");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "fld" attribute
     */
    public long getFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLD$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fld" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FLD$4);
            return target;
        }
    }
    
    /**
     * Sets the "fld" attribute
     */
    public void setFld(long fld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLD$4);
            }
            target.setLongValue(fld);
        }
    }
    
    /**
     * Sets (as xml) the "fld" attribute
     */
    public void xsetFld(org.apache.xmlbeans.XmlUnsignedInt fld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FLD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FLD$4);
            }
            target.set(fld);
        }
    }
    
    /**
     * Gets the "subtotal" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum getSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUBTOTAL$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "subtotal" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction xgetSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_store().find_attribute_user(SUBTOTAL$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_default_attribute_value(SUBTOTAL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "subtotal" attribute
     */
    public boolean isSetSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBTOTAL$6) != null;
        }
    }
    
    /**
     * Sets the "subtotal" attribute
     */
    public void setSubtotal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum subtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBTOTAL$6);
            }
            target.setEnumValue(subtotal);
        }
    }
    
    /**
     * Sets (as xml) the "subtotal" attribute
     */
    public void xsetSubtotal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction subtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_store().find_attribute_user(SUBTOTAL$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_store().add_attribute_user(SUBTOTAL$6);
            }
            target.set(subtotal);
        }
    }
    
    /**
     * Unsets the "subtotal" attribute
     */
    public void unsetSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBTOTAL$6);
        }
    }
    
    /**
     * Gets the "showDataAs" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs.Enum getShowDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDATAAS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWDATAAS$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "showDataAs" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs xgetShowDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs)get_store().find_attribute_user(SHOWDATAAS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs)get_default_attribute_value(SHOWDATAAS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "showDataAs" attribute
     */
    public boolean isSetShowDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWDATAAS$8) != null;
        }
    }
    
    /**
     * Sets the "showDataAs" attribute
     */
    public void setShowDataAs(org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs.Enum showDataAs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDATAAS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWDATAAS$8);
            }
            target.setEnumValue(showDataAs);
        }
    }
    
    /**
     * Sets (as xml) the "showDataAs" attribute
     */
    public void xsetShowDataAs(org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs showDataAs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs)get_store().find_attribute_user(SHOWDATAAS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs)get_store().add_attribute_user(SHOWDATAAS$8);
            }
            target.set(showDataAs);
        }
    }
    
    /**
     * Unsets the "showDataAs" attribute
     */
    public void unsetShowDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWDATAAS$8);
        }
    }
    
    /**
     * Gets the "baseField" attribute
     */
    public int getBaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BASEFIELD$10);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseField" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetBaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(BASEFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(BASEFIELD$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "baseField" attribute
     */
    public boolean isSetBaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASEFIELD$10) != null;
        }
    }
    
    /**
     * Sets the "baseField" attribute
     */
    public void setBaseField(int baseField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASEFIELD$10);
            }
            target.setIntValue(baseField);
        }
    }
    
    /**
     * Sets (as xml) the "baseField" attribute
     */
    public void xsetBaseField(org.apache.xmlbeans.XmlInt baseField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(BASEFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(BASEFIELD$10);
            }
            target.set(baseField);
        }
    }
    
    /**
     * Unsets the "baseField" attribute
     */
    public void unsetBaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASEFIELD$10);
        }
    }
    
    /**
     * Gets the "baseItem" attribute
     */
    public long getBaseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEITEM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BASEITEM$12);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseItem" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetBaseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BASEITEM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(BASEITEM$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "baseItem" attribute
     */
    public boolean isSetBaseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASEITEM$12) != null;
        }
    }
    
    /**
     * Sets the "baseItem" attribute
     */
    public void setBaseItem(long baseItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEITEM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASEITEM$12);
            }
            target.setLongValue(baseItem);
        }
    }
    
    /**
     * Sets (as xml) the "baseItem" attribute
     */
    public void xsetBaseItem(org.apache.xmlbeans.XmlUnsignedInt baseItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BASEITEM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(BASEITEM$12);
            }
            target.set(baseItem);
        }
    }
    
    /**
     * Unsets the "baseItem" attribute
     */
    public void unsetBaseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASEITEM$12);
        }
    }
    
    /**
     * Gets the "numFmtId" attribute
     */
    public long getNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$14);
            return target;
        }
    }
    
    /**
     * True if has "numFmtId" attribute
     */
    public boolean isSetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMFMTID$14) != null;
        }
    }
    
    /**
     * Sets the "numFmtId" attribute
     */
    public void setNumFmtId(long numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMFMTID$14);
            }
            target.setLongValue(numFmtId);
        }
    }
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    public void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().add_attribute_user(NUMFMTID$14);
            }
            target.set(numFmtId);
        }
    }
    
    /**
     * Unsets the "numFmtId" attribute
     */
    public void unsetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMFMTID$14);
        }
    }
}
