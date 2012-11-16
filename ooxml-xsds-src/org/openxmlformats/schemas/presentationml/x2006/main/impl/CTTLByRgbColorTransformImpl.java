/*
 * XML Type:  CT_TLByRgbColorTransform
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLByRgbColorTransform(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLByRgbColorTransformImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLByRgbColorTransform
{
    
    public CTTLByRgbColorTransformImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName R$0 = 
        new javax.xml.namespace.QName("", "r");
    private static final javax.xml.namespace.QName G$2 = 
        new javax.xml.namespace.QName("", "g");
    private static final javax.xml.namespace.QName B$4 = 
        new javax.xml.namespace.QName("", "b");
    
    
    /**
     * Gets the "r" attribute
     */
    public int getR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "r" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(R$0);
            return target;
        }
    }
    
    /**
     * Sets the "r" attribute
     */
    public void setR(int r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$0);
            }
            target.setIntValue(r);
        }
    }
    
    /**
     * Sets (as xml) the "r" attribute
     */
    public void xsetR(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(R$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(R$0);
            }
            target.set(r);
        }
    }
    
    /**
     * Gets the "g" attribute
     */
    public int getG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(G$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "g" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(G$2);
            return target;
        }
    }
    
    /**
     * Sets the "g" attribute
     */
    public void setG(int g)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(G$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(G$2);
            }
            target.setIntValue(g);
        }
    }
    
    /**
     * Sets (as xml) the "g" attribute
     */
    public void xsetG(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage g)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(G$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(G$2);
            }
            target.set(g);
        }
    }
    
    /**
     * Gets the "b" attribute
     */
    public int getB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "b" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage xgetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(B$4);
            return target;
        }
    }
    
    /**
     * Sets the "b" attribute
     */
    public void setB(int b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(B$4);
            }
            target.setIntValue(b);
        }
    }
    
    /**
     * Sets (as xml) the "b" attribute
     */
    public void xsetB(org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().find_attribute_user(B$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedPercentage)get_store().add_attribute_user(B$4);
            }
            target.set(b);
        }
    }
}
