/*
 * XML Type:  CT_OleItem
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_OleItem(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTOleItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleItem
{
    
    public CTOleItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ICON$2 = 
        new javax.xml.namespace.QName("", "icon");
    private static final javax.xml.namespace.QName ADVISE$4 = 
        new javax.xml.namespace.QName("", "advise");
    private static final javax.xml.namespace.QName PREFERPIC$6 = 
        new javax.xml.namespace.QName("", "preferPic");
    
    
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
     * Gets the "icon" attribute
     */
    public boolean getIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ICON$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "icon" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ICON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ICON$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "icon" attribute
     */
    public boolean isSetIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ICON$2) != null;
        }
    }
    
    /**
     * Sets the "icon" attribute
     */
    public void setIcon(boolean icon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICON$2);
            }
            target.setBooleanValue(icon);
        }
    }
    
    /**
     * Sets (as xml) the "icon" attribute
     */
    public void xsetIcon(org.apache.xmlbeans.XmlBoolean icon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ICON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ICON$2);
            }
            target.set(icon);
        }
    }
    
    /**
     * Unsets the "icon" attribute
     */
    public void unsetIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ICON$2);
        }
    }
    
    /**
     * Gets the "advise" attribute
     */
    public boolean getAdvise()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVISE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADVISE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "advise" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAdvise()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVISE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ADVISE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "advise" attribute
     */
    public boolean isSetAdvise()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADVISE$4) != null;
        }
    }
    
    /**
     * Sets the "advise" attribute
     */
    public void setAdvise(boolean advise)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVISE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADVISE$4);
            }
            target.setBooleanValue(advise);
        }
    }
    
    /**
     * Sets (as xml) the "advise" attribute
     */
    public void xsetAdvise(org.apache.xmlbeans.XmlBoolean advise)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVISE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADVISE$4);
            }
            target.set(advise);
        }
    }
    
    /**
     * Unsets the "advise" attribute
     */
    public void unsetAdvise()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADVISE$4);
        }
    }
    
    /**
     * Gets the "preferPic" attribute
     */
    public boolean getPreferPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERPIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREFERPIC$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preferPic" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreferPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERPIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PREFERPIC$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "preferPic" attribute
     */
    public boolean isSetPreferPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREFERPIC$6) != null;
        }
    }
    
    /**
     * Sets the "preferPic" attribute
     */
    public void setPreferPic(boolean preferPic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERPIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERPIC$6);
            }
            target.setBooleanValue(preferPic);
        }
    }
    
    /**
     * Sets (as xml) the "preferPic" attribute
     */
    public void xsetPreferPic(org.apache.xmlbeans.XmlBoolean preferPic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERPIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PREFERPIC$6);
            }
            target.set(preferPic);
        }
    }
    
    /**
     * Unsets the "preferPic" attribute
     */
    public void unsetPreferPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREFERPIC$6);
        }
    }
}
