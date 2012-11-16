/*
 * XML Type:  CT_Bar
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTBar
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_Bar(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTBarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTBar
{
    
    public CTBarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BARPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "barPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "barPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr getBarPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr)get_store().find_element_user(BARPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "barPr" element
     */
    public boolean isSetBarPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BARPR$0) != 0;
        }
    }
    
    /**
     * Sets the "barPr" element
     */
    public void setBarPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr barPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr)get_store().find_element_user(BARPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr)get_store().add_element_user(BARPR$0);
            }
            target.set(barPr);
        }
    }
    
    /**
     * Appends and returns a new empty "barPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr addNewBarPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBarPr)get_store().add_element_user(BARPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "barPr" element
     */
    public void unsetBarPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BARPR$0, 0);
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
