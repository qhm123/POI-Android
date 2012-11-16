/*
 * XML Type:  CT_MC
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTMC
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_MC(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTMCImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTMC
{
    
    public CTMCImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MCPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mcPr");
    
    
    /**
     * Gets the "mcPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr getMcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr)get_store().find_element_user(MCPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mcPr" element
     */
    public boolean isSetMcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MCPR$0) != 0;
        }
    }
    
    /**
     * Sets the "mcPr" element
     */
    public void setMcPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr mcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr)get_store().find_element_user(MCPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr)get_store().add_element_user(MCPR$0);
            }
            target.set(mcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "mcPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr addNewMcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr)get_store().add_element_user(MCPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "mcPr" element
     */
    public void unsetMcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MCPR$0, 0);
        }
    }
}
