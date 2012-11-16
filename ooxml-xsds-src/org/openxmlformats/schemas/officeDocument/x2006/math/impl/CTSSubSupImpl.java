/*
 * XML Type:  CT_SSubSup
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_SSubSup(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTSSubSupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSup
{
    
    public CTSSubSupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SSUBSUPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sSubSupPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    private static final javax.xml.namespace.QName SUB$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sub");
    private static final javax.xml.namespace.QName SUP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sup");
    
    
    /**
     * Gets the "sSubSupPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr getSSubSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr)get_store().find_element_user(SSUBSUPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sSubSupPr" element
     */
    public boolean isSetSSubSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SSUBSUPPR$0) != 0;
        }
    }
    
    /**
     * Sets the "sSubSupPr" element
     */
    public void setSSubSupPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr sSubSupPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr)get_store().find_element_user(SSUBSUPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr)get_store().add_element_user(SSUBSUPPR$0);
            }
            target.set(sSubSupPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sSubSupPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr addNewSSubSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubSupPr)get_store().add_element_user(SSUBSUPPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sSubSupPr" element
     */
    public void unsetSSubSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SSUBSUPPR$0, 0);
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
    
    /**
     * Gets the "sup" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getSup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sup" element
     */
    public void setSup(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg sup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUP$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUP$6);
            }
            target.set(sup);
        }
    }
    
    /**
     * Appends and returns a new empty "sup" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewSup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUP$6);
            return target;
        }
    }
}
