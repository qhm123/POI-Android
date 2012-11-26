/*
 * XML Type:  CT_PresetGeometry2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_PresetGeometry2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPresetGeometry2DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D
{
    
    public CTPresetGeometry2DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "avLst");
    private static final javax.xml.namespace.QName PRST$2 = 
        new javax.xml.namespace.QName("", "prst");
    
    
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
     * Gets the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STShapeType.Enum getPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STShapeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STShapeType xgetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeType)get_store().find_attribute_user(PRST$2);
            return target;
        }
    }
    
    /**
     * Sets the "prst" attribute
     */
    public void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STShapeType.Enum prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRST$2);
            }
            target.setEnumValue(prst);
        }
    }
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    public void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STShapeType prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeType)get_store().find_attribute_user(PRST$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeType)get_store().add_attribute_user(PRST$2);
            }
            target.set(prst);
        }
    }
}
