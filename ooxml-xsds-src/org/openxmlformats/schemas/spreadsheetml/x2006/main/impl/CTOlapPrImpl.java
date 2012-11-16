/*
 * XML Type:  CT_OlapPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_OlapPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTOlapPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr
{
    
    public CTOlapPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCAL$0 = 
        new javax.xml.namespace.QName("", "local");
    private static final javax.xml.namespace.QName LOCALCONNECTION$2 = 
        new javax.xml.namespace.QName("", "localConnection");
    private static final javax.xml.namespace.QName LOCALREFRESH$4 = 
        new javax.xml.namespace.QName("", "localRefresh");
    private static final javax.xml.namespace.QName SENDLOCALE$6 = 
        new javax.xml.namespace.QName("", "sendLocale");
    private static final javax.xml.namespace.QName ROWDRILLCOUNT$8 = 
        new javax.xml.namespace.QName("", "rowDrillCount");
    private static final javax.xml.namespace.QName SERVERFILL$10 = 
        new javax.xml.namespace.QName("", "serverFill");
    private static final javax.xml.namespace.QName SERVERNUMBERFORMAT$12 = 
        new javax.xml.namespace.QName("", "serverNumberFormat");
    private static final javax.xml.namespace.QName SERVERFONT$14 = 
        new javax.xml.namespace.QName("", "serverFont");
    private static final javax.xml.namespace.QName SERVERFONTCOLOR$16 = 
        new javax.xml.namespace.QName("", "serverFontColor");
    
    
    /**
     * Gets the "local" attribute
     */
    public boolean getLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCAL$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "local" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCAL$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "local" attribute
     */
    public boolean isSetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCAL$0) != null;
        }
    }
    
    /**
     * Sets the "local" attribute
     */
    public void setLocal(boolean local)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCAL$0);
            }
            target.setBooleanValue(local);
        }
    }
    
    /**
     * Sets (as xml) the "local" attribute
     */
    public void xsetLocal(org.apache.xmlbeans.XmlBoolean local)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCAL$0);
            }
            target.set(local);
        }
    }
    
    /**
     * Unsets the "local" attribute
     */
    public void unsetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCAL$0);
        }
    }
    
    /**
     * Gets the "localConnection" attribute
     */
    public java.lang.String getLocalConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALCONNECTION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "localConnection" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetLocalConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(LOCALCONNECTION$2);
            return target;
        }
    }
    
    /**
     * True if has "localConnection" attribute
     */
    public boolean isSetLocalConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCALCONNECTION$2) != null;
        }
    }
    
    /**
     * Sets the "localConnection" attribute
     */
    public void setLocalConnection(java.lang.String localConnection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALCONNECTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALCONNECTION$2);
            }
            target.setStringValue(localConnection);
        }
    }
    
    /**
     * Sets (as xml) the "localConnection" attribute
     */
    public void xsetLocalConnection(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring localConnection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(LOCALCONNECTION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(LOCALCONNECTION$2);
            }
            target.set(localConnection);
        }
    }
    
    /**
     * Unsets the "localConnection" attribute
     */
    public void unsetLocalConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCALCONNECTION$2);
        }
    }
    
    /**
     * Gets the "localRefresh" attribute
     */
    public boolean getLocalRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALREFRESH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCALREFRESH$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "localRefresh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocalRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCALREFRESH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCALREFRESH$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "localRefresh" attribute
     */
    public boolean isSetLocalRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCALREFRESH$4) != null;
        }
    }
    
    /**
     * Sets the "localRefresh" attribute
     */
    public void setLocalRefresh(boolean localRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALREFRESH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALREFRESH$4);
            }
            target.setBooleanValue(localRefresh);
        }
    }
    
    /**
     * Sets (as xml) the "localRefresh" attribute
     */
    public void xsetLocalRefresh(org.apache.xmlbeans.XmlBoolean localRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCALREFRESH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCALREFRESH$4);
            }
            target.set(localRefresh);
        }
    }
    
    /**
     * Unsets the "localRefresh" attribute
     */
    public void unsetLocalRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCALREFRESH$4);
        }
    }
    
    /**
     * Gets the "sendLocale" attribute
     */
    public boolean getSendLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDLOCALE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SENDLOCALE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendLocale" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SENDLOCALE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SENDLOCALE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "sendLocale" attribute
     */
    public boolean isSetSendLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SENDLOCALE$6) != null;
        }
    }
    
    /**
     * Sets the "sendLocale" attribute
     */
    public void setSendLocale(boolean sendLocale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDLOCALE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENDLOCALE$6);
            }
            target.setBooleanValue(sendLocale);
        }
    }
    
    /**
     * Sets (as xml) the "sendLocale" attribute
     */
    public void xsetSendLocale(org.apache.xmlbeans.XmlBoolean sendLocale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SENDLOCALE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SENDLOCALE$6);
            }
            target.set(sendLocale);
        }
    }
    
    /**
     * Unsets the "sendLocale" attribute
     */
    public void unsetSendLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SENDLOCALE$6);
        }
    }
    
    /**
     * Gets the "rowDrillCount" attribute
     */
    public long getRowDrillCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWDRILLCOUNT$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowDrillCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRowDrillCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ROWDRILLCOUNT$8);
            return target;
        }
    }
    
    /**
     * True if has "rowDrillCount" attribute
     */
    public boolean isSetRowDrillCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWDRILLCOUNT$8) != null;
        }
    }
    
    /**
     * Sets the "rowDrillCount" attribute
     */
    public void setRowDrillCount(long rowDrillCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWDRILLCOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWDRILLCOUNT$8);
            }
            target.setLongValue(rowDrillCount);
        }
    }
    
    /**
     * Sets (as xml) the "rowDrillCount" attribute
     */
    public void xsetRowDrillCount(org.apache.xmlbeans.XmlUnsignedInt rowDrillCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ROWDRILLCOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ROWDRILLCOUNT$8);
            }
            target.set(rowDrillCount);
        }
    }
    
    /**
     * Unsets the "rowDrillCount" attribute
     */
    public void unsetRowDrillCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWDRILLCOUNT$8);
        }
    }
    
    /**
     * Gets the "serverFill" attribute
     */
    public boolean getServerFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFILL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERVERFILL$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverFill" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetServerFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFILL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SERVERFILL$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "serverFill" attribute
     */
    public boolean isSetServerFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERFILL$10) != null;
        }
    }
    
    /**
     * Sets the "serverFill" attribute
     */
    public void setServerFill(boolean serverFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFILL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERFILL$10);
            }
            target.setBooleanValue(serverFill);
        }
    }
    
    /**
     * Sets (as xml) the "serverFill" attribute
     */
    public void xsetServerFill(org.apache.xmlbeans.XmlBoolean serverFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFILL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SERVERFILL$10);
            }
            target.set(serverFill);
        }
    }
    
    /**
     * Unsets the "serverFill" attribute
     */
    public void unsetServerFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERFILL$10);
        }
    }
    
    /**
     * Gets the "serverNumberFormat" attribute
     */
    public boolean getServerNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERNUMBERFORMAT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERVERNUMBERFORMAT$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverNumberFormat" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetServerNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERNUMBERFORMAT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SERVERNUMBERFORMAT$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "serverNumberFormat" attribute
     */
    public boolean isSetServerNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERNUMBERFORMAT$12) != null;
        }
    }
    
    /**
     * Sets the "serverNumberFormat" attribute
     */
    public void setServerNumberFormat(boolean serverNumberFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERNUMBERFORMAT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERNUMBERFORMAT$12);
            }
            target.setBooleanValue(serverNumberFormat);
        }
    }
    
    /**
     * Sets (as xml) the "serverNumberFormat" attribute
     */
    public void xsetServerNumberFormat(org.apache.xmlbeans.XmlBoolean serverNumberFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERNUMBERFORMAT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SERVERNUMBERFORMAT$12);
            }
            target.set(serverNumberFormat);
        }
    }
    
    /**
     * Unsets the "serverNumberFormat" attribute
     */
    public void unsetServerNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERNUMBERFORMAT$12);
        }
    }
    
    /**
     * Gets the "serverFont" attribute
     */
    public boolean getServerFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFONT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERVERFONT$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverFont" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetServerFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFONT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SERVERFONT$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "serverFont" attribute
     */
    public boolean isSetServerFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERFONT$14) != null;
        }
    }
    
    /**
     * Sets the "serverFont" attribute
     */
    public void setServerFont(boolean serverFont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFONT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERFONT$14);
            }
            target.setBooleanValue(serverFont);
        }
    }
    
    /**
     * Sets (as xml) the "serverFont" attribute
     */
    public void xsetServerFont(org.apache.xmlbeans.XmlBoolean serverFont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFONT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SERVERFONT$14);
            }
            target.set(serverFont);
        }
    }
    
    /**
     * Unsets the "serverFont" attribute
     */
    public void unsetServerFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERFONT$14);
        }
    }
    
    /**
     * Gets the "serverFontColor" attribute
     */
    public boolean getServerFontColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFONTCOLOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERVERFONTCOLOR$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverFontColor" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetServerFontColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFONTCOLOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SERVERFONTCOLOR$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "serverFontColor" attribute
     */
    public boolean isSetServerFontColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERFONTCOLOR$16) != null;
        }
    }
    
    /**
     * Sets the "serverFontColor" attribute
     */
    public void setServerFontColor(boolean serverFontColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFONTCOLOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERFONTCOLOR$16);
            }
            target.setBooleanValue(serverFontColor);
        }
    }
    
    /**
     * Sets (as xml) the "serverFontColor" attribute
     */
    public void xsetServerFontColor(org.apache.xmlbeans.XmlBoolean serverFontColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFONTCOLOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SERVERFONTCOLOR$16);
            }
            target.set(serverFontColor);
        }
    }
    
    /**
     * Unsets the "serverFontColor" attribute
     */
    public void unsetServerFontColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERFONTCOLOR$16);
        }
    }
}
