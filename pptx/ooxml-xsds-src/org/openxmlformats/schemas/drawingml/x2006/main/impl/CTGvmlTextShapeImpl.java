/*
 * XML Type:  CT_GvmlTextShape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GvmlTextShape(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGvmlTextShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape
{
    
    public CTGvmlTextShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TXBODY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "txBody");
    private static final javax.xml.namespace.QName USESPRECT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "useSpRect");
    private static final javax.xml.namespace.QName XFRM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "xfrm");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "txBody" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXBODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "txBody" element
     */
    public void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXBODY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXBODY$0);
            }
            target.set(txBody);
        }
    }
    
    /**
     * Appends and returns a new empty "txBody" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXBODY$0);
            return target;
        }
    }
    
    /**
     * Gets the "useSpRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle getUseSpRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle)get_store().find_element_user(USESPRECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "useSpRect" element
     */
    public boolean isSetUseSpRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESPRECT$2) != 0;
        }
    }
    
    /**
     * Sets the "useSpRect" element
     */
    public void setUseSpRect(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle useSpRect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle)get_store().find_element_user(USESPRECT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle)get_store().add_element_user(USESPRECT$2);
            }
            target.set(useSpRect);
        }
    }
    
    /**
     * Appends and returns a new empty "useSpRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle addNewUseSpRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle)get_store().add_element_user(USESPRECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "useSpRect" element
     */
    public void unsetUseSpRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESPRECT$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().find_element_user(XFRM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xfrm" element
     */
    public boolean isSetXfrm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XFRM$4) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().find_element_user(XFRM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().add_element_user(XFRM$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().add_element_user(XFRM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "xfrm" element
     */
    public void unsetXfrm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XFRM$4, 0);
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
