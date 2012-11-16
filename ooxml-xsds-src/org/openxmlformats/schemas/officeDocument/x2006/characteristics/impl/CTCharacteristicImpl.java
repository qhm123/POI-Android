/*
 * XML Type:  CT_Characteristic
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/characteristics
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.characteristics.impl;
/**
 * An XML CT_Characteristic(@http://schemas.openxmlformats.org/officeDocument/2006/characteristics).
 *
 * This is a complex type.
 */
public class CTCharacteristicImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic
{
    
    public CTCharacteristicImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName RELATION$2 = 
        new javax.xml.namespace.QName("", "relation");
    private static final javax.xml.namespace.QName VAL$4 = 
        new javax.xml.namespace.QName("", "val");
    private static final javax.xml.namespace.QName VOCABULARY$6 = 
        new javax.xml.namespace.QName("", "vocabulary");
    
    
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
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            return target;
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
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "relation" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation.Enum getRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATION$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "relation" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation xgetRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation)get_store().find_attribute_user(RELATION$2);
            return target;
        }
    }
    
    /**
     * Sets the "relation" attribute
     */
    public void setRelation(org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation.Enum relation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATION$2);
            }
            target.setEnumValue(relation);
        }
    }
    
    /**
     * Sets (as xml) the "relation" attribute
     */
    public void xsetRelation(org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation relation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation)get_store().find_attribute_user(RELATION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.STRelation)get_store().add_attribute_user(RELATION$2);
            }
            target.set(relation);
        }
    }
    
    /**
     * Gets the "val" attribute
     */
    public java.lang.String getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VAL$4);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(java.lang.String val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$4);
            }
            target.setStringValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.apache.xmlbeans.XmlString val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VAL$4);
            }
            target.set(val);
        }
    }
    
    /**
     * Gets the "vocabulary" attribute
     */
    public java.lang.String getVocabulary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOCABULARY$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vocabulary" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetVocabulary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VOCABULARY$6);
            return target;
        }
    }
    
    /**
     * True if has "vocabulary" attribute
     */
    public boolean isSetVocabulary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VOCABULARY$6) != null;
        }
    }
    
    /**
     * Sets the "vocabulary" attribute
     */
    public void setVocabulary(java.lang.String vocabulary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOCABULARY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOCABULARY$6);
            }
            target.setStringValue(vocabulary);
        }
    }
    
    /**
     * Sets (as xml) the "vocabulary" attribute
     */
    public void xsetVocabulary(org.apache.xmlbeans.XmlAnyURI vocabulary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(VOCABULARY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(VOCABULARY$6);
            }
            target.set(vocabulary);
        }
    }
    
    /**
     * Unsets the "vocabulary" attribute
     */
    public void unsetVocabulary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VOCABULARY$6);
        }
    }
}
