/*
 * XML Type:  CT_Cell3D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Cell3D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTCell3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D
{
    
    public CTCell3DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bevel");
    private static final javax.xml.namespace.QName LIGHTRIG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lightRig");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName PRSTMATERIAL$6 = 
        new javax.xml.namespace.QName("", "prstMaterial");
    
    
    /**
     * Gets the "bevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBevel getBevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().find_element_user(BEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bevel" element
     */
    public void setBevel(org.openxmlformats.schemas.drawingml.x2006.main.CTBevel bevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().find_element_user(BEVEL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().add_element_user(BEVEL$0);
            }
            target.set(bevel);
        }
    }
    
    /**
     * Appends and returns a new empty "bevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBevel addNewBevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().add_element_user(BEVEL$0);
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
     * True if has "lightRig" element
     */
    public boolean isSetLightRig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIGHTRIG$2) != 0;
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
     * Unsets the "lightRig" element
     */
    public void unsetLightRig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIGHTRIG$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
            return get_store().count_elements(EXTLST$4) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
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
            get_store().remove_element(EXTLST$4, 0);
        }
    }
    
    /**
     * Gets the "prstMaterial" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType.Enum getPrstMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRSTMATERIAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRSTMATERIAL$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "prstMaterial" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType xgetPrstMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_store().find_attribute_user(PRSTMATERIAL$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_default_attribute_value(PRSTMATERIAL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "prstMaterial" attribute
     */
    public boolean isSetPrstMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRSTMATERIAL$6) != null;
        }
    }
    
    /**
     * Sets the "prstMaterial" attribute
     */
    public void setPrstMaterial(org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType.Enum prstMaterial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRSTMATERIAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRSTMATERIAL$6);
            }
            target.setEnumValue(prstMaterial);
        }
    }
    
    /**
     * Sets (as xml) the "prstMaterial" attribute
     */
    public void xsetPrstMaterial(org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType prstMaterial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_store().find_attribute_user(PRSTMATERIAL$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_store().add_attribute_user(PRSTMATERIAL$6);
            }
            target.set(prstMaterial);
        }
    }
    
    /**
     * Unsets the "prstMaterial" attribute
     */
    public void unsetPrstMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRSTMATERIAL$6);
        }
    }
}
