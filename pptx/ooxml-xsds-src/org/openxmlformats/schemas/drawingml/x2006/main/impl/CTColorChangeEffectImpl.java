/*
 * XML Type:  CT_ColorChangeEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ColorChangeEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorChangeEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect
{
    
    public CTColorChangeEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLRFROM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrFrom");
    private static final javax.xml.namespace.QName CLRTO$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrTo");
    private static final javax.xml.namespace.QName USEA$4 = 
        new javax.xml.namespace.QName("", "useA");
    
    
    /**
     * Gets the "clrFrom" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getClrFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CLRFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clrFrom" element
     */
    public void setClrFrom(org.openxmlformats.schemas.drawingml.x2006.main.CTColor clrFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CLRFROM$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CLRFROM$0);
            }
            target.set(clrFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "clrFrom" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewClrFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CLRFROM$0);
            return target;
        }
    }
    
    /**
     * Gets the "clrTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getClrTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CLRTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clrTo" element
     */
    public void setClrTo(org.openxmlformats.schemas.drawingml.x2006.main.CTColor clrTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CLRTO$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CLRTO$2);
            }
            target.set(clrTo);
        }
    }
    
    /**
     * Appends and returns a new empty "clrTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewClrTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CLRTO$2);
            return target;
        }
    }
    
    /**
     * Gets the "useA" attribute
     */
    public boolean getUseA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEA$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useA" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEA$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "useA" attribute
     */
    public boolean isSetUseA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEA$4) != null;
        }
    }
    
    /**
     * Sets the "useA" attribute
     */
    public void setUseA(boolean useA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEA$4);
            }
            target.setBooleanValue(useA);
        }
    }
    
    /**
     * Sets (as xml) the "useA" attribute
     */
    public void xsetUseA(org.apache.xmlbeans.XmlBoolean useA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEA$4);
            }
            target.set(useA);
        }
    }
    
    /**
     * Unsets the "useA" attribute
     */
    public void unsetUseA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEA$4);
        }
    }
}
