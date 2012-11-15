/*
 * XML Type:  CT_SlideMasterTextStyles
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideMasterTextStyles(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideMasterTextStylesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles
{
    
    public CTSlideMasterTextStylesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLESTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "titleStyle");
    private static final javax.xml.namespace.QName BODYSTYLE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bodyStyle");
    private static final javax.xml.namespace.QName OTHERSTYLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "otherStyle");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    
    
    /**
     * Gets the "titleStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle getTitleStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(TITLESTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "titleStyle" element
     */
    public boolean isSetTitleStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLESTYLE$0) != 0;
        }
    }
    
    /**
     * Sets the "titleStyle" element
     */
    public void setTitleStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle titleStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(TITLESTYLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(TITLESTYLE$0);
            }
            target.set(titleStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "titleStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle addNewTitleStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(TITLESTYLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "titleStyle" element
     */
    public void unsetTitleStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLESTYLE$0, 0);
        }
    }
    
    /**
     * Gets the "bodyStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle getBodyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(BODYSTYLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bodyStyle" element
     */
    public boolean isSetBodyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYSTYLE$2) != 0;
        }
    }
    
    /**
     * Sets the "bodyStyle" element
     */
    public void setBodyStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle bodyStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(BODYSTYLE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(BODYSTYLE$2);
            }
            target.set(bodyStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "bodyStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle addNewBodyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(BODYSTYLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bodyStyle" element
     */
    public void unsetBodyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYSTYLE$2, 0);
        }
    }
    
    /**
     * Gets the "otherStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle getOtherStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(OTHERSTYLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "otherStyle" element
     */
    public boolean isSetOtherStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERSTYLE$4) != 0;
        }
    }
    
    /**
     * Sets the "otherStyle" element
     */
    public void setOtherStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle otherStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(OTHERSTYLE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(OTHERSTYLE$4);
            }
            target.set(otherStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "otherStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle addNewOtherStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(OTHERSTYLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "otherStyle" element
     */
    public void unsetOtherStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERSTYLE$4, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
