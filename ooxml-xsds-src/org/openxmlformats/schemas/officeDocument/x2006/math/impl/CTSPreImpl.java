/*
 * XML Type:  CT_SPre
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTSPre
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_SPre(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTSPreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTSPre
{
    
    public CTSPreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPREPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sPrePr");
    private static final javax.xml.namespace.QName SUB$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sub");
    private static final javax.xml.namespace.QName SUP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sup");
    private static final javax.xml.namespace.QName E$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "sPrePr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr getSPrePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr)get_store().find_element_user(SPREPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sPrePr" element
     */
    public boolean isSetSPrePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPREPR$0) != 0;
        }
    }
    
    /**
     * Sets the "sPrePr" element
     */
    public void setSPrePr(org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr sPrePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr)get_store().find_element_user(SPREPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr)get_store().add_element_user(SPREPR$0);
            }
            target.set(sPrePr);
        }
    }
    
    /**
     * Appends and returns a new empty "sPrePr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr addNewSPrePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSPrePr)get_store().add_element_user(SPREPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sPrePr" element
     */
    public void unsetSPrePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPREPR$0, 0);
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
