/*
 * XML Type:  CT_Col
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Col(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol
{
    
    public CTColImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIN$0 = 
        new javax.xml.namespace.QName("", "min");
    private static final javax.xml.namespace.QName MAX$2 = 
        new javax.xml.namespace.QName("", "max");
    private static final javax.xml.namespace.QName WIDTH$4 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName STYLE$6 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName HIDDEN$8 = 
        new javax.xml.namespace.QName("", "hidden");
    private static final javax.xml.namespace.QName BESTFIT$10 = 
        new javax.xml.namespace.QName("", "bestFit");
    private static final javax.xml.namespace.QName CUSTOMWIDTH$12 = 
        new javax.xml.namespace.QName("", "customWidth");
    private static final javax.xml.namespace.QName PHONETIC$14 = 
        new javax.xml.namespace.QName("", "phonetic");
    private static final javax.xml.namespace.QName OUTLINELEVEL$16 = 
        new javax.xml.namespace.QName("", "outlineLevel");
    private static final javax.xml.namespace.QName COLLAPSED$18 = 
        new javax.xml.namespace.QName("", "collapsed");
    
    
    /**
     * Gets the "min" attribute
     */
    public long getMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "min" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MIN$0);
            return target;
        }
    }
    
    /**
     * Sets the "min" attribute
     */
    public void setMin(long min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$0);
            }
            target.setLongValue(min);
        }
    }
    
    /**
     * Sets (as xml) the "min" attribute
     */
    public void xsetMin(org.apache.xmlbeans.XmlUnsignedInt min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MIN$0);
            }
            target.set(min);
        }
    }
    
    /**
     * Gets the "max" attribute
     */
    public long getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "max" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAX$2);
            return target;
        }
    }
    
    /**
     * Sets the "max" attribute
     */
    public void setMax(long max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$2);
            }
            target.setLongValue(max);
        }
    }
    
    /**
     * Sets (as xml) the "max" attribute
     */
    public void xsetMax(org.apache.xmlbeans.XmlUnsignedInt max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MAX$2);
            }
            target.set(max);
        }
    }
    
    /**
     * Gets the "width" attribute
     */
    public double getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "width" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$4);
            return target;
        }
    }
    
    /**
     * True if has "width" attribute
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WIDTH$4) != null;
        }
    }
    
    /**
     * Sets the "width" attribute
     */
    public void setWidth(double width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$4);
            }
            target.setDoubleValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlDouble width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WIDTH$4);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "width" attribute
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WIDTH$4);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public long getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STYLE$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(STYLE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$6) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(long style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$6);
            }
            target.setLongValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.apache.xmlbeans.XmlUnsignedInt style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(STYLE$6);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$6);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDEN$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDEN$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "hidden" attribute
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDEN$8) != null;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$8);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$8);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Unsets the "hidden" attribute
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDEN$8);
        }
    }
    
    /**
     * Gets the "bestFit" attribute
     */
    public boolean getBestFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BESTFIT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BESTFIT$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bestFit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBestFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BESTFIT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BESTFIT$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "bestFit" attribute
     */
    public boolean isSetBestFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BESTFIT$10) != null;
        }
    }
    
    /**
     * Sets the "bestFit" attribute
     */
    public void setBestFit(boolean bestFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BESTFIT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BESTFIT$10);
            }
            target.setBooleanValue(bestFit);
        }
    }
    
    /**
     * Sets (as xml) the "bestFit" attribute
     */
    public void xsetBestFit(org.apache.xmlbeans.XmlBoolean bestFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BESTFIT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BESTFIT$10);
            }
            target.set(bestFit);
        }
    }
    
    /**
     * Unsets the "bestFit" attribute
     */
    public void unsetBestFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BESTFIT$10);
        }
    }
    
    /**
     * Gets the "customWidth" attribute
     */
    public boolean getCustomWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMWIDTH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CUSTOMWIDTH$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "customWidth" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustomWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMWIDTH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CUSTOMWIDTH$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "customWidth" attribute
     */
    public boolean isSetCustomWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMWIDTH$12) != null;
        }
    }
    
    /**
     * Sets the "customWidth" attribute
     */
    public void setCustomWidth(boolean customWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMWIDTH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMWIDTH$12);
            }
            target.setBooleanValue(customWidth);
        }
    }
    
    /**
     * Sets (as xml) the "customWidth" attribute
     */
    public void xsetCustomWidth(org.apache.xmlbeans.XmlBoolean customWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMWIDTH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTOMWIDTH$12);
            }
            target.set(customWidth);
        }
    }
    
    /**
     * Unsets the "customWidth" attribute
     */
    public void unsetCustomWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMWIDTH$12);
        }
    }
    
    /**
     * Gets the "phonetic" attribute
     */
    public boolean getPhonetic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONETIC$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PHONETIC$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "phonetic" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPhonetic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PHONETIC$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PHONETIC$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "phonetic" attribute
     */
    public boolean isSetPhonetic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PHONETIC$14) != null;
        }
    }
    
    /**
     * Sets the "phonetic" attribute
     */
    public void setPhonetic(boolean phonetic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONETIC$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHONETIC$14);
            }
            target.setBooleanValue(phonetic);
        }
    }
    
    /**
     * Sets (as xml) the "phonetic" attribute
     */
    public void xsetPhonetic(org.apache.xmlbeans.XmlBoolean phonetic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PHONETIC$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PHONETIC$14);
            }
            target.set(phonetic);
        }
    }
    
    /**
     * Unsets the "phonetic" attribute
     */
    public void unsetPhonetic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PHONETIC$14);
        }
    }
    
    /**
     * Gets the "outlineLevel" attribute
     */
    public short getOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINELEVEL$16);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "outlineLevel" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(OUTLINELEVEL$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "outlineLevel" attribute
     */
    public boolean isSetOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINELEVEL$16) != null;
        }
    }
    
    /**
     * Sets the "outlineLevel" attribute
     */
    public void setOutlineLevel(short outlineLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINELEVEL$16);
            }
            target.setShortValue(outlineLevel);
        }
    }
    
    /**
     * Sets (as xml) the "outlineLevel" attribute
     */
    public void xsetOutlineLevel(org.apache.xmlbeans.XmlUnsignedByte outlineLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(OUTLINELEVEL$16);
            }
            target.set(outlineLevel);
        }
    }
    
    /**
     * Unsets the "outlineLevel" attribute
     */
    public void unsetOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINELEVEL$16);
        }
    }
    
    /**
     * Gets the "collapsed" attribute
     */
    public boolean getCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSED$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLLAPSED$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "collapsed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLLAPSED$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COLLAPSED$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "collapsed" attribute
     */
    public boolean isSetCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLLAPSED$18) != null;
        }
    }
    
    /**
     * Sets the "collapsed" attribute
     */
    public void setCollapsed(boolean collapsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSED$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLAPSED$18);
            }
            target.setBooleanValue(collapsed);
        }
    }
    
    /**
     * Sets (as xml) the "collapsed" attribute
     */
    public void xsetCollapsed(org.apache.xmlbeans.XmlBoolean collapsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLLAPSED$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COLLAPSED$18);
            }
            target.set(collapsed);
        }
    }
    
    /**
     * Unsets the "collapsed" attribute
     */
    public void unsetCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLLAPSED$18);
        }
    }
}
