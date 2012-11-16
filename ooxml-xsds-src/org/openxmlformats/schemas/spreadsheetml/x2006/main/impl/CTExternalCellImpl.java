/*
 * XML Type:  CT_ExternalCell
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalCell(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalCellImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell
{
    
    public CTExternalCellImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "v");
    private static final javax.xml.namespace.QName R$2 = 
        new javax.xml.namespace.QName("", "r");
    private static final javax.xml.namespace.QName T$4 = 
        new javax.xml.namespace.QName("", "t");
    private static final javax.xml.namespace.QName VM$6 = 
        new javax.xml.namespace.QName("", "vm");
    
    
    /**
     * Gets the "v" element
     */
    public java.lang.String getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "v" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(V$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "v" element
     */
    public boolean isSetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V$0) != 0;
        }
    }
    
    /**
     * Sets the "v" element
     */
    public void setV(java.lang.String v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(V$0);
            }
            target.setStringValue(v);
        }
    }
    
    /**
     * Sets (as xml) the "v" element
     */
    public void xsetV(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(V$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(V$0);
            }
            target.set(v);
        }
    }
    
    /**
     * Unsets the "v" element
     */
    public void unsetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V$0, 0);
        }
    }
    
    /**
     * Gets the "r" attribute
     */
    public java.lang.String getR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "r" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$2);
            return target;
        }
    }
    
    /**
     * True if has "r" attribute
     */
    public boolean isSetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(R$2) != null;
        }
    }
    
    /**
     * Sets the "r" attribute
     */
    public void setR(java.lang.String r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$2);
            }
            target.setStringValue(r);
        }
    }
    
    /**
     * Sets (as xml) the "r" attribute
     */
    public void xsetR(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(R$2);
            }
            target.set(r);
        }
    }
    
    /**
     * Unsets the "r" attribute
     */
    public void unsetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(R$2);
        }
    }
    
    /**
     * Gets the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(T$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(T$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_default_attribute_value(T$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "t" attribute
     */
    public boolean isSetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(T$4) != null;
        }
    }
    
    /**
     * Sets the "t" attribute
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T$4);
            }
            target.setEnumValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" attribute
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(T$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().add_attribute_user(T$4);
            }
            target.set(t);
        }
    }
    
    /**
     * Unsets the "t" attribute
     */
    public void unsetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(T$4);
        }
    }
    
    /**
     * Gets the "vm" attribute
     */
    public long getVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VM$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "vm" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(VM$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "vm" attribute
     */
    public boolean isSetVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VM$6) != null;
        }
    }
    
    /**
     * Sets the "vm" attribute
     */
    public void setVm(long vm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VM$6);
            }
            target.setLongValue(vm);
        }
    }
    
    /**
     * Sets (as xml) the "vm" attribute
     */
    public void xsetVm(org.apache.xmlbeans.XmlUnsignedInt vm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(VM$6);
            }
            target.set(vm);
        }
    }
    
    /**
     * Unsets the "vm" attribute
     */
    public void unsetVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VM$6);
        }
    }
}
