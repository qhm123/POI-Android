/*
 * XML Type:  CT_GroupChr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_GroupChr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTGroupChrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChr
{
    
    public CTGroupChrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPCHRPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "groupChrPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "groupChrPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr getGroupChrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr)get_store().find_element_user(GROUPCHRPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "groupChrPr" element
     */
    public boolean isSetGroupChrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPCHRPR$0) != 0;
        }
    }
    
    /**
     * Sets the "groupChrPr" element
     */
    public void setGroupChrPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr groupChrPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr)get_store().find_element_user(GROUPCHRPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr)get_store().add_element_user(GROUPCHRPR$0);
            }
            target.set(groupChrPr);
        }
    }
    
    /**
     * Appends and returns a new empty "groupChrPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr addNewGroupChrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr)get_store().add_element_user(GROUPCHRPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "groupChrPr" element
     */
    public void unsetGroupChrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPCHRPR$0, 0);
        }
    }
    
    /**
     * Gets the "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "e" element
     */
    public void setE(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg e)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$2);
            }
            target.set(e);
        }
    }
    
    /**
     * Appends and returns a new empty "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$2);
            return target;
        }
    }
}
