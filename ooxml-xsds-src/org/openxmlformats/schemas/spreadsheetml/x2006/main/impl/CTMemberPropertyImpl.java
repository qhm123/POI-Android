/*
 * XML Type:  CT_MemberProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MemberProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMemberPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty
{
    
    public CTMemberPropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SHOWCELL$2 = 
        new javax.xml.namespace.QName("", "showCell");
    private static final javax.xml.namespace.QName SHOWTIP$4 = 
        new javax.xml.namespace.QName("", "showTip");
    private static final javax.xml.namespace.QName SHOWASCAPTION$6 = 
        new javax.xml.namespace.QName("", "showAsCaption");
    private static final javax.xml.namespace.QName NAMELEN$8 = 
        new javax.xml.namespace.QName("", "nameLen");
    private static final javax.xml.namespace.QName PPOS$10 = 
        new javax.xml.namespace.QName("", "pPos");
    private static final javax.xml.namespace.QName PLEN$12 = 
        new javax.xml.namespace.QName("", "pLen");
    private static final javax.xml.namespace.QName LEVEL$14 = 
        new javax.xml.namespace.QName("", "level");
    private static final javax.xml.namespace.QName FIELD$16 = 
        new javax.xml.namespace.QName("", "field");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$0) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$0);
        }
    }
    
    /**
     * Gets the "showCell" attribute
     */
    public boolean getShowCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCELL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWCELL$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showCell" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCELL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWCELL$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "showCell" attribute
     */
    public boolean isSetShowCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCELL$2) != null;
        }
    }
    
    /**
     * Sets the "showCell" attribute
     */
    public void setShowCell(boolean showCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCELL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCELL$2);
            }
            target.setBooleanValue(showCell);
        }
    }
    
    /**
     * Sets (as xml) the "showCell" attribute
     */
    public void xsetShowCell(org.apache.xmlbeans.XmlBoolean showCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCELL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWCELL$2);
            }
            target.set(showCell);
        }
    }
    
    /**
     * Unsets the "showCell" attribute
     */
    public void unsetShowCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCELL$2);
        }
    }
    
    /**
     * Gets the "showTip" attribute
     */
    public boolean getShowTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWTIP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWTIP$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showTip" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWTIP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWTIP$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "showTip" attribute
     */
    public boolean isSetShowTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWTIP$4) != null;
        }
    }
    
    /**
     * Sets the "showTip" attribute
     */
    public void setShowTip(boolean showTip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWTIP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWTIP$4);
            }
            target.setBooleanValue(showTip);
        }
    }
    
    /**
     * Sets (as xml) the "showTip" attribute
     */
    public void xsetShowTip(org.apache.xmlbeans.XmlBoolean showTip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWTIP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWTIP$4);
            }
            target.set(showTip);
        }
    }
    
    /**
     * Unsets the "showTip" attribute
     */
    public void unsetShowTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWTIP$4);
        }
    }
    
    /**
     * Gets the "showAsCaption" attribute
     */
    public boolean getShowAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWASCAPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWASCAPTION$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAsCaption" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWASCAPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWASCAPTION$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "showAsCaption" attribute
     */
    public boolean isSetShowAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWASCAPTION$6) != null;
        }
    }
    
    /**
     * Sets the "showAsCaption" attribute
     */
    public void setShowAsCaption(boolean showAsCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWASCAPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWASCAPTION$6);
            }
            target.setBooleanValue(showAsCaption);
        }
    }
    
    /**
     * Sets (as xml) the "showAsCaption" attribute
     */
    public void xsetShowAsCaption(org.apache.xmlbeans.XmlBoolean showAsCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWASCAPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWASCAPTION$6);
            }
            target.set(showAsCaption);
        }
    }
    
    /**
     * Unsets the "showAsCaption" attribute
     */
    public void unsetShowAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWASCAPTION$6);
        }
    }
    
    /**
     * Gets the "nameLen" attribute
     */
    public long getNameLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMELEN$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "nameLen" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetNameLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NAMELEN$8);
            return target;
        }
    }
    
    /**
     * True if has "nameLen" attribute
     */
    public boolean isSetNameLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMELEN$8) != null;
        }
    }
    
    /**
     * Sets the "nameLen" attribute
     */
    public void setNameLen(long nameLen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMELEN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMELEN$8);
            }
            target.setLongValue(nameLen);
        }
    }
    
    /**
     * Sets (as xml) the "nameLen" attribute
     */
    public void xsetNameLen(org.apache.xmlbeans.XmlUnsignedInt nameLen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NAMELEN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(NAMELEN$8);
            }
            target.set(nameLen);
        }
    }
    
    /**
     * Unsets the "nameLen" attribute
     */
    public void unsetNameLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMELEN$8);
        }
    }
    
    /**
     * Gets the "pPos" attribute
     */
    public long getPPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PPOS$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "pPos" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PPOS$10);
            return target;
        }
    }
    
    /**
     * True if has "pPos" attribute
     */
    public boolean isSetPPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PPOS$10) != null;
        }
    }
    
    /**
     * Sets the "pPos" attribute
     */
    public void setPPos(long pPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PPOS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PPOS$10);
            }
            target.setLongValue(pPos);
        }
    }
    
    /**
     * Sets (as xml) the "pPos" attribute
     */
    public void xsetPPos(org.apache.xmlbeans.XmlUnsignedInt pPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PPOS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PPOS$10);
            }
            target.set(pPos);
        }
    }
    
    /**
     * Unsets the "pPos" attribute
     */
    public void unsetPPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PPOS$10);
        }
    }
    
    /**
     * Gets the "pLen" attribute
     */
    public long getPLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEN$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "pLen" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PLEN$12);
            return target;
        }
    }
    
    /**
     * True if has "pLen" attribute
     */
    public boolean isSetPLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PLEN$12) != null;
        }
    }
    
    /**
     * Sets the "pLen" attribute
     */
    public void setPLen(long pLen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLEN$12);
            }
            target.setLongValue(pLen);
        }
    }
    
    /**
     * Sets (as xml) the "pLen" attribute
     */
    public void xsetPLen(org.apache.xmlbeans.XmlUnsignedInt pLen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PLEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PLEN$12);
            }
            target.set(pLen);
        }
    }
    
    /**
     * Unsets the "pLen" attribute
     */
    public void unsetPLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PLEN$12);
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public long getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LEVEL$14);
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$14) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(long level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$14);
            }
            target.setLongValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.apache.xmlbeans.XmlUnsignedInt level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LEVEL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(LEVEL$14);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$14);
        }
    }
    
    /**
     * Gets the "field" attribute
     */
    public long getField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "field" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIELD$16);
            return target;
        }
    }
    
    /**
     * Sets the "field" attribute
     */
    public void setField(long field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$16);
            }
            target.setLongValue(field);
        }
    }
    
    /**
     * Sets (as xml) the "field" attribute
     */
    public void xsetField(org.apache.xmlbeans.XmlUnsignedInt field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIELD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIELD$16);
            }
            target.set(field);
        }
    }
}
