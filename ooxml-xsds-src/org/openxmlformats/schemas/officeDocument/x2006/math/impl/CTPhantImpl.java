/*
 * XML Type:  CT_Phant
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTPhant
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_Phant(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTPhantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTPhant
{
    
    public CTPhantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHANTPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "phantPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "phantPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr getPhantPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr)get_store().find_element_user(PHANTPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "phantPr" element
     */
    public boolean isSetPhantPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHANTPR$0) != 0;
        }
    }
    
    /**
     * Sets the "phantPr" element
     */
    public void setPhantPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr phantPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr)get_store().find_element_user(PHANTPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr)get_store().add_element_user(PHANTPR$0);
            }
            target.set(phantPr);
        }
    }
    
    /**
     * Appends and returns a new empty "phantPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr addNewPhantPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr)get_store().add_element_user(PHANTPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "phantPr" element
     */
    public void unsetPhantPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHANTPR$0, 0);
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
