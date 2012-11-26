/*
 * XML Type:  CT_Background
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTBackground
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_Background(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTBackgroundImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTBackground
{
    
    public CTBackgroundImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BGPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bgPr");
    private static final javax.xml.namespace.QName BGREF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bgRef");
    private static final javax.xml.namespace.QName BWMODE$4 = 
        new javax.xml.namespace.QName("", "bwMode");
    
    
    /**
     * Gets the "bgPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties getBgPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties)get_store().find_element_user(BGPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bgPr" element
     */
    public boolean isSetBgPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BGPR$0) != 0;
        }
    }
    
    /**
     * Sets the "bgPr" element
     */
    public void setBgPr(org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties bgPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties)get_store().find_element_user(BGPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties)get_store().add_element_user(BGPR$0);
            }
            target.set(bgPr);
        }
    }
    
    /**
     * Appends and returns a new empty "bgPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties addNewBgPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties)get_store().add_element_user(BGPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bgPr" element
     */
    public void unsetBgPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BGPR$0, 0);
        }
    }
    
    /**
     * Gets the "bgRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getBgRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(BGREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bgRef" element
     */
    public boolean isSetBgRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BGREF$2) != 0;
        }
    }
    
    /**
     * Sets the "bgRef" element
     */
    public void setBgRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference bgRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(BGREF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(BGREF$2);
            }
            target.set(bgRef);
        }
    }
    
    /**
     * Appends and returns a new empty "bgRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewBgRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(BGREF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bgRef" element
     */
    public void unsetBgRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BGREF$2, 0);
        }
    }
    
    /**
     * Gets the "bwMode" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode.Enum getBwMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BWMODE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwMode" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode xgetBwMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode)get_store().find_attribute_user(BWMODE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode)get_default_attribute_value(BWMODE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "bwMode" attribute
     */
    public boolean isSetBwMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWMODE$4) != null;
        }
    }
    
    /**
     * Sets the "bwMode" attribute
     */
    public void setBwMode(org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode.Enum bwMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWMODE$4);
            }
            target.setEnumValue(bwMode);
        }
    }
    
    /**
     * Sets (as xml) the "bwMode" attribute
     */
    public void xsetBwMode(org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode bwMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode)get_store().find_attribute_user(BWMODE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode)get_store().add_attribute_user(BWMODE$4);
            }
            target.set(bwMode);
        }
    }
    
    /**
     * Unsets the "bwMode" attribute
     */
    public void unsetBwMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWMODE$4);
        }
    }
}
