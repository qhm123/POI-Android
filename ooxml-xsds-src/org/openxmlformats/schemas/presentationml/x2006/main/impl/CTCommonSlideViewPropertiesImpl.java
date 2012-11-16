/*
 * XML Type:  CT_CommonSlideViewProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideViewProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_CommonSlideViewProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTCommonSlideViewPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideViewProperties
{
    
    public CTCommonSlideViewPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CVIEWPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cViewPr");
    private static final javax.xml.namespace.QName GUIDELST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "guideLst");
    private static final javax.xml.namespace.QName SNAPTOGRID$4 = 
        new javax.xml.namespace.QName("", "snapToGrid");
    private static final javax.xml.namespace.QName SNAPTOOBJECTS$6 = 
        new javax.xml.namespace.QName("", "snapToObjects");
    private static final javax.xml.namespace.QName SHOWGUIDES$8 = 
        new javax.xml.namespace.QName("", "showGuides");
    
    
    /**
     * Gets the "cViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties getCViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().find_element_user(CVIEWPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cViewPr" element
     */
    public void setCViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties cViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().find_element_user(CVIEWPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().add_element_user(CVIEWPR$0);
            }
            target.set(cViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "cViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties addNewCViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().add_element_user(CVIEWPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "guideLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList getGuideLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList)get_store().find_element_user(GUIDELST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "guideLst" element
     */
    public boolean isSetGuideLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUIDELST$2) != 0;
        }
    }
    
    /**
     * Sets the "guideLst" element
     */
    public void setGuideLst(org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList guideLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList)get_store().find_element_user(GUIDELST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList)get_store().add_element_user(GUIDELST$2);
            }
            target.set(guideLst);
        }
    }
    
    /**
     * Appends and returns a new empty "guideLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList addNewGuideLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList)get_store().add_element_user(GUIDELST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "guideLst" element
     */
    public void unsetGuideLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUIDELST$2, 0);
        }
    }
    
    /**
     * Gets the "snapToGrid" attribute
     */
    public boolean getSnapToGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNAPTOGRID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SNAPTOGRID$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "snapToGrid" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSnapToGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SNAPTOGRID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SNAPTOGRID$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "snapToGrid" attribute
     */
    public boolean isSetSnapToGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SNAPTOGRID$4) != null;
        }
    }
    
    /**
     * Sets the "snapToGrid" attribute
     */
    public void setSnapToGrid(boolean snapToGrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNAPTOGRID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SNAPTOGRID$4);
            }
            target.setBooleanValue(snapToGrid);
        }
    }
    
    /**
     * Sets (as xml) the "snapToGrid" attribute
     */
    public void xsetSnapToGrid(org.apache.xmlbeans.XmlBoolean snapToGrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SNAPTOGRID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SNAPTOGRID$4);
            }
            target.set(snapToGrid);
        }
    }
    
    /**
     * Unsets the "snapToGrid" attribute
     */
    public void unsetSnapToGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SNAPTOGRID$4);
        }
    }
    
    /**
     * Gets the "snapToObjects" attribute
     */
    public boolean getSnapToObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNAPTOOBJECTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SNAPTOOBJECTS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "snapToObjects" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSnapToObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SNAPTOOBJECTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SNAPTOOBJECTS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "snapToObjects" attribute
     */
    public boolean isSetSnapToObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SNAPTOOBJECTS$6) != null;
        }
    }
    
    /**
     * Sets the "snapToObjects" attribute
     */
    public void setSnapToObjects(boolean snapToObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNAPTOOBJECTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SNAPTOOBJECTS$6);
            }
            target.setBooleanValue(snapToObjects);
        }
    }
    
    /**
     * Sets (as xml) the "snapToObjects" attribute
     */
    public void xsetSnapToObjects(org.apache.xmlbeans.XmlBoolean snapToObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SNAPTOOBJECTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SNAPTOOBJECTS$6);
            }
            target.set(snapToObjects);
        }
    }
    
    /**
     * Unsets the "snapToObjects" attribute
     */
    public void unsetSnapToObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SNAPTOOBJECTS$6);
        }
    }
    
    /**
     * Gets the "showGuides" attribute
     */
    public boolean getShowGuides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWGUIDES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWGUIDES$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showGuides" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowGuides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWGUIDES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWGUIDES$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "showGuides" attribute
     */
    public boolean isSetShowGuides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWGUIDES$8) != null;
        }
    }
    
    /**
     * Sets the "showGuides" attribute
     */
    public void setShowGuides(boolean showGuides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWGUIDES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWGUIDES$8);
            }
            target.setBooleanValue(showGuides);
        }
    }
    
    /**
     * Sets (as xml) the "showGuides" attribute
     */
    public void xsetShowGuides(org.apache.xmlbeans.XmlBoolean showGuides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWGUIDES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWGUIDES$8);
            }
            target.set(showGuides);
        }
    }
    
    /**
     * Unsets the "showGuides" attribute
     */
    public void unsetShowGuides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWGUIDES$8);
        }
    }
}
