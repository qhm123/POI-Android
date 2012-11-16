/*
 * XML Type:  CT_Compat
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/compatibility
 * Java type: org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.compatibility.impl;
/**
 * An XML CT_Compat(@http://schemas.openxmlformats.org/drawingml/2006/compatibility).
 *
 * This is a complex type.
 */
public class CTCompatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.compatibility.CTCompat
{
    
    public CTCompatImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPID$0 = 
        new javax.xml.namespace.QName("", "spid");
    
    
    /**
     * Gets the "spid" attribute
     */
    public java.lang.String getSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STShapeID xgetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$0);
            return target;
        }
    }
    
    /**
     * Sets the "spid" attribute
     */
    public void setSpid(java.lang.String spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$0);
            }
            target.setStringValue(spid);
        }
    }
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    public void xsetSpid(org.openxmlformats.schemas.drawingml.x2006.main.STShapeID spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().add_attribute_user(SPID$0);
            }
            target.set(spid);
        }
    }
}
