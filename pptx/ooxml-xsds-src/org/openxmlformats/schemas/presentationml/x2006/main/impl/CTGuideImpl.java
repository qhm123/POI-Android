/*
 * XML Type:  CT_Guide
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTGuide
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_Guide(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTGuideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTGuide
{
    
    public CTGuideImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIENT$0 = 
        new javax.xml.namespace.QName("", "orient");
    private static final javax.xml.namespace.QName POS$2 = 
        new javax.xml.namespace.QName("", "pos");
    
    
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
     * Gets the "pos" attribute
     */
    public int getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POS$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "pos" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(POS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_default_attribute_value(POS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "pos" attribute
     */
    public boolean isSetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POS$2) != null;
        }
    }
    
    /**
     * Sets the "pos" attribute
     */
    public void setPos(int pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POS$2);
            }
            target.setIntValue(pos);
        }
    }
    
    /**
     * Sets (as xml) the "pos" attribute
     */
    public void xsetPos(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(POS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(POS$2);
            }
            target.set(pos);
        }
    }
    
    /**
     * Unsets the "pos" attribute
     */
    public void unsetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POS$2);
        }
    }
}
