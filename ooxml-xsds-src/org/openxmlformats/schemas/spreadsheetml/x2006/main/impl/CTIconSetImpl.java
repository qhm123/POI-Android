/*
 * XML Type:  CT_IconSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_IconSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTIconSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet
{
    
    public CTIconSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CFVO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfvo");
    private static final javax.xml.namespace.QName ICONSET$2 = 
        new javax.xml.namespace.QName("", "iconSet");
    private static final javax.xml.namespace.QName SHOWVALUE$4 = 
        new javax.xml.namespace.QName("", "showValue");
    private static final javax.xml.namespace.QName PERCENT$6 = 
        new javax.xml.namespace.QName("", "percent");
    private static final javax.xml.namespace.QName REVERSE$8 = 
        new javax.xml.namespace.QName("", "reverse");
    
    
    /**
     * Gets a List of "cfvo" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo> getCfvoList()
    {
        final class CfvoList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo get(int i)
                { return CTIconSetImpl.this.getCfvoArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo old = CTIconSetImpl.this.getCfvoArray(i);
                CTIconSetImpl.this.setCfvoArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo o)
                { CTIconSetImpl.this.insertNewCfvo(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo old = CTIconSetImpl.this.getCfvoArray(i);
                CTIconSetImpl.this.removeCfvo(i);
                return old;
            }
            
            public int size()
                { return CTIconSetImpl.this.sizeOfCfvoArray(); }
            
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
     * Gets the "iconSet" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum getIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONSET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ICONSET$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "iconSet" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType xgetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_store().find_attribute_user(ICONSET$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_default_attribute_value(ICONSET$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "iconSet" attribute
     */
    public boolean isSetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ICONSET$2) != null;
        }
    }
    
    /**
     * Sets the "iconSet" attribute
     */
    public void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum iconSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONSET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICONSET$2);
            }
            target.setEnumValue(iconSet);
        }
    }
    
    /**
     * Sets (as xml) the "iconSet" attribute
     */
    public void xsetIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType iconSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_store().find_attribute_user(ICONSET$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_store().add_attribute_user(ICONSET$2);
            }
            target.set(iconSet);
        }
    }
    
    /**
     * Unsets the "iconSet" attribute
     */
    public void unsetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ICONSET$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVALUE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWVALUE$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVALUE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWVALUE$4);
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
            return get_store().find_attribute_user(SHOWVALUE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVALUE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWVALUE$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVALUE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWVALUE$4);
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
            get_store().remove_attribute(SHOWVALUE$4);
        }
    }
    
    /**
     * Gets the "percent" attribute
     */
    public boolean getPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PERCENT$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "percent" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERCENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PERCENT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "percent" attribute
     */
    public boolean isSetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERCENT$6) != null;
        }
    }
    
    /**
     * Sets the "percent" attribute
     */
    public void setPercent(boolean percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERCENT$6);
            }
            target.setBooleanValue(percent);
        }
    }
    
    /**
     * Sets (as xml) the "percent" attribute
     */
    public void xsetPercent(org.apache.xmlbeans.XmlBoolean percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERCENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PERCENT$6);
            }
            target.set(percent);
        }
    }
    
    /**
     * Unsets the "percent" attribute
     */
    public void unsetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERCENT$6);
        }
    }
    
    /**
     * Gets the "reverse" attribute
     */
    public boolean getReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVERSE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REVERSE$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "reverse" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REVERSE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REVERSE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "reverse" attribute
     */
    public boolean isSetReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REVERSE$8) != null;
        }
    }
    
    /**
     * Sets the "reverse" attribute
     */
    public void setReverse(boolean reverse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVERSE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVERSE$8);
            }
            target.setBooleanValue(reverse);
        }
    }
    
    /**
     * Sets (as xml) the "reverse" attribute
     */
    public void xsetReverse(org.apache.xmlbeans.XmlBoolean reverse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REVERSE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REVERSE$8);
            }
            target.set(reverse);
        }
    }
    
    /**
     * Unsets the "reverse" attribute
     */
    public void unsetReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REVERSE$8);
        }
    }
}
