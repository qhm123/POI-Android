/*
 * XML Type:  CT_SlideSyncProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideSyncProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideSyncPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties
{
    
    public CTSlideSyncPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SERVERSLDID$2 = 
        new javax.xml.namespace.QName("", "serverSldId");
    private static final javax.xml.namespace.QName SERVERSLDMODIFIEDTIME$4 = 
        new javax.xml.namespace.QName("", "serverSldModifiedTime");
    private static final javax.xml.namespace.QName CLIENTINSERTEDTIME$6 = 
        new javax.xml.namespace.QName("", "clientInsertedTime");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "serverSldId" attribute
     */
    public java.lang.String getServerSldId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERSLDID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverSldId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetServerSldId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVERSLDID$2);
            return target;
        }
    }
    
    /**
     * Sets the "serverSldId" attribute
     */
    public void setServerSldId(java.lang.String serverSldId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERSLDID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERSLDID$2);
            }
            target.setStringValue(serverSldId);
        }
    }
    
    /**
     * Sets (as xml) the "serverSldId" attribute
     */
    public void xsetServerSldId(org.apache.xmlbeans.XmlString serverSldId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVERSLDID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVERSLDID$2);
            }
            target.set(serverSldId);
        }
    }
    
    /**
     * Gets the "serverSldModifiedTime" attribute
     */
    public java.util.Calendar getServerSldModifiedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERSLDMODIFIEDTIME$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverSldModifiedTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetServerSldModifiedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(SERVERSLDMODIFIEDTIME$4);
            return target;
        }
    }
    
    /**
     * Sets the "serverSldModifiedTime" attribute
     */
    public void setServerSldModifiedTime(java.util.Calendar serverSldModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERSLDMODIFIEDTIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERSLDMODIFIEDTIME$4);
            }
            target.setCalendarValue(serverSldModifiedTime);
        }
    }
    
    /**
     * Sets (as xml) the "serverSldModifiedTime" attribute
     */
    public void xsetServerSldModifiedTime(org.apache.xmlbeans.XmlDateTime serverSldModifiedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(SERVERSLDMODIFIEDTIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(SERVERSLDMODIFIEDTIME$4);
            }
            target.set(serverSldModifiedTime);
        }
    }
    
    /**
     * Gets the "clientInsertedTime" attribute
     */
    public java.util.Calendar getClientInsertedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTINSERTEDTIME$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "clientInsertedTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetClientInsertedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CLIENTINSERTEDTIME$6);
            return target;
        }
    }
    
    /**
     * Sets the "clientInsertedTime" attribute
     */
    public void setClientInsertedTime(java.util.Calendar clientInsertedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTINSERTEDTIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTINSERTEDTIME$6);
            }
            target.setCalendarValue(clientInsertedTime);
        }
    }
    
    /**
     * Sets (as xml) the "clientInsertedTime" attribute
     */
    public void xsetClientInsertedTime(org.apache.xmlbeans.XmlDateTime clientInsertedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CLIENTINSERTEDTIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(CLIENTINSERTEDTIME$6);
            }
            target.set(clientInsertedTime);
        }
    }
}
