/*
 * XML Type:  CT_Backdrop
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Backdrop(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBackdropImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop
{
    
    public CTBackdropImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "anchor");
    private static final javax.xml.namespace.QName NORM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "norm");
    private static final javax.xml.namespace.QName UP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "up");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "anchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D getAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D)get_store().find_element_user(ANCHOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anchor" element
     */
    public void setAnchor(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D)get_store().find_element_user(ANCHOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D)get_store().add_element_user(ANCHOR$0);
            }
            target.set(anchor);
        }
    }
    
    /**
     * Appends and returns a new empty "anchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D addNewAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D)get_store().add_element_user(ANCHOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "norm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D getNorm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().find_element_user(NORM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "norm" element
     */
    public void setNorm(org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D norm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().find_element_user(NORM$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().add_element_user(NORM$2);
            }
            target.set(norm);
        }
    }
    
    /**
     * Appends and returns a new empty "norm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D addNewNorm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().add_element_user(NORM$2);
            return target;
        }
    }
    
    /**
     * Gets the "up" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D getUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().find_element_user(UP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "up" element
     */
    public void setUp(org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D up)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().find_element_user(UP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().add_element_user(UP$4);
            }
            target.set(up);
        }
    }
    
    /**
     * Appends and returns a new empty "up" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D addNewUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D)get_store().add_element_user(UP$4);
            return target;
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
