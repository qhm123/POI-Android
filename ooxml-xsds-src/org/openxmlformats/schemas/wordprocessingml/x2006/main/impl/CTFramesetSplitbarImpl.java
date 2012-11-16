/*
 * XML Type:  CT_FramesetSplitbar
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FramesetSplitbar(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFramesetSplitbarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar
{
    
    public CTFramesetSplitbarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName W$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
    private static final javax.xml.namespace.QName COLOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "color");
    private static final javax.xml.namespace.QName NOBORDER$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noBorder");
    private static final javax.xml.namespace.QName FLATBORDERS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "flatBorders");
    
    
    /**
     * Gets the "w" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(W$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "w" element
     */
    public boolean isSetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(W$0) != 0;
        }
    }
    
    /**
     * Sets the "w" element
     */
    public void setW(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().find_element_user(W$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(W$0);
            }
            target.set(w);
        }
    }
    
    /**
     * Appends and returns a new empty "w" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure addNewW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure)get_store().add_element_user(W$0);
            return target;
        }
    }
    
    /**
     * Unsets the "w" element
     */
    public void unsetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(W$0, 0);
        }
    }
    
    /**
     * Gets the "color" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().find_element_user(COLOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "color" element
     */
    public boolean isSetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLOR$2) != 0;
        }
    }
    
    /**
     * Sets the "color" element
     */
    public void setColor(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().find_element_user(COLOR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().add_element_user(COLOR$2);
            }
            target.set(color);
        }
    }
    
    /**
     * Appends and returns a new empty "color" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor addNewColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().add_element_user(COLOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "color" element
     */
    public void unsetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLOR$2, 0);
        }
    }
    
    /**
     * Gets the "noBorder" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNoBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOBORDER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noBorder" element
     */
    public boolean isSetNoBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOBORDER$4) != 0;
        }
    }
    
    /**
     * Sets the "noBorder" element
     */
    public void setNoBorder(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff noBorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOBORDER$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOBORDER$4);
            }
            target.set(noBorder);
        }
    }
    
    /**
     * Appends and returns a new empty "noBorder" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNoBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOBORDER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "noBorder" element
     */
    public void unsetNoBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOBORDER$4, 0);
        }
    }
    
    /**
     * Gets the "flatBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getFlatBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FLATBORDERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "flatBorders" element
     */
    public boolean isSetFlatBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLATBORDERS$6) != 0;
        }
    }
    
    /**
     * Sets the "flatBorders" element
     */
    public void setFlatBorders(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff flatBorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FLATBORDERS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FLATBORDERS$6);
            }
            target.set(flatBorders);
        }
    }
    
    /**
     * Appends and returns a new empty "flatBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewFlatBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FLATBORDERS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "flatBorders" element
     */
    public void unsetFlatBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLATBORDERS$6, 0);
        }
    }
}
