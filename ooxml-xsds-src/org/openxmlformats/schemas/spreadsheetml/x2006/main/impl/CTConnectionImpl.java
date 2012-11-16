/*
 * XML Type:  CT_Connection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Connection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTConnectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection
{
    
    public CTConnectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dbPr");
    private static final javax.xml.namespace.QName OLAPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "olapPr");
    private static final javax.xml.namespace.QName WEBPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPr");
    private static final javax.xml.namespace.QName TEXTPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "textPr");
    private static final javax.xml.namespace.QName PARAMETERS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "parameters");
    private static final javax.xml.namespace.QName EXTLST$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName SOURCEFILE$14 = 
        new javax.xml.namespace.QName("", "sourceFile");
    private static final javax.xml.namespace.QName ODCFILE$16 = 
        new javax.xml.namespace.QName("", "odcFile");
    private static final javax.xml.namespace.QName KEEPALIVE$18 = 
        new javax.xml.namespace.QName("", "keepAlive");
    private static final javax.xml.namespace.QName INTERVAL$20 = 
        new javax.xml.namespace.QName("", "interval");
    private static final javax.xml.namespace.QName NAME$22 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$24 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName TYPE$26 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName RECONNECTIONMETHOD$28 = 
        new javax.xml.namespace.QName("", "reconnectionMethod");
    private static final javax.xml.namespace.QName REFRESHEDVERSION$30 = 
        new javax.xml.namespace.QName("", "refreshedVersion");
    private static final javax.xml.namespace.QName MINREFRESHABLEVERSION$32 = 
        new javax.xml.namespace.QName("", "minRefreshableVersion");
    private static final javax.xml.namespace.QName SAVEPASSWORD$34 = 
        new javax.xml.namespace.QName("", "savePassword");
    private static final javax.xml.namespace.QName NEW$36 = 
        new javax.xml.namespace.QName("", "new");
    private static final javax.xml.namespace.QName DELETED$38 = 
        new javax.xml.namespace.QName("", "deleted");
    private static final javax.xml.namespace.QName ONLYUSECONNECTIONFILE$40 = 
        new javax.xml.namespace.QName("", "onlyUseConnectionFile");
    private static final javax.xml.namespace.QName BACKGROUND$42 = 
        new javax.xml.namespace.QName("", "background");
    private static final javax.xml.namespace.QName REFRESHONLOAD$44 = 
        new javax.xml.namespace.QName("", "refreshOnLoad");
    private static final javax.xml.namespace.QName SAVEDATA$46 = 
        new javax.xml.namespace.QName("", "saveData");
    private static final javax.xml.namespace.QName CREDENTIALS$48 = 
        new javax.xml.namespace.QName("", "credentials");
    private static final javax.xml.namespace.QName SINGLESIGNONID$50 = 
        new javax.xml.namespace.QName("", "singleSignOnId");
    
    
    /**
     * Gets the "dbPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr getDbPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr)get_store().find_element_user(DBPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dbPr" element
     */
    public boolean isSetDbPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DBPR$0) != 0;
        }
    }
    
    /**
     * Sets the "dbPr" element
     */
    public void setDbPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr dbPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr)get_store().find_element_user(DBPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr)get_store().add_element_user(DBPR$0);
            }
            target.set(dbPr);
        }
    }
    
    /**
     * Appends and returns a new empty "dbPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr addNewDbPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr)get_store().add_element_user(DBPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dbPr" element
     */
    public void unsetDbPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DBPR$0, 0);
        }
    }
    
    /**
     * Gets the "olapPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr getOlapPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr)get_store().find_element_user(OLAPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "olapPr" element
     */
    public boolean isSetOlapPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLAPPR$2) != 0;
        }
    }
    
    /**
     * Sets the "olapPr" element
     */
    public void setOlapPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr olapPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr)get_store().find_element_user(OLAPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr)get_store().add_element_user(OLAPPR$2);
            }
            target.set(olapPr);
        }
    }
    
    /**
     * Appends and returns a new empty "olapPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr addNewOlapPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr)get_store().add_element_user(OLAPPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "olapPr" element
     */
    public void unsetOlapPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLAPPR$2, 0);
        }
    }
    
    /**
     * Gets the "webPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr getWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr)get_store().find_element_user(WEBPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "webPr" element
     */
    public boolean isSetWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBPR$4) != 0;
        }
    }
    
    /**
     * Sets the "webPr" element
     */
    public void setWebPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr webPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr)get_store().find_element_user(WEBPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr)get_store().add_element_user(WEBPR$4);
            }
            target.set(webPr);
        }
    }
    
    /**
     * Appends and returns a new empty "webPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr addNewWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr)get_store().add_element_user(WEBPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "webPr" element
     */
    public void unsetWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBPR$4, 0);
        }
    }
    
    /**
     * Gets the "textPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr getTextPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr)get_store().find_element_user(TEXTPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "textPr" element
     */
    public boolean isSetTextPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTPR$6) != 0;
        }
    }
    
    /**
     * Sets the "textPr" element
     */
    public void setTextPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr textPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr)get_store().find_element_user(TEXTPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr)get_store().add_element_user(TEXTPR$6);
            }
            target.set(textPr);
        }
    }
    
    /**
     * Appends and returns a new empty "textPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr addNewTextPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr)get_store().add_element_user(TEXTPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "textPr" element
     */
    public void unsetTextPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTPR$6, 0);
        }
    }
    
    /**
     * Gets the "parameters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters)get_store().find_element_user(PARAMETERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parameters" element
     */
    public boolean isSetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$8) != 0;
        }
    }
    
    /**
     * Sets the "parameters" element
     */
    public void setParameters(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters)get_store().find_element_user(PARAMETERS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters)get_store().add_element_user(PARAMETERS$8);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters)get_store().add_element_user(PARAMETERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "parameters" element
     */
    public void unsetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$8, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$10) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$10);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$10, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$12);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "sourceFile" attribute
     */
    public java.lang.String getSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEFILE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceFile" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SOURCEFILE$14);
            return target;
        }
    }
    
    /**
     * True if has "sourceFile" attribute
     */
    public boolean isSetSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCEFILE$14) != null;
        }
    }
    
    /**
     * Sets the "sourceFile" attribute
     */
    public void setSourceFile(java.lang.String sourceFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEFILE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEFILE$14);
            }
            target.setStringValue(sourceFile);
        }
    }
    
    /**
     * Sets (as xml) the "sourceFile" attribute
     */
    public void xsetSourceFile(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring sourceFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SOURCEFILE$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SOURCEFILE$14);
            }
            target.set(sourceFile);
        }
    }
    
    /**
     * Unsets the "sourceFile" attribute
     */
    public void unsetSourceFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCEFILE$14);
        }
    }
    
    /**
     * Gets the "odcFile" attribute
     */
    public java.lang.String getOdcFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ODCFILE$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "odcFile" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOdcFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ODCFILE$16);
            return target;
        }
    }
    
    /**
     * True if has "odcFile" attribute
     */
    public boolean isSetOdcFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ODCFILE$16) != null;
        }
    }
    
    /**
     * Sets the "odcFile" attribute
     */
    public void setOdcFile(java.lang.String odcFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ODCFILE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ODCFILE$16);
            }
            target.setStringValue(odcFile);
        }
    }
    
    /**
     * Sets (as xml) the "odcFile" attribute
     */
    public void xsetOdcFile(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring odcFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ODCFILE$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(ODCFILE$16);
            }
            target.set(odcFile);
        }
    }
    
    /**
     * Unsets the "odcFile" attribute
     */
    public void unsetOdcFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ODCFILE$16);
        }
    }
    
    /**
     * Gets the "keepAlive" attribute
     */
    public boolean getKeepAlive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEEPALIVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KEEPALIVE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "keepAlive" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetKeepAlive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEEPALIVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(KEEPALIVE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "keepAlive" attribute
     */
    public boolean isSetKeepAlive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEEPALIVE$18) != null;
        }
    }
    
    /**
     * Sets the "keepAlive" attribute
     */
    public void setKeepAlive(boolean keepAlive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEEPALIVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEEPALIVE$18);
            }
            target.setBooleanValue(keepAlive);
        }
    }
    
    /**
     * Sets (as xml) the "keepAlive" attribute
     */
    public void xsetKeepAlive(org.apache.xmlbeans.XmlBoolean keepAlive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEEPALIVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(KEEPALIVE$18);
            }
            target.set(keepAlive);
        }
    }
    
    /**
     * Unsets the "keepAlive" attribute
     */
    public void unsetKeepAlive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEEPALIVE$18);
        }
    }
    
    /**
     * Gets the "interval" attribute
     */
    public long getInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERVAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERVAL$20);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "interval" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INTERVAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(INTERVAL$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "interval" attribute
     */
    public boolean isSetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERVAL$20) != null;
        }
    }
    
    /**
     * Sets the "interval" attribute
     */
    public void setInterval(long interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERVAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERVAL$20);
            }
            target.setLongValue(interval);
        }
    }
    
    /**
     * Sets (as xml) the "interval" attribute
     */
    public void xsetInterval(org.apache.xmlbeans.XmlUnsignedInt interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INTERVAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(INTERVAL$20);
            }
            target.set(interval);
        }
    }
    
    /**
     * Unsets the "interval" attribute
     */
    public void unsetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERVAL$20);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$22);
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
            return get_store().find_attribute_user(NAME$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$22);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$22);
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
            get_store().remove_attribute(NAME$22);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$24);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$24) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$24);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DESCRIPTION$24);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$24);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public long getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TYPE$26);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$26) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(long type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$26);
            }
            target.setLongValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlUnsignedInt type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(TYPE$26);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$26);
        }
    }
    
    /**
     * Gets the "reconnectionMethod" attribute
     */
    public long getReconnectionMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECONNECTIONMETHOD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RECONNECTIONMETHOD$28);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "reconnectionMethod" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetReconnectionMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RECONNECTIONMETHOD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(RECONNECTIONMETHOD$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "reconnectionMethod" attribute
     */
    public boolean isSetReconnectionMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECONNECTIONMETHOD$28) != null;
        }
    }
    
    /**
     * Sets the "reconnectionMethod" attribute
     */
    public void setReconnectionMethod(long reconnectionMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECONNECTIONMETHOD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECONNECTIONMETHOD$28);
            }
            target.setLongValue(reconnectionMethod);
        }
    }
    
    /**
     * Sets (as xml) the "reconnectionMethod" attribute
     */
    public void xsetReconnectionMethod(org.apache.xmlbeans.XmlUnsignedInt reconnectionMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RECONNECTIONMETHOD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RECONNECTIONMETHOD$28);
            }
            target.set(reconnectionMethod);
        }
    }
    
    /**
     * Unsets the "reconnectionMethod" attribute
     */
    public void unsetReconnectionMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECONNECTIONMETHOD$28);
        }
    }
    
    /**
     * Gets the "refreshedVersion" attribute
     */
    public short getRefreshedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDVERSION$30);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshedVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetRefreshedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(REFRESHEDVERSION$30);
            return target;
        }
    }
    
    /**
     * Sets the "refreshedVersion" attribute
     */
    public void setRefreshedVersion(short refreshedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDVERSION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHEDVERSION$30);
            }
            target.setShortValue(refreshedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "refreshedVersion" attribute
     */
    public void xsetRefreshedVersion(org.apache.xmlbeans.XmlUnsignedByte refreshedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(REFRESHEDVERSION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(REFRESHEDVERSION$30);
            }
            target.set(refreshedVersion);
        }
    }
    
    /**
     * Gets the "minRefreshableVersion" attribute
     */
    public short getMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINREFRESHABLEVERSION$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINREFRESHABLEVERSION$32);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "minRefreshableVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINREFRESHABLEVERSION$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(MINREFRESHABLEVERSION$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "minRefreshableVersion" attribute
     */
    public boolean isSetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINREFRESHABLEVERSION$32) != null;
        }
    }
    
    /**
     * Sets the "minRefreshableVersion" attribute
     */
    public void setMinRefreshableVersion(short minRefreshableVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINREFRESHABLEVERSION$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINREFRESHABLEVERSION$32);
            }
            target.setShortValue(minRefreshableVersion);
        }
    }
    
    /**
     * Sets (as xml) the "minRefreshableVersion" attribute
     */
    public void xsetMinRefreshableVersion(org.apache.xmlbeans.XmlUnsignedByte minRefreshableVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINREFRESHABLEVERSION$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(MINREFRESHABLEVERSION$32);
            }
            target.set(minRefreshableVersion);
        }
    }
    
    /**
     * Unsets the "minRefreshableVersion" attribute
     */
    public void unsetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINREFRESHABLEVERSION$32);
        }
    }
    
    /**
     * Gets the "savePassword" attribute
     */
    public boolean getSavePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEPASSWORD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVEPASSWORD$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "savePassword" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSavePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEPASSWORD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SAVEPASSWORD$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "savePassword" attribute
     */
    public boolean isSetSavePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SAVEPASSWORD$34) != null;
        }
    }
    
    /**
     * Sets the "savePassword" attribute
     */
    public void setSavePassword(boolean savePassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEPASSWORD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVEPASSWORD$34);
            }
            target.setBooleanValue(savePassword);
        }
    }
    
    /**
     * Sets (as xml) the "savePassword" attribute
     */
    public void xsetSavePassword(org.apache.xmlbeans.XmlBoolean savePassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEPASSWORD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SAVEPASSWORD$34);
            }
            target.set(savePassword);
        }
    }
    
    /**
     * Unsets the "savePassword" attribute
     */
    public void unsetSavePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SAVEPASSWORD$34);
        }
    }
    
    /**
     * Gets the "new" attribute
     */
    public boolean getNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEW$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NEW$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "new" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NEW$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NEW$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "new" attribute
     */
    public boolean isSetNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEW$36) != null;
        }
    }
    
    /**
     * Sets the "new" attribute
     */
    public void setNew(boolean xnew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEW$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEW$36);
            }
            target.setBooleanValue(xnew);
        }
    }
    
    /**
     * Sets (as xml) the "new" attribute
     */
    public void xsetNew(org.apache.xmlbeans.XmlBoolean xnew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NEW$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NEW$36);
            }
            target.set(xnew);
        }
    }
    
    /**
     * Unsets the "new" attribute
     */
    public void unsetNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEW$36);
        }
    }
    
    /**
     * Gets the "deleted" attribute
     */
    public boolean getDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELETED$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "deleted" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETED$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELETED$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "deleted" attribute
     */
    public boolean isSetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELETED$38) != null;
        }
    }
    
    /**
     * Sets the "deleted" attribute
     */
    public void setDeleted(boolean deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETED$38);
            }
            target.setBooleanValue(deleted);
        }
    }
    
    /**
     * Sets (as xml) the "deleted" attribute
     */
    public void xsetDeleted(org.apache.xmlbeans.XmlBoolean deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETED$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELETED$38);
            }
            target.set(deleted);
        }
    }
    
    /**
     * Unsets the "deleted" attribute
     */
    public void unsetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELETED$38);
        }
    }
    
    /**
     * Gets the "onlyUseConnectionFile" attribute
     */
    public boolean getOnlyUseConnectionFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONLYUSECONNECTIONFILE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ONLYUSECONNECTIONFILE$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "onlyUseConnectionFile" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOnlyUseConnectionFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ONLYUSECONNECTIONFILE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ONLYUSECONNECTIONFILE$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "onlyUseConnectionFile" attribute
     */
    public boolean isSetOnlyUseConnectionFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ONLYUSECONNECTIONFILE$40) != null;
        }
    }
    
    /**
     * Sets the "onlyUseConnectionFile" attribute
     */
    public void setOnlyUseConnectionFile(boolean onlyUseConnectionFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONLYUSECONNECTIONFILE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONLYUSECONNECTIONFILE$40);
            }
            target.setBooleanValue(onlyUseConnectionFile);
        }
    }
    
    /**
     * Sets (as xml) the "onlyUseConnectionFile" attribute
     */
    public void xsetOnlyUseConnectionFile(org.apache.xmlbeans.XmlBoolean onlyUseConnectionFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ONLYUSECONNECTIONFILE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ONLYUSECONNECTIONFILE$40);
            }
            target.set(onlyUseConnectionFile);
        }
    }
    
    /**
     * Unsets the "onlyUseConnectionFile" attribute
     */
    public void unsetOnlyUseConnectionFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ONLYUSECONNECTIONFILE$40);
        }
    }
    
    /**
     * Gets the "background" attribute
     */
    public boolean getBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKGROUND$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BACKGROUND$42);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "background" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKGROUND$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BACKGROUND$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "background" attribute
     */
    public boolean isSetBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BACKGROUND$42) != null;
        }
    }
    
    /**
     * Sets the "background" attribute
     */
    public void setBackground(boolean background)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKGROUND$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BACKGROUND$42);
            }
            target.setBooleanValue(background);
        }
    }
    
    /**
     * Sets (as xml) the "background" attribute
     */
    public void xsetBackground(org.apache.xmlbeans.XmlBoolean background)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKGROUND$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BACKGROUND$42);
            }
            target.set(background);
        }
    }
    
    /**
     * Unsets the "background" attribute
     */
    public void unsetBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BACKGROUND$42);
        }
    }
    
    /**
     * Gets the "refreshOnLoad" attribute
     */
    public boolean getRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONLOAD$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFRESHONLOAD$44);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshOnLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONLOAD$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REFRESHONLOAD$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "refreshOnLoad" attribute
     */
    public boolean isSetRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHONLOAD$44) != null;
        }
    }
    
    /**
     * Sets the "refreshOnLoad" attribute
     */
    public void setRefreshOnLoad(boolean refreshOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONLOAD$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHONLOAD$44);
            }
            target.setBooleanValue(refreshOnLoad);
        }
    }
    
    /**
     * Sets (as xml) the "refreshOnLoad" attribute
     */
    public void xsetRefreshOnLoad(org.apache.xmlbeans.XmlBoolean refreshOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONLOAD$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REFRESHONLOAD$44);
            }
            target.set(refreshOnLoad);
        }
    }
    
    /**
     * Unsets the "refreshOnLoad" attribute
     */
    public void unsetRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHONLOAD$44);
        }
    }
    
    /**
     * Gets the "saveData" attribute
     */
    public boolean getSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEDATA$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVEDATA$46);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "saveData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEDATA$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SAVEDATA$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "saveData" attribute
     */
    public boolean isSetSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SAVEDATA$46) != null;
        }
    }
    
    /**
     * Sets the "saveData" attribute
     */
    public void setSaveData(boolean saveData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEDATA$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVEDATA$46);
            }
            target.setBooleanValue(saveData);
        }
    }
    
    /**
     * Sets (as xml) the "saveData" attribute
     */
    public void xsetSaveData(org.apache.xmlbeans.XmlBoolean saveData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEDATA$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SAVEDATA$46);
            }
            target.set(saveData);
        }
    }
    
    /**
     * Unsets the "saveData" attribute
     */
    public void unsetSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SAVEDATA$46);
        }
    }
    
    /**
     * Gets the "credentials" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod.Enum getCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREDENTIALS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREDENTIALS$48);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "credentials" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod xgetCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod)get_store().find_attribute_user(CREDENTIALS$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod)get_default_attribute_value(CREDENTIALS$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "credentials" attribute
     */
    public boolean isSetCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CREDENTIALS$48) != null;
        }
    }
    
    /**
     * Sets the "credentials" attribute
     */
    public void setCredentials(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod.Enum credentials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREDENTIALS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREDENTIALS$48);
            }
            target.setEnumValue(credentials);
        }
    }
    
    /**
     * Sets (as xml) the "credentials" attribute
     */
    public void xsetCredentials(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod credentials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod)get_store().find_attribute_user(CREDENTIALS$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod)get_store().add_attribute_user(CREDENTIALS$48);
            }
            target.set(credentials);
        }
    }
    
    /**
     * Unsets the "credentials" attribute
     */
    public void unsetCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CREDENTIALS$48);
        }
    }
    
    /**
     * Gets the "singleSignOnId" attribute
     */
    public java.lang.String getSingleSignOnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLESIGNONID$50);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "singleSignOnId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSingleSignOnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SINGLESIGNONID$50);
            return target;
        }
    }
    
    /**
     * True if has "singleSignOnId" attribute
     */
    public boolean isSetSingleSignOnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SINGLESIGNONID$50) != null;
        }
    }
    
    /**
     * Sets the "singleSignOnId" attribute
     */
    public void setSingleSignOnId(java.lang.String singleSignOnId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLESIGNONID$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SINGLESIGNONID$50);
            }
            target.setStringValue(singleSignOnId);
        }
    }
    
    /**
     * Sets (as xml) the "singleSignOnId" attribute
     */
    public void xsetSingleSignOnId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring singleSignOnId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SINGLESIGNONID$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SINGLESIGNONID$50);
            }
            target.set(singleSignOnId);
        }
    }
    
    /**
     * Unsets the "singleSignOnId" attribute
     */
    public void unsetSingleSignOnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SINGLESIGNONID$50);
        }
    }
}
