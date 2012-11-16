/*
 * XML Type:  CT_Func
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTFunc
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_Func(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTFuncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTFunc
{
    
    public CTFuncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNCPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "funcPr");
    private static final javax.xml.namespace.QName FNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "fName");
    private static final javax.xml.namespace.QName E$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "funcPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr getFuncPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr)get_store().find_element_user(FUNCPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "funcPr" element
     */
    public boolean isSetFuncPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCPR$0) != 0;
        }
    }
    
    /**
     * Sets the "funcPr" element
     */
    public void setFuncPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr funcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr)get_store().find_element_user(FUNCPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr)get_store().add_element_user(FUNCPR$0);
            }
            target.set(funcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "funcPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr addNewFuncPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr)get_store().add_element_user(FUNCPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "funcPr" element
     */
    public void unsetFuncPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCPR$0, 0);
        }
    }
    
    /**
     * Gets the "fName" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getFName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(FNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fName" element
     */
    public void setFName(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg fName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(FNAME$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(FNAME$2);
            }
            target.set(fName);
        }
    }
    
    /**
     * Appends and returns a new empty "fName" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewFName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(FNAME$2);
            return target;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$4, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$4);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$4);
            return target;
        }
    }
}
