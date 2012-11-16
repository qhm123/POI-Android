/*
 * XML Type:  CT_BlendEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_BlendEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBlendEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect
{
    
    public CTBlendEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cont");
    private static final javax.xml.namespace.QName BLEND$2 = 
        new javax.xml.namespace.QName("", "blend");
    
    
    /**
     * Gets the "cont" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer getCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(CONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cont" element
     */
    public void setCont(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer cont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(CONT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(CONT$0);
            }
            target.set(cont);
        }
    }
    
    /**
     * Appends and returns a new empty "cont" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer addNewCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(CONT$0);
            return target;
        }
    }
    
    /**
     * Gets the "blend" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode.Enum getBlend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLEND$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "blend" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode xgetBlend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode)get_store().find_attribute_user(BLEND$2);
            return target;
        }
    }
    
    /**
     * Sets the "blend" attribute
     */
    public void setBlend(org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode.Enum blend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLEND$2);
            }
            target.setEnumValue(blend);
        }
    }
    
    /**
     * Sets (as xml) the "blend" attribute
     */
    public void xsetBlend(org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode blend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode)get_store().find_attribute_user(BLEND$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlendMode)get_store().add_attribute_user(BLEND$2);
            }
            target.set(blend);
        }
    }
}
