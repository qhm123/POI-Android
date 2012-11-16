/*
 * XML Type:  CT_Scale2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Scale2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTScale2DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D
{
    
    public CTScale2DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sx");
    private static final javax.xml.namespace.QName SY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sy");
    
    
    /**
     * Gets the "sx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRatio getSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRatio target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().find_element_user(SX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sx" element
     */
    public void setSx(org.openxmlformats.schemas.drawingml.x2006.main.CTRatio sx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRatio target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().find_element_user(SX$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().add_element_user(SX$0);
            }
            target.set(sx);
        }
    }
    
    /**
     * Appends and returns a new empty "sx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRatio addNewSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRatio target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().add_element_user(SX$0);
            return target;
        }
    }
    
    /**
     * Gets the "sy" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRatio getSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRatio target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().find_element_user(SY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sy" element
     */
    public void setSy(org.openxmlformats.schemas.drawingml.x2006.main.CTRatio sy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRatio target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().find_element_user(SY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().add_element_user(SY$2);
            }
            target.set(sy);
        }
    }
    
    /**
     * Appends and returns a new empty "sy" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRatio addNewSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRatio target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRatio)get_store().add_element_user(SY$2);
            return target;
        }
    }
}
