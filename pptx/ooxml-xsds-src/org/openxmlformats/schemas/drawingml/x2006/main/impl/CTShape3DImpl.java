/*
 * XML Type:  CT_Shape3D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Shape3D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTShape3DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D
{
    
    public CTShape3DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEVELT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bevelT");
    private static final javax.xml.namespace.QName BEVELB$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bevelB");
    private static final javax.xml.namespace.QName EXTRUSIONCLR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extrusionClr");
    private static final javax.xml.namespace.QName CONTOURCLR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "contourClr");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName Z$10 = 
        new javax.xml.namespace.QName("", "z");
    private static final javax.xml.namespace.QName EXTRUSIONH$12 = 
        new javax.xml.namespace.QName("", "extrusionH");
    private static final javax.xml.namespace.QName CONTOURW$14 = 
        new javax.xml.namespace.QName("", "contourW");
    private static final javax.xml.namespace.QName PRSTMATERIAL$16 = 
        new javax.xml.namespace.QName("", "prstMaterial");
    
    
    /**
     * Gets the "bevelT" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBevel getBevelT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().find_element_user(BEVELT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bevelT" element
     */
    public boolean isSetBevelT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEVELT$0) != 0;
        }
    }
    
    /**
     * Sets the "bevelT" element
     */
    public void setBevelT(org.openxmlformats.schemas.drawingml.x2006.main.CTBevel bevelT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().find_element_user(BEVELT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().add_element_user(BEVELT$0);
            }
            target.set(bevelT);
        }
    }
    
    /**
     * Appends and returns a new empty "bevelT" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBevel addNewBevelT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().add_element_user(BEVELT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bevelT" element
     */
    public void unsetBevelT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEVELT$0, 0);
        }
    }
    
    /**
     * Gets the "bevelB" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBevel getBevelB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().find_element_user(BEVELB$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bevelB" element
     */
    public boolean isSetBevelB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEVELB$2) != 0;
        }
    }
    
    /**
     * Sets the "bevelB" element
     */
    public void setBevelB(org.openxmlformats.schemas.drawingml.x2006.main.CTBevel bevelB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().find_element_user(BEVELB$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().add_element_user(BEVELB$2);
            }
            target.set(bevelB);
        }
    }
    
    /**
     * Appends and returns a new empty "bevelB" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBevel addNewBevelB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBevel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBevel)get_store().add_element_user(BEVELB$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bevelB" element
     */
    public void unsetBevelB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEVELB$2, 0);
        }
    }
    
    /**
     * Gets the "extrusionClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getExtrusionClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(EXTRUSIONCLR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extrusionClr" element
     */
    public boolean isSetExtrusionClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTRUSIONCLR$4) != 0;
        }
    }
    
    /**
     * Sets the "extrusionClr" element
     */
    public void setExtrusionClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor extrusionClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(EXTRUSIONCLR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(EXTRUSIONCLR$4);
            }
            target.set(extrusionClr);
        }
    }
    
    /**
     * Appends and returns a new empty "extrusionClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewExtrusionClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(EXTRUSIONCLR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "extrusionClr" element
     */
    public void unsetExtrusionClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTRUSIONCLR$4, 0);
        }
    }
    
    /**
     * Gets the "contourClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getContourClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CONTOURCLR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contourClr" element
     */
    public boolean isSetContourClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTOURCLR$6) != 0;
        }
    }
    
    /**
     * Sets the "contourClr" element
     */
    public void setContourClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor contourClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CONTOURCLR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CONTOURCLR$6);
            }
            target.set(contourClr);
        }
    }
    
    /**
     * Appends and returns a new empty "contourClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewContourClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CONTOURCLR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "contourClr" element
     */
    public void unsetContourClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTOURCLR$6, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
            return get_store().count_elements(EXTLST$8) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
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
            get_store().remove_element(EXTLST$8, 0);
        }
    }
    
    /**
     * Gets the "z" attribute
     */
    public long getZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Z$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(Z$10);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "z" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(Z$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_default_attribute_value(Z$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "z" attribute
     */
    public boolean isSetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(Z$10) != null;
        }
    }
    
    /**
     * Sets the "z" attribute
     */
    public void setZ(long z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Z$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(Z$10);
            }
            target.setLongValue(z);
        }
    }
    
    /**
     * Sets (as xml) the "z" attribute
     */
    public void xsetZ(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(Z$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(Z$10);
            }
            target.set(z);
        }
    }
    
    /**
     * Unsets the "z" attribute
     */
    public void unsetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(Z$10);
        }
    }
    
    /**
     * Gets the "extrusionH" attribute
     */
    public long getExtrusionH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTRUSIONH$12);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "extrusionH" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetExtrusionH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(EXTRUSIONH$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(EXTRUSIONH$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "extrusionH" attribute
     */
    public boolean isSetExtrusionH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTRUSIONH$12) != null;
        }
    }
    
    /**
     * Sets the "extrusionH" attribute
     */
    public void setExtrusionH(long extrusionH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTRUSIONH$12);
            }
            target.setLongValue(extrusionH);
        }
    }
    
    /**
     * Sets (as xml) the "extrusionH" attribute
     */
    public void xsetExtrusionH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate extrusionH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(EXTRUSIONH$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(EXTRUSIONH$12);
            }
            target.set(extrusionH);
        }
    }
    
    /**
     * Unsets the "extrusionH" attribute
     */
    public void unsetExtrusionH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTRUSIONH$12);
        }
    }
    
    /**
     * Gets the "contourW" attribute
     */
    public long getContourW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTOURW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTOURW$14);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "contourW" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetContourW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(CONTOURW$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(CONTOURW$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "contourW" attribute
     */
    public boolean isSetContourW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTOURW$14) != null;
        }
    }
    
    /**
     * Sets the "contourW" attribute
     */
    public void setContourW(long contourW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTOURW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTOURW$14);
            }
            target.setLongValue(contourW);
        }
    }
    
    /**
     * Sets (as xml) the "contourW" attribute
     */
    public void xsetContourW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate contourW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(CONTOURW$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(CONTOURW$14);
            }
            target.set(contourW);
        }
    }
    
    /**
     * Unsets the "contourW" attribute
     */
    public void unsetContourW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTOURW$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRSTMATERIAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRSTMATERIAL$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_store().find_attribute_user(PRSTMATERIAL$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_default_attribute_value(PRSTMATERIAL$16);
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
            return get_store().find_attribute_user(PRSTMATERIAL$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRSTMATERIAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRSTMATERIAL$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_store().find_attribute_user(PRSTMATERIAL$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetMaterialType)get_store().add_attribute_user(PRSTMATERIAL$16);
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
            get_store().remove_attribute(PRSTMATERIAL$16);
        }
    }
}
