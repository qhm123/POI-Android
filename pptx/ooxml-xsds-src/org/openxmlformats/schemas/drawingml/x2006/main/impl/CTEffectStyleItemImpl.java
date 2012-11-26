/*
 * XML Type:  CT_EffectStyleItem
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_EffectStyleItem(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTEffectStyleItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem
{
    
    public CTEffectStyleItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EFFECTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
    private static final javax.xml.namespace.QName EFFECTDAG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
    private static final javax.xml.namespace.QName SCENE3D$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scene3d");
    private static final javax.xml.namespace.QName SP3D$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sp3d");
    
    
    /**
     * Gets the "effectLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList getEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectLst" element
     */
    public boolean isSetEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "effectLst" element
     */
    public void setEffectLst(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList effectLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$0);
            }
            target.set(effectLst);
        }
    }
    
    /**
     * Appends and returns a new empty "effectLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList addNewEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "effectLst" element
     */
    public void unsetEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTLST$0, 0);
        }
    }
    
    /**
     * Gets the "effectDag" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer getEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectDag" element
     */
    public boolean isSetEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTDAG$2) != 0;
        }
    }
    
    /**
     * Sets the "effectDag" element
     */
    public void setEffectDag(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer effectDag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$2);
            }
            target.set(effectDag);
        }
    }
    
    /**
     * Appends and returns a new empty "effectDag" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer addNewEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$2);
            return target;
        }
    }
    
    /**
     * Unsets the "effectDag" element
     */
    public void unsetEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTDAG$2, 0);
        }
    }
    
    /**
     * Gets the "scene3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D getScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().find_element_user(SCENE3D$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scene3d" element
     */
    public boolean isSetScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCENE3D$4) != 0;
        }
    }
    
    /**
     * Sets the "scene3d" element
     */
    public void setScene3D(org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D scene3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().find_element_user(SCENE3D$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().add_element_user(SCENE3D$4);
            }
            target.set(scene3D);
        }
    }
    
    /**
     * Appends and returns a new empty "scene3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D addNewScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().add_element_user(SCENE3D$4);
            return target;
        }
    }
    
    /**
     * Unsets the "scene3d" element
     */
    public void unsetScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCENE3D$4, 0);
        }
    }
    
    /**
     * Gets the "sp3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D getSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().find_element_user(SP3D$6, 0);
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
            return get_store().count_elements(SP3D$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().find_element_user(SP3D$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().add_element_user(SP3D$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().add_element_user(SP3D$6);
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
            get_store().remove_element(SP3D$6, 0);
        }
    }
}
