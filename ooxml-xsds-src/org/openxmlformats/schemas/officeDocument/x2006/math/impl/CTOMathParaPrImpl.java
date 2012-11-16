/*
 * XML Type:  CT_OMathParaPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_OMathParaPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTOMathParaPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr
{
    
    public CTOMathParaPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "jc");
    
    
    /**
     * Gets the "jc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc getJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().find_element_user(JC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "jc" element
     */
    public boolean isSetJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JC$0) != 0;
        }
    }
    
    /**
     * Sets the "jc" element
     */
    public void setJc(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc jc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().find_element_user(JC$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().add_element_user(JC$0);
            }
            target.set(jc);
        }
    }
    
    /**
     * Appends and returns a new empty "jc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc addNewJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().add_element_user(JC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "jc" element
     */
    public void unsetJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JC$0, 0);
        }
    }
}
