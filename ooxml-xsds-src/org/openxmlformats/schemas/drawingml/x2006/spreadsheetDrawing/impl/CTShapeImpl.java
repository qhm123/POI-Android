/*
 * XML Type:  CT_Shape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;
/**
 * An XML CT_Shape(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public class CTShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape
{
    
    public CTShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVSPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "nvSpPr");
    private static final javax.xml.namespace.QName SPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "spPr");
    private static final javax.xml.namespace.QName STYLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "style");
    private static final javax.xml.namespace.QName TXBODY$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "txBody");
    private static final javax.xml.namespace.QName MACRO$8 = 
        new javax.xml.namespace.QName("", "macro");
    private static final javax.xml.namespace.QName TEXTLINK$10 = 
        new javax.xml.namespace.QName("", "textlink");
    private static final javax.xml.namespace.QName FLOCKSTEXT$12 = 
        new javax.xml.namespace.QName("", "fLocksText");
    private static final javax.xml.namespace.QName FPUBLISHED$14 = 
        new javax.xml.namespace.QName("", "fPublished");
    
    
    /**
     * Gets the "nvSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual getNvSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual)get_store().find_element_user(NVSPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nvSpPr" element
     */
    public void setNvSpPr(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual nvSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual)get_store().find_element_user(NVSPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual)get_store().add_element_user(NVSPPR$0);
            }
            target.set(nvSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual addNewNvSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual)get_store().add_element_user(NVSPPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            return target;
        }
    }
    
    /**
     * Gets the "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "style" element
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$4) != 0;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$4);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "style" element
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$4, 0);
        }
    }
    
    /**
     * Gets the "txBody" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXBODY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txBody" element
     */
    public boolean isSetTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXBODY$6) != 0;
        }
    }
    
    /**
     * Sets the "txBody" element
     */
    public void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXBODY$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXBODY$6);
            }
            target.set(txBody);
        }
    }
    
    /**
     * Appends and returns a new empty "txBody" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXBODY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "txBody" element
     */
    public void unsetTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXBODY$6, 0);
        }
    }
    
    /**
     * Gets the "macro" attribute
     */
    public java.lang.String getMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MACRO$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "macro" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MACRO$8);
            return target;
        }
    }
    
    /**
     * True if has "macro" attribute
     */
    public boolean isSetMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MACRO$8) != null;
        }
    }
    
    /**
     * Sets the "macro" attribute
     */
    public void setMacro(java.lang.String macro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MACRO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MACRO$8);
            }
            target.setStringValue(macro);
        }
    }
    
    /**
     * Sets (as xml) the "macro" attribute
     */
    public void xsetMacro(org.apache.xmlbeans.XmlString macro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MACRO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MACRO$8);
            }
            target.set(macro);
        }
    }
    
    /**
     * Unsets the "macro" attribute
     */
    public void unsetMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MACRO$8);
        }
    }
    
    /**
     * Gets the "textlink" attribute
     */
    public java.lang.String getTextlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTLINK$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "textlink" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTLINK$10);
            return target;
        }
    }
    
    /**
     * True if has "textlink" attribute
     */
    public boolean isSetTextlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTLINK$10) != null;
        }
    }
    
    /**
     * Sets the "textlink" attribute
     */
    public void setTextlink(java.lang.String textlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTLINK$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTLINK$10);
            }
            target.setStringValue(textlink);
        }
    }
    
    /**
     * Sets (as xml) the "textlink" attribute
     */
    public void xsetTextlink(org.apache.xmlbeans.XmlString textlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTLINK$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTLINK$10);
            }
            target.set(textlink);
        }
    }
    
    /**
     * Unsets the "textlink" attribute
     */
    public void unsetTextlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTLINK$10);
        }
    }
    
    /**
     * Gets the "fLocksText" attribute
     */
    public boolean getFLocksText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOCKSTEXT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FLOCKSTEXT$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fLocksText" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFLocksText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLOCKSTEXT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FLOCKSTEXT$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "fLocksText" attribute
     */
    public boolean isSetFLocksText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLOCKSTEXT$12) != null;
        }
    }
    
    /**
     * Sets the "fLocksText" attribute
     */
    public void setFLocksText(boolean fLocksText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOCKSTEXT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOCKSTEXT$12);
            }
            target.setBooleanValue(fLocksText);
        }
    }
    
    /**
     * Sets (as xml) the "fLocksText" attribute
     */
    public void xsetFLocksText(org.apache.xmlbeans.XmlBoolean fLocksText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLOCKSTEXT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FLOCKSTEXT$12);
            }
            target.set(fLocksText);
        }
    }
    
    /**
     * Unsets the "fLocksText" attribute
     */
    public void unsetFLocksText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLOCKSTEXT$12);
        }
    }
    
    /**
     * Gets the "fPublished" attribute
     */
    public boolean getFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPUBLISHED$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FPUBLISHED$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fPublished" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FPUBLISHED$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FPUBLISHED$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "fPublished" attribute
     */
    public boolean isSetFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FPUBLISHED$14) != null;
        }
    }
    
    /**
     * Sets the "fPublished" attribute
     */
    public void setFPublished(boolean fPublished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FPUBLISHED$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FPUBLISHED$14);
            }
            target.setBooleanValue(fPublished);
        }
    }
    
    /**
     * Sets (as xml) the "fPublished" attribute
     */
    public void xsetFPublished(org.apache.xmlbeans.XmlBoolean fPublished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FPUBLISHED$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FPUBLISHED$14);
            }
            target.set(fPublished);
        }
    }
    
    /**
     * Unsets the "fPublished" attribute
     */
    public void unsetFPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FPUBLISHED$14);
        }
    }
}
