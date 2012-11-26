/*
 * XML Type:  CT_InOutTransition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_InOutTransition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTInOutTransitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTInOutTransition
{
    
    public CTInOutTransitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIR$0 = 
        new javax.xml.namespace.QName("", "dir");
    
    
    /**
     * Gets the "dir" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType.Enum getDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIR$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dir" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType xgetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_store().find_attribute_user(DIR$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_default_attribute_value(DIR$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "dir" attribute
     */
    public boolean isSetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIR$0) != null;
        }
    }
    
    /**
     * Sets the "dir" attribute
     */
    public void setDir(org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType.Enum dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$0);
            }
            target.setEnumValue(dir);
        }
    }
    
    /**
     * Sets (as xml) the "dir" attribute
     */
    public void xsetDir(org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_store().find_attribute_user(DIR$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_store().add_attribute_user(DIR$0);
            }
            target.set(dir);
        }
    }
    
    /**
     * Unsets the "dir" attribute
     */
    public void unsetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIR$0);
        }
    }
}
