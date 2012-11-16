/*
 * XML Type:  CT_NameType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography.impl;
/**
 * An XML CT_NameType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public class CTNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType
{
    
    public CTNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMELIST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "NameList");
    
    
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
}
