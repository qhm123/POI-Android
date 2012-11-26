/*
 * XML Type:  CT_BaseStyles
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_BaseStyles(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBaseStylesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles
{
    
    public CTBaseStylesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLRSCHEME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrScheme");
    private static final javax.xml.namespace.QName FONTSCHEME$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fontScheme");
    private static final javax.xml.namespace.QName FMTSCHEME$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fmtScheme");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "clrScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme getClrScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().find_element_user(CLRSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clrScheme" element
     */
    public void setClrScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme clrScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().find_element_user(CLRSCHEME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().add_element_user(CLRSCHEME$0);
            }
            target.set(clrScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "clrScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme addNewClrScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme)get_store().add_element_user(CLRSCHEME$0);
            return target;
        }
    }
    
    /**
     * Gets the "fontScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme getFontScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme)get_store().find_element_user(FONTSCHEME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fontScheme" element
     */
    public void setFontScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme fontScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme)get_store().find_element_user(FONTSCHEME$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme)get_store().add_element_user(FONTSCHEME$2);
            }
            target.set(fontScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "fontScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme addNewFontScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme)get_store().add_element_user(FONTSCHEME$2);
            return target;
        }
    }
    
    /**
     * Gets the "fmtScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix getFmtScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix)get_store().find_element_user(FMTSCHEME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmtScheme" element
     */
    public void setFmtScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix fmtScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix)get_store().find_element_user(FMTSCHEME$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix)get_store().add_element_user(FMTSCHEME$4);
            }
            target.set(fmtScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "fmtScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix addNewFmtScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix)get_store().add_element_user(FMTSCHEME$4);
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
