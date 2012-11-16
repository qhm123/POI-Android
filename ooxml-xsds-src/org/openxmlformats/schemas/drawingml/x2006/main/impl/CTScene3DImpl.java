/*
 * XML Type:  CT_Scene3D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Scene3D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTScene3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D
{
    
    public CTScene3DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMERA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "camera");
    private static final javax.xml.namespace.QName LIGHTRIG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lightRig");
    private static final javax.xml.namespace.QName BACKDROP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "backdrop");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "camera" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCamera getCamera()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCamera target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCamera)get_store().find_element_user(CAMERA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "camera" element
     */
    public void setCamera(org.openxmlformats.schemas.drawingml.x2006.main.CTCamera camera)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCamera target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCamera)get_store().find_element_user(CAMERA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCamera)get_store().add_element_user(CAMERA$0);
            }
            target.set(camera);
        }
    }
    
    /**
     * Appends and returns a new empty "camera" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCamera addNewCamera()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCamera target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCamera)get_store().add_element_user(CAMERA$0);
            return target;
        }
    }
    
    /**
     * Gets the "lightRig" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig getLightRig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig)get_store().find_element_user(LIGHTRIG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lightRig" element
     */
    public void setLightRig(org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig lightRig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig)get_store().find_element_user(LIGHTRIG$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig)get_store().add_element_user(LIGHTRIG$2);
            }
            target.set(lightRig);
        }
    }
    
    /**
     * Appends and returns a new empty "lightRig" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig addNewLightRig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLightRig)get_store().add_element_user(LIGHTRIG$2);
            return target;
        }
    }
    
    /**
     * Gets the "backdrop" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop getBackdrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop)get_store().find_element_user(BACKDROP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "backdrop" element
     */
    public boolean isSetBackdrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BACKDROP$4) != 0;
        }
    }
    
    /**
     * Sets the "backdrop" element
     */
    public void setBackdrop(org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop backdrop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop)get_store().find_element_user(BACKDROP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop)get_store().add_element_user(BACKDROP$4);
            }
            target.set(backdrop);
        }
    }
    
    /**
     * Appends and returns a new empty "backdrop" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop addNewBackdrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop)get_store().add_element_user(BACKDROP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "backdrop" element
     */
    public void unsetBackdrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BACKDROP$4, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$6) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$6, 0);
        }
    }
}
