/*
 * XML Type:  CT_TextTabStop
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextTabStop(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextTabStopImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop
{
    
    public CTTextTabStopImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("", "pos");
    private static final javax.xml.namespace.QName ALGN$2 = 
        new javax.xml.namespace.QName("", "algn");
    
    
    /**
     * Gets the "pos" attribute
     */
    public int getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(POS$0);
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
            return get_store().find_attribute_user(POS$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POS$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(POS$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(POS$0);
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
            get_store().remove_attribute(POS$0);
        }
    }
    
    /**
     * Gets the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType.Enum getAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType xgetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType)get_store().find_attribute_user(ALGN$2);
            return target;
        }
    }
    
    /**
     * True if has "algn" attribute
     */
    public boolean isSetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALGN$2) != null;
        }
    }
    
    /**
     * Sets the "algn" attribute
     */
    public void setAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType.Enum algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGN$2);
            }
            target.setEnumValue(algn);
        }
    }
    
    /**
     * Sets (as xml) the "algn" attribute
     */
    public void xsetAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType)get_store().find_attribute_user(ALGN$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType)get_store().add_attribute_user(ALGN$2);
            }
            target.set(algn);
        }
    }
    
    /**
     * Unsets the "algn" attribute
     */
    public void unsetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALGN$2);
        }
    }
}
