/*
 * XML Type:  CT_PageSetup
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_PageSetup(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTPageSetupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup
{
    
    public CTPageSetupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAPERSIZE$0 = 
        new javax.xml.namespace.QName("", "paperSize");
    private static final javax.xml.namespace.QName FIRSTPAGENUMBER$2 = 
        new javax.xml.namespace.QName("", "firstPageNumber");
    private static final javax.xml.namespace.QName ORIENTATION$4 = 
        new javax.xml.namespace.QName("", "orientation");
    private static final javax.xml.namespace.QName BLACKANDWHITE$6 = 
        new javax.xml.namespace.QName("", "blackAndWhite");
    private static final javax.xml.namespace.QName DRAFT$8 = 
        new javax.xml.namespace.QName("", "draft");
    private static final javax.xml.namespace.QName USEFIRSTPAGENUMBER$10 = 
        new javax.xml.namespace.QName("", "useFirstPageNumber");
    private static final javax.xml.namespace.QName HORIZONTALDPI$12 = 
        new javax.xml.namespace.QName("", "horizontalDpi");
    private static final javax.xml.namespace.QName VERTICALDPI$14 = 
        new javax.xml.namespace.QName("", "verticalDpi");
    private static final javax.xml.namespace.QName COPIES$16 = 
        new javax.xml.namespace.QName("", "copies");
    
    
    /**
     * Gets the "paperSize" attribute
     */
    public long getPaperSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAPERSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PAPERSIZE$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "paperSize" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPaperSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PAPERSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(PAPERSIZE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "paperSize" attribute
     */
    public boolean isSetPaperSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAPERSIZE$0) != null;
        }
    }
    
    /**
     * Sets the "paperSize" attribute
     */
    public void setPaperSize(long paperSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAPERSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAPERSIZE$0);
            }
            target.setLongValue(paperSize);
        }
    }
    
    /**
     * Sets (as xml) the "paperSize" attribute
     */
    public void xsetPaperSize(org.apache.xmlbeans.XmlUnsignedInt paperSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PAPERSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PAPERSIZE$0);
            }
            target.set(paperSize);
        }
    }
    
    /**
     * Unsets the "paperSize" attribute
     */
    public void unsetPaperSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAPERSIZE$0);
        }
    }
    
    /**
     * Gets the "firstPageNumber" attribute
     */
    public long getFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTPAGENUMBER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTPAGENUMBER$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstPageNumber" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTPAGENUMBER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(FIRSTPAGENUMBER$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstPageNumber" attribute
     */
    public boolean isSetFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTPAGENUMBER$2) != null;
        }
    }
    
    /**
     * Sets the "firstPageNumber" attribute
     */
    public void setFirstPageNumber(long firstPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTPAGENUMBER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTPAGENUMBER$2);
            }
            target.setLongValue(firstPageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "firstPageNumber" attribute
     */
    public void xsetFirstPageNumber(org.apache.xmlbeans.XmlUnsignedInt firstPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTPAGENUMBER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIRSTPAGENUMBER$2);
            }
            target.set(firstPageNumber);
        }
    }
    
    /**
     * Unsets the "firstPageNumber" attribute
     */
    public void unsetFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTPAGENUMBER$2);
        }
    }
    
    /**
     * Gets the "orientation" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation.Enum getOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORIENTATION$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "orientation" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation xgetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation)get_store().find_attribute_user(ORIENTATION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation)get_default_attribute_value(ORIENTATION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "orientation" attribute
     */
    public boolean isSetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIENTATION$4) != null;
        }
    }
    
    /**
     * Sets the "orientation" attribute
     */
    public void setOrientation(org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation.Enum orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$4);
            }
            target.setEnumValue(orientation);
        }
    }
    
    /**
     * Sets (as xml) the "orientation" attribute
     */
    public void xsetOrientation(org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation)get_store().find_attribute_user(ORIENTATION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STPageSetupOrientation)get_store().add_attribute_user(ORIENTATION$4);
            }
            target.set(orientation);
        }
    }
    
    /**
     * Unsets the "orientation" attribute
     */
    public void unsetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIENTATION$4);
        }
    }
    
    /**
     * Gets the "blackAndWhite" attribute
     */
    public boolean getBlackAndWhite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLACKANDWHITE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLACKANDWHITE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "blackAndWhite" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBlackAndWhite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLACKANDWHITE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BLACKANDWHITE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "blackAndWhite" attribute
     */
    public boolean isSetBlackAndWhite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLACKANDWHITE$6) != null;
        }
    }
    
    /**
     * Sets the "blackAndWhite" attribute
     */
    public void setBlackAndWhite(boolean blackAndWhite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLACKANDWHITE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLACKANDWHITE$6);
            }
            target.setBooleanValue(blackAndWhite);
        }
    }
    
    /**
     * Sets (as xml) the "blackAndWhite" attribute
     */
    public void xsetBlackAndWhite(org.apache.xmlbeans.XmlBoolean blackAndWhite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLACKANDWHITE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BLACKANDWHITE$6);
            }
            target.set(blackAndWhite);
        }
    }
    
    /**
     * Unsets the "blackAndWhite" attribute
     */
    public void unsetBlackAndWhite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLACKANDWHITE$6);
        }
    }
    
    /**
     * Gets the "draft" attribute
     */
    public boolean getDraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAFT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAFT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "draft" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAFT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAFT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "draft" attribute
     */
    public boolean isSetDraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAFT$8) != null;
        }
    }
    
    /**
     * Sets the "draft" attribute
     */
    public void setDraft(boolean draft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAFT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAFT$8);
            }
            target.setBooleanValue(draft);
        }
    }
    
    /**
     * Sets (as xml) the "draft" attribute
     */
    public void xsetDraft(org.apache.xmlbeans.XmlBoolean draft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAFT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAFT$8);
            }
            target.set(draft);
        }
    }
    
    /**
     * Unsets the "draft" attribute
     */
    public void unsetDraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAFT$8);
        }
    }
    
    /**
     * Gets the "useFirstPageNumber" attribute
     */
    public boolean getUseFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEFIRSTPAGENUMBER$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useFirstPageNumber" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEFIRSTPAGENUMBER$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "useFirstPageNumber" attribute
     */
    public boolean isSetUseFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEFIRSTPAGENUMBER$10) != null;
        }
    }
    
    /**
     * Sets the "useFirstPageNumber" attribute
     */
    public void setUseFirstPageNumber(boolean useFirstPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEFIRSTPAGENUMBER$10);
            }
            target.setBooleanValue(useFirstPageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "useFirstPageNumber" attribute
     */
    public void xsetUseFirstPageNumber(org.apache.xmlbeans.XmlBoolean useFirstPageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEFIRSTPAGENUMBER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEFIRSTPAGENUMBER$10);
            }
            target.set(useFirstPageNumber);
        }
    }
    
    /**
     * Unsets the "useFirstPageNumber" attribute
     */
    public void unsetUseFirstPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEFIRSTPAGENUMBER$10);
        }
    }
    
    /**
     * Gets the "horizontalDpi" attribute
     */
    public int getHorizontalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORIZONTALDPI$12);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "horizontalDpi" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetHorizontalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(HORIZONTALDPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(HORIZONTALDPI$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "horizontalDpi" attribute
     */
    public boolean isSetHorizontalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORIZONTALDPI$12) != null;
        }
    }
    
    /**
     * Sets the "horizontalDpi" attribute
     */
    public void setHorizontalDpi(int horizontalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALDPI$12);
            }
            target.setIntValue(horizontalDpi);
        }
    }
    
    /**
     * Sets (as xml) the "horizontalDpi" attribute
     */
    public void xsetHorizontalDpi(org.apache.xmlbeans.XmlInt horizontalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(HORIZONTALDPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(HORIZONTALDPI$12);
            }
            target.set(horizontalDpi);
        }
    }
    
    /**
     * Unsets the "horizontalDpi" attribute
     */
    public void unsetHorizontalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORIZONTALDPI$12);
        }
    }
    
    /**
     * Gets the "verticalDpi" attribute
     */
    public int getVerticalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERTICALDPI$14);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "verticalDpi" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetVerticalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(VERTICALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(VERTICALDPI$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "verticalDpi" attribute
     */
    public boolean isSetVerticalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTICALDPI$14) != null;
        }
    }
    
    /**
     * Sets the "verticalDpi" attribute
     */
    public void setVerticalDpi(int verticalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALDPI$14);
            }
            target.setIntValue(verticalDpi);
        }
    }
    
    /**
     * Sets (as xml) the "verticalDpi" attribute
     */
    public void xsetVerticalDpi(org.apache.xmlbeans.XmlInt verticalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(VERTICALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(VERTICALDPI$14);
            }
            target.set(verticalDpi);
        }
    }
    
    /**
     * Unsets the "verticalDpi" attribute
     */
    public void unsetVerticalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTICALDPI$14);
        }
    }
    
    /**
     * Gets the "copies" attribute
     */
    public long getCopies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPIES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COPIES$16);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "copies" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCopies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COPIES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COPIES$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "copies" attribute
     */
    public boolean isSetCopies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COPIES$16) != null;
        }
    }
    
    /**
     * Sets the "copies" attribute
     */
    public void setCopies(long copies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPIES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPIES$16);
            }
            target.setLongValue(copies);
        }
    }
    
    /**
     * Sets (as xml) the "copies" attribute
     */
    public void xsetCopies(org.apache.xmlbeans.XmlUnsignedInt copies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COPIES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COPIES$16);
            }
            target.set(copies);
        }
    }
    
    /**
     * Unsets the "copies" attribute
     */
    public void unsetCopies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COPIES$16);
        }
    }
}
