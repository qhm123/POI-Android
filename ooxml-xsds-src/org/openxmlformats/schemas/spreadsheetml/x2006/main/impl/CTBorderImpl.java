/*
 * XML Type:  CT_Border
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Border(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBorderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder
{
    
    public CTBorderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "left");
    private static final javax.xml.namespace.QName RIGHT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "right");
    private static final javax.xml.namespace.QName TOP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "top");
    private static final javax.xml.namespace.QName BOTTOM$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bottom");
    private static final javax.xml.namespace.QName DIAGONAL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "diagonal");
    private static final javax.xml.namespace.QName VERTICAL$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "vertical");
    private static final javax.xml.namespace.QName HORIZONTAL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "horizontal");
    private static final javax.xml.namespace.QName DIAGONALUP$14 = 
        new javax.xml.namespace.QName("", "diagonalUp");
    private static final javax.xml.namespace.QName DIAGONALDOWN$16 = 
        new javax.xml.namespace.QName("", "diagonalDown");
    private static final javax.xml.namespace.QName OUTLINE$18 = 
        new javax.xml.namespace.QName("", "outline");
    
    
    /**
     * Gets the "left" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(LEFT$0, 0);
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
            return get_store().count_elements(LEFT$0) != 0;
        }
    }
    
    /**
     * Sets the "left" element
     */
    public void setLeft(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(LEFT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(LEFT$0);
            }
            target.set(left);
        }
    }
    
    /**
     * Appends and returns a new empty "left" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr addNewLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(LEFT$0);
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
            get_store().remove_element(LEFT$0, 0);
        }
    }
    
    /**
     * Gets the "right" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(RIGHT$2, 0);
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
            return get_store().count_elements(RIGHT$2) != 0;
        }
    }
    
    /**
     * Sets the "right" element
     */
    public void setRight(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(RIGHT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(RIGHT$2);
            }
            target.set(right);
        }
    }
    
    /**
     * Appends and returns a new empty "right" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr addNewRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(RIGHT$2);
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
            get_store().remove_element(RIGHT$2, 0);
        }
    }
    
    /**
     * Gets the "top" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(TOP$4, 0);
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
            return get_store().count_elements(TOP$4) != 0;
        }
    }
    
    /**
     * Sets the "top" element
     */
    public void setTop(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(TOP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(TOP$4);
            }
            target.set(top);
        }
    }
    
    /**
     * Appends and returns a new empty "top" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr addNewTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(TOP$4);
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
            get_store().remove_element(TOP$4, 0);
        }
    }
    
    /**
     * Gets the "bottom" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(BOTTOM$6, 0);
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
            return get_store().count_elements(BOTTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "bottom" element
     */
    public void setBottom(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(BOTTOM$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(BOTTOM$6);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Appends and returns a new empty "bottom" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr addNewBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(BOTTOM$6);
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
            get_store().remove_element(BOTTOM$6, 0);
        }
    }
    
    /**
     * Gets the "diagonal" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr getDiagonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(DIAGONAL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diagonal" element
     */
    public boolean isSetDiagonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGONAL$8) != 0;
        }
    }
    
    /**
     * Sets the "diagonal" element
     */
    public void setDiagonal(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr diagonal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(DIAGONAL$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(DIAGONAL$8);
            }
            target.set(diagonal);
        }
    }
    
    /**
     * Appends and returns a new empty "diagonal" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr addNewDiagonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(DIAGONAL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "diagonal" element
     */
    public void unsetDiagonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGONAL$8, 0);
        }
    }
    
    /**
     * Gets the "vertical" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr getVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(VERTICAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vertical" element
     */
    public boolean isSetVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICAL$10) != 0;
        }
    }
    
    /**
     * Sets the "vertical" element
     */
    public void setVertical(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr vertical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(VERTICAL$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(VERTICAL$10);
            }
            target.set(vertical);
        }
    }
    
    /**
     * Appends and returns a new empty "vertical" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr addNewVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(VERTICAL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "vertical" element
     */
    public void unsetVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICAL$10, 0);
        }
    }
    
    /**
     * Gets the "horizontal" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr getHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(HORIZONTAL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "horizontal" element
     */
    public boolean isSetHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HORIZONTAL$12) != 0;
        }
    }
    
    /**
     * Sets the "horizontal" element
     */
    public void setHorizontal(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr horizontal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().find_element_user(HORIZONTAL$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(HORIZONTAL$12);
            }
            target.set(horizontal);
        }
    }
    
    /**
     * Appends and returns a new empty "horizontal" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr addNewHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr)get_store().add_element_user(HORIZONTAL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "horizontal" element
     */
    public void unsetHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HORIZONTAL$12, 0);
        }
    }
    
    /**
     * Gets the "diagonalUp" attribute
     */
    public boolean getDiagonalUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAGONALUP$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "diagonalUp" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDiagonalUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIAGONALUP$14);
            return target;
        }
    }
    
    /**
     * True if has "diagonalUp" attribute
     */
    public boolean isSetDiagonalUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIAGONALUP$14) != null;
        }
    }
    
    /**
     * Sets the "diagonalUp" attribute
     */
    public void setDiagonalUp(boolean diagonalUp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAGONALUP$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIAGONALUP$14);
            }
            target.setBooleanValue(diagonalUp);
        }
    }
    
    /**
     * Sets (as xml) the "diagonalUp" attribute
     */
    public void xsetDiagonalUp(org.apache.xmlbeans.XmlBoolean diagonalUp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIAGONALUP$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DIAGONALUP$14);
            }
            target.set(diagonalUp);
        }
    }
    
    /**
     * Unsets the "diagonalUp" attribute
     */
    public void unsetDiagonalUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIAGONALUP$14);
        }
    }
    
    /**
     * Gets the "diagonalDown" attribute
     */
    public boolean getDiagonalDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAGONALDOWN$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "diagonalDown" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDiagonalDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIAGONALDOWN$16);
            return target;
        }
    }
    
    /**
     * True if has "diagonalDown" attribute
     */
    public boolean isSetDiagonalDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIAGONALDOWN$16) != null;
        }
    }
    
    /**
     * Sets the "diagonalDown" attribute
     */
    public void setDiagonalDown(boolean diagonalDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIAGONALDOWN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIAGONALDOWN$16);
            }
            target.setBooleanValue(diagonalDown);
        }
    }
    
    /**
     * Sets (as xml) the "diagonalDown" attribute
     */
    public void xsetDiagonalDown(org.apache.xmlbeans.XmlBoolean diagonalDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIAGONALDOWN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DIAGONALDOWN$16);
            }
            target.set(diagonalDown);
        }
    }
    
    /**
     * Unsets the "diagonalDown" attribute
     */
    public void unsetDiagonalDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIAGONALDOWN$16);
        }
    }
    
    /**
     * Gets the "outline" attribute
     */
    public boolean getOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "outline" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OUTLINE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "outline" attribute
     */
    public boolean isSetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINE$18) != null;
        }
    }
    
    /**
     * Sets the "outline" attribute
     */
    public void setOutline(boolean outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINE$18);
            }
            target.setBooleanValue(outline);
        }
    }
    
    /**
     * Sets (as xml) the "outline" attribute
     */
    public void xsetOutline(org.apache.xmlbeans.XmlBoolean outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTLINE$18);
            }
            target.set(outline);
        }
    }
    
    /**
     * Unsets the "outline" attribute
     */
    public void unsetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINE$18);
        }
    }
}
