/*
 * XML Type:  CT_DocPart
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocPart(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart
{
    
    public CTDocPartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCPARTPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartPr");
    private static final javax.xml.namespace.QName DOCPARTBODY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartBody");
    
    
    /**
     * Gets the "docPartPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr getDocPartPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr)get_store().find_element_user(DOCPARTPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docPartPr" element
     */
    public boolean isSetDocPartPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTPR$0) != 0;
        }
    }
    
    /**
     * Sets the "docPartPr" element
     */
    public void setDocPartPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr docPartPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr)get_store().find_element_user(DOCPARTPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr)get_store().add_element_user(DOCPARTPR$0);
            }
            target.set(docPartPr);
        }
    }
    
    /**
     * Appends and returns a new empty "docPartPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr addNewDocPartPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr)get_store().add_element_user(DOCPARTPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "docPartPr" element
     */
    public void unsetDocPartPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTPR$0, 0);
        }
    }
    
    /**
     * Gets the "docPartBody" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody getDocPartBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().find_element_user(DOCPARTBODY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docPartBody" element
     */
    public boolean isSetDocPartBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTBODY$2) != 0;
        }
    }
    
    /**
     * Sets the "docPartBody" element
     */
    public void setDocPartBody(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody docPartBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().find_element_user(DOCPARTBODY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().add_element_user(DOCPARTBODY$2);
            }
            target.set(docPartBody);
        }
    }
    
    /**
     * Appends and returns a new empty "docPartBody" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody addNewDocPartBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody)get_store().add_element_user(DOCPARTBODY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "docPartBody" element
     */
    public void unsetDocPartBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTBODY$2, 0);
        }
    }
}
