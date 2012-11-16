/*
 * XML Type:  CT_FieldGroup
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FieldGroup(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFieldGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup
{
    
    public CTFieldGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rangePr");
    private static final javax.xml.namespace.QName DISCRETEPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "discretePr");
    private static final javax.xml.namespace.QName GROUPITEMS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "groupItems");
    private static final javax.xml.namespace.QName PAR$6 = 
        new javax.xml.namespace.QName("", "par");
    private static final javax.xml.namespace.QName BASE$8 = 
        new javax.xml.namespace.QName("", "base");
    
    
    /**
     * Gets the "rangePr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr getRangePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr)get_store().find_element_user(RANGEPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rangePr" element
     */
    public boolean isSetRangePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANGEPR$0) != 0;
        }
    }
    
    /**
     * Sets the "rangePr" element
     */
    public void setRangePr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr rangePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr)get_store().find_element_user(RANGEPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr)get_store().add_element_user(RANGEPR$0);
            }
            target.set(rangePr);
        }
    }
    
    /**
     * Appends and returns a new empty "rangePr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr addNewRangePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr)get_store().add_element_user(RANGEPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rangePr" element
     */
    public void unsetRangePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANGEPR$0, 0);
        }
    }
    
    /**
     * Gets the "discretePr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr getDiscretePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr)get_store().find_element_user(DISCRETEPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discretePr" element
     */
    public boolean isSetDiscretePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCRETEPR$2) != 0;
        }
    }
    
    /**
     * Sets the "discretePr" element
     */
    public void setDiscretePr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr discretePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr)get_store().find_element_user(DISCRETEPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr)get_store().add_element_user(DISCRETEPR$2);
            }
            target.set(discretePr);
        }
    }
    
    /**
     * Appends and returns a new empty "discretePr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr addNewDiscretePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr)get_store().add_element_user(DISCRETEPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "discretePr" element
     */
    public void unsetDiscretePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCRETEPR$2, 0);
        }
    }
    
    /**
     * Gets the "groupItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems getGroupItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems)get_store().find_element_user(GROUPITEMS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "groupItems" element
     */
    public boolean isSetGroupItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPITEMS$4) != 0;
        }
    }
    
    /**
     * Sets the "groupItems" element
     */
    public void setGroupItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems groupItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems)get_store().find_element_user(GROUPITEMS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems)get_store().add_element_user(GROUPITEMS$4);
            }
            target.set(groupItems);
        }
    }
    
    /**
     * Appends and returns a new empty "groupItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems addNewGroupItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems)get_store().add_element_user(GROUPITEMS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "groupItems" element
     */
    public void unsetGroupItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPITEMS$4, 0);
        }
    }
    
    /**
     * Gets the "par" attribute
     */
    public long getPar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAR$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "par" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PAR$6);
            return target;
        }
    }
    
    /**
     * True if has "par" attribute
     */
    public boolean isSetPar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAR$6) != null;
        }
    }
    
    /**
     * Sets the "par" attribute
     */
    public void setPar(long par)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAR$6);
            }
            target.setLongValue(par);
        }
    }
    
    /**
     * Sets (as xml) the "par" attribute
     */
    public void xsetPar(org.apache.xmlbeans.XmlUnsignedInt par)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PAR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PAR$6);
            }
            target.set(par);
        }
    }
    
    /**
     * Unsets the "par" attribute
     */
    public void unsetPar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAR$6);
        }
    }
    
    /**
     * Gets the "base" attribute
     */
    public long getBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "base" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BASE$8);
            return target;
        }
    }
    
    /**
     * True if has "base" attribute
     */
    public boolean isSetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASE$8) != null;
        }
    }
    
    /**
     * Sets the "base" attribute
     */
    public void setBase(long base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$8);
            }
            target.setLongValue(base);
        }
    }
    
    /**
     * Sets (as xml) the "base" attribute
     */
    public void xsetBase(org.apache.xmlbeans.XmlUnsignedInt base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BASE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(BASE$8);
            }
            target.set(base);
        }
    }
    
    /**
     * Unsets the "base" attribute
     */
    public void unsetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASE$8);
        }
    }
}
