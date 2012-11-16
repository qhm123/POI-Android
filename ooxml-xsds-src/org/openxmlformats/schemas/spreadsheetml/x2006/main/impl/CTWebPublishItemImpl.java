/*
 * XML Type:  CT_WebPublishItem
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_WebPublishItem(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWebPublishItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem
{
    
    public CTWebPublishItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName DIVID$2 = 
        new javax.xml.namespace.QName("", "divId");
    private static final javax.xml.namespace.QName SOURCETYPE$4 = 
        new javax.xml.namespace.QName("", "sourceType");
    private static final javax.xml.namespace.QName SOURCEREF$6 = 
        new javax.xml.namespace.QName("", "sourceRef");
    private static final javax.xml.namespace.QName SOURCEOBJECT$8 = 
        new javax.xml.namespace.QName("", "sourceObject");
    private static final javax.xml.namespace.QName DESTINATIONFILE$10 = 
        new javax.xml.namespace.QName("", "destinationFile");
    private static final javax.xml.namespace.QName TITLE$12 = 
        new javax.xml.namespace.QName("", "title");
    private static final javax.xml.namespace.QName AUTOREPUBLISH$14 = 
        new javax.xml.namespace.QName("", "autoRepublish");
    
    
    /**
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlUnsignedInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "divId" attribute
     */
    public java.lang.String getDivId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIVID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "divId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDivId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DIVID$2);
            return target;
        }
    }
    
    /**
     * Sets the "divId" attribute
     */
    public void setDivId(java.lang.String divId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIVID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIVID$2);
            }
            target.setStringValue(divId);
        }
    }
    
    /**
     * Sets (as xml) the "divId" attribute
     */
    public void xsetDivId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring divId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DIVID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DIVID$2);
            }
            target.set(divId);
        }
    }
    
    /**
     * Gets the "sourceType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType.Enum getSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCETYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType xgetSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType)get_store().find_attribute_user(SOURCETYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "sourceType" attribute
     */
    public void setSourceType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType.Enum sourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCETYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCETYPE$4);
            }
            target.setEnumValue(sourceType);
        }
    }
    
    /**
     * Sets (as xml) the "sourceType" attribute
     */
    public void xsetSourceType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType sourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType)get_store().find_attribute_user(SOURCETYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STWebSourceType)get_store().add_attribute_user(SOURCETYPE$4);
            }
            target.set(sourceType);
        }
    }
    
    /**
     * Gets the "sourceRef" attribute
     */
    public java.lang.String getSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEREF$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceRef" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(SOURCEREF$6);
            return target;
        }
    }
    
    /**
     * True if has "sourceRef" attribute
     */
    public boolean isSetSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCEREF$6) != null;
        }
    }
    
    /**
     * Sets the "sourceRef" attribute
     */
    public void setSourceRef(java.lang.String sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEREF$6);
            }
            target.setStringValue(sourceRef);
        }
    }
    
    /**
     * Sets (as xml) the "sourceRef" attribute
     */
    public void xsetSourceRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(SOURCEREF$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(SOURCEREF$6);
            }
            target.set(sourceRef);
        }
    }
    
    /**
     * Unsets the "sourceRef" attribute
     */
    public void unsetSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCEREF$6);
        }
    }
    
    /**
     * Gets the "sourceObject" attribute
     */
    public java.lang.String getSourceObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEOBJECT$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceObject" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSourceObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SOURCEOBJECT$8);
            return target;
        }
    }
    
    /**
     * True if has "sourceObject" attribute
     */
    public boolean isSetSourceObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCEOBJECT$8) != null;
        }
    }
    
    /**
     * Sets the "sourceObject" attribute
     */
    public void setSourceObject(java.lang.String sourceObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEOBJECT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEOBJECT$8);
            }
            target.setStringValue(sourceObject);
        }
    }
    
    /**
     * Sets (as xml) the "sourceObject" attribute
     */
    public void xsetSourceObject(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring sourceObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SOURCEOBJECT$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SOURCEOBJECT$8);
            }
            target.set(sourceObject);
        }
    }
    
    /**
     * Unsets the "sourceObject" attribute
     */
    public void unsetSourceObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCEOBJECT$8);
        }
    }
    
    /**
     * Gets the "destinationFile" attribute
     */
    public java.lang.String getDestinationFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONFILE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "destinationFile" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDestinationFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESTINATIONFILE$10);
            return target;
        }
    }
    
    /**
     * Sets the "destinationFile" attribute
     */
    public void setDestinationFile(java.lang.String destinationFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONFILE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTINATIONFILE$10);
            }
            target.setStringValue(destinationFile);
        }
    }
    
    /**
     * Sets (as xml) the "destinationFile" attribute
     */
    public void xsetDestinationFile(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring destinationFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESTINATIONFILE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DESTINATIONFILE$10);
            }
            target.set(destinationFile);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TITLE$12);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$12) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$12);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TITLE$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(TITLE$12);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$12);
        }
    }
    
    /**
     * Gets the "autoRepublish" attribute
     */
    public boolean getAutoRepublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOREPUBLISH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOREPUBLISH$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoRepublish" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoRepublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOREPUBLISH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOREPUBLISH$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoRepublish" attribute
     */
    public boolean isSetAutoRepublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOREPUBLISH$14) != null;
        }
    }
    
    /**
     * Sets the "autoRepublish" attribute
     */
    public void setAutoRepublish(boolean autoRepublish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOREPUBLISH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOREPUBLISH$14);
            }
            target.setBooleanValue(autoRepublish);
        }
    }
    
    /**
     * Sets (as xml) the "autoRepublish" attribute
     */
    public void xsetAutoRepublish(org.apache.xmlbeans.XmlBoolean autoRepublish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOREPUBLISH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOREPUBLISH$14);
            }
            target.set(autoRepublish);
        }
    }
    
    /**
     * Unsets the "autoRepublish" attribute
     */
    public void unsetAutoRepublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOREPUBLISH$14);
        }
    }
}
