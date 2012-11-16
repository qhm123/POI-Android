/*
 * XML Type:  CT_OMathArgPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArgPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_OMathArgPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTOMathArgPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArgPr
{
    
    public CTOMathArgPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARGSZ$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "argSz");
    
    
    /**
     * Gets the "argSz" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2 getArgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2)get_store().find_element_user(ARGSZ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "argSz" element
     */
    public boolean isSetArgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARGSZ$0) != 0;
        }
    }
    
    /**
     * Sets the "argSz" element
     */
    public void setArgSz(org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2 argSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2)get_store().find_element_user(ARGSZ$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2)get_store().add_element_user(ARGSZ$0);
            }
            target.set(argSz);
        }
    }
    
    /**
     * Appends and returns a new empty "argSz" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2 addNewArgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger2)get_store().add_element_user(ARGSZ$0);
            return target;
        }
    }
    
    /**
     * Unsets the "argSz" element
     */
    public void unsetArgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARGSZ$0, 0);
        }
    }
}
