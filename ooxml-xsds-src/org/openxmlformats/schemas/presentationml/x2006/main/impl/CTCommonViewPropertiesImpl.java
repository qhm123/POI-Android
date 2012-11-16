/*
 * XML Type:  CT_CommonViewProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_CommonViewProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTCommonViewPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties
{
    
    public CTCommonViewPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCALE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "scale");
    private static final javax.xml.namespace.QName ORIGIN$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "origin");
    private static final javax.xml.namespace.QName VARSCALE$4 = 
        new javax.xml.namespace.QName("", "varScale");
    
    
    /**
     * Gets the "scale" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D)get_store().find_element_user(SCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scale" element
     */
    public void setScale(org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D)get_store().find_element_user(SCALE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D)get_store().add_element_user(SCALE$0);
            }
            target.set(scale);
        }
    }
    
    /**
     * Appends and returns a new empty "scale" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D addNewScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScale2D)get_store().add_element_user(SCALE$0);
            return target;
        }
    }
    
    /**
     * Gets the "origin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(ORIGIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(ORIGIN$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(ORIGIN$2);
            }
            target.set(origin);
        }
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(ORIGIN$2);
            return target;
        }
    }
    
    /**
     * Gets the "varScale" attribute
     */
    public boolean getVarScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VARSCALE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "varScale" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVarScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VARSCALE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "varScale" attribute
     */
    public boolean isSetVarScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VARSCALE$4) != null;
        }
    }
    
    /**
     * Sets the "varScale" attribute
     */
    public void setVarScale(boolean varScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VARSCALE$4);
            }
            target.setBooleanValue(varScale);
        }
    }
    
    /**
     * Sets (as xml) the "varScale" attribute
     */
    public void xsetVarScale(org.apache.xmlbeans.XmlBoolean varScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARSCALE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VARSCALE$4);
            }
            target.set(varScale);
        }
    }
    
    /**
     * Unsets the "varScale" attribute
     */
    public void unsetVarScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VARSCALE$4);
        }
    }
}
