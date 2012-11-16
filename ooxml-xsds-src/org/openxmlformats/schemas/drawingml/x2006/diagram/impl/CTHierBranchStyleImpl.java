/*
 * XML Type:  CT_HierBranchStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_HierBranchStyle(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTHierBranchStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle
{
    
    public CTHierBranchStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("", "val");
    
    
    /**
     * Gets the "val" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle.Enum getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VAL$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle)get_default_attribute_value(VAL$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "val" attribute
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VAL$0) != null;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle.Enum val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setEnumValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHierBranchStyle)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Unsets the "val" attribute
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VAL$0);
        }
    }
}
