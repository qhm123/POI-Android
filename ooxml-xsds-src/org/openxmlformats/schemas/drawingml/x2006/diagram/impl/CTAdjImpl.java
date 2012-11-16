/*
 * XML Type:  CT_Adj
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Adj(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTAdjImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj
{
    
    public CTAdjImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDX$0 = 
        new javax.xml.namespace.QName("", "idx");
    private static final javax.xml.namespace.QName VAL$2 = 
        new javax.xml.namespace.QName("", "val");
    
    
    /**
     * Gets the "idx" attribute
     */
    public long getIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDX$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "idx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STIndex1 xgetIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STIndex1 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STIndex1)get_store().find_attribute_user(IDX$0);
            return target;
        }
    }
    
    /**
     * Sets the "idx" attribute
     */
    public void setIdx(long idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDX$0);
            }
            target.setLongValue(idx);
        }
    }
    
    /**
     * Sets (as xml) the "idx" attribute
     */
    public void xsetIdx(org.openxmlformats.schemas.drawingml.x2006.diagram.STIndex1 idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STIndex1 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STIndex1)get_store().find_attribute_user(IDX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STIndex1)get_store().add_attribute_user(IDX$0);
            }
            target.set(idx);
        }
    }
    
    /**
     * Gets the "val" attribute
     */
    public double getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VAL$2);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(double val)
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
            target.setDoubleValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.apache.xmlbeans.XmlDouble val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VAL$2);
            }
            target.set(val);
        }
    }
}
