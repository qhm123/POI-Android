/*
 * XML Type:  CT_ShapeStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ShapeStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTShapeStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle
{
    
    public CTShapeStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LNREF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnRef");
    private static final javax.xml.namespace.QName FILLREF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillRef");
    private static final javax.xml.namespace.QName EFFECTREF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectRef");
    private static final javax.xml.namespace.QName FONTREF$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fontRef");
    
    
    /**
     * Gets the "lnRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getLnRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(LNREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lnRef" element
     */
    public void setLnRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference lnRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(LNREF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(LNREF$0);
            }
            target.set(lnRef);
        }
    }
    
    /**
     * Appends and returns a new empty "lnRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewLnRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(LNREF$0);
            return target;
        }
    }
    
    /**
     * Gets the "fillRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(FILLREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fillRef" element
     */
    public void setFillRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference fillRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(FILLREF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(FILLREF$2);
            }
            target.set(fillRef);
        }
    }
    
    /**
     * Appends and returns a new empty "fillRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(FILLREF$2);
            return target;
        }
    }
    
    /**
     * Gets the "effectRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getEffectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(EFFECTREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "effectRef" element
     */
    public void setEffectRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference effectRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(EFFECTREF$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(EFFECTREF$4);
            }
            target.set(effectRef);
        }
    }
    
    /**
     * Appends and returns a new empty "effectRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewEffectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(EFFECTREF$4);
            return target;
        }
    }
    
    /**
     * Gets the "fontRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference getFontRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().find_element_user(FONTREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fontRef" element
     */
    public void setFontRef(org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference fontRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().find_element_user(FONTREF$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().add_element_user(FONTREF$6);
            }
            target.set(fontRef);
        }
    }
    
    /**
     * Appends and returns a new empty "fontRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference addNewFontRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference)get_store().add_element_user(FONTREF$6);
            return target;
        }
    }
}
