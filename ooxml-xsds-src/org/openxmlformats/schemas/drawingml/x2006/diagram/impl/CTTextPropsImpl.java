/*
 * XML Type:  CT_TextProps
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTTextProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_TextProps(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTTextPropsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTTextProps
{
    
    public CTTextPropsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SP3D$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sp3d");
    private static final javax.xml.namespace.QName FLATTX$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "flatTx");
    
    
    /**
     * Gets the "sp3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D getSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().find_element_user(SP3D$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sp3d" element
     */
    public boolean isSetSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SP3D$0) != 0;
        }
    }
    
    /**
     * Sets the "sp3d" element
     */
    public void setSp3D(org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D sp3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().find_element_user(SP3D$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().add_element_user(SP3D$0);
            }
            target.set(sp3D);
        }
    }
    
    /**
     * Appends and returns a new empty "sp3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D addNewSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().add_element_user(SP3D$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sp3d" element
     */
    public void unsetSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SP3D$0, 0);
        }
    }
    
    /**
     * Gets the "flatTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText getFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().find_element_user(FLATTX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "flatTx" element
     */
    public boolean isSetFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLATTX$2) != 0;
        }
    }
    
    /**
     * Sets the "flatTx" element
     */
    public void setFlatTx(org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText flatTx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().find_element_user(FLATTX$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().add_element_user(FLATTX$2);
            }
            target.set(flatTx);
        }
    }
    
    /**
     * Appends and returns a new empty "flatTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText addNewFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().add_element_user(FLATTX$2);
            return target;
        }
    }
    
    /**
     * Unsets the "flatTx" element
     */
    public void unsetFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLATTX$2, 0);
        }
    }
}
