/*
 * XML Type:  CT_Boolean
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Boolean(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBooleanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean
{
    
    public CTBooleanImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "x");
    private static final javax.xml.namespace.QName V$2 = 
        new javax.xml.namespace.QName("", "v");
    private static final javax.xml.namespace.QName U$4 = 
        new javax.xml.namespace.QName("", "u");
    private static final javax.xml.namespace.QName F$6 = 
        new javax.xml.namespace.QName("", "f");
    private static final javax.xml.namespace.QName C$8 = 
        new javax.xml.namespace.QName("", "c");
    private static final javax.xml.namespace.QName CP$10 = 
        new javax.xml.namespace.QName("", "cp");
    
    
    /**
     * Gets a List of "x" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX> getXList()
    {
        final class XList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX get(int i)
                { return CTBooleanImpl.this.getXArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTBooleanImpl.this.getXArray(i);
                CTBooleanImpl.this.setXArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
                { CTBooleanImpl.this.insertNewX(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTBooleanImpl.this.getXArray(i);
                CTBooleanImpl.this.removeX(i);
                return old;
            }
            
            public int size()
                { return CTBooleanImpl.this.sizeOfXArray(); }
            
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
     * Gets the "v" attribute
     */
    public boolean getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "v" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(V$2);
            return target;
        }
    }
    
    /**
     * Sets the "v" attribute
     */
    public void setV(boolean v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(V$2);
            }
            target.setBooleanValue(v);
        }
    }
    
    /**
     * Sets (as xml) the "v" attribute
     */
    public void xsetV(org.apache.xmlbeans.XmlBoolean v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(V$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(V$2);
            }
            target.set(v);
        }
    }
    
    /**
     * Gets the "u" attribute
     */
    public boolean getU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(U$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "u" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(U$4);
            return target;
        }
    }
    
    /**
     * True if has "u" attribute
     */
    public boolean isSetU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(U$4) != null;
        }
    }
    
    /**
     * Sets the "u" attribute
     */
    public void setU(boolean u)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(U$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(U$4);
            }
            target.setBooleanValue(u);
        }
    }
    
    /**
     * Sets (as xml) the "u" attribute
     */
    public void xsetU(org.apache.xmlbeans.XmlBoolean u)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(U$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(U$4);
            }
            target.set(u);
        }
    }
    
    /**
     * Unsets the "u" attribute
     */
    public void unsetU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(U$4);
        }
    }
    
    /**
     * Gets the "f" attribute
     */
    public boolean getF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(F$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "f" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(F$6);
            return target;
        }
    }
    
    /**
     * True if has "f" attribute
     */
    public boolean isSetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(F$6) != null;
        }
    }
    
    /**
     * Sets the "f" attribute
     */
    public void setF(boolean f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(F$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(F$6);
            }
            target.setBooleanValue(f);
        }
    }
    
    /**
     * Sets (as xml) the "f" attribute
     */
    public void xsetF(org.apache.xmlbeans.XmlBoolean f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(F$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(F$6);
            }
            target.set(f);
        }
    }
    
    /**
     * Unsets the "f" attribute
     */
    public void unsetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(F$6);
        }
    }
    
    /**
     * Gets the "c" attribute
     */
    public java.lang.String getC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "c" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(C$8);
            return target;
        }
    }
    
    /**
     * True if has "c" attribute
     */
    public boolean isSetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(C$8) != null;
        }
    }
    
    /**
     * Sets the "c" attribute
     */
    public void setC(java.lang.String c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(C$8);
            }
            target.setStringValue(c);
        }
    }
    
    /**
     * Sets (as xml) the "c" attribute
     */
    public void xsetC(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(C$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(C$8);
            }
            target.set(c);
        }
    }
    
    /**
     * Unsets the "c" attribute
     */
    public void unsetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(C$8);
        }
    }
    
    /**
     * Gets the "cp" attribute
     */
    public long getCp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CP$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cp" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CP$10);
            return target;
        }
    }
    
    /**
     * True if has "cp" attribute
     */
    public boolean isSetCp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CP$10) != null;
        }
    }
    
    /**
     * Sets the "cp" attribute
     */
    public void setCp(long cp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CP$10);
            }
            target.setLongValue(cp);
        }
    }
    
    /**
     * Sets (as xml) the "cp" attribute
     */
    public void xsetCp(org.apache.xmlbeans.XmlUnsignedInt cp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CP$10);
            }
            target.set(cp);
        }
    }
    
    /**
     * Unsets the "cp" attribute
     */
    public void unsetCp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CP$10);
        }
    }
}
