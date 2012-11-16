/*
 * XML Type:  CT_CellAlignment
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellAlignment(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellAlignmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment
{
    
    public CTCellAlignmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HORIZONTAL$0 = 
        new javax.xml.namespace.QName("", "horizontal");
    private static final javax.xml.namespace.QName VERTICAL$2 = 
        new javax.xml.namespace.QName("", "vertical");
    private static final javax.xml.namespace.QName TEXTROTATION$4 = 
        new javax.xml.namespace.QName("", "textRotation");
    private static final javax.xml.namespace.QName WRAPTEXT$6 = 
        new javax.xml.namespace.QName("", "wrapText");
    private static final javax.xml.namespace.QName INDENT$8 = 
        new javax.xml.namespace.QName("", "indent");
    private static final javax.xml.namespace.QName RELATIVEINDENT$10 = 
        new javax.xml.namespace.QName("", "relativeIndent");
    private static final javax.xml.namespace.QName JUSTIFYLASTLINE$12 = 
        new javax.xml.namespace.QName("", "justifyLastLine");
    private static final javax.xml.namespace.QName SHRINKTOFIT$14 = 
        new javax.xml.namespace.QName("", "shrinkToFit");
    private static final javax.xml.namespace.QName READINGORDER$16 = 
        new javax.xml.namespace.QName("", "readingOrder");
    
    
    /**
     * Gets the "horizontal" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment.Enum getHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTAL$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "horizontal" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment xgetHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment)get_store().find_attribute_user(HORIZONTAL$0);
            return target;
        }
    }
    
    /**
     * True if has "horizontal" attribute
     */
    public boolean isSetHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORIZONTAL$0) != null;
        }
    }
    
    /**
     * Sets the "horizontal" attribute
     */
    public void setHorizontal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment.Enum horizontal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTAL$0);
            }
            target.setEnumValue(horizontal);
        }
    }
    
    /**
     * Sets (as xml) the "horizontal" attribute
     */
    public void xsetHorizontal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment horizontal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment)get_store().find_attribute_user(HORIZONTAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment)get_store().add_attribute_user(HORIZONTAL$0);
            }
            target.set(horizontal);
        }
    }
    
    /**
     * Unsets the "horizontal" attribute
     */
    public void unsetHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORIZONTAL$0);
        }
    }
    
    /**
     * Gets the "vertical" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment.Enum getVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICAL$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vertical" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment xgetVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment)get_store().find_attribute_user(VERTICAL$2);
            return target;
        }
    }
    
    /**
     * True if has "vertical" attribute
     */
    public boolean isSetVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTICAL$2) != null;
        }
    }
    
    /**
     * Sets the "vertical" attribute
     */
    public void setVertical(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment.Enum vertical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICAL$2);
            }
            target.setEnumValue(vertical);
        }
    }
    
    /**
     * Sets (as xml) the "vertical" attribute
     */
    public void xsetVertical(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment vertical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment)get_store().find_attribute_user(VERTICAL$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment)get_store().add_attribute_user(VERTICAL$2);
            }
            target.set(vertical);
        }
    }
    
    /**
     * Unsets the "vertical" attribute
     */
    public void unsetVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTICAL$2);
        }
    }
    
    /**
     * Gets the "textRotation" attribute
     */
    public long getTextRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTROTATION$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "textRotation" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetTextRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TEXTROTATION$4);
            return target;
        }
    }
    
    /**
     * True if has "textRotation" attribute
     */
    public boolean isSetTextRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTROTATION$4) != null;
        }
    }
    
    /**
     * Sets the "textRotation" attribute
     */
    public void setTextRotation(long textRotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTROTATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTROTATION$4);
            }
            target.setLongValue(textRotation);
        }
    }
    
    /**
     * Sets (as xml) the "textRotation" attribute
     */
    public void xsetTextRotation(org.apache.xmlbeans.XmlUnsignedInt textRotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TEXTROTATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(TEXTROTATION$4);
            }
            target.set(textRotation);
        }
    }
    
    /**
     * Unsets the "textRotation" attribute
     */
    public void unsetTextRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTROTATION$4);
        }
    }
    
    /**
     * Gets the "wrapText" attribute
     */
    public boolean getWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPTEXT$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrapText" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WRAPTEXT$6);
            return target;
        }
    }
    
    /**
     * True if has "wrapText" attribute
     */
    public boolean isSetWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WRAPTEXT$6) != null;
        }
    }
    
    /**
     * Sets the "wrapText" attribute
     */
    public void setWrapText(boolean wrapText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAPTEXT$6);
            }
            target.setBooleanValue(wrapText);
        }
    }
    
    /**
     * Sets (as xml) the "wrapText" attribute
     */
    public void xsetWrapText(org.apache.xmlbeans.XmlBoolean wrapText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WRAPTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(WRAPTEXT$6);
            }
            target.set(wrapText);
        }
    }
    
    /**
     * Unsets the "wrapText" attribute
     */
    public void unsetWrapText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WRAPTEXT$6);
        }
    }
    
    /**
     * Gets the "indent" attribute
     */
    public long getIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENT$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "indent" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDENT$8);
            return target;
        }
    }
    
    /**
     * True if has "indent" attribute
     */
    public boolean isSetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDENT$8) != null;
        }
    }
    
    /**
     * Sets the "indent" attribute
     */
    public void setIndent(long indent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDENT$8);
            }
            target.setLongValue(indent);
        }
    }
    
    /**
     * Sets (as xml) the "indent" attribute
     */
    public void xsetIndent(org.apache.xmlbeans.XmlUnsignedInt indent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDENT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(INDENT$8);
            }
            target.set(indent);
        }
    }
    
    /**
     * Unsets the "indent" attribute
     */
    public void unsetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDENT$8);
        }
    }
    
    /**
     * Gets the "relativeIndent" attribute
     */
    public int getRelativeIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEINDENT$10);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "relativeIndent" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetRelativeIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RELATIVEINDENT$10);
            return target;
        }
    }
    
    /**
     * True if has "relativeIndent" attribute
     */
    public boolean isSetRelativeIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATIVEINDENT$10) != null;
        }
    }
    
    /**
     * Sets the "relativeIndent" attribute
     */
    public void setRelativeIndent(int relativeIndent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVEINDENT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIVEINDENT$10);
            }
            target.setIntValue(relativeIndent);
        }
    }
    
    /**
     * Sets (as xml) the "relativeIndent" attribute
     */
    public void xsetRelativeIndent(org.apache.xmlbeans.XmlInt relativeIndent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RELATIVEINDENT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(RELATIVEINDENT$10);
            }
            target.set(relativeIndent);
        }
    }
    
    /**
     * Unsets the "relativeIndent" attribute
     */
    public void unsetRelativeIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATIVEINDENT$10);
        }
    }
    
    /**
     * Gets the "justifyLastLine" attribute
     */
    public boolean getJustifyLastLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JUSTIFYLASTLINE$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "justifyLastLine" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetJustifyLastLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(JUSTIFYLASTLINE$12);
            return target;
        }
    }
    
    /**
     * True if has "justifyLastLine" attribute
     */
    public boolean isSetJustifyLastLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JUSTIFYLASTLINE$12) != null;
        }
    }
    
    /**
     * Sets the "justifyLastLine" attribute
     */
    public void setJustifyLastLine(boolean justifyLastLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JUSTIFYLASTLINE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JUSTIFYLASTLINE$12);
            }
            target.setBooleanValue(justifyLastLine);
        }
    }
    
    /**
     * Sets (as xml) the "justifyLastLine" attribute
     */
    public void xsetJustifyLastLine(org.apache.xmlbeans.XmlBoolean justifyLastLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(JUSTIFYLASTLINE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(JUSTIFYLASTLINE$12);
            }
            target.set(justifyLastLine);
        }
    }
    
    /**
     * Unsets the "justifyLastLine" attribute
     */
    public void unsetJustifyLastLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JUSTIFYLASTLINE$12);
        }
    }
    
    /**
     * Gets the "shrinkToFit" attribute
     */
    public boolean getShrinkToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHRINKTOFIT$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "shrinkToFit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShrinkToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHRINKTOFIT$14);
            return target;
        }
    }
    
    /**
     * True if has "shrinkToFit" attribute
     */
    public boolean isSetShrinkToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHRINKTOFIT$14) != null;
        }
    }
    
    /**
     * Sets the "shrinkToFit" attribute
     */
    public void setShrinkToFit(boolean shrinkToFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHRINKTOFIT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHRINKTOFIT$14);
            }
            target.setBooleanValue(shrinkToFit);
        }
    }
    
    /**
     * Sets (as xml) the "shrinkToFit" attribute
     */
    public void xsetShrinkToFit(org.apache.xmlbeans.XmlBoolean shrinkToFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHRINKTOFIT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHRINKTOFIT$14);
            }
            target.set(shrinkToFit);
        }
    }
    
    /**
     * Unsets the "shrinkToFit" attribute
     */
    public void unsetShrinkToFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHRINKTOFIT$14);
        }
    }
    
    /**
     * Gets the "readingOrder" attribute
     */
    public long getReadingOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READINGORDER$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "readingOrder" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetReadingOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(READINGORDER$16);
            return target;
        }
    }
    
    /**
     * True if has "readingOrder" attribute
     */
    public boolean isSetReadingOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(READINGORDER$16) != null;
        }
    }
    
    /**
     * Sets the "readingOrder" attribute
     */
    public void setReadingOrder(long readingOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READINGORDER$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READINGORDER$16);
            }
            target.setLongValue(readingOrder);
        }
    }
    
    /**
     * Sets (as xml) the "readingOrder" attribute
     */
    public void xsetReadingOrder(org.apache.xmlbeans.XmlUnsignedInt readingOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(READINGORDER$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(READINGORDER$16);
            }
            target.set(readingOrder);
        }
    }
    
    /**
     * Unsets the "readingOrder" attribute
     */
    public void unsetReadingOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(READINGORDER$16);
        }
    }
}
