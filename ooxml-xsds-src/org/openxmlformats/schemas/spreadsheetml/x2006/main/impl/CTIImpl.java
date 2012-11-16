/*
 * XML Type:  CT_I
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_I(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTIImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI
{
    
    public CTIImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "x");
    private static final javax.xml.namespace.QName T$2 = 
        new javax.xml.namespace.QName("", "t");
    private static final javax.xml.namespace.QName R$4 = 
        new javax.xml.namespace.QName("", "r");
    private static final javax.xml.namespace.QName I$6 = 
        new javax.xml.namespace.QName("", "i");
    
    
    /**
     * Gets a List of "x" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX> getXList()
    {
        final class XList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX get(int i)
                { return CTIImpl.this.getXArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTIImpl.this.getXArray(i);
                CTIImpl.this.setXArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
                { CTIImpl.this.insertNewX(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTIImpl.this.getXArray(i);
                CTIImpl.this.removeX(i);
                return old;
            }
            
            public int size()
                { return CTIImpl.this.sizeOfXArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XList();
        }
    }
    
    /**
     * Gets array of all "x" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] getXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(X$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX getXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().find_element_user(X$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "x" element
     */
    public int sizeOfXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X$0);
        }
    }
    
    /**
     * Sets array of all "x" element
     */
    public void setXArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] xArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xArray, X$0);
        }
    }
    
    /**
     * Sets ith "x" element
     */
    public void setXArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().find_element_user(X$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(x);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX insertNewX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().insert_element_user(X$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX addNewX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().add_element_user(X$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "x" element
     */
    public void removeX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X$0, i);
        }
    }
    
    /**
     * Gets the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(T$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_default_attribute_value(T$2);
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
            return get_store().find_attribute_user(T$2) != null;
        }
    }
    
    /**
     * Sets the "t" attribute
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T$2);
            }
            target.setEnumValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" attribute
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_store().add_attribute_user(T$2);
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
            get_store().remove_attribute(T$2);
        }
    }
    
    /**
     * Gets the "r" attribute
     */
    public long getR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(R$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "r" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(R$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(R$4);
            }
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
            return get_store().find_attribute_user(R$4) != null;
        }
    }
    
    /**
     * Sets the "r" attribute
     */
    public void setR(long r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$4);
            }
            target.setLongValue(r);
        }
    }
    
    /**
     * Sets (as xml) the "r" attribute
     */
    public void xsetR(org.apache.xmlbeans.XmlUnsignedInt r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(R$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(R$4);
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
            get_store().remove_attribute(R$4);
        }
    }
    
    /**
     * Gets the "i" attribute
     */
    public long getI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(I$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "i" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(I$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(I$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "i" attribute
     */
    public boolean isSetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(I$6) != null;
        }
    }
    
    /**
     * Sets the "i" attribute
     */
    public void setI(long iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(I$6);
            }
            target.setLongValue(iValue);
        }
    }
    
    /**
     * Sets (as xml) the "i" attribute
     */
    public void xsetI(org.apache.xmlbeans.XmlUnsignedInt iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(I$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(I$6);
            }
            target.set(iValue);
        }
    }
    
    /**
     * Unsets the "i" attribute
     */
    public void unsetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(I$6);
        }
    }
}
