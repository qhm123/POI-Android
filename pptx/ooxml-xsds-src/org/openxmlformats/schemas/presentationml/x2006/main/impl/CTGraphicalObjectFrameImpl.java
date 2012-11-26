/*
 * XML Type:  CT_GraphicalObjectFrame
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_GraphicalObjectFrame(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTGraphicalObjectFrameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame
{
    
    public CTGraphicalObjectFrameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVGRAPHICFRAMEPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvGraphicFramePr");
    private static final javax.xml.namespace.QName XFRM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "xfrm");
    private static final javax.xml.namespace.QName GRAPHIC$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    
    
    /**
     * Gets the "nvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual getNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual)get_store().find_element_user(NVGRAPHICFRAMEPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nvGraphicFramePr" element
     */
    public void setNvGraphicFramePr(org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual nvGraphicFramePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual)get_store().find_element_user(NVGRAPHICFRAMEPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual)get_store().add_element_user(NVGRAPHICFRAMEPR$0);
            }
            target.set(nvGraphicFramePr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvGraphicFramePr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual addNewNvGraphicFramePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual)get_store().add_element_user(NVGRAPHICFRAMEPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "xfrm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D getXfrm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().find_element_user(XFRM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "xfrm" element
     */
    public void setXfrm(org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D xfrm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().find_element_user(XFRM$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().add_element_user(XFRM$2);
            }
            target.set(xfrm);
        }
    }
    
    /**
     * Appends and returns a new empty "xfrm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D addNewXfrm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().add_element_user(XFRM$2);
            return target;
        }
    }
    
    /**
     * Gets the "graphic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject getGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "graphic" element
     */
    public void setGraphic(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject graphic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().find_element_user(GRAPHIC$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$4);
            }
            target.set(graphic);
        }
    }
    
    /**
     * Appends and returns a new empty "graphic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject addNewGraphic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject)get_store().add_element_user(GRAPHIC$4);
            return target;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$6, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$6);
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
