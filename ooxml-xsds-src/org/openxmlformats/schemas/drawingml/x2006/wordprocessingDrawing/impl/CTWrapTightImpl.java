/*
 * XML Type:  CT_WrapTight
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * An XML CT_WrapTight(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public class CTWrapTightImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight
{
    
    public CTWrapTightImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WRAPPOLYGON$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapPolygon");
    private static final javax.xml.namespace.QName WRAPTEXT$2 = 
        new javax.xml.namespace.QName("", "wrapText");
    private static final javax.xml.namespace.QName DISTL$4 = 
        new javax.xml.namespace.QName("", "distL");
    private static final javax.xml.namespace.QName DISTR$6 = 
        new javax.xml.namespace.QName("", "distR");
    
    
    /**
     * Gets the "wrapPolygon" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath getWrapPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath)get_store().find_element_user(WRAPPOLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wrapPolygon" element
     */
    public void setWrapPolygon(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath wrapPolygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath)get_store().find_element_user(WRAPPOLYGON$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath)get_store().add_element_user(WRAPPOLYGON$0);
            }
            target.set(wrapPolygon);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapPolygon" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath addNewWrapPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath)get_store().add_element_user(WRAPPOLYGON$0);
            return target;
        }
    }
    
    /**
     * Gets the "wrapText" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.Enum getWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPTEXT$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrapText" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText xgetWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText)get_store().find_attribute_user(WRAPTEXT$2);
            return target;
        }
    }
    
    /**
     * Sets the "wrapText" attribute
     */
    public void setWrapText(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText.Enum wrapText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPTEXT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAPTEXT$2);
            }
            target.setEnumValue(wrapText);
        }
    }
    
    /**
     * Sets (as xml) the "wrapText" attribute
     */
    public void xsetWrapText(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText wrapText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText)get_store().find_attribute_user(WRAPTEXT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapText)get_store().add_attribute_user(WRAPTEXT$2);
            }
            target.set(wrapText);
        }
    }
    
    /**
     * Gets the "distL" attribute
     */
    public long getDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distL" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$4);
            return target;
        }
    }
    
    /**
     * True if has "distL" attribute
     */
    public boolean isSetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTL$4) != null;
        }
    }
    
    /**
     * Sets the "distL" attribute
     */
    public void setDistL(long distL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTL$4);
            }
            target.setLongValue(distL);
        }
    }
    
    /**
     * Sets (as xml) the "distL" attribute
     */
    public void xsetDistL(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTL$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTL$4);
            }
            target.set(distL);
        }
    }
    
    /**
     * Unsets the "distL" attribute
     */
    public void unsetDistL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTL$4);
        }
    }
    
    /**
     * Gets the "distR" attribute
     */
    public long getDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "distR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$6);
            return target;
        }
    }
    
    /**
     * True if has "distR" attribute
     */
    public boolean isSetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTR$6) != null;
        }
    }
    
    /**
     * Sets the "distR" attribute
     */
    public void setDistR(long distR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTR$6);
            }
            target.setLongValue(distR);
        }
    }
    
    /**
     * Sets (as xml) the "distR" attribute
     */
    public void xsetDistR(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().find_attribute_user(DISTR$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance)get_store().add_attribute_user(DISTR$6);
            }
            target.set(distR);
        }
    }
    
    /**
     * Unsets the "distR" attribute
     */
    public void unsetDistR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTR$6);
        }
    }
}
