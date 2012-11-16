/*
 * XML Type:  CT_SheetFormatPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SheetFormatPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetFormatPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr
{
    
    public CTSheetFormatPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECOLWIDTH$0 = 
        new javax.xml.namespace.QName("", "baseColWidth");
    private static final javax.xml.namespace.QName DEFAULTCOLWIDTH$2 = 
        new javax.xml.namespace.QName("", "defaultColWidth");
    private static final javax.xml.namespace.QName DEFAULTROWHEIGHT$4 = 
        new javax.xml.namespace.QName("", "defaultRowHeight");
    private static final javax.xml.namespace.QName CUSTOMHEIGHT$6 = 
        new javax.xml.namespace.QName("", "customHeight");
    private static final javax.xml.namespace.QName ZEROHEIGHT$8 = 
        new javax.xml.namespace.QName("", "zeroHeight");
    private static final javax.xml.namespace.QName THICKTOP$10 = 
        new javax.xml.namespace.QName("", "thickTop");
    private static final javax.xml.namespace.QName THICKBOTTOM$12 = 
        new javax.xml.namespace.QName("", "thickBottom");
    private static final javax.xml.namespace.QName OUTLINELEVELROW$14 = 
        new javax.xml.namespace.QName("", "outlineLevelRow");
    private static final javax.xml.namespace.QName OUTLINELEVELCOL$16 = 
        new javax.xml.namespace.QName("", "outlineLevelCol");
    
    
    /**
     * Gets the "baseColWidth" attribute
     */
    public long getBaseColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASECOLWIDTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BASECOLWIDTH$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseColWidth" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetBaseColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BASECOLWIDTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(BASECOLWIDTH$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "baseColWidth" attribute
     */
    public boolean isSetBaseColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASECOLWIDTH$0) != null;
        }
    }
    
    /**
     * Sets the "baseColWidth" attribute
     */
    public void setBaseColWidth(long baseColWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASECOLWIDTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASECOLWIDTH$0);
            }
            target.setLongValue(baseColWidth);
        }
    }
    
    /**
     * Sets (as xml) the "baseColWidth" attribute
     */
    public void xsetBaseColWidth(org.apache.xmlbeans.XmlUnsignedInt baseColWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BASECOLWIDTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(BASECOLWIDTH$0);
            }
            target.set(baseColWidth);
        }
    }
    
    /**
     * Unsets the "baseColWidth" attribute
     */
    public void unsetBaseColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASECOLWIDTH$0);
        }
    }
    
    /**
     * Gets the "defaultColWidth" attribute
     */
    public double getDefaultColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultColWidth" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetDefaultColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
            return target;
        }
    }
    
    /**
     * True if has "defaultColWidth" attribute
     */
    public boolean isSetDefaultColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTCOLWIDTH$2) != null;
        }
    }
    
    /**
     * Sets the "defaultColWidth" attribute
     */
    public void setDefaultColWidth(double defaultColWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTCOLWIDTH$2);
            }
            target.setDoubleValue(defaultColWidth);
        }
    }
    
    /**
     * Sets (as xml) the "defaultColWidth" attribute
     */
    public void xsetDefaultColWidth(org.apache.xmlbeans.XmlDouble defaultColWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEFAULTCOLWIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DEFAULTCOLWIDTH$2);
            }
            target.set(defaultColWidth);
        }
    }
    
    /**
     * Unsets the "defaultColWidth" attribute
     */
    public void unsetDefaultColWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTCOLWIDTH$2);
        }
    }
    
    /**
     * Gets the "defaultRowHeight" attribute
     */
    public double getDefaultRowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultRowHeight" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetDefaultRowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
            return target;
        }
    }
    
    /**
     * Sets the "defaultRowHeight" attribute
     */
    public void setDefaultRowHeight(double defaultRowHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTROWHEIGHT$4);
            }
            target.setDoubleValue(defaultRowHeight);
        }
    }
    
    /**
     * Sets (as xml) the "defaultRowHeight" attribute
     */
    public void xsetDefaultRowHeight(org.apache.xmlbeans.XmlDouble defaultRowHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEFAULTROWHEIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DEFAULTROWHEIGHT$4);
            }
            target.set(defaultRowHeight);
        }
    }
    
    /**
     * Gets the "customHeight" attribute
     */
    public boolean getCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMHEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CUSTOMHEIGHT$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "customHeight" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMHEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CUSTOMHEIGHT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "customHeight" attribute
     */
    public boolean isSetCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMHEIGHT$6) != null;
        }
    }
    
    /**
     * Sets the "customHeight" attribute
     */
    public void setCustomHeight(boolean customHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMHEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMHEIGHT$6);
            }
            target.setBooleanValue(customHeight);
        }
    }
    
    /**
     * Sets (as xml) the "customHeight" attribute
     */
    public void xsetCustomHeight(org.apache.xmlbeans.XmlBoolean customHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMHEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTOMHEIGHT$6);
            }
            target.set(customHeight);
        }
    }
    
    /**
     * Unsets the "customHeight" attribute
     */
    public void unsetCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMHEIGHT$6);
        }
    }
    
    /**
     * Gets the "zeroHeight" attribute
     */
    public boolean getZeroHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZEROHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZEROHEIGHT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "zeroHeight" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetZeroHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZEROHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ZEROHEIGHT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "zeroHeight" attribute
     */
    public boolean isSetZeroHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZEROHEIGHT$8) != null;
        }
    }
    
    /**
     * Sets the "zeroHeight" attribute
     */
    public void setZeroHeight(boolean zeroHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZEROHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZEROHEIGHT$8);
            }
            target.setBooleanValue(zeroHeight);
        }
    }
    
    /**
     * Sets (as xml) the "zeroHeight" attribute
     */
    public void xsetZeroHeight(org.apache.xmlbeans.XmlBoolean zeroHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZEROHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ZEROHEIGHT$8);
            }
            target.set(zeroHeight);
        }
    }
    
    /**
     * Unsets the "zeroHeight" attribute
     */
    public void unsetZeroHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZEROHEIGHT$8);
        }
    }
    
    /**
     * Gets the "thickTop" attribute
     */
    public boolean getThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THICKTOP$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "thickTop" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(THICKTOP$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "thickTop" attribute
     */
    public boolean isSetThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THICKTOP$10) != null;
        }
    }
    
    /**
     * Sets the "thickTop" attribute
     */
    public void setThickTop(boolean thickTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THICKTOP$10);
            }
            target.setBooleanValue(thickTop);
        }
    }
    
    /**
     * Sets (as xml) the "thickTop" attribute
     */
    public void xsetThickTop(org.apache.xmlbeans.XmlBoolean thickTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(THICKTOP$10);
            }
            target.set(thickTop);
        }
    }
    
    /**
     * Unsets the "thickTop" attribute
     */
    public void unsetThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THICKTOP$10);
        }
    }
    
    /**
     * Gets the "thickBottom" attribute
     */
    public boolean getThickBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKBOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THICKBOTTOM$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "thickBottom" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetThickBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKBOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(THICKBOTTOM$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "thickBottom" attribute
     */
    public boolean isSetThickBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THICKBOTTOM$12) != null;
        }
    }
    
    /**
     * Sets the "thickBottom" attribute
     */
    public void setThickBottom(boolean thickBottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKBOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THICKBOTTOM$12);
            }
            target.setBooleanValue(thickBottom);
        }
    }
    
    /**
     * Sets (as xml) the "thickBottom" attribute
     */
    public void xsetThickBottom(org.apache.xmlbeans.XmlBoolean thickBottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKBOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(THICKBOTTOM$12);
            }
            target.set(thickBottom);
        }
    }
    
    /**
     * Unsets the "thickBottom" attribute
     */
    public void unsetThickBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THICKBOTTOM$12);
        }
    }
    
    /**
     * Gets the "outlineLevelRow" attribute
     */
    public short getOutlineLevelRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVELROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINELEVELROW$14);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "outlineLevelRow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetOutlineLevelRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVELROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(OUTLINELEVELROW$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "outlineLevelRow" attribute
     */
    public boolean isSetOutlineLevelRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINELEVELROW$14) != null;
        }
    }
    
    /**
     * Sets the "outlineLevelRow" attribute
     */
    public void setOutlineLevelRow(short outlineLevelRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVELROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINELEVELROW$14);
            }
            target.setShortValue(outlineLevelRow);
        }
    }
    
    /**
     * Sets (as xml) the "outlineLevelRow" attribute
     */
    public void xsetOutlineLevelRow(org.apache.xmlbeans.XmlUnsignedByte outlineLevelRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVELROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(OUTLINELEVELROW$14);
            }
            target.set(outlineLevelRow);
        }
    }
    
    /**
     * Unsets the "outlineLevelRow" attribute
     */
    public void unsetOutlineLevelRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINELEVELROW$14);
        }
    }
    
    /**
     * Gets the "outlineLevelCol" attribute
     */
    public short getOutlineLevelCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVELCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINELEVELCOL$16);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "outlineLevelCol" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetOutlineLevelCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVELCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(OUTLINELEVELCOL$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "outlineLevelCol" attribute
     */
    public boolean isSetOutlineLevelCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINELEVELCOL$16) != null;
        }
    }
    
    /**
     * Sets the "outlineLevelCol" attribute
     */
    public void setOutlineLevelCol(short outlineLevelCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVELCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINELEVELCOL$16);
            }
            target.setShortValue(outlineLevelCol);
        }
    }
    
    /**
     * Sets (as xml) the "outlineLevelCol" attribute
     */
    public void xsetOutlineLevelCol(org.apache.xmlbeans.XmlUnsignedByte outlineLevelCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVELCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(OUTLINELEVELCOL$16);
            }
            target.set(outlineLevelCol);
        }
    }
    
    /**
     * Unsets the "outlineLevelCol" attribute
     */
    public void unsetOutlineLevelCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINELEVELCOL$16);
        }
    }
}
