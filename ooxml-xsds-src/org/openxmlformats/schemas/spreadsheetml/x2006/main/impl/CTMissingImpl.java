/*
 * XML Type:  CT_Missing
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Missing(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMissingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing
{
    
    public CTMissingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TPLS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tpls");
    private static final javax.xml.namespace.QName X$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "x");
    private static final javax.xml.namespace.QName U$4 = 
        new javax.xml.namespace.QName("", "u");
    private static final javax.xml.namespace.QName F$6 = 
        new javax.xml.namespace.QName("", "f");
    private static final javax.xml.namespace.QName C$8 = 
        new javax.xml.namespace.QName("", "c");
    private static final javax.xml.namespace.QName CP$10 = 
        new javax.xml.namespace.QName("", "cp");
    private static final javax.xml.namespace.QName IN$12 = 
        new javax.xml.namespace.QName("", "in");
    private static final javax.xml.namespace.QName BC$14 = 
        new javax.xml.namespace.QName("", "bc");
    private static final javax.xml.namespace.QName FC$16 = 
        new javax.xml.namespace.QName("", "fc");
    private static final javax.xml.namespace.QName I$18 = 
        new javax.xml.namespace.QName("", "i");
    private static final javax.xml.namespace.QName UN$20 = 
        new javax.xml.namespace.QName("", "un");
    private static final javax.xml.namespace.QName ST$22 = 
        new javax.xml.namespace.QName("", "st");
    private static final javax.xml.namespace.QName B$24 = 
        new javax.xml.namespace.QName("", "b");
    
    
    /**
     * Gets a List of "tpls" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples> getTplsList()
    {
        final class TplsList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples get(int i)
                { return CTMissingImpl.this.getTplsArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples old = CTMissingImpl.this.getTplsArray(i);
                CTMissingImpl.this.setTplsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples o)
                { CTMissingImpl.this.insertNewTpls(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples old = CTMissingImpl.this.getTplsArray(i);
                CTMissingImpl.this.removeTpls(i);
                return old;
            }
            
            public int size()
                { return CTMissingImpl.this.sizeOfTplsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TplsList();
        }
    }
    
    /**
     * Gets array of all "tpls" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] getTplsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TPLS$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getTplsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(TPLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tpls" element
     */
    public int sizeOfTplsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TPLS$0);
        }
    }
    
    /**
     * Sets array of all "tpls" element
     */
    public void setTplsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] tplsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tplsArray, TPLS$0);
        }
    }
    
    /**
     * Sets ith "tpls" element
     */
    public void setTplsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples tpls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(TPLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tpls);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples insertNewTpls(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().insert_element_user(TPLS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewTpls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().add_element_user(TPLS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tpls" element
     */
    public void removeTpls(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TPLS$0, i);
        }
    }
    
    /**
     * Gets a List of "x" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX> getXList()
    {
        final class XList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX get(int i)
                { return CTMissingImpl.this.getXArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTMissingImpl.this.getXArray(i);
                CTMissingImpl.this.setXArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
                { CTMissingImpl.this.insertNewX(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTMissingImpl.this.getXArray(i);
                CTMissingImpl.this.removeX(i);
                return old;
            }
            
            public int size()
                { return CTMissingImpl.this.sizeOfXArray(); }
            
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
            get_store().find_all_element_users(X$2, targetList);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().find_element_user(X$2, i);
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
            return get_store().count_elements(X$2);
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
            arraySetterHelper(xArray, X$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().find_element_user(X$2, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().insert_element_user(X$2, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().add_element_user(X$2);
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
            get_store().remove_element(X$2, i);
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
    
    /**
     * Gets the "in" attribute
     */
    public long getIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IN$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "in" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IN$12);
            return target;
        }
    }
    
    /**
     * True if has "in" attribute
     */
    public boolean isSetIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IN$12) != null;
        }
    }
    
    /**
     * Sets the "in" attribute
     */
    public void setIn(long in)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IN$12);
            }
            target.setLongValue(in);
        }
    }
    
    /**
     * Sets (as xml) the "in" attribute
     */
    public void xsetIn(org.apache.xmlbeans.XmlUnsignedInt in)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(IN$12);
            }
            target.set(in);
        }
    }
    
    /**
     * Unsets the "in" attribute
     */
    public void unsetIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IN$12);
        }
    }
    
    /**
     * Gets the "bc" attribute
     */
    public byte[] getBc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BC$14);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "bc" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetBc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(BC$14);
            return target;
        }
    }
    
    /**
     * True if has "bc" attribute
     */
    public boolean isSetBc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BC$14) != null;
        }
    }
    
    /**
     * Sets the "bc" attribute
     */
    public void setBc(byte[] bc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BC$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BC$14);
            }
            target.setByteArrayValue(bc);
        }
    }
    
    /**
     * Sets (as xml) the "bc" attribute
     */
    public void xsetBc(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex bc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(BC$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().add_attribute_user(BC$14);
            }
            target.set(bc);
        }
    }
    
    /**
     * Unsets the "bc" attribute
     */
    public void unsetBc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BC$14);
        }
    }
    
    /**
     * Gets the "fc" attribute
     */
    public byte[] getFc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FC$16);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "fc" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetFc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(FC$16);
            return target;
        }
    }
    
    /**
     * True if has "fc" attribute
     */
    public boolean isSetFc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FC$16) != null;
        }
    }
    
    /**
     * Sets the "fc" attribute
     */
    public void setFc(byte[] fc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FC$16);
            }
            target.setByteArrayValue(fc);
        }
    }
    
    /**
     * Sets (as xml) the "fc" attribute
     */
    public void xsetFc(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex fc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(FC$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().add_attribute_user(FC$16);
            }
            target.set(fc);
        }
    }
    
    /**
     * Unsets the "fc" attribute
     */
    public void unsetFc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FC$16);
        }
    }
    
    /**
     * Gets the "i" attribute
     */
    public boolean getI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(I$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "i" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(I$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(I$18);
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
            return get_store().find_attribute_user(I$18) != null;
        }
    }
    
    /**
     * Sets the "i" attribute
     */
    public void setI(boolean iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(I$18);
            }
            target.setBooleanValue(iValue);
        }
    }
    
    /**
     * Sets (as xml) the "i" attribute
     */
    public void xsetI(org.apache.xmlbeans.XmlBoolean iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(I$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(I$18);
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
            get_store().remove_attribute(I$18);
        }
    }
    
    /**
     * Gets the "un" attribute
     */
    public boolean getUn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UN$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "un" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UN$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "un" attribute
     */
    public boolean isSetUn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UN$20) != null;
        }
    }
    
    /**
     * Sets the "un" attribute
     */
    public void setUn(boolean un)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UN$20);
            }
            target.setBooleanValue(un);
        }
    }
    
    /**
     * Sets (as xml) the "un" attribute
     */
    public void xsetUn(org.apache.xmlbeans.XmlBoolean un)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UN$20);
            }
            target.set(un);
        }
    }
    
    /**
     * Unsets the "un" attribute
     */
    public void unsetUn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UN$20);
        }
    }
    
    /**
     * Gets the "st" attribute
     */
    public boolean getSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ST$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "st" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ST$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ST$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "st" attribute
     */
    public boolean isSetSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ST$22) != null;
        }
    }
    
    /**
     * Sets the "st" attribute
     */
    public void setSt(boolean st)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ST$22);
            }
            target.setBooleanValue(st);
        }
    }
    
    /**
     * Sets (as xml) the "st" attribute
     */
    public void xsetSt(org.apache.xmlbeans.XmlBoolean st)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ST$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ST$22);
            }
            target.set(st);
        }
    }
    
    /**
     * Unsets the "st" attribute
     */
    public void unsetSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ST$22);
        }
    }
    
    /**
     * Gets the "b" attribute
     */
    public boolean getB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(B$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "b" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(B$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(B$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "b" attribute
     */
    public boolean isSetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(B$24) != null;
        }
    }
    
    /**
     * Sets the "b" attribute
     */
    public void setB(boolean b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(B$24);
            }
            target.setBooleanValue(b);
        }
    }
    
    /**
     * Sets (as xml) the "b" attribute
     */
    public void xsetB(org.apache.xmlbeans.XmlBoolean b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(B$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(B$24);
            }
            target.set(b);
        }
    }
    
    /**
     * Unsets the "b" attribute
     */
    public void unsetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(B$24);
        }
    }
}
