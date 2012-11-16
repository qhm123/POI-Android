/*
 * XML Type:  CT_SSub
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTSSub
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_SSub(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTSSubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTSSub
{
    
    public CTSSubImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SSUBPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sSubPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    private static final javax.xml.namespace.QName SUB$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sub");
    
    
    /**
     * Gets the "sSubPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr getSSubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr)get_store().find_element_user(SSUBPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sSubPr" element
     */
    public boolean isSetSSubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SSUBPR$0) != 0;
        }
    }
    
    /**
     * Sets the "sSubPr" element
     */
    public void setSSubPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr sSubPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr)get_store().find_element_user(SSUBPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr)get_store().add_element_user(SSUBPR$0);
            }
            target.set(sSubPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sSubPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr addNewSSubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr)get_store().add_element_user(SSUBPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sSubPr" element
     */
    public void unsetSSubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SSUBPR$0, 0);
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
    
    /**
     * Gets the "sub" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUB$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sub" element
     */
    public void setSub(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg sub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUB$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUB$4);
            }
            target.set(sub);
        }
    }
    
    /**
     * Appends and returns a new empty "sub" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUB$4);
            return target;
        }
    }
}
