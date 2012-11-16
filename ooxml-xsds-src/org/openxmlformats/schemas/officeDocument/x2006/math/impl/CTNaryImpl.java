/*
 * XML Type:  CT_Nary
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTNary
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_Nary(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTNaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTNary
{
    
    public CTNaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NARYPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "naryPr");
    private static final javax.xml.namespace.QName SUB$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sub");
    private static final javax.xml.namespace.QName SUP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sup");
    private static final javax.xml.namespace.QName E$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "naryPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr getNaryPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr)get_store().find_element_user(NARYPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "naryPr" element
     */
    public boolean isSetNaryPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NARYPR$0) != 0;
        }
    }
    
    /**
     * Sets the "naryPr" element
     */
    public void setNaryPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr naryPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr)get_store().find_element_user(NARYPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr)get_store().add_element_user(NARYPR$0);
            }
            target.set(naryPr);
        }
    }
    
    /**
     * Appends and returns a new empty "naryPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr addNewNaryPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr)get_store().add_element_user(NARYPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "naryPr" element
     */
    public void unsetNaryPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NARYPR$0, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUB$2, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(SUB$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUB$2);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(SUB$2);
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
    
    /**
     * Gets the "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$6, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$6);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$6);
            return target;
        }
    }
}
