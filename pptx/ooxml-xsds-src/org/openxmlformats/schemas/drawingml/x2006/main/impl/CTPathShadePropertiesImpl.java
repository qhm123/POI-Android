/*
 * XML Type:  CT_PathShadeProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_PathShadeProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPathShadePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties
{
    
    public CTPathShadePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILLTORECT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillToRect");
    private static final javax.xml.namespace.QName PATH$2 = 
        new javax.xml.namespace.QName("", "path");
    
    
    /**
     * Gets the "fillToRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect getFillToRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(FILLTORECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fillToRect" element
     */
    public boolean isSetFillToRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLTORECT$0) != 0;
        }
    }
    
    /**
     * Sets the "fillToRect" element
     */
    public void setFillToRect(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect fillToRect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().find_element_user(FILLTORECT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(FILLTORECT$0);
            }
            target.set(fillToRect);
        }
    }
    
    /**
     * Appends and returns a new empty "fillToRect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect addNewFillToRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect)get_store().add_element_user(FILLTORECT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fillToRect" element
     */
    public void unsetFillToRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLTORECT$0, 0);
        }
    }
    
    /**
     * Gets the "path" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType.Enum getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType)get_store().find_attribute_user(PATH$2);
            return target;
        }
    }
    
    /**
     * True if has "path" attribute
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATH$2) != null;
        }
    }
    
    /**
     * Sets the "path" attribute
     */
    public void setPath(org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType.Enum path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$2);
            }
            target.setEnumValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" attribute
     */
    public void xsetPath(org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType)get_store().find_attribute_user(PATH$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType)get_store().add_attribute_user(PATH$2);
            }
            target.set(path);
        }
    }
    
    /**
     * Unsets the "path" attribute
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATH$2);
        }
    }
}
