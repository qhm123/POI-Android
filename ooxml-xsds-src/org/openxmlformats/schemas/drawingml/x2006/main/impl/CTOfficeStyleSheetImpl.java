/*
 * XML Type:  CT_OfficeStyleSheet
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_OfficeStyleSheet(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTOfficeStyleSheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet
{
    
    public CTOfficeStyleSheetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THEMEELEMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "themeElements");
    private static final javax.xml.namespace.QName OBJECTDEFAULTS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "objectDefaults");
    private static final javax.xml.namespace.QName EXTRACLRSCHEMELST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extraClrSchemeLst");
    private static final javax.xml.namespace.QName CUSTCLRLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "custClrLst");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "themeElements" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles getThemeElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().find_element_user(THEMEELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "themeElements" element
     */
    public void setThemeElements(org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles themeElements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().find_element_user(THEMEELEMENTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().add_element_user(THEMEELEMENTS$0);
            }
            target.set(themeElements);
        }
    }
    
    /**
     * Appends and returns a new empty "themeElements" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles addNewThemeElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles)get_store().add_element_user(THEMEELEMENTS$0);
            return target;
        }
    }
    
    /**
     * Gets the "objectDefaults" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults getObjectDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults)get_store().find_element_user(OBJECTDEFAULTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objectDefaults" element
     */
    public boolean isSetObjectDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTDEFAULTS$2) != 0;
        }
    }
    
    /**
     * Sets the "objectDefaults" element
     */
    public void setObjectDefaults(org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults objectDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults)get_store().find_element_user(OBJECTDEFAULTS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults)get_store().add_element_user(OBJECTDEFAULTS$2);
            }
            target.set(objectDefaults);
        }
    }
    
    /**
     * Appends and returns a new empty "objectDefaults" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults addNewObjectDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults)get_store().add_element_user(OBJECTDEFAULTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "objectDefaults" element
     */
    public void unsetObjectDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTDEFAULTS$2, 0);
        }
    }
    
    /**
     * Gets the "extraClrSchemeLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList getExtraClrSchemeLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList)get_store().find_element_user(EXTRACLRSCHEMELST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extraClrSchemeLst" element
     */
    public boolean isSetExtraClrSchemeLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTRACLRSCHEMELST$4) != 0;
        }
    }
    
    /**
     * Sets the "extraClrSchemeLst" element
     */
    public void setExtraClrSchemeLst(org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList extraClrSchemeLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList)get_store().find_element_user(EXTRACLRSCHEMELST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList)get_store().add_element_user(EXTRACLRSCHEMELST$4);
            }
            target.set(extraClrSchemeLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extraClrSchemeLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList addNewExtraClrSchemeLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList)get_store().add_element_user(EXTRACLRSCHEMELST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "extraClrSchemeLst" element
     */
    public void unsetExtraClrSchemeLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTRACLRSCHEMELST$4, 0);
        }
    }
    
    /**
     * Gets the "custClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList getCustClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList)get_store().find_element_user(CUSTCLRLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custClrLst" element
     */
    public boolean isSetCustClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTCLRLST$6) != 0;
        }
    }
    
    /**
     * Sets the "custClrLst" element
     */
    public void setCustClrLst(org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList custClrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList)get_store().find_element_user(CUSTCLRLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList)get_store().add_element_user(CUSTCLRLST$6);
            }
            target.set(custClrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "custClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList addNewCustClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList)get_store().add_element_user(CUSTCLRLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "custClrLst" element
     */
    public void unsetCustClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTCLRLST$6, 0);
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
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NAME$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$10) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$10);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$10);
        }
    }
}
