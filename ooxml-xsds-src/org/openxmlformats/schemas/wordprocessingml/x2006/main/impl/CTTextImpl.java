/*
 * XML Type:  CT_Text
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Text(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText.
 */
public class CTTextImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText
{
    
    public CTTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CTTextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SPACE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
    
    
    /**
     * Gets the "space" attribute
     */
    public org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum getSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPACE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "space" attribute
     */
    public org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space xgetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_default_attribute_value(SPACE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "space" attribute
     */
    public boolean isSetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPACE$0) != null;
        }
    }
    
    /**
     * Sets the "space" attribute
     */
    public void setSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$0);
            }
            target.setEnumValue(space);
        }
    }
    
    /**
     * Sets (as xml) the "space" attribute
     */
    public void xsetSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$0);
            }
            target.set(space);
        }
    }
    
    /**
     * Unsets the "space" attribute
     */
    public void unsetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPACE$0);
        }
    }
}
