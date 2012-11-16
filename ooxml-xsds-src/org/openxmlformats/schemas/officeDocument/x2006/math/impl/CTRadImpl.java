/*
 * XML Type:  CT_Rad
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTRad
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_Rad(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTRadImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTRad
{
    
    public CTRadImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RADPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "radPr");
    private static final javax.xml.namespace.QName DEG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "deg");
    private static final javax.xml.namespace.QName E$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "radPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr getRadPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr)get_store().find_element_user(RADPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "radPr" element
     */
    public boolean isSetRadPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADPR$0) != 0;
        }
    }
    
    /**
     * Sets the "radPr" element
     */
    public void setRadPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr radPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr)get_store().find_element_user(RADPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr)get_store().add_element_user(RADPR$0);
            }
            target.set(radPr);
        }
    }
    
    /**
     * Appends and returns a new empty "radPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr addNewRadPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr)get_store().add_element_user(RADPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "radPr" element
     */
    public void unsetRadPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADPR$0, 0);
        }
    }
    
    /**
     * Gets the "deg" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getDeg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(DEG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deg" element
     */
    public void setDeg(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg deg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(DEG$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(DEG$2);
            }
            target.set(deg);
        }
    }
    
    /**
     * Appends and returns a new empty "deg" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewDeg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(DEG$2);
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
