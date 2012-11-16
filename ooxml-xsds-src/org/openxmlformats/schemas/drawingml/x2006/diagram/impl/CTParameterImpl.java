/*
 * XML Type:  CT_Parameter
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Parameter(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter
{
    
    public CTParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName VAL$2 = 
        new javax.xml.namespace.QName("", "val");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId.Enum getType()
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
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId.Enum type)
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
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterId)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "val" attribute
     */
    public java.lang.Object getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterVal xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterVal)get_store().find_attribute_user(VAL$2);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(java.lang.Object val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$2);
            }
            target.setObjectValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterVal val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterVal)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STParameterVal)get_store().add_attribute_user(VAL$2);
            }
            target.set(val);
        }
    }
}
