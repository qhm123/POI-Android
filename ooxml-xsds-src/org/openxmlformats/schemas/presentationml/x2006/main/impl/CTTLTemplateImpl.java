/*
 * XML Type:  CT_TLTemplate
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTemplate(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTemplateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate
{
    
    public CTTLTemplateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TNLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tnLst");
    private static final javax.xml.namespace.QName LVL$2 = 
        new javax.xml.namespace.QName("", "lvl");
    
    
    /**
     * Gets the "tnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(TNLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tnLst" element
     */
    public void setTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList tnLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(TNLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(TNLST$0);
            }
            target.set(tnLst);
        }
    }
    
    /**
     * Appends and returns a new empty "tnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(TNLST$0);
            return target;
        }
    }
    
    /**
     * Gets the "lvl" attribute
     */
    public long getLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LVL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LVL$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "lvl" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LVL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(LVL$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl" attribute
     */
    public boolean isSetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LVL$2) != null;
        }
    }
    
    /**
     * Sets the "lvl" attribute
     */
    public void setLvl(long lvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LVL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LVL$2);
            }
            target.setLongValue(lvl);
        }
    }
    
    /**
     * Sets (as xml) the "lvl" attribute
     */
    public void xsetLvl(org.apache.xmlbeans.XmlUnsignedInt lvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LVL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(LVL$2);
            }
            target.set(lvl);
        }
    }
    
    /**
     * Unsets the "lvl" attribute
     */
    public void unsetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LVL$2);
        }
    }
}
