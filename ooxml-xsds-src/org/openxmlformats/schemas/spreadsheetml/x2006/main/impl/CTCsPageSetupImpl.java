/*
 * XML Type:  CT_CsPageSetup
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CsPageSetup(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCsPageSetupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup
{
    
    public CTCsPageSetupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAPERSIZE$0 = 
        new javax.xml.namespace.QName("", "paperSize");
    private static final javax.xml.namespace.QName FIRSTPAGENUMBER$2 = 
        new javax.xml.namespace.QName("", "firstPageNumber");
    private static final javax.xml.namespace.QName ORIENTATION$4 = 
        new javax.xml.namespace.QName("", "orientation");
    private static final javax.xml.namespace.QName USEPRINTERDEFAULTS$6 = 
        new javax.xml.namespace.QName("", "usePrinterDefaults");
    private static final javax.xml.namespace.QName BLACKANDWHITE$8 = 
        new javax.xml.namespace.QName("", "blackAndWhite");
    private static final javax.xml.namespace.QName DRAFT$10 = 
        new javax.xml.namespace.QName("", "draft");
    private static final javax.xml.namespace.QName USEFIRSTPAGENUMBER$12 = 
        new javax.xml.namespace.QName("", "useFirstPageNumber");
    private static final javax.xml.namespace.QName HORIZONTALDPI$14 = 
        new javax.xml.namespace.QName("", "horizontalDpi");
    private static final javax.xml.namespace.QName VERTICALDPI$16 = 
        new javax.xml.namespace.QName("", "verticalDpi");
    private static final javax.xml.namespace.QName COPIES$18 = 
        new javax.xml.namespace.QName("", "copies");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    
    
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation.Enum getOrientation()
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
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "orientation" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation xgetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_store().find_attribute_user(ORIENTATION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_default_attribute_value(ORIENTATION$4);
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
    public void setOrientation(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation.Enum orientation)
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
    public void xsetOrientation(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_store().find_attribute_user(ORIENTATION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_store().add_attribute_user(ORIENTATION$4);
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
     * Gets the "usePrinterDefaults" attribute
     */
    public boolean getUsePrinterDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEPRINTERDEFAULTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEPRINTERDEFAULTS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "usePrinterDefaults" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUsePrinterDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEPRINTERDEFAULTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEPRINTERDEFAULTS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "usePrinterDefaults" attribute
     */
    public boolean isSetUsePrinterDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEPRINTERDEFAULTS$6) != null;
        }
    }
    
    /**
     * Sets the "usePrinterDefaults" attribute
     */
    public void setUsePrinterDefaults(boolean usePrinterDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEPRINTERDEFAULTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEPRINTERDEFAULTS$6);
            }
            target.setBooleanValue(usePrinterDefaults);
        }
    }
    
    /**
     * Sets (as xml) the "usePrinterDefaults" attribute
     */
    public void xsetUsePrinterDefaults(org.apache.xmlbeans.XmlBoolean usePrinterDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEPRINTERDEFAULTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEPRINTERDEFAULTS$6);
            }
            target.set(usePrinterDefaults);
        }
    }
    
    /**
     * Unsets the "usePrinterDefaults" attribute
     */
    public void unsetUsePrinterDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEPRINTERDEFAULTS$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLACKANDWHITE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLACKANDWHITE$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLACKANDWHITE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BLACKANDWHITE$8);
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
            return get_store().find_attribute_user(BLACKANDWHITE$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLACKANDWHITE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLACKANDWHITE$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLACKANDWHITE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BLACKANDWHITE$8);
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
            get_store().remove_attribute(BLACKANDWHITE$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAFT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAFT$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAFT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAFT$10);
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
            return get_store().find_attribute_user(DRAFT$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAFT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAFT$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAFT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAFT$10);
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
            get_store().remove_attribute(DRAFT$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEFIRSTPAGENUMBER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEFIRSTPAGENUMBER$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEFIRSTPAGENUMBER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEFIRSTPAGENUMBER$12);
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
            return get_store().find_attribute_user(USEFIRSTPAGENUMBER$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEFIRSTPAGENUMBER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEFIRSTPAGENUMBER$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEFIRSTPAGENUMBER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEFIRSTPAGENUMBER$12);
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
            get_store().remove_attribute(USEFIRSTPAGENUMBER$12);
        }
    }
    
    /**
     * Gets the "horizontalDpi" attribute
     */
    public long getHorizontalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORIZONTALDPI$14);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "horizontalDpi" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetHorizontalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HORIZONTALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(HORIZONTALDPI$14);
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
            return get_store().find_attribute_user(HORIZONTALDPI$14) != null;
        }
    }
    
    /**
     * Sets the "horizontalDpi" attribute
     */
    public void setHorizontalDpi(long horizontalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALDPI$14);
            }
            target.setLongValue(horizontalDpi);
        }
    }
    
    /**
     * Sets (as xml) the "horizontalDpi" attribute
     */
    public void xsetHorizontalDpi(org.apache.xmlbeans.XmlUnsignedInt horizontalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HORIZONTALDPI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(HORIZONTALDPI$14);
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
            get_store().remove_attribute(HORIZONTALDPI$14);
        }
    }
    
    /**
     * Gets the "verticalDpi" attribute
     */
    public long getVerticalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDPI$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERTICALDPI$16);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "verticalDpi" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetVerticalDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VERTICALDPI$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(VERTICALDPI$16);
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
            return get_store().find_attribute_user(VERTICALDPI$16) != null;
        }
    }
    
    /**
     * Sets the "verticalDpi" attribute
     */
    public void setVerticalDpi(long verticalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDPI$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALDPI$16);
            }
            target.setLongValue(verticalDpi);
        }
    }
    
    /**
     * Sets (as xml) the "verticalDpi" attribute
     */
    public void xsetVerticalDpi(org.apache.xmlbeans.XmlUnsignedInt verticalDpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VERTICALDPI$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(VERTICALDPI$16);
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
            get_store().remove_attribute(VERTICALDPI$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPIES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COPIES$18);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COPIES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COPIES$18);
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
            return get_store().find_attribute_user(COPIES$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPIES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPIES$18);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COPIES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COPIES$18);
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
            get_store().remove_attribute(COPIES$18);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$20);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$20) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$20);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$20);
        }
    }
}
