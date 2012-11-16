/*
 * XML Type:  CT_PageBorders
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PageBorders(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageBordersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders
{
    
    public CTPageBordersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "top");
    private static final javax.xml.namespace.QName LEFT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "left");
    private static final javax.xml.namespace.QName BOTTOM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bottom");
    private static final javax.xml.namespace.QName RIGHT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "right");
    private static final javax.xml.namespace.QName ZORDER$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "zOrder");
    private static final javax.xml.namespace.QName DISPLAY$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "display");
    private static final javax.xml.namespace.QName OFFSETFROM$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "offsetFrom");
    
    
    /**
     * Gets the "top" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "top" element
     */
    public boolean isSetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOP$0) != 0;
        }
    }
    
    /**
     * Sets the "top" element
     */
    public void setTop(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(TOP$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TOP$0);
            }
            target.set(top);
        }
    }
    
    /**
     * Appends and returns a new empty "top" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(TOP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "top" element
     */
    public void unsetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOP$0, 0);
        }
    }
    
    /**
     * Gets the "left" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(LEFT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "left" element
     */
    public boolean isSetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEFT$2) != 0;
        }
    }
    
    /**
     * Sets the "left" element
     */
    public void setLeft(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(LEFT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(LEFT$2);
            }
            target.set(left);
        }
    }
    
    /**
     * Appends and returns a new empty "left" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(LEFT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "left" element
     */
    public void unsetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEFT$2, 0);
        }
    }
    
    /**
     * Gets the "bottom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(BOTTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bottom" element
     */
    public boolean isSetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOTTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "bottom" element
     */
    public void setBottom(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(BOTTOM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(BOTTOM$4);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Appends and returns a new empty "bottom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(BOTTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bottom" element
     */
    public void unsetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOTTOM$4, 0);
        }
    }
    
    /**
     * Gets the "right" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(RIGHT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "right" element
     */
    public boolean isSetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHT$6) != 0;
        }
    }
    
    /**
     * Sets the "right" element
     */
    public void setRight(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(RIGHT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(RIGHT$6);
            }
            target.set(right);
        }
    }
    
    /**
     * Appends and returns a new empty "right" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(RIGHT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "right" element
     */
    public void unsetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHT$6, 0);
        }
    }
    
    /**
     * Gets the "zOrder" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder.Enum getZOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZORDER$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "zOrder" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder xgetZOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder)get_store().find_attribute_user(ZORDER$8);
            return target;
        }
    }
    
    /**
     * True if has "zOrder" attribute
     */
    public boolean isSetZOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZORDER$8) != null;
        }
    }
    
    /**
     * Sets the "zOrder" attribute
     */
    public void setZOrder(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder.Enum zOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZORDER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZORDER$8);
            }
            target.setEnumValue(zOrder);
        }
    }
    
    /**
     * Sets (as xml) the "zOrder" attribute
     */
    public void xsetZOrder(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder zOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder)get_store().find_attribute_user(ZORDER$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderZOrder)get_store().add_attribute_user(ZORDER$8);
            }
            target.set(zOrder);
        }
    }
    
    /**
     * Unsets the "zOrder" attribute
     */
    public void unsetZOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZORDER$8);
        }
    }
    
    /**
     * Gets the "display" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay.Enum getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "display" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay xgetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay)get_store().find_attribute_user(DISPLAY$10);
            return target;
        }
    }
    
    /**
     * True if has "display" attribute
     */
    public boolean isSetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAY$10) != null;
        }
    }
    
    /**
     * Sets the "display" attribute
     */
    public void setDisplay(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay.Enum display)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAY$10);
            }
            target.setEnumValue(display);
        }
    }
    
    /**
     * Sets (as xml) the "display" attribute
     */
    public void xsetDisplay(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay display)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay)get_store().find_attribute_user(DISPLAY$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderDisplay)get_store().add_attribute_user(DISPLAY$10);
            }
            target.set(display);
        }
    }
    
    /**
     * Unsets the "display" attribute
     */
    public void unsetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAY$10);
        }
    }
    
    /**
     * Gets the "offsetFrom" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset.Enum getOffsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETFROM$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "offsetFrom" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset xgetOffsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset)get_store().find_attribute_user(OFFSETFROM$12);
            return target;
        }
    }
    
    /**
     * True if has "offsetFrom" attribute
     */
    public boolean isSetOffsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OFFSETFROM$12) != null;
        }
    }
    
    /**
     * Sets the "offsetFrom" attribute
     */
    public void setOffsetFrom(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset.Enum offsetFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSETFROM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSETFROM$12);
            }
            target.setEnumValue(offsetFrom);
        }
    }
    
    /**
     * Sets (as xml) the "offsetFrom" attribute
     */
    public void xsetOffsetFrom(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset offsetFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset)get_store().find_attribute_user(OFFSETFROM$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageBorderOffset)get_store().add_attribute_user(OFFSETFROM$12);
            }
            target.set(offsetFrom);
        }
    }
    
    /**
     * Unsets the "offsetFrom" attribute
     */
    public void unsetOffsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OFFSETFROM$12);
        }
    }
}
