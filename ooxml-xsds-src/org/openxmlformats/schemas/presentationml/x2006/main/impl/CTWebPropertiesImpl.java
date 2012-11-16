/*
 * XML Type:  CT_WebProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_WebProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTWebPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties
{
    
    public CTWebPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SHOWANIMATION$2 = 
        new javax.xml.namespace.QName("", "showAnimation");
    private static final javax.xml.namespace.QName RESIZEGRAPHICS$4 = 
        new javax.xml.namespace.QName("", "resizeGraphics");
    private static final javax.xml.namespace.QName ALLOWPNG$6 = 
        new javax.xml.namespace.QName("", "allowPng");
    private static final javax.xml.namespace.QName RELYONVML$8 = 
        new javax.xml.namespace.QName("", "relyOnVml");
    private static final javax.xml.namespace.QName ORGANIZEINFOLDERS$10 = 
        new javax.xml.namespace.QName("", "organizeInFolders");
    private static final javax.xml.namespace.QName USELONGFILENAMES$12 = 
        new javax.xml.namespace.QName("", "useLongFilenames");
    private static final javax.xml.namespace.QName IMGSZ$14 = 
        new javax.xml.namespace.QName("", "imgSz");
    private static final javax.xml.namespace.QName ENCODING$16 = 
        new javax.xml.namespace.QName("", "encoding");
    private static final javax.xml.namespace.QName CLR$18 = 
        new javax.xml.namespace.QName("", "clr");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "showAnimation" attribute
     */
    public boolean getShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWANIMATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWANIMATION$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAnimation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWANIMATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWANIMATION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "showAnimation" attribute
     */
    public boolean isSetShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWANIMATION$2) != null;
        }
    }
    
    /**
     * Sets the "showAnimation" attribute
     */
    public void setShowAnimation(boolean showAnimation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWANIMATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWANIMATION$2);
            }
            target.setBooleanValue(showAnimation);
        }
    }
    
    /**
     * Sets (as xml) the "showAnimation" attribute
     */
    public void xsetShowAnimation(org.apache.xmlbeans.XmlBoolean showAnimation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWANIMATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWANIMATION$2);
            }
            target.set(showAnimation);
        }
    }
    
    /**
     * Unsets the "showAnimation" attribute
     */
    public void unsetShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWANIMATION$2);
        }
    }
    
    /**
     * Gets the "resizeGraphics" attribute
     */
    public boolean getResizeGraphics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESIZEGRAPHICS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESIZEGRAPHICS$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "resizeGraphics" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetResizeGraphics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RESIZEGRAPHICS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RESIZEGRAPHICS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "resizeGraphics" attribute
     */
    public boolean isSetResizeGraphics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESIZEGRAPHICS$4) != null;
        }
    }
    
    /**
     * Sets the "resizeGraphics" attribute
     */
    public void setResizeGraphics(boolean resizeGraphics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESIZEGRAPHICS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESIZEGRAPHICS$4);
            }
            target.setBooleanValue(resizeGraphics);
        }
    }
    
    /**
     * Sets (as xml) the "resizeGraphics" attribute
     */
    public void xsetResizeGraphics(org.apache.xmlbeans.XmlBoolean resizeGraphics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RESIZEGRAPHICS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RESIZEGRAPHICS$4);
            }
            target.set(resizeGraphics);
        }
    }
    
    /**
     * Unsets the "resizeGraphics" attribute
     */
    public void unsetResizeGraphics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESIZEGRAPHICS$4);
        }
    }
    
    /**
     * Gets the "allowPng" attribute
     */
    public boolean getAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWPNG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALLOWPNG$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowPng" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWPNG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ALLOWPNG$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "allowPng" attribute
     */
    public boolean isSetAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWPNG$6) != null;
        }
    }
    
    /**
     * Sets the "allowPng" attribute
     */
    public void setAllowPng(boolean allowPng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWPNG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWPNG$6);
            }
            target.setBooleanValue(allowPng);
        }
    }
    
    /**
     * Sets (as xml) the "allowPng" attribute
     */
    public void xsetAllowPng(org.apache.xmlbeans.XmlBoolean allowPng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWPNG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALLOWPNG$6);
            }
            target.set(allowPng);
        }
    }
    
    /**
     * Unsets the "allowPng" attribute
     */
    public void unsetAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWPNG$6);
        }
    }
    
    /**
     * Gets the "relyOnVml" attribute
     */
    public boolean getRelyOnVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELYONVML$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RELYONVML$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "relyOnVml" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRelyOnVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RELYONVML$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RELYONVML$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "relyOnVml" attribute
     */
    public boolean isSetRelyOnVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELYONVML$8) != null;
        }
    }
    
    /**
     * Sets the "relyOnVml" attribute
     */
    public void setRelyOnVml(boolean relyOnVml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELYONVML$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELYONVML$8);
            }
            target.setBooleanValue(relyOnVml);
        }
    }
    
    /**
     * Sets (as xml) the "relyOnVml" attribute
     */
    public void xsetRelyOnVml(org.apache.xmlbeans.XmlBoolean relyOnVml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RELYONVML$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RELYONVML$8);
            }
            target.set(relyOnVml);
        }
    }
    
    /**
     * Unsets the "relyOnVml" attribute
     */
    public void unsetRelyOnVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELYONVML$8);
        }
    }
    
    /**
     * Gets the "organizeInFolders" attribute
     */
    public boolean getOrganizeInFolders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANIZEINFOLDERS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORGANIZEINFOLDERS$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "organizeInFolders" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOrganizeInFolders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ORGANIZEINFOLDERS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ORGANIZEINFOLDERS$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "organizeInFolders" attribute
     */
    public boolean isSetOrganizeInFolders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORGANIZEINFOLDERS$10) != null;
        }
    }
    
    /**
     * Sets the "organizeInFolders" attribute
     */
    public void setOrganizeInFolders(boolean organizeInFolders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANIZEINFOLDERS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORGANIZEINFOLDERS$10);
            }
            target.setBooleanValue(organizeInFolders);
        }
    }
    
    /**
     * Sets (as xml) the "organizeInFolders" attribute
     */
    public void xsetOrganizeInFolders(org.apache.xmlbeans.XmlBoolean organizeInFolders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ORGANIZEINFOLDERS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ORGANIZEINFOLDERS$10);
            }
            target.set(organizeInFolders);
        }
    }
    
    /**
     * Unsets the "organizeInFolders" attribute
     */
    public void unsetOrganizeInFolders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORGANIZEINFOLDERS$10);
        }
    }
    
    /**
     * Gets the "useLongFilenames" attribute
     */
    public boolean getUseLongFilenames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USELONGFILENAMES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USELONGFILENAMES$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useLongFilenames" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseLongFilenames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USELONGFILENAMES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USELONGFILENAMES$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "useLongFilenames" attribute
     */
    public boolean isSetUseLongFilenames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USELONGFILENAMES$12) != null;
        }
    }
    
    /**
     * Sets the "useLongFilenames" attribute
     */
    public void setUseLongFilenames(boolean useLongFilenames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USELONGFILENAMES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USELONGFILENAMES$12);
            }
            target.setBooleanValue(useLongFilenames);
        }
    }
    
    /**
     * Sets (as xml) the "useLongFilenames" attribute
     */
    public void xsetUseLongFilenames(org.apache.xmlbeans.XmlBoolean useLongFilenames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USELONGFILENAMES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USELONGFILENAMES$12);
            }
            target.set(useLongFilenames);
        }
    }
    
    /**
     * Unsets the "useLongFilenames" attribute
     */
    public void unsetUseLongFilenames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USELONGFILENAMES$12);
        }
    }
    
    /**
     * Gets the "imgSz" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize.Enum getImgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMGSZ$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMGSZ$14);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "imgSz" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize xgetImgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize)get_store().find_attribute_user(IMGSZ$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize)get_default_attribute_value(IMGSZ$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "imgSz" attribute
     */
    public boolean isSetImgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMGSZ$14) != null;
        }
    }
    
    /**
     * Sets the "imgSz" attribute
     */
    public void setImgSz(org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize.Enum imgSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMGSZ$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMGSZ$14);
            }
            target.setEnumValue(imgSz);
        }
    }
    
    /**
     * Sets (as xml) the "imgSz" attribute
     */
    public void xsetImgSz(org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize imgSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize)get_store().find_attribute_user(IMGSZ$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebScreenSize)get_store().add_attribute_user(IMGSZ$14);
            }
            target.set(imgSz);
        }
    }
    
    /**
     * Unsets the "imgSz" attribute
     */
    public void unsetImgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMGSZ$14);
        }
    }
    
    /**
     * Gets the "encoding" attribute
     */
    public java.lang.String getEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENCODING$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encoding" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding xgetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding)get_store().find_attribute_user(ENCODING$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding)get_default_attribute_value(ENCODING$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "encoding" attribute
     */
    public boolean isSetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODING$16) != null;
        }
    }
    
    /**
     * Sets the "encoding" attribute
     */
    public void setEncoding(java.lang.String encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODING$16);
            }
            target.setStringValue(encoding);
        }
    }
    
    /**
     * Sets (as xml) the "encoding" attribute
     */
    public void xsetEncoding(org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding)get_store().find_attribute_user(ENCODING$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebEncoding)get_store().add_attribute_user(ENCODING$16);
            }
            target.set(encoding);
        }
    }
    
    /**
     * Unsets the "encoding" attribute
     */
    public void unsetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODING$16);
        }
    }
    
    /**
     * Gets the "clr" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType.Enum getClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLR$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLR$18);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "clr" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType xgetClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType)get_store().find_attribute_user(CLR$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType)get_default_attribute_value(CLR$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "clr" attribute
     */
    public boolean isSetClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLR$18) != null;
        }
    }
    
    /**
     * Sets the "clr" attribute
     */
    public void setClr(org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType.Enum clr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLR$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLR$18);
            }
            target.setEnumValue(clr);
        }
    }
    
    /**
     * Sets (as xml) the "clr" attribute
     */
    public void xsetClr(org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType clr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType)get_store().find_attribute_user(CLR$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STWebColorType)get_store().add_attribute_user(CLR$18);
            }
            target.set(clr);
        }
    }
    
    /**
     * Unsets the "clr" attribute
     */
    public void unsetClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLR$18);
        }
    }
}
