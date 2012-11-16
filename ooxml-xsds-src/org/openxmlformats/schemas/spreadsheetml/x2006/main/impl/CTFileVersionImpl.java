/*
 * XML Type:  CT_FileVersion
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FileVersion(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFileVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion
{
    
    public CTFileVersionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPNAME$0 = 
        new javax.xml.namespace.QName("", "appName");
    private static final javax.xml.namespace.QName LASTEDITED$2 = 
        new javax.xml.namespace.QName("", "lastEdited");
    private static final javax.xml.namespace.QName LOWESTEDITED$4 = 
        new javax.xml.namespace.QName("", "lowestEdited");
    private static final javax.xml.namespace.QName RUPBUILD$6 = 
        new javax.xml.namespace.QName("", "rupBuild");
    private static final javax.xml.namespace.QName CODENAME$8 = 
        new javax.xml.namespace.QName("", "codeName");
    
    
    /**
     * Gets the "appName" attribute
     */
    public java.lang.String getAppName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "appName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAppName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "appName" attribute
     */
    public boolean isSetAppName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPNAME$0) != null;
        }
    }
    
    /**
     * Sets the "appName" attribute
     */
    public void setAppName(java.lang.String appName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPNAME$0);
            }
            target.setStringValue(appName);
        }
    }
    
    /**
     * Sets (as xml) the "appName" attribute
     */
    public void xsetAppName(org.apache.xmlbeans.XmlString appName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPNAME$0);
            }
            target.set(appName);
        }
    }
    
    /**
     * Unsets the "appName" attribute
     */
    public void unsetAppName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPNAME$0);
        }
    }
    
    /**
     * Gets the "lastEdited" attribute
     */
    public java.lang.String getLastEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTEDITED$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastEdited" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLastEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTEDITED$2);
            return target;
        }
    }
    
    /**
     * True if has "lastEdited" attribute
     */
    public boolean isSetLastEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTEDITED$2) != null;
        }
    }
    
    /**
     * Sets the "lastEdited" attribute
     */
    public void setLastEdited(java.lang.String lastEdited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTEDITED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTEDITED$2);
            }
            target.setStringValue(lastEdited);
        }
    }
    
    /**
     * Sets (as xml) the "lastEdited" attribute
     */
    public void xsetLastEdited(org.apache.xmlbeans.XmlString lastEdited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTEDITED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTEDITED$2);
            }
            target.set(lastEdited);
        }
    }
    
    /**
     * Unsets the "lastEdited" attribute
     */
    public void unsetLastEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTEDITED$2);
        }
    }
    
    /**
     * Gets the "lowestEdited" attribute
     */
    public java.lang.String getLowestEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOWESTEDITED$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowestEdited" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLowestEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOWESTEDITED$4);
            return target;
        }
    }
    
    /**
     * True if has "lowestEdited" attribute
     */
    public boolean isSetLowestEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOWESTEDITED$4) != null;
        }
    }
    
    /**
     * Sets the "lowestEdited" attribute
     */
    public void setLowestEdited(java.lang.String lowestEdited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOWESTEDITED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOWESTEDITED$4);
            }
            target.setStringValue(lowestEdited);
        }
    }
    
    /**
     * Sets (as xml) the "lowestEdited" attribute
     */
    public void xsetLowestEdited(org.apache.xmlbeans.XmlString lowestEdited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOWESTEDITED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOWESTEDITED$4);
            }
            target.set(lowestEdited);
        }
    }
    
    /**
     * Unsets the "lowestEdited" attribute
     */
    public void unsetLowestEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOWESTEDITED$4);
        }
    }
    
    /**
     * Gets the "rupBuild" attribute
     */
    public java.lang.String getRupBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUPBUILD$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rupBuild" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRupBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RUPBUILD$6);
            return target;
        }
    }
    
    /**
     * True if has "rupBuild" attribute
     */
    public boolean isSetRupBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RUPBUILD$6) != null;
        }
    }
    
    /**
     * Sets the "rupBuild" attribute
     */
    public void setRupBuild(java.lang.String rupBuild)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUPBUILD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUPBUILD$6);
            }
            target.setStringValue(rupBuild);
        }
    }
    
    /**
     * Sets (as xml) the "rupBuild" attribute
     */
    public void xsetRupBuild(org.apache.xmlbeans.XmlString rupBuild)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RUPBUILD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RUPBUILD$6);
            }
            target.set(rupBuild);
        }
    }
    
    /**
     * Unsets the "rupBuild" attribute
     */
    public void unsetRupBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RUPBUILD$6);
        }
    }
    
    /**
     * Gets the "codeName" attribute
     */
    public java.lang.String getCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(CODENAME$8);
            return target;
        }
    }
    
    /**
     * True if has "codeName" attribute
     */
    public boolean isSetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODENAME$8) != null;
        }
    }
    
    /**
     * Sets the "codeName" attribute
     */
    public void setCodeName(java.lang.String codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODENAME$8);
            }
            target.setStringValue(codeName);
        }
    }
    
    /**
     * Sets (as xml) the "codeName" attribute
     */
    public void xsetCodeName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(CODENAME$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(CODENAME$8);
            }
            target.set(codeName);
        }
    }
    
    /**
     * Unsets the "codeName" attribute
     */
    public void unsetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODENAME$8);
        }
    }
}
