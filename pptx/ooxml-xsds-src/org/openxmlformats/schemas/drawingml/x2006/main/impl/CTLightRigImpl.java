/*
 * XML Type:  CT_LightRig
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_LightRig(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLightRigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig
{
    
    public CTLightRigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "rot");
    private static final javax.xml.namespace.QName RIG$2 = 
        new javax.xml.namespace.QName("", "rig");
    private static final javax.xml.namespace.QName DIR$4 = 
        new javax.xml.namespace.QName("", "dir");
    
    
    /**
     * Gets the "rot" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords getRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().find_element_user(ROT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rot" element
     */
    public boolean isSetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROT$0) != 0;
        }
    }
    
    /**
     * Sets the "rot" element
     */
    public void setRot(org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().find_element_user(ROT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().add_element_user(ROT$0);
            }
            target.set(rot);
        }
    }
    
    /**
     * Appends and returns a new empty "rot" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords addNewRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords)get_store().add_element_user(ROT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rot" element
     */
    public void unsetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROT$0, 0);
        }
    }
    
    /**
     * Gets the "rig" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType.Enum getRig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIG$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "rig" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType xgetRig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType)get_store().find_attribute_user(RIG$2);
            return target;
        }
    }
    
    /**
     * Sets the "rig" attribute
     */
    public void setRig(org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType.Enum rig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIG$2);
            }
            target.setEnumValue(rig);
        }
    }
    
    /**
     * Sets (as xml) the "rig" attribute
     */
    public void xsetRig(org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType rig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType)get_store().find_attribute_user(RIG$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType)get_store().add_attribute_user(RIG$2);
            }
            target.set(rig);
        }
    }
    
    /**
     * Gets the "dir" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection.Enum getDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dir" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection xgetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection)get_store().find_attribute_user(DIR$4);
            return target;
        }
    }
    
    /**
     * Sets the "dir" attribute
     */
    public void setDir(org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection.Enum dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$4);
            }
            target.setEnumValue(dir);
        }
    }
    
    /**
     * Sets (as xml) the "dir" attribute
     */
    public void xsetDir(org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection)get_store().find_attribute_user(DIR$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STLightRigDirection)get_store().add_attribute_user(DIR$4);
            }
            target.set(dir);
        }
    }
}
