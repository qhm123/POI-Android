/*
 * XML Type:  CT_PageMargins
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PageMargins(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageMarginsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins
{
    
    public CTPageMarginsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFT$0 = 
        new javax.xml.namespace.QName("", "left");
    private static final javax.xml.namespace.QName RIGHT$2 = 
        new javax.xml.namespace.QName("", "right");
    private static final javax.xml.namespace.QName TOP$4 = 
        new javax.xml.namespace.QName("", "top");
    private static final javax.xml.namespace.QName BOTTOM$6 = 
        new javax.xml.namespace.QName("", "bottom");
    private static final javax.xml.namespace.QName HEADER$8 = 
        new javax.xml.namespace.QName("", "header");
    private static final javax.xml.namespace.QName FOOTER$10 = 
        new javax.xml.namespace.QName("", "footer");
    
    
    /**
     * Gets the "left" attribute
     */
    public double getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFT$0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "left" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LEFT$0);
            return target;
        }
    }
    
    /**
     * Sets the "left" attribute
     */
    public void setLeft(double left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFT$0);
            }
            target.setDoubleValue(left);
        }
    }
    
    /**
     * Sets (as xml) the "left" attribute
     */
    public void xsetLeft(org.apache.xmlbeans.XmlDouble left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LEFT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LEFT$0);
            }
            target.set(left);
        }
    }
    
    /**
     * Gets the "right" attribute
     */
    public double getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHT$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "right" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RIGHT$2);
            return target;
        }
    }
    
    /**
     * Sets the "right" attribute
     */
    public void setRight(double right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHT$2);
            }
            target.setDoubleValue(right);
        }
    }
    
    /**
     * Sets (as xml) the "right" attribute
     */
    public void xsetRight(org.apache.xmlbeans.XmlDouble right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RIGHT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RIGHT$2);
            }
            target.set(right);
        }
    }
    
    /**
     * Gets the "top" attribute
     */
    public double getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOP$4);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "top" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOP$4);
            return target;
        }
    }
    
    /**
     * Sets the "top" attribute
     */
    public void setTop(double top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOP$4);
            }
            target.setDoubleValue(top);
        }
    }
    
    /**
     * Sets (as xml) the "top" attribute
     */
    public void xsetTop(org.apache.xmlbeans.XmlDouble top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOP$4);
            }
            target.set(top);
        }
    }
    
    /**
     * Gets the "bottom" attribute
     */
    public double getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOM$6);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "bottom" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BOTTOM$6);
            return target;
        }
    }
    
    /**
     * Sets the "bottom" attribute
     */
    public void setBottom(double bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOTTOM$6);
            }
            target.setDoubleValue(bottom);
        }
    }
    
    /**
     * Sets (as xml) the "bottom" attribute
     */
    public void xsetBottom(org.apache.xmlbeans.XmlDouble bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BOTTOM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(BOTTOM$6);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Gets the "header" attribute
     */
    public double getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$8);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "header" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HEADER$8);
            return target;
        }
    }
    
    /**
     * Sets the "header" attribute
     */
    public void setHeader(double header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADER$8);
            }
            target.setDoubleValue(header);
        }
    }
    
    /**
     * Sets (as xml) the "header" attribute
     */
    public void xsetHeader(org.apache.xmlbeans.XmlDouble header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HEADER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HEADER$8);
            }
            target.set(header);
        }
    }
    
    /**
     * Gets the "footer" attribute
     */
    public double getFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOOTER$10);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "footer" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FOOTER$10);
            return target;
        }
    }
    
    /**
     * Sets the "footer" attribute
     */
    public void setFooter(double footer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOOTER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOOTER$10);
            }
            target.setDoubleValue(footer);
        }
    }
    
    /**
     * Sets (as xml) the "footer" attribute
     */
    public void xsetFooter(org.apache.xmlbeans.XmlDouble footer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FOOTER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(FOOTER$10);
            }
            target.set(footer);
        }
    }
}
