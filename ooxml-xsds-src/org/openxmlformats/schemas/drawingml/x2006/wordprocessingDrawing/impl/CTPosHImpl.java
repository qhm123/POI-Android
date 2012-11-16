/*
 * XML Type:  CT_PosH
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * An XML CT_PosH(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public class CTPosHImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH
{
    
    public CTPosHImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "align");
    private static final javax.xml.namespace.QName POSOFFSET$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "posOffset");
    private static final javax.xml.namespace.QName RELATIVEFROM$4 = 
        new javax.xml.namespace.QName("", "relativeFrom");
    
    
    /**
     * Gets the "align" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH.Enum getAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "align" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH xgetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH)get_store().find_element_user(ALIGN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "align" element
     */
    public boolean isSetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIGN$0) != 0;
        }
    }
    
    /**
     * Sets the "align" element
     */
    public void setAlign(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH.Enum align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIGN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIGN$0);
            }
            target.setEnumValue(align);
        }
    }
    
    /**
     * Sets (as xml) the "align" element
     */
    public void xsetAlign(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH)get_store().find_element_user(ALIGN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STAlignH)get_store().add_element_user(ALIGN$0);
            }
            target.set(align);
        }
    }
    
    /**
     * Unsets the "align" element
     */
    public void unsetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIGN$0, 0);
        }
    }
    
    /**
     * Gets the "posOffset" element
     */
    public int getPosOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSOFFSET$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "posOffset" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STPositionOffset xgetPosOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STPositionOffset target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STPositionOffset)get_store().find_element_user(POSOFFSET$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "posOffset" element
     */
    public boolean isSetPosOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSOFFSET$2) != 0;
        }
    }
    
    /**
     * Sets the "posOffset" element
     */
    public void setPosOffset(int posOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSOFFSET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSOFFSET$2);
            }
            target.setIntValue(posOffset);
        }
    }
    
    /**
     * Sets (as xml) the "posOffset" element
     */
    public void xsetPosOffset(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STPositionOffset posOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STPositionOffset target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STPositionOffset)get_store().find_element_user(POSOFFSET$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STPositionOffset)get_store().add_element_user(POSOFFSET$2);
            }
            target.set(posOffset);
        }
    }
    
    /**
     * Unsets the "posOffset" element
     */
    public void unsetPosOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSOFFSET$2, 0);
        }
    }
    
    /**
     * Gets the "relativeFrom" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH.Enum getRelativeFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEFROM$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "relativeFrom" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH xgetRelativeFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH)get_store().find_attribute_user(RELATIVEFROM$4);
            return target;
        }
    }
    
    /**
     * Sets the "relativeFrom" attribute
     */
    public void setRelativeFrom(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH.Enum relativeFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEFROM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIVEFROM$4);
            }
            target.setEnumValue(relativeFrom);
        }
    }
    
    /**
     * Sets (as xml) the "relativeFrom" attribute
     */
    public void xsetRelativeFrom(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH relativeFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH)get_store().find_attribute_user(RELATIVEFROM$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH)get_store().add_attribute_user(RELATIVEFROM$4);
            }
            target.set(relativeFrom);
        }
    }
}
