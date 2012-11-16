/*
 * XML Type:  CT_Schema
 * Namespace: http://schemas.openxmlformats.org/schemaLibrary/2006/main
 * Java type: org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.schemaLibrary.x2006.main.impl;
/**
 * An XML CT_Schema(@http://schemas.openxmlformats.org/schemaLibrary/2006/main).
 *
 * This is a complex type.
 */
public class CTSchemaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema
{
    
    public CTSchemaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URI$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/schemaLibrary/2006/main", "uri");
    private static final javax.xml.namespace.QName MANIFESTLOCATION$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/schemaLibrary/2006/main", "manifestLocation");
    private static final javax.xml.namespace.QName SCHEMALOCATION$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/schemaLibrary/2006/main", "schemaLocation");
    
    
    /**
     * Gets the "uri" attribute
     */
    public java.lang.String getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(URI$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(URI$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "uri" attribute
     */
    public boolean isSetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$0) != null;
        }
    }
    
    /**
     * Sets the "uri" attribute
     */
    public void setUri(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$0);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    public void xsetUri(org.apache.xmlbeans.XmlString uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URI$0);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "uri" attribute
     */
    public void unsetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$0);
        }
    }
    
    /**
     * Gets the "manifestLocation" attribute
     */
    public java.lang.String getManifestLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANIFESTLOCATION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "manifestLocation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetManifestLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANIFESTLOCATION$2);
            return target;
        }
    }
    
    /**
     * True if has "manifestLocation" attribute
     */
    public boolean isSetManifestLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MANIFESTLOCATION$2) != null;
        }
    }
    
    /**
     * Sets the "manifestLocation" attribute
     */
    public void setManifestLocation(java.lang.String manifestLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANIFESTLOCATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANIFESTLOCATION$2);
            }
            target.setStringValue(manifestLocation);
        }
    }
    
    /**
     * Sets (as xml) the "manifestLocation" attribute
     */
    public void xsetManifestLocation(org.apache.xmlbeans.XmlString manifestLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANIFESTLOCATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MANIFESTLOCATION$2);
            }
            target.set(manifestLocation);
        }
    }
    
    /**
     * Unsets the "manifestLocation" attribute
     */
    public void unsetManifestLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MANIFESTLOCATION$2);
        }
    }
    
    /**
     * Gets the "schemaLocation" attribute
     */
    public java.lang.String getSchemaLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemaLocation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSchemaLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMALOCATION$4);
            return target;
        }
    }
    
    /**
     * True if has "schemaLocation" attribute
     */
    public boolean isSetSchemaLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMALOCATION$4) != null;
        }
    }
    
    /**
     * Sets the "schemaLocation" attribute
     */
    public void setSchemaLocation(java.lang.String schemaLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMALOCATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMALOCATION$4);
            }
            target.setStringValue(schemaLocation);
        }
    }
    
    /**
     * Sets (as xml) the "schemaLocation" attribute
     */
    public void xsetSchemaLocation(org.apache.xmlbeans.XmlString schemaLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMALOCATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCHEMALOCATION$4);
            }
            target.set(schemaLocation);
        }
    }
    
    /**
     * Unsets the "schemaLocation" attribute
     */
    public void unsetSchemaLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMALOCATION$4);
        }
    }
}
