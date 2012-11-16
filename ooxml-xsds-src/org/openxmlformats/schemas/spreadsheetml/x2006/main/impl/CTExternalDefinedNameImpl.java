/*
 * XML Type:  CT_ExternalDefinedName
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalDefinedName(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalDefinedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName
{
    
    public CTExternalDefinedNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName REFERSTO$2 = 
        new javax.xml.namespace.QName("", "refersTo");
    private static final javax.xml.namespace.QName SHEETID$4 = 
        new javax.xml.namespace.QName("", "sheetId");
    
    
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
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
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "refersTo" attribute
     */
    public java.lang.String getRefersTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERSTO$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "refersTo" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetRefersTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(REFERSTO$2);
            return target;
        }
    }
    
    /**
     * True if has "refersTo" attribute
     */
    public boolean isSetRefersTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFERSTO$2) != null;
        }
    }
    
    /**
     * Sets the "refersTo" attribute
     */
    public void setRefersTo(java.lang.String refersTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERSTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFERSTO$2);
            }
            target.setStringValue(refersTo);
        }
    }
    
    /**
     * Sets (as xml) the "refersTo" attribute
     */
    public void xsetRefersTo(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring refersTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(REFERSTO$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(REFERSTO$2);
            }
            target.set(refersTo);
        }
    }
    
    /**
     * Unsets the "refersTo" attribute
     */
    public void unsetRefersTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFERSTO$2);
        }
    }
    
    /**
     * Gets the "sheetId" attribute
     */
    public long getSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$4);
            return target;
        }
    }
    
    /**
     * True if has "sheetId" attribute
     */
    public boolean isSetSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHEETID$4) != null;
        }
    }
    
    /**
     * Sets the "sheetId" attribute
     */
    public void setSheetId(long sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHEETID$4);
            }
            target.setLongValue(sheetId);
        }
    }
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    public void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SHEETID$4);
            }
            target.set(sheetId);
        }
    }
    
    /**
     * Unsets the "sheetId" attribute
     */
    public void unsetSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHEETID$4);
        }
    }
}
