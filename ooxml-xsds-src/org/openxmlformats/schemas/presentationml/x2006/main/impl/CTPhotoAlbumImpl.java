/*
 * XML Type:  CT_PhotoAlbum
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_PhotoAlbum(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTPhotoAlbumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum
{
    
    public CTPhotoAlbumImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName BW$2 = 
        new javax.xml.namespace.QName("", "bw");
    private static final javax.xml.namespace.QName SHOWCAPTIONS$4 = 
        new javax.xml.namespace.QName("", "showCaptions");
    private static final javax.xml.namespace.QName LAYOUT$6 = 
        new javax.xml.namespace.QName("", "layout");
    private static final javax.xml.namespace.QName FRAME$8 = 
        new javax.xml.namespace.QName("", "frame");
    
    
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
     * Gets the "bw" attribute
     */
    public boolean getBw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BW$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bw" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BW$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "bw" attribute
     */
    public boolean isSetBw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BW$2) != null;
        }
    }
    
    /**
     * Sets the "bw" attribute
     */
    public void setBw(boolean bw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BW$2);
            }
            target.setBooleanValue(bw);
        }
    }
    
    /**
     * Sets (as xml) the "bw" attribute
     */
    public void xsetBw(org.apache.xmlbeans.XmlBoolean bw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BW$2);
            }
            target.set(bw);
        }
    }
    
    /**
     * Unsets the "bw" attribute
     */
    public void unsetBw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BW$2);
        }
    }
    
    /**
     * Gets the "showCaptions" attribute
     */
    public boolean getShowCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCAPTIONS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWCAPTIONS$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showCaptions" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCAPTIONS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWCAPTIONS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "showCaptions" attribute
     */
    public boolean isSetShowCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCAPTIONS$4) != null;
        }
    }
    
    /**
     * Sets the "showCaptions" attribute
     */
    public void setShowCaptions(boolean showCaptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCAPTIONS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCAPTIONS$4);
            }
            target.setBooleanValue(showCaptions);
        }
    }
    
    /**
     * Sets (as xml) the "showCaptions" attribute
     */
    public void xsetShowCaptions(org.apache.xmlbeans.XmlBoolean showCaptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCAPTIONS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWCAPTIONS$4);
            }
            target.set(showCaptions);
        }
    }
    
    /**
     * Unsets the "showCaptions" attribute
     */
    public void unsetShowCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCAPTIONS$4);
        }
    }
    
    /**
     * Gets the "layout" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout.Enum getLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAYOUT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LAYOUT$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "layout" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout xgetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout)get_store().find_attribute_user(LAYOUT$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout)get_default_attribute_value(LAYOUT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "layout" attribute
     */
    public boolean isSetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LAYOUT$6) != null;
        }
    }
    
    /**
     * Sets the "layout" attribute
     */
    public void setLayout(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout.Enum layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAYOUT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAYOUT$6);
            }
            target.setEnumValue(layout);
        }
    }
    
    /**
     * Sets (as xml) the "layout" attribute
     */
    public void xsetLayout(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout)get_store().find_attribute_user(LAYOUT$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout)get_store().add_attribute_user(LAYOUT$6);
            }
            target.set(layout);
        }
    }
    
    /**
     * Unsets the "layout" attribute
     */
    public void unsetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LAYOUT$6);
        }
    }
    
    /**
     * Gets the "frame" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape.Enum getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FRAME$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape)get_store().find_attribute_user(FRAME$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape)get_default_attribute_value(FRAME$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$8) != null;
        }
    }
    
    /**
     * Sets the "frame" attribute
     */
    public void setFrame(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape.Enum frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$8);
            }
            target.setEnumValue(frame);
        }
    }
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape)get_store().find_attribute_user(FRAME$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape)get_store().add_attribute_user(FRAME$8);
            }
            target.set(frame);
        }
    }
    
    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$8);
        }
    }
}
