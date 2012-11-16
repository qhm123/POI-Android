/*
 * XML Type:  CT_DdeItem
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DdeItem(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDdeItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItem
{
    
    public CTDdeItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "values");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName OLE$4 = 
        new javax.xml.namespace.QName("", "ole");
    private static final javax.xml.namespace.QName ADVISE$6 = 
        new javax.xml.namespace.QName("", "advise");
    private static final javax.xml.namespace.QName PREFERPIC$8 = 
        new javax.xml.namespace.QName("", "preferPic");
    
    
    /**
     * Gets the "values" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "values" element
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUES$0) != 0;
        }
    }
    
    /**
     * Sets the "values" element
     */
    public void setValues(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues)get_store().add_element_user(VALUES$0);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "values" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues)get_store().add_element_user(VALUES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "values" element
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUES$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$2);
            }
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_default_attribute_value(NAME$2);
            }
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
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$2);
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
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "ole" attribute
     */
    public boolean getOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OLE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ole" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OLE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "ole" attribute
     */
    public boolean isSetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLE$4) != null;
        }
    }
    
    /**
     * Sets the "ole" attribute
     */
    public void setOle(boolean ole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLE$4);
            }
            target.setBooleanValue(ole);
        }
    }
    
    /**
     * Sets (as xml) the "ole" attribute
     */
    public void xsetOle(org.apache.xmlbeans.XmlBoolean ole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OLE$4);
            }
            target.set(ole);
        }
    }
    
    /**
     * Unsets the "ole" attribute
     */
    public void unsetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVISE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADVISE$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVISE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ADVISE$6);
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
            return get_store().find_attribute_user(ADVISE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVISE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADVISE$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADVISE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADVISE$6);
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
            get_store().remove_attribute(ADVISE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERPIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREFERPIC$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERPIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PREFERPIC$8);
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
            return get_store().find_attribute_user(PREFERPIC$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERPIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERPIC$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERPIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PREFERPIC$8);
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
            get_store().remove_attribute(PREFERPIC$8);
        }
    }
}
