/*
 * XML Type:  CT_DataBar
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataBar(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataBarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar
{
    
    public CTDataBarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CFVO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfvo");
    private static final javax.xml.namespace.QName COLOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
    private static final javax.xml.namespace.QName MINLENGTH$4 = 
        new javax.xml.namespace.QName("", "minLength");
    private static final javax.xml.namespace.QName MAXLENGTH$6 = 
        new javax.xml.namespace.QName("", "maxLength");
    private static final javax.xml.namespace.QName SHOWVALUE$8 = 
        new javax.xml.namespace.QName("", "showValue");
    
    
    /**
     * Gets a List of "cfvo" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo> getCfvoList()
    {
        final class CfvoList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo get(int i)
                { return CTDataBarImpl.this.getCfvoArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo old = CTDataBarImpl.this.getCfvoArray(i);
                CTDataBarImpl.this.setCfvoArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo o)
                { CTDataBarImpl.this.insertNewCfvo(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo old = CTDataBarImpl.this.getCfvoArray(i);
                CTDataBarImpl.this.removeCfvo(i);
                return old;
            }
            
            public int size()
                { return CTDataBarImpl.this.sizeOfCfvoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CfvoList();
        }
    }
    
    /**
     * Gets array of all "cfvo" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] getCfvoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CFVO$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cfvo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo getCfvoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().find_element_user(CFVO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cfvo" element
     */
    public int sizeOfCfvoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CFVO$0);
        }
    }
    
    /**
     * Sets array of all "cfvo" element
     */
    public void setCfvoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] cfvoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cfvoArray, CFVO$0);
        }
    }
    
    /**
     * Sets ith "cfvo" element
     */
    public void setCfvoArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo cfvo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().find_element_user(CFVO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cfvo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cfvo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo insertNewCfvo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().insert_element_user(CFVO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cfvo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo addNewCfvo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().add_element_user(CFVO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cfvo" element
     */
    public void removeCfvo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CFVO$0, i);
        }
    }
    
    /**
     * Gets the "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "color" element
     */
    public void setColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(COLOR$2);
            }
            target.set(color);
        }
    }
    
    /**
     * Appends and returns a new empty "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(COLOR$2);
            return target;
        }
    }
    
    /**
     * Gets the "minLength" attribute
     */
    public long getMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINLENGTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINLENGTH$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "minLength" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MINLENGTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(MINLENGTH$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "minLength" attribute
     */
    public boolean isSetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINLENGTH$4) != null;
        }
    }
    
    /**
     * Sets the "minLength" attribute
     */
    public void setMinLength(long minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINLENGTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINLENGTH$4);
            }
            target.setLongValue(minLength);
        }
    }
    
    /**
     * Sets (as xml) the "minLength" attribute
     */
    public void xsetMinLength(org.apache.xmlbeans.XmlUnsignedInt minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MINLENGTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MINLENGTH$4);
            }
            target.set(minLength);
        }
    }
    
    /**
     * Unsets the "minLength" attribute
     */
    public void unsetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINLENGTH$4);
        }
    }
    
    /**
     * Gets the "maxLength" attribute
     */
    public long getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXLENGTH$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxLength" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAXLENGTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(MAXLENGTH$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "maxLength" attribute
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXLENGTH$6) != null;
        }
    }
    
    /**
     * Sets the "maxLength" attribute
     */
    public void setMaxLength(long maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXLENGTH$6);
            }
            target.setLongValue(maxLength);
        }
    }
    
    /**
     * Sets (as xml) the "maxLength" attribute
     */
    public void xsetMaxLength(org.apache.xmlbeans.XmlUnsignedInt maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAXLENGTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MAXLENGTH$6);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Unsets the "maxLength" attribute
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXLENGTH$6);
        }
    }
    
    /**
     * Gets the "showValue" attribute
     */
    public boolean getShowValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWVALUE$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showValue" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWVALUE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "showValue" attribute
     */
    public boolean isSetShowValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWVALUE$8) != null;
        }
    }
    
    /**
     * Sets the "showValue" attribute
     */
    public void setShowValue(boolean showValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWVALUE$8);
            }
            target.setBooleanValue(showValue);
        }
    }
    
    /**
     * Sets (as xml) the "showValue" attribute
     */
    public void xsetShowValue(org.apache.xmlbeans.XmlBoolean showValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWVALUE$8);
            }
            target.set(showValue);
        }
    }
    
    /**
     * Unsets the "showValue" attribute
     */
    public void unsetShowValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWVALUE$8);
        }
    }
}
