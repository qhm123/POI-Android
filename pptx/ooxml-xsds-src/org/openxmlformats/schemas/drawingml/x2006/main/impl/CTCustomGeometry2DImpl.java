/*
 * XML Type:  CT_CustomGeometry2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_CustomGeometry2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomGeometry2DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D
{
    
    public CTCustomGeometry2DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "avLst");
    private static final javax.xml.namespace.QName GDLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gdLst");
    private static final javax.xml.namespace.QName AHLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ahLst");
    private static final javax.xml.namespace.QName CXNLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cxnLst");
    private static final javax.xml.namespace.QName RECT$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "rect");
    private static final javax.xml.namespace.QName PATHLST$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pathLst");
    
    
    /**
     * Gets the "avLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList getAvLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().find_element_user(AVLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "avLst" element
     */
    public boolean isSetAvLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVLST$0) != 0;
        }
    }
    
    /**
     * Sets the "avLst" element
     */
    public void setAvLst(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList avLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().find_element_user(AVLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().add_element_user(AVLST$0);
            }
            target.set(avLst);
        }
    }
    
    /**
     * Appends and returns a new empty "avLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList addNewAvLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().add_element_user(AVLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "avLst" element
     */
    public void unsetAvLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVLST$0, 0);
        }
    }
    
    /**
     * Gets the "gdLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList getGdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().find_element_user(GDLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gdLst" element
     */
    public boolean isSetGdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GDLST$2) != 0;
        }
    }
    
    /**
     * Sets the "gdLst" element
     */
    public void setGdLst(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList gdLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().find_element_user(GDLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().add_element_user(GDLST$2);
            }
            target.set(gdLst);
        }
    }
    
    /**
     * Appends and returns a new empty "gdLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList addNewGdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList)get_store().add_element_user(GDLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "gdLst" element
     */
    public void unsetGdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GDLST$2, 0);
        }
    }
    
    /**
     * Gets the "ahLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList getAhLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList)get_store().find_element_user(AHLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ahLst" element
     */
    public boolean isSetAhLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AHLST$4) != 0;
        }
    }
    
    /**
     * Sets the "ahLst" element
     */
    public void setAhLst(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList ahLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList)get_store().find_element_user(AHLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList)get_store().add_element_user(AHLST$4);
            }
            target.set(ahLst);
        }
    }
    
    /**
     * Appends and returns a new empty "ahLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList addNewAhLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList)get_store().add_element_user(AHLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ahLst" element
     */
    public void unsetAhLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AHLST$4, 0);
        }
    }
    
    /**
     * Gets the "cxnLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList getCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList)get_store().find_element_user(CXNLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cxnLst" element
     */
    public boolean isSetCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CXNLST$6) != 0;
        }
    }
    
    /**
     * Sets the "cxnLst" element
     */
    public void setCxnLst(org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList cxnLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList)get_store().find_element_user(CXNLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList)get_store().add_element_user(CXNLST$6);
            }
            target.set(cxnLst);
        }
    }
    
    /**
     * Appends and returns a new empty "cxnLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList addNewCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList)get_store().add_element_user(CXNLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "cxnLst" element
     */
    public void unsetCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CXNLST$6, 0);
        }
    }
    
    /**
     * Gets the "rect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect getRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect)get_store().find_element_user(RECT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rect" element
     */
    public boolean isSetRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECT$8) != 0;
        }
    }
    
    /**
     * Sets the "rect" element
     */
    public void setRect(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect rect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect)get_store().find_element_user(RECT$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect)get_store().add_element_user(RECT$8);
            }
            target.set(rect);
        }
    }
    
    /**
     * Appends and returns a new empty "rect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect addNewRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect)get_store().add_element_user(RECT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "rect" element
     */
    public void unsetRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECT$8, 0);
        }
    }
    
    /**
     * Gets the "pathLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList getPathLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList)get_store().find_element_user(PATHLST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pathLst" element
     */
    public void setPathLst(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList pathLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList)get_store().find_element_user(PATHLST$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList)get_store().add_element_user(PATHLST$10);
            }
            target.set(pathLst);
        }
    }
    
    /**
     * Appends and returns a new empty "pathLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList addNewPathLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList)get_store().add_element_user(PATHLST$10);
            return target;
        }
    }
}
