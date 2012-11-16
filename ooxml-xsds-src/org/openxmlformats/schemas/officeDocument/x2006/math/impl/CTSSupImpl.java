/*
 * XML Type:  CT_SSup
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTSSup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_SSup(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTSSupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTSSup
{
    
    public CTSSupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SSUPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sSupPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    private static final javax.xml.namespace.QName SUP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sup");
    
    
    /**
     * Gets the "sSupPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr getSSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr)get_store().find_element_user(SSUPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sSupPr" element
     */
    public boolean isSetSSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SSUPPR$0) != 0;
        }
    }
    
    /**
     * Sets the "sSupPr" element
     */
    public void setSSupPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr sSupPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr)get_store().find_element_user(SSUPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr)get_store().add_element_user(SSUPPR$0);
            }
            target.set(sSupPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sSupPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr addNewSSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSSupPr)get_store().add_element_user(SSUPPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sSupPr" element
     */
    public void unsetSSupPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SSUPPR$0, 0);
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
     * Gets the "sup" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getSup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUP$4, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUP$4);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUP$4);
            return target;
        }
    }
}
