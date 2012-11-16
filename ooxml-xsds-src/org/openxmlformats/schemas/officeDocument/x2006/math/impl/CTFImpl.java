/*
 * XML Type:  CT_F
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTF
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_F(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTFImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTF
{
    
    public CTFImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "fPr");
    private static final javax.xml.namespace.QName NUM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "num");
    private static final javax.xml.namespace.QName DEN$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "den");
    
    
    /**
     * Gets the "fPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr getFPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr)get_store().find_element_user(FPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fPr" element
     */
    public boolean isSetFPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FPR$0) != 0;
        }
    }
    
    /**
     * Sets the "fPr" element
     */
    public void setFPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr fPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr)get_store().find_element_user(FPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr)get_store().add_element_user(FPR$0);
            }
            target.set(fPr);
        }
    }
    
    /**
     * Appends and returns a new empty "fPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr addNewFPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr)get_store().add_element_user(FPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fPr" element
     */
    public void unsetFPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FPR$0, 0);
        }
    }
    
    /**
     * Gets the "num" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(NUM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "num" element
     */
    public void setNum(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg num)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(NUM$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(NUM$2);
            }
            target.set(num);
        }
    }
    
    /**
     * Appends and returns a new empty "num" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(NUM$2);
            return target;
        }
    }
    
    /**
     * Gets the "den" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getDen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(DEN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "den" element
     */
    public void setDen(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg den)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(DEN$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(DEN$4);
            }
            target.set(den);
        }
    }
    
    /**
     * Appends and returns a new empty "den" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewDen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(DEN$4);
            return target;
        }
    }
}
