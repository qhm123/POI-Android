/*
 * XML Type:  CT_NotesSlide
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_NotesSlide(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTNotesSlideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide
{
    
    public CTNotesSlideImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSLD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
    private static final javax.xml.namespace.QName CLRMAPOVR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMapOvr");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SHOWMASTERSP$6 = 
        new javax.xml.namespace.QName("", "showMasterSp");
    private static final javax.xml.namespace.QName SHOWMASTERPHANIM$8 = 
        new javax.xml.namespace.QName("", "showMasterPhAnim");
    
    
    /**
     * Gets the "cSld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData getCSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().find_element_user(CSLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cSld" element
     */
    public void setCSld(org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData cSld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().find_element_user(CSLD$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().add_element_user(CSLD$0);
            }
            target.set(cSld);
        }
    }
    
    /**
     * Appends and returns a new empty "cSld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData addNewCSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().add_element_user(CSLD$0);
            return target;
        }
    }
    
    /**
     * Gets the "clrMapOvr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride getClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().find_element_user(CLRMAPOVR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clrMapOvr" element
     */
    public boolean isSetClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRMAPOVR$2) != 0;
        }
    }
    
    /**
     * Sets the "clrMapOvr" element
     */
    public void setClrMapOvr(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride clrMapOvr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().find_element_user(CLRMAPOVR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().add_element_user(CLRMAPOVR$2);
            }
            target.set(clrMapOvr);
        }
    }
    
    /**
     * Appends and returns a new empty "clrMapOvr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride addNewClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride)get_store().add_element_user(CLRMAPOVR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "clrMapOvr" element
     */
    public void unsetClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRMAPOVR$2, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$4, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$4);
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
     * Gets the "showMasterSp" attribute
     */
    public boolean getShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERSP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWMASTERSP$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showMasterSp" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERSP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWMASTERSP$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "showMasterSp" attribute
     */
    public boolean isSetShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWMASTERSP$6) != null;
        }
    }
    
    /**
     * Sets the "showMasterSp" attribute
     */
    public void setShowMasterSp(boolean showMasterSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERSP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWMASTERSP$6);
            }
            target.setBooleanValue(showMasterSp);
        }
    }
    
    /**
     * Sets (as xml) the "showMasterSp" attribute
     */
    public void xsetShowMasterSp(org.apache.xmlbeans.XmlBoolean showMasterSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERSP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWMASTERSP$6);
            }
            target.set(showMasterSp);
        }
    }
    
    /**
     * Unsets the "showMasterSp" attribute
     */
    public void unsetShowMasterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWMASTERSP$6);
        }
    }
    
    /**
     * Gets the "showMasterPhAnim" attribute
     */
    public boolean getShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERPHANIM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWMASTERPHANIM$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showMasterPhAnim" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERPHANIM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWMASTERPHANIM$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "showMasterPhAnim" attribute
     */
    public boolean isSetShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWMASTERPHANIM$8) != null;
        }
    }
    
    /**
     * Sets the "showMasterPhAnim" attribute
     */
    public void setShowMasterPhAnim(boolean showMasterPhAnim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMASTERPHANIM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWMASTERPHANIM$8);
            }
            target.setBooleanValue(showMasterPhAnim);
        }
    }
    
    /**
     * Sets (as xml) the "showMasterPhAnim" attribute
     */
    public void xsetShowMasterPhAnim(org.apache.xmlbeans.XmlBoolean showMasterPhAnim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMASTERPHANIM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWMASTERPHANIM$8);
            }
            target.set(showMasterPhAnim);
        }
    }
    
    /**
     * Unsets the "showMasterPhAnim" attribute
     */
    public void unsetShowMasterPhAnim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWMASTERPHANIM$8);
        }
    }
}
