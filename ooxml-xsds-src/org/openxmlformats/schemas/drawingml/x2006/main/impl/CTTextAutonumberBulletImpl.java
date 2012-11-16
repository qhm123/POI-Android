/*
 * XML Type:  CT_TextAutonumberBullet
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextAutonumberBullet(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextAutonumberBulletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet
{
    
    public CTTextAutonumberBulletImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName STARTAT$2 = 
        new javax.xml.namespace.QName("", "startAt");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "startAt" attribute
     */
    public int getStartAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STARTAT$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "startAt" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum xgetStartAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum)get_store().find_attribute_user(STARTAT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum)get_default_attribute_value(STARTAT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "startAt" attribute
     */
    public boolean isSetStartAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTAT$2) != null;
        }
    }
    
    /**
     * Sets the "startAt" attribute
     */
    public void setStartAt(int startAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTAT$2);
            }
            target.setIntValue(startAt);
        }
    }
    
    /**
     * Sets (as xml) the "startAt" attribute
     */
    public void xsetStartAt(org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum startAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum)get_store().find_attribute_user(STARTAT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum)get_store().add_attribute_user(STARTAT$2);
            }
            target.set(startAt);
        }
    }
    
    /**
     * Unsets the "startAt" attribute
     */
    public void unsetStartAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTAT$2);
        }
    }
}
