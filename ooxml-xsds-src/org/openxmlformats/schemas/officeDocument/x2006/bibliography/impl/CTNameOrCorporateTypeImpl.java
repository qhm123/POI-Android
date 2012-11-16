/*
 * XML Type:  CT_NameOrCorporateType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography.impl;
/**
 * An XML CT_NameOrCorporateType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public class CTNameOrCorporateTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType
{
    
    public CTNameOrCorporateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMELIST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "NameList");
    private static final javax.xml.namespace.QName CORPORATE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Corporate");
    
    
    /**
     * Gets the "NameList" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType getNameList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType)get_store().find_element_user(NAMELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NameList" element
     */
    public boolean isSetNameList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "NameList" element
     */
    public void setNameList(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType nameList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType)get_store().find_element_user(NAMELIST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType)get_store().add_element_user(NAMELIST$0);
            }
            target.set(nameList);
        }
    }
    
    /**
     * Appends and returns a new empty "NameList" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType addNewNameList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType)get_store().add_element_user(NAMELIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "NameList" element
     */
    public void unsetNameList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMELIST$0, 0);
        }
    }
    
    /**
     * Gets the "Corporate" element
     */
    public java.lang.String getCorporate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Corporate" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetCorporate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(CORPORATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Corporate" element
     */
    public boolean isSetCorporate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORPORATE$2) != 0;
        }
    }
    
    /**
     * Sets the "Corporate" element
     */
    public void setCorporate(java.lang.String corporate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPORATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPORATE$2);
            }
            target.setStringValue(corporate);
        }
    }
    
    /**
     * Sets (as xml) the "Corporate" element
     */
    public void xsetCorporate(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 corporate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(CORPORATE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().add_element_user(CORPORATE$2);
            }
            target.set(corporate);
        }
    }
    
    /**
     * Unsets the "Corporate" element
     */
    public void unsetCorporate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORPORATE$2, 0);
        }
    }
}
