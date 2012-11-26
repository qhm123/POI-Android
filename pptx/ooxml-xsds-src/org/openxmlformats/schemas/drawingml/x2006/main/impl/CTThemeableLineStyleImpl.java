/*
 * XML Type:  CT_ThemeableLineStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ThemeableLineStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTThemeableLineStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle
{
    
    public CTThemeableLineStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ln");
    private static final javax.xml.namespace.QName LNREF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnRef");
    
    
    /**
     * Gets the "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ln" element
     */
    public boolean isSetLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LN$0) != 0;
        }
    }
    
    /**
     * Sets the "ln" element
     */
    public void setLn(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties ln)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LN$0);
            }
            target.set(ln);
        }
    }
    
    /**
     * Appends and returns a new empty "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ln" element
     */
    public void unsetLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LN$0, 0);
        }
    }
    
    /**
     * Gets the "lnRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getLnRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(LNREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnRef" element
     */
    public boolean isSetLnRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNREF$2) != 0;
        }
    }
    
    /**
     * Sets the "lnRef" element
     */
    public void setLnRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference lnRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(LNREF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(LNREF$2);
            }
            target.set(lnRef);
        }
    }
    
    /**
     * Appends and returns a new empty "lnRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewLnRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(LNREF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lnRef" element
     */
    public void unsetLnRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNREF$2, 0);
        }
    }
}
