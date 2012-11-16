/*
 * XML Type:  CT_Box
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTBox
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_Box(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTBoxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTBox
{
    
    public CTBoxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOXPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "boxPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "boxPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr getBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr)get_store().find_element_user(BOXPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "boxPr" element
     */
    public boolean isSetBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOXPR$0) != 0;
        }
    }
    
    /**
     * Sets the "boxPr" element
     */
    public void setBoxPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr boxPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr)get_store().find_element_user(BOXPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr)get_store().add_element_user(BOXPR$0);
            }
            target.set(boxPr);
        }
    }
    
    /**
     * Appends and returns a new empty "boxPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr addNewBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr)get_store().add_element_user(BOXPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "boxPr" element
     */
    public void unsetBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOXPR$0, 0);
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
