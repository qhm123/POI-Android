/*
 * XML Type:  CT_SplitTransition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SplitTransition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSplitTransitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSplitTransition
{
    
    public CTSplitTransitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIENT$0 = 
        new javax.xml.namespace.QName("", "orient");
    private static final javax.xml.namespace.QName DIR$2 = 
        new javax.xml.namespace.QName("", "dir");
    
    
    /**
     * Gets the "orient" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum getOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORIENT$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "orient" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STDirection xgetOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STDirection target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_store().find_attribute_user(ORIENT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_default_attribute_value(ORIENT$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "orient" attribute
     */
    public boolean isSetOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIENT$0) != null;
        }
    }
    
    /**
     * Sets the "orient" attribute
     */
    public void setOrient(org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum orient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENT$0);
            }
            target.setEnumValue(orient);
        }
    }
    
    /**
     * Sets (as xml) the "orient" attribute
     */
    public void xsetOrient(org.openxmlformats.schemas.presentationml.x2006.main.STDirection orient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STDirection target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_store().find_attribute_user(ORIENT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_store().add_attribute_user(ORIENT$0);
            }
            target.set(orient);
        }
    }
    
    /**
     * Unsets the "orient" attribute
     */
    public void unsetOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIENT$0);
        }
    }
    
    /**
     * Gets the "dir" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType.Enum getDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIR$2);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_store().find_attribute_user(DIR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_default_attribute_value(DIR$2);
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
            return get_store().find_attribute_user(DIR$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$2);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_store().find_attribute_user(DIR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTransitionInOutDirectionType)get_store().add_attribute_user(DIR$2);
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
            get_store().remove_attribute(DIR$2);
        }
    }
}
