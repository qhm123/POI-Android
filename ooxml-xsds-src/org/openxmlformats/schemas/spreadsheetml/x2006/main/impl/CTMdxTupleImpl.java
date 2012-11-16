/*
 * XML Type:  CT_MdxTuple
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MdxTuple(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMdxTupleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple
{
    
    public CTMdxTupleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName N$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "n");
    private static final javax.xml.namespace.QName C$2 = 
        new javax.xml.namespace.QName("", "c");
    private static final javax.xml.namespace.QName CT$4 = 
        new javax.xml.namespace.QName("", "ct");
    private static final javax.xml.namespace.QName SI$6 = 
        new javax.xml.namespace.QName("", "si");
    private static final javax.xml.namespace.QName FI$8 = 
        new javax.xml.namespace.QName("", "fi");
    private static final javax.xml.namespace.QName BC$10 = 
        new javax.xml.namespace.QName("", "bc");
    private static final javax.xml.namespace.QName FC$12 = 
        new javax.xml.namespace.QName("", "fc");
    private static final javax.xml.namespace.QName I$14 = 
        new javax.xml.namespace.QName("", "i");
    private static final javax.xml.namespace.QName U$16 = 
        new javax.xml.namespace.QName("", "u");
    private static final javax.xml.namespace.QName ST$18 = 
        new javax.xml.namespace.QName("", "st");
    private static final javax.xml.namespace.QName B$20 = 
        new javax.xml.namespace.QName("", "b");
    
    
    /**
     * Gets a List of "n" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex> getNList()
    {
        final class NList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex get(int i)
                { return CTMdxTupleImpl.this.getNArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex old = CTMdxTupleImpl.this.getNArray(i);
                CTMdxTupleImpl.this.setNArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex o)
                { CTMdxTupleImpl.this.insertNewN(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex old = CTMdxTupleImpl.this.getNArray(i);
                CTMdxTupleImpl.this.removeN(i);
                return old;
            }
            
            public int size()
                { return CTMdxTupleImpl.this.sizeOfNArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NList();
        }
    }
    
    /**
     * Gets array of all "n" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] getNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(N$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex getNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().find_element_user(N$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "n" element
     */
    public int sizeOfNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(N$0);
        }
    }
    
    /**
     * Sets array of all "n" element
     */
    public void setNArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] nArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nArray, N$0);
        }
    }
    
    /**
     * Sets ith "n" element
     */
    public void setNArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().find_element_user(N$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(n);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex insertNewN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().insert_element_user(N$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex addNewN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().add_element_user(N$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "n" element
     */
    public void removeN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(N$0, i);
        }
    }
    
    /**
     * Gets the "c" attribute
     */
    public long getC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(C$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "c" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(C$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(C$2);
            }
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
            return get_store().find_attribute_user(C$2) != null;
        }
    }
    
    /**
     * Sets the "c" attribute
     */
    public void setC(long c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(C$2);
            }
            target.setLongValue(c);
        }
    }
    
    /**
     * Sets (as xml) the "c" attribute
     */
    public void xsetC(org.apache.xmlbeans.XmlUnsignedInt c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(C$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(C$2);
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
            get_store().remove_attribute(C$2);
        }
    }
    
    /**
     * Gets the "ct" attribute
     */
    public java.lang.String getCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ct" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CT$4);
            return target;
        }
    }
    
    /**
     * True if has "ct" attribute
     */
    public boolean isSetCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CT$4) != null;
        }
    }
    
    /**
     * Sets the "ct" attribute
     */
    public void setCt(java.lang.String ct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CT$4);
            }
            target.setStringValue(ct);
        }
    }
    
    /**
     * Sets (as xml) the "ct" attribute
     */
    public void xsetCt(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring ct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CT$4);
            }
            target.set(ct);
        }
    }
    
    /**
     * Unsets the "ct" attribute
     */
    public void unsetCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CT$4);
        }
    }
    
    /**
     * Gets the "si" attribute
     */
    public long getSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SI$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "si" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SI$6);
            return target;
        }
    }
    
    /**
     * True if has "si" attribute
     */
    public boolean isSetSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SI$6) != null;
        }
    }
    
    /**
     * Sets the "si" attribute
     */
    public void setSi(long si)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SI$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SI$6);
            }
            target.setLongValue(si);
        }
    }
    
    /**
     * Sets (as xml) the "si" attribute
     */
    public void xsetSi(org.apache.xmlbeans.XmlUnsignedInt si)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SI$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SI$6);
            }
            target.set(si);
        }
    }
    
    /**
     * Unsets the "si" attribute
     */
    public void unsetSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SI$6);
        }
    }
    
    /**
     * Gets the "fi" attribute
     */
    public long getFi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FI$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fi" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FI$8);
            return target;
        }
    }
    
    /**
     * True if has "fi" attribute
     */
    public boolean isSetFi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FI$8) != null;
        }
    }
    
    /**
     * Sets the "fi" attribute
     */
    public void setFi(long fi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FI$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FI$8);
            }
            target.setLongValue(fi);
        }
    }
    
    /**
     * Sets (as xml) the "fi" attribute
     */
    public void xsetFi(org.apache.xmlbeans.XmlUnsignedInt fi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FI$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FI$8);
            }
            target.set(fi);
        }
    }
    
    /**
     * Unsets the "fi" attribute
     */
    public void unsetFi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FI$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BC$10);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(BC$10);
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
            return get_store().find_attribute_user(BC$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BC$10);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(BC$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().add_attribute_user(BC$10);
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
            get_store().remove_attribute(BC$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FC$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(FC$12);
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
            return get_store().find_attribute_user(FC$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FC$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(FC$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().add_attribute_user(FC$12);
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
            get_store().remove_attribute(FC$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(I$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(I$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(I$14);
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
            return get_store().find_attribute_user(I$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(I$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(I$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(I$14);
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
            get_store().remove_attribute(I$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(U$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(U$16);
            }
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(U$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(U$16);
            }
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
            return get_store().find_attribute_user(U$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(U$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(U$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(U$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(U$16);
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
            get_store().remove_attribute(U$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ST$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ST$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ST$18);
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
            return get_store().find_attribute_user(ST$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ST$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ST$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ST$18);
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
            get_store().remove_attribute(ST$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(B$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(B$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(B$20);
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
            return get_store().find_attribute_user(B$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(B$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(B$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(B$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(B$20);
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
            get_store().remove_attribute(B$20);
        }
    }
}
