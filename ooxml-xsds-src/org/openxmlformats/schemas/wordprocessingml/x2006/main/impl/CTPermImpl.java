/*
 * XML Type:  CT_Perm
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Perm(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPermImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm
{
    
    public CTPermImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "id");
    private static final javax.xml.namespace.QName DISPLACEDBYCUSTOMXML$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displacedByCustomXml");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ID$0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "displacedByCustomXml" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml.Enum getDisplacedByCustomXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "displacedByCustomXml" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml xgetDisplacedByCustomXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml)get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$2);
            return target;
        }
    }
    
    /**
     * True if has "displacedByCustomXml" attribute
     */
    public boolean isSetDisplacedByCustomXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$2) != null;
        }
    }
    
    /**
     * Sets the "displacedByCustomXml" attribute
     */
    public void setDisplacedByCustomXml(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml.Enum displacedByCustomXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLACEDBYCUSTOMXML$2);
            }
            target.setEnumValue(displacedByCustomXml);
        }
    }
    
    /**
     * Sets (as xml) the "displacedByCustomXml" attribute
     */
    public void xsetDisplacedByCustomXml(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml displacedByCustomXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml)get_store().find_attribute_user(DISPLACEDBYCUSTOMXML$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml)get_store().add_attribute_user(DISPLACEDBYCUSTOMXML$2);
            }
            target.set(displacedByCustomXml);
        }
    }
    
    /**
     * Unsets the "displacedByCustomXml" attribute
     */
    public void unsetDisplacedByCustomXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLACEDBYCUSTOMXML$2);
        }
    }
}
