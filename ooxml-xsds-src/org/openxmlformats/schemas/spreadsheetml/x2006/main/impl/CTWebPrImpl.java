/*
 * XML Type:  CT_WebPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_WebPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWebPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr
{
    
    public CTWebPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tables");
    private static final javax.xml.namespace.QName XML$2 = 
        new javax.xml.namespace.QName("", "xml");
    private static final javax.xml.namespace.QName SOURCEDATA$4 = 
        new javax.xml.namespace.QName("", "sourceData");
    private static final javax.xml.namespace.QName PARSEPRE$6 = 
        new javax.xml.namespace.QName("", "parsePre");
    private static final javax.xml.namespace.QName CONSECUTIVE$8 = 
        new javax.xml.namespace.QName("", "consecutive");
    private static final javax.xml.namespace.QName FIRSTROW$10 = 
        new javax.xml.namespace.QName("", "firstRow");
    private static final javax.xml.namespace.QName XL97$12 = 
        new javax.xml.namespace.QName("", "xl97");
    private static final javax.xml.namespace.QName TEXTDATES$14 = 
        new javax.xml.namespace.QName("", "textDates");
    private static final javax.xml.namespace.QName XL2000$16 = 
        new javax.xml.namespace.QName("", "xl2000");
    private static final javax.xml.namespace.QName URL$18 = 
        new javax.xml.namespace.QName("", "url");
    private static final javax.xml.namespace.QName POST$20 = 
        new javax.xml.namespace.QName("", "post");
    private static final javax.xml.namespace.QName HTMLTABLES$22 = 
        new javax.xml.namespace.QName("", "htmlTables");
    private static final javax.xml.namespace.QName HTMLFORMAT$24 = 
        new javax.xml.namespace.QName("", "htmlFormat");
    private static final javax.xml.namespace.QName EDITPAGE$26 = 
        new javax.xml.namespace.QName("", "editPage");
    
    
    /**
     * Gets the "tables" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables getTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables)get_store().find_element_user(TABLES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tables" element
     */
    public boolean isSetTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLES$0) != 0;
        }
    }
    
    /**
     * Sets the "tables" element
     */
    public void setTables(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables tables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables)get_store().find_element_user(TABLES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables)get_store().add_element_user(TABLES$0);
            }
            target.set(tables);
        }
    }
    
    /**
     * Appends and returns a new empty "tables" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables addNewTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables)get_store().add_element_user(TABLES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tables" element
     */
    public void unsetTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLES$0, 0);
        }
    }
    
    /**
     * Gets the "xml" attribute
     */
    public boolean getXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XML$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XML$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xml" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XML$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(XML$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "xml" attribute
     */
    public boolean isSetXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XML$2) != null;
        }
    }
    
    /**
     * Sets the "xml" attribute
     */
    public void setXml(boolean xml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XML$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XML$2);
            }
            target.setBooleanValue(xml);
        }
    }
    
    /**
     * Sets (as xml) the "xml" attribute
     */
    public void xsetXml(org.apache.xmlbeans.XmlBoolean xml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XML$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(XML$2);
            }
            target.set(xml);
        }
    }
    
    /**
     * Unsets the "xml" attribute
     */
    public void unsetXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XML$2);
        }
    }
    
    /**
     * Gets the "sourceData" attribute
     */
    public boolean getSourceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEDATA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCEDATA$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSourceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOURCEDATA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SOURCEDATA$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceData" attribute
     */
    public boolean isSetSourceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCEDATA$4) != null;
        }
    }
    
    /**
     * Sets the "sourceData" attribute
     */
    public void setSourceData(boolean sourceData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEDATA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEDATA$4);
            }
            target.setBooleanValue(sourceData);
        }
    }
    
    /**
     * Sets (as xml) the "sourceData" attribute
     */
    public void xsetSourceData(org.apache.xmlbeans.XmlBoolean sourceData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOURCEDATA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SOURCEDATA$4);
            }
            target.set(sourceData);
        }
    }
    
    /**
     * Unsets the "sourceData" attribute
     */
    public void unsetSourceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCEDATA$4);
        }
    }
    
    /**
     * Gets the "parsePre" attribute
     */
    public boolean getParsePre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARSEPRE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARSEPRE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "parsePre" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetParsePre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PARSEPRE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PARSEPRE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "parsePre" attribute
     */
    public boolean isSetParsePre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARSEPRE$6) != null;
        }
    }
    
    /**
     * Sets the "parsePre" attribute
     */
    public void setParsePre(boolean parsePre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARSEPRE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARSEPRE$6);
            }
            target.setBooleanValue(parsePre);
        }
    }
    
    /**
     * Sets (as xml) the "parsePre" attribute
     */
    public void xsetParsePre(org.apache.xmlbeans.XmlBoolean parsePre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PARSEPRE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PARSEPRE$6);
            }
            target.set(parsePre);
        }
    }
    
    /**
     * Unsets the "parsePre" attribute
     */
    public void unsetParsePre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARSEPRE$6);
        }
    }
    
    /**
     * Gets the "consecutive" attribute
     */
    public boolean getConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSECUTIVE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONSECUTIVE$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "consecutive" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONSECUTIVE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONSECUTIVE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "consecutive" attribute
     */
    public boolean isSetConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONSECUTIVE$8) != null;
        }
    }
    
    /**
     * Sets the "consecutive" attribute
     */
    public void setConsecutive(boolean consecutive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSECUTIVE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSECUTIVE$8);
            }
            target.setBooleanValue(consecutive);
        }
    }
    
    /**
     * Sets (as xml) the "consecutive" attribute
     */
    public void xsetConsecutive(org.apache.xmlbeans.XmlBoolean consecutive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONSECUTIVE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONSECUTIVE$8);
            }
            target.set(consecutive);
        }
    }
    
    /**
     * Unsets the "consecutive" attribute
     */
    public void unsetConsecutive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONSECUTIVE$8);
        }
    }
    
    /**
     * Gets the "firstRow" attribute
     */
    public boolean getFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTROW$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTROW$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTROW$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIRSTROW$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstRow" attribute
     */
    public boolean isSetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTROW$10) != null;
        }
    }
    
    /**
     * Sets the "firstRow" attribute
     */
    public void setFirstRow(boolean firstRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTROW$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTROW$10);
            }
            target.setBooleanValue(firstRow);
        }
    }
    
    /**
     * Sets (as xml) the "firstRow" attribute
     */
    public void xsetFirstRow(org.apache.xmlbeans.XmlBoolean firstRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTROW$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIRSTROW$10);
            }
            target.set(firstRow);
        }
    }
    
    /**
     * Unsets the "firstRow" attribute
     */
    public void unsetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTROW$10);
        }
    }
    
    /**
     * Gets the "xl97" attribute
     */
    public boolean getXl97()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XL97$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XL97$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xl97" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetXl97()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XL97$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(XL97$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "xl97" attribute
     */
    public boolean isSetXl97()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XL97$12) != null;
        }
    }
    
    /**
     * Sets the "xl97" attribute
     */
    public void setXl97(boolean xl97)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XL97$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XL97$12);
            }
            target.setBooleanValue(xl97);
        }
    }
    
    /**
     * Sets (as xml) the "xl97" attribute
     */
    public void xsetXl97(org.apache.xmlbeans.XmlBoolean xl97)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XL97$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(XL97$12);
            }
            target.set(xl97);
        }
    }
    
    /**
     * Unsets the "xl97" attribute
     */
    public void unsetXl97()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XL97$12);
        }
    }
    
    /**
     * Gets the "textDates" attribute
     */
    public boolean getTextDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDATES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEXTDATES$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "textDates" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTextDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TEXTDATES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TEXTDATES$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "textDates" attribute
     */
    public boolean isSetTextDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTDATES$14) != null;
        }
    }
    
    /**
     * Sets the "textDates" attribute
     */
    public void setTextDates(boolean textDates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDATES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTDATES$14);
            }
            target.setBooleanValue(textDates);
        }
    }
    
    /**
     * Sets (as xml) the "textDates" attribute
     */
    public void xsetTextDates(org.apache.xmlbeans.XmlBoolean textDates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TEXTDATES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TEXTDATES$14);
            }
            target.set(textDates);
        }
    }
    
    /**
     * Unsets the "textDates" attribute
     */
    public void unsetTextDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTDATES$14);
        }
    }
    
    /**
     * Gets the "xl2000" attribute
     */
    public boolean getXl2000()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XL2000$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XL2000$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xl2000" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetXl2000()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XL2000$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(XL2000$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "xl2000" attribute
     */
    public boolean isSetXl2000()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XL2000$16) != null;
        }
    }
    
    /**
     * Sets the "xl2000" attribute
     */
    public void setXl2000(boolean xl2000)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XL2000$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XL2000$16);
            }
            target.setBooleanValue(xl2000);
        }
    }
    
    /**
     * Sets (as xml) the "xl2000" attribute
     */
    public void xsetXl2000(org.apache.xmlbeans.XmlBoolean xl2000)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XL2000$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(XL2000$16);
            }
            target.set(xl2000);
        }
    }
    
    /**
     * Unsets the "xl2000" attribute
     */
    public void unsetXl2000()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XL2000$16);
        }
    }
    
    /**
     * Gets the "url" attribute
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(URL$18);
            return target;
        }
    }
    
    /**
     * True if has "url" attribute
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URL$18) != null;
        }
    }
    
    /**
     * Sets the "url" attribute
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$18);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" attribute
     */
    public void xsetUrl(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(URL$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(URL$18);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "url" attribute
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URL$18);
        }
    }
    
    /**
     * Gets the "post" attribute
     */
    public java.lang.String getPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POST$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "post" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(POST$20);
            return target;
        }
    }
    
    /**
     * True if has "post" attribute
     */
    public boolean isSetPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POST$20) != null;
        }
    }
    
    /**
     * Sets the "post" attribute
     */
    public void setPost(java.lang.String post)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POST$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POST$20);
            }
            target.setStringValue(post);
        }
    }
    
    /**
     * Sets (as xml) the "post" attribute
     */
    public void xsetPost(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring post)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(POST$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(POST$20);
            }
            target.set(post);
        }
    }
    
    /**
     * Unsets the "post" attribute
     */
    public void unsetPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POST$20);
        }
    }
    
    /**
     * Gets the "htmlTables" attribute
     */
    public boolean getHtmlTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTMLTABLES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HTMLTABLES$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "htmlTables" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHtmlTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HTMLTABLES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HTMLTABLES$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "htmlTables" attribute
     */
    public boolean isSetHtmlTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HTMLTABLES$22) != null;
        }
    }
    
    /**
     * Sets the "htmlTables" attribute
     */
    public void setHtmlTables(boolean htmlTables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTMLTABLES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HTMLTABLES$22);
            }
            target.setBooleanValue(htmlTables);
        }
    }
    
    /**
     * Sets (as xml) the "htmlTables" attribute
     */
    public void xsetHtmlTables(org.apache.xmlbeans.XmlBoolean htmlTables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HTMLTABLES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HTMLTABLES$22);
            }
            target.set(htmlTables);
        }
    }
    
    /**
     * Unsets the "htmlTables" attribute
     */
    public void unsetHtmlTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HTMLTABLES$22);
        }
    }
    
    /**
     * Gets the "htmlFormat" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt.Enum getHtmlFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTMLFORMAT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HTMLFORMAT$24);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "htmlFormat" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt xgetHtmlFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt)get_store().find_attribute_user(HTMLFORMAT$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt)get_default_attribute_value(HTMLFORMAT$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "htmlFormat" attribute
     */
    public boolean isSetHtmlFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HTMLFORMAT$24) != null;
        }
    }
    
    /**
     * Sets the "htmlFormat" attribute
     */
    public void setHtmlFormat(org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt.Enum htmlFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTMLFORMAT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HTMLFORMAT$24);
            }
            target.setEnumValue(htmlFormat);
        }
    }
    
    /**
     * Sets (as xml) the "htmlFormat" attribute
     */
    public void xsetHtmlFormat(org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt htmlFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt)get_store().find_attribute_user(HTMLFORMAT$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STHtmlFmt)get_store().add_attribute_user(HTMLFORMAT$24);
            }
            target.set(htmlFormat);
        }
    }
    
    /**
     * Unsets the "htmlFormat" attribute
     */
    public void unsetHtmlFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HTMLFORMAT$24);
        }
    }
    
    /**
     * Gets the "editPage" attribute
     */
    public java.lang.String getEditPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITPAGE$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "editPage" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetEditPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(EDITPAGE$26);
            return target;
        }
    }
    
    /**
     * True if has "editPage" attribute
     */
    public boolean isSetEditPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDITPAGE$26) != null;
        }
    }
    
    /**
     * Sets the "editPage" attribute
     */
    public void setEditPage(java.lang.String editPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITPAGE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDITPAGE$26);
            }
            target.setStringValue(editPage);
        }
    }
    
    /**
     * Sets (as xml) the "editPage" attribute
     */
    public void xsetEditPage(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring editPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(EDITPAGE$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(EDITPAGE$26);
            }
            target.set(editPage);
        }
    }
    
    /**
     * Unsets the "editPage" attribute
     */
    public void unsetEditPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDITPAGE$26);
        }
    }
}
