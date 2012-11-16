/*
 * XML Type:  CT_EightDirectionTransition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_EightDirectionTransition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTEightDirectionTransitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTEightDirectionTransition
{
    
    public CTEightDirectionTransitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIR$0 = 
        new javax.xml.namespace.QName("", "dir");
    
    
    /**
     * Gets the "dir" attribute
     */
    public java.lang.String getDir()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dir" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType xgetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType)get_store().find_attribute_user(DIR$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType)get_default_attribute_value(DIR$0);
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
    public void setDir(java.lang.String dir)
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
            target.setStringValue(dir);
        }
    }
    
    /**
     * Sets (as xml) the "dir" attribute
     */
    public void xsetDir(org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType)get_store().find_attribute_user(DIR$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionEightDirectionType)get_store().add_attribute_user(DIR$0);
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
