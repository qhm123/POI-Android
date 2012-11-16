/*
 * XML Type:  CT_Language
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Language(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLanguageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage
{
    
    public CTLanguageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    private static final javax.xml.namespace.QName EASTASIA$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsia");
    private static final javax.xml.namespace.QName BIDI$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidi");
    
    
    /**
     * Gets the "val" attribute
     */
    public java.lang.Object getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * True if has "val" attribute
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VAL$0) != null;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(java.lang.Object val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setObjectValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
    
    /**
     * Unsets the "val" attribute
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VAL$0);
        }
    }
    
    /**
     * Gets the "eastAsia" attribute
     */
    public java.lang.Object getEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EASTASIA$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "eastAsia" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang xgetEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(EASTASIA$2);
            return target;
        }
    }
    
    /**
     * True if has "eastAsia" attribute
     */
    public boolean isSetEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EASTASIA$2) != null;
        }
    }
    
    /**
     * Sets the "eastAsia" attribute
     */
    public void setEastAsia(java.lang.Object eastAsia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EASTASIA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EASTASIA$2);
            }
            target.setObjectValue(eastAsia);
        }
    }
    
    /**
     * Sets (as xml) the "eastAsia" attribute
     */
    public void xsetEastAsia(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang eastAsia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(EASTASIA$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().add_attribute_user(EASTASIA$2);
            }
            target.set(eastAsia);
        }
    }
    
    /**
     * Unsets the "eastAsia" attribute
     */
    public void unsetEastAsia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EASTASIA$2);
        }
    }
    
    /**
     * Gets the "bidi" attribute
     */
    public java.lang.Object getBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIDI$4);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "bidi" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang xgetBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(BIDI$4);
            return target;
        }
    }
    
    /**
     * True if has "bidi" attribute
     */
    public boolean isSetBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BIDI$4) != null;
        }
    }
    
    /**
     * Sets the "bidi" attribute
     */
    public void setBidi(java.lang.Object bidi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIDI$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BIDI$4);
            }
            target.setObjectValue(bidi);
        }
    }
    
    /**
     * Sets (as xml) the "bidi" attribute
     */
    public void xsetBidi(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang bidi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(BIDI$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().add_attribute_user(BIDI$4);
            }
            target.set(bidi);
        }
    }
    
    /**
     * Unsets the "bidi" attribute
     */
    public void unsetBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BIDI$4);
        }
    }
}
