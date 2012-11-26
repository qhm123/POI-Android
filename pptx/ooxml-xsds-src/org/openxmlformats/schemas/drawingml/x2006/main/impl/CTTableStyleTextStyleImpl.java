/*
 * XML Type:  CT_TableStyleTextStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableStyleTextStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableStyleTextStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle
{
    
    public CTTableStyleTextStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "font");
    private static final javax.xml.namespace.QName FONTREF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fontRef");
    private static final javax.xml.namespace.QName SCRGBCLR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scrgbClr");
    private static final javax.xml.namespace.QName SRGBCLR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srgbClr");
    private static final javax.xml.namespace.QName HSLCLR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hslClr");
    private static final javax.xml.namespace.QName SYSCLR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sysClr");
    private static final javax.xml.namespace.QName SCHEMECLR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "schemeClr");
    private static final javax.xml.namespace.QName PRSTCLR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstClr");
    private static final javax.xml.namespace.QName EXTLST$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName B$18 = 
        new javax.xml.namespace.QName("", "b");
    private static final javax.xml.namespace.QName I$20 = 
        new javax.xml.namespace.QName("", "i");
    
    
    /**
     * Gets the "font" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection getFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "font" element
     */
    public boolean isSetFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FONT$0) != 0;
        }
    }
    
    /**
     * Sets the "font" element
     */
    public void setFont(org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection)get_store().add_element_user(FONT$0);
            }
            target.set(font);
        }
    }
    
    /**
     * Appends and returns a new empty "font" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection)get_store().add_element_user(FONT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "font" element
     */
    public void unsetFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FONT$0, 0);
        }
    }
    
    /**
     * Gets the "fontRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference getFontRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().find_element_user(FONTREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fontRef" element
     */
    public boolean isSetFontRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FONTREF$2) != 0;
        }
    }
    
    /**
     * Sets the "fontRef" element
     */
    public void setFontRef(org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference fontRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().find_element_user(FONTREF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().add_element_user(FONTREF$2);
            }
            target.set(fontRef);
        }
    }
    
    /**
     * Appends and returns a new empty "fontRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference addNewFontRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().add_element_user(FONTREF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fontRef" element
     */
    public void unsetFontRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FONTREF$2, 0);
        }
    }
    
    /**
     * Gets the "scrgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor getScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().find_element_user(SCRGBCLR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scrgbClr" element
     */
    public boolean isSetScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRGBCLR$4) != 0;
        }
    }
    
    /**
     * Sets the "scrgbClr" element
     */
    public void setScrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor scrgbClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().find_element_user(SCRGBCLR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().add_element_user(SCRGBCLR$4);
            }
            target.set(scrgbClr);
        }
    }
    
    /**
     * Appends and returns a new empty "scrgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor addNewScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().add_element_user(SCRGBCLR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "scrgbClr" element
     */
    public void unsetScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRGBCLR$4, 0);
        }
    }
    
    /**
     * Gets the "srgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor getSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().find_element_user(SRGBCLR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "srgbClr" element
     */
    public boolean isSetSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRGBCLR$6) != 0;
        }
    }
    
    /**
     * Sets the "srgbClr" element
     */
    public void setSrgbClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor srgbClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().find_element_user(SRGBCLR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().add_element_user(SRGBCLR$6);
            }
            target.set(srgbClr);
        }
    }
    
    /**
     * Appends and returns a new empty "srgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor addNewSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().add_element_user(SRGBCLR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "srgbClr" element
     */
    public void unsetSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRGBCLR$6, 0);
        }
    }
    
    /**
     * Gets the "hslClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor getHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().find_element_user(HSLCLR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hslClr" element
     */
    public boolean isSetHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HSLCLR$8) != 0;
        }
    }
    
    /**
     * Sets the "hslClr" element
     */
    public void setHslClr(org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor hslClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().find_element_user(HSLCLR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().add_element_user(HSLCLR$8);
            }
            target.set(hslClr);
        }
    }
    
    /**
     * Appends and returns a new empty "hslClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor addNewHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().add_element_user(HSLCLR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "hslClr" element
     */
    public void unsetHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HSLCLR$8, 0);
        }
    }
    
    /**
     * Gets the "sysClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor getSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().find_element_user(SYSCLR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sysClr" element
     */
    public boolean isSetSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSCLR$10) != 0;
        }
    }
    
    /**
     * Sets the "sysClr" element
     */
    public void setSysClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor sysClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().find_element_user(SYSCLR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().add_element_user(SYSCLR$10);
            }
            target.set(sysClr);
        }
    }
    
    /**
     * Appends and returns a new empty "sysClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor addNewSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().add_element_user(SYSCLR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "sysClr" element
     */
    public void unsetSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSCLR$10, 0);
        }
    }
    
    /**
     * Gets the "schemeClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor getSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().find_element_user(SCHEMECLR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schemeClr" element
     */
    public boolean isSetSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMECLR$12) != 0;
        }
    }
    
    /**
     * Sets the "schemeClr" element
     */
    public void setSchemeClr(org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor schemeClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().find_element_user(SCHEMECLR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().add_element_user(SCHEMECLR$12);
            }
            target.set(schemeClr);
        }
    }
    
    /**
     * Appends and returns a new empty "schemeClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor addNewSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().add_element_user(SCHEMECLR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "schemeClr" element
     */
    public void unsetSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMECLR$12, 0);
        }
    }
    
    /**
     * Gets the "prstClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor getPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().find_element_user(PRSTCLR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prstClr" element
     */
    public boolean isSetPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSTCLR$14) != 0;
        }
    }
    
    /**
     * Sets the "prstClr" element
     */
    public void setPrstClr(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor prstClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().find_element_user(PRSTCLR$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().add_element_user(PRSTCLR$14);
            }
            target.set(prstClr);
        }
    }
    
    /**
     * Appends and returns a new empty "prstClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor addNewPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().add_element_user(PRSTCLR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "prstClr" element
     */
    public void unsetPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSTCLR$14, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, 0);
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
            return get_store().count_elements(EXTLST$16) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$16);
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
            get_store().remove_element(EXTLST$16, 0);
        }
    }
    
    /**
     * Gets the "b" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType.Enum getB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(B$18);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "b" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType xgetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_store().find_attribute_user(B$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_default_attribute_value(B$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "b" attribute
     */
    public boolean isSetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(B$18) != null;
        }
    }
    
    /**
     * Sets the "b" attribute
     */
    public void setB(org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType.Enum b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(B$18);
            }
            target.setEnumValue(b);
        }
    }
    
    /**
     * Sets (as xml) the "b" attribute
     */
    public void xsetB(org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_store().find_attribute_user(B$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_store().add_attribute_user(B$18);
            }
            target.set(b);
        }
    }
    
    /**
     * Unsets the "b" attribute
     */
    public void unsetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(B$18);
        }
    }
    
    /**
     * Gets the "i" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType.Enum getI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(I$20);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "i" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType xgetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_store().find_attribute_user(I$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_default_attribute_value(I$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "i" attribute
     */
    public boolean isSetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(I$20) != null;
        }
    }
    
    /**
     * Sets the "i" attribute
     */
    public void setI(org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType.Enum iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(I$20);
            }
            target.setEnumValue(iValue);
        }
    }
    
    /**
     * Sets (as xml) the "i" attribute
     */
    public void xsetI(org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_store().find_attribute_user(I$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType)get_store().add_attribute_user(I$20);
            }
            target.set(iValue);
        }
    }
    
    /**
     * Unsets the "i" attribute
     */
    public void unsetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(I$20);
        }
    }
}
