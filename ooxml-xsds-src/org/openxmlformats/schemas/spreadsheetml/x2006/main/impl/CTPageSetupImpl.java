/*
 * XML Type:  CT_PageSetup
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PageSetup(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageSetupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup
{
    
    public CTPageSetupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAPERSIZE$0 = 
        new javax.xml.namespace.QName("", "paperSize");
    private static final javax.xml.namespace.QName SCALE$2 = 
        new javax.xml.namespace.QName("", "scale");
    private static final javax.xml.namespace.QName FIRSTPAGENUMBER$4 = 
        new javax.xml.namespace.QName("", "firstPageNumber");
    private static final javax.xml.namespace.QName FITTOWIDTH$6 = 
        new javax.xml.namespace.QName("", "fitToWidth");
    private static final javax.xml.namespace.QName FITTOHEIGHT$8 = 
        new javax.xml.namespace.QName("", "fitToHeight");
    private static final javax.xml.namespace.QName PAGEORDER$10 = 
        new javax.xml.namespace.QName("", "pageOrder");
    private static final javax.xml.namespace.QName ORIENTATION$12 = 
        new javax.xml.namespace.QName("", "orientation");
    private static final javax.xml.namespace.QName USEPRINTERDEFAULTS$14 = 
        new javax.xml.namespace.QName("", "usePrinterDefaults");
    private static final javax.xml.namespace.QName BLACKANDWHITE$16 = 
        new javax.xml.namespace.QName("", "blackAndWhite");
    private static final javax.xml.namespace.QName DRAFT$18 = 
        new javax.xml.namespace.QName("", "draft");
    private static final javax.xml.namespace.QName CELLCOMMENTS$20 = 
        new javax.xml.namespace.QName("", "cellComments");
    private static final javax.xml.namespace.QName USEFIRSTPAGENUMBER$22 = 
        new javax.xml.namespace.QName("", "useFirstPageNumber");
    private static final javax.xml.namespace.QName ERRORS$24 = 
        new javax.xml.namespace.QName("", "errors");
    private static final javax.xml.namespace.QName HORIZONTALDPI$26 = 
        new javax.xml.namespace.QName("", "horizontalDpi");
    private static final javax.xml.namespace.QName VERTICALDPI$28 = 
        new javax.xml.namespace.QName("", "verticalDpi");
    private static final javax.xml.namespace.QName COPIES$30 = 
        new javax.xml.namespace.QName("", "copies");
    private static final javax.xml.namespace.QName ID$32 = 
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
     * Gets the "scale" attribute
     */
    public long getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCALE$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(SCALE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "scale" attribute
     */
    public boolean isSetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALE$2) != null;
        }
    }
    
    /**
     * Sets the "scale" attribute
     */
    public void setScale(long scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALE$2);
            }
            target.setLongValue(scale);
        }
    }
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    public void xsetScale(org.apache.xmlbeans.XmlUnsignedInt scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SCALE$2);
            }
            target.set(scale);
        }
    }
    
    /**
     * Unsets the "scale" attribute
     */
    public void unsetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTPAGENUMBER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTPAGENUMBER$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTPAGENUMBER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(FIRSTPAGENUMBER$4);
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
            return get_store().find_attribute_user(FIRSTPAGENUMBER$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTPAGENUMBER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTPAGENUMBER$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTPAGENUMBER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIRSTPAGENUMBER$4);
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
            get_store().remove_attribute(FIRSTPAGENUMBER$4);
        }
    }
    
    /**
     * Gets the "fitToWidth" attribute
     */
    public long getFitToWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOWIDTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FITTOWIDTH$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fitToWidth" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFitToWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FITTOWIDTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(FITTOWIDTH$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "fitToWidth" attribute
     */
    public boolean isSetFitToWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FITTOWIDTH$6) != null;
        }
    }
    
    /**
     * Sets the "fitToWidth" attribute
     */
    public void setFitToWidth(long fitToWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOWIDTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FITTOWIDTH$6);
            }
            target.setLongValue(fitToWidth);
        }
    }
    
    /**
     * Sets (as xml) the "fitToWidth" attribute
     */
    public void xsetFitToWidth(org.apache.xmlbeans.XmlUnsignedInt fitToWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FITTOWIDTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FITTOWIDTH$6);
            }
            target.set(fitToWidth);
        }
    }
    
    /**
     * Unsets the "fitToWidth" attribute
     */
    public void unsetFitToWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FITTOWIDTH$6);
        }
    }
    
    /**
     * Gets the "fitToHeight" attribute
     */
    public long getFitToHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FITTOHEIGHT$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fitToHeight" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFitToHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FITTOHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(FITTOHEIGHT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "fitToHeight" attribute
     */
    public boolean isSetFitToHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FITTOHEIGHT$8) != null;
        }
    }
    
    /**
     * Sets the "fitToHeight" attribute
     */
    public void setFitToHeight(long fitToHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FITTOHEIGHT$8);
            }
            target.setLongValue(fitToHeight);
        }
    }
    
    /**
     * Sets (as xml) the "fitToHeight" attribute
     */
    public void xsetFitToHeight(org.apache.xmlbeans.XmlUnsignedInt fitToHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FITTOHEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FITTOHEIGHT$8);
            }
            target.set(fitToHeight);
        }
    }
    
    /**
     * Unsets the "fitToHeight" attribute
     */
    public void unsetFitToHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FITTOHEIGHT$8);
        }
    }
    
    /**
     * Gets the "pageOrder" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder.Enum getPageOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PAGEORDER$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "pageOrder" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder xgetPageOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder)get_store().find_attribute_user(PAGEORDER$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder)get_default_attribute_value(PAGEORDER$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "pageOrder" attribute
     */
    public boolean isSetPageOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAGEORDER$10) != null;
        }
    }
    
    /**
     * Sets the "pageOrder" attribute
     */
    public void setPageOrder(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder.Enum pageOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGEORDER$10);
            }
            target.setEnumValue(pageOrder);
        }
    }
    
    /**
     * Sets (as xml) the "pageOrder" attribute
     */
    public void xsetPageOrder(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder pageOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder)get_store().find_attribute_user(PAGEORDER$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder)get_store().add_attribute_user(PAGEORDER$10);
            }
            target.set(pageOrder);
        }
    }
    
    /**
     * Unsets the "pageOrder" attribute
     */
    public void unsetPageOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAGEORDER$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORIENTATION$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_store().find_attribute_user(ORIENTATION$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_default_attribute_value(ORIENTATION$12);
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
            return get_store().find_attribute_user(ORIENTATION$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_store().find_attribute_user(ORIENTATION$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation)get_store().add_attribute_user(ORIENTATION$12);
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
            get_store().remove_attribute(ORIENTATION$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEPRINTERDEFAULTS$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEPRINTERDEFAULTS$14);
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
            return get_store().find_attribute_user(USEPRINTERDEFAULTS$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEPRINTERDEFAULTS$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEPRINTERDEFAULTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEPRINTERDEFAULTS$14);
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
            get_store().remove_attribute(USEPRINTERDEFAULTS$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLACKANDWHITE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLACKANDWHITE$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLACKANDWHITE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BLACKANDWHITE$16);
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
            return get_store().find_attribute_user(BLACKANDWHITE$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLACKANDWHITE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLACKANDWHITE$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLACKANDWHITE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BLACKANDWHITE$16);
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
            get_store().remove_attribute(BLACKANDWHITE$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAFT$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAFT$18);
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
            return get_store().find_attribute_user(DRAFT$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAFT$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAFT$18);
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
            get_store().remove_attribute(DRAFT$18);
        }
    }
    
    /**
     * Gets the "cellComments" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments.Enum getCellComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLCOMMENTS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CELLCOMMENTS$20);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cellComments" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments xgetCellComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments)get_store().find_attribute_user(CELLCOMMENTS$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments)get_default_attribute_value(CELLCOMMENTS$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "cellComments" attribute
     */
    public boolean isSetCellComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CELLCOMMENTS$20) != null;
        }
    }
    
    /**
     * Sets the "cellComments" attribute
     */
    public void setCellComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments.Enum cellComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLCOMMENTS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLCOMMENTS$20);
            }
            target.setEnumValue(cellComments);
        }
    }
    
    /**
     * Sets (as xml) the "cellComments" attribute
     */
    public void xsetCellComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments cellComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments)get_store().find_attribute_user(CELLCOMMENTS$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments)get_store().add_attribute_user(CELLCOMMENTS$20);
            }
            target.set(cellComments);
        }
    }
    
    /**
     * Unsets the "cellComments" attribute
     */
    public void unsetCellComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CELLCOMMENTS$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEFIRSTPAGENUMBER$22);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEFIRSTPAGENUMBER$22);
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
            return get_store().find_attribute_user(USEFIRSTPAGENUMBER$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEFIRSTPAGENUMBER$22);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEFIRSTPAGENUMBER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEFIRSTPAGENUMBER$22);
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
            get_store().remove_attribute(USEFIRSTPAGENUMBER$22);
        }
    }
    
    /**
     * Gets the "errors" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError.Enum getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ERRORS$24);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "errors" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError xgetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError)get_store().find_attribute_user(ERRORS$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError)get_default_attribute_value(ERRORS$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "errors" attribute
     */
    public boolean isSetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORS$24) != null;
        }
    }
    
    /**
     * Sets the "errors" attribute
     */
    public void setErrors(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError.Enum errors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORS$24);
            }
            target.setEnumValue(errors);
        }
    }
    
    /**
     * Sets (as xml) the "errors" attribute
     */
    public void xsetErrors(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError errors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError)get_store().find_attribute_user(ERRORS$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPrintError)get_store().add_attribute_user(ERRORS$24);
            }
            target.set(errors);
        }
    }
    
    /**
     * Unsets the "errors" attribute
     */
    public void unsetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORS$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDPI$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORIZONTALDPI$26);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HORIZONTALDPI$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(HORIZONTALDPI$26);
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
            return get_store().find_attribute_user(HORIZONTALDPI$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALDPI$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALDPI$26);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HORIZONTALDPI$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(HORIZONTALDPI$26);
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
            get_store().remove_attribute(HORIZONTALDPI$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDPI$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERTICALDPI$28);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VERTICALDPI$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(VERTICALDPI$28);
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
            return get_store().find_attribute_user(VERTICALDPI$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALDPI$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALDPI$28);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VERTICALDPI$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(VERTICALDPI$28);
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
            get_store().remove_attribute(VERTICALDPI$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPIES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COPIES$30);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COPIES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COPIES$30);
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
            return get_store().find_attribute_user(COPIES$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPIES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPIES$30);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COPIES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COPIES$30);
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
            get_store().remove_attribute(COPIES$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$32);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$32);
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
            return get_store().find_attribute_user(ID$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$32);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$32);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$32);
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
            get_store().remove_attribute(ID$32);
        }
    }
}
