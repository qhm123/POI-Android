/*
 * XML Type:  CT_VolTopic
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_VolTopic(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTVolTopicImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopic
{
    
    public CTVolTopicImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "v");
    private static final javax.xml.namespace.QName STP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "stp");
    private static final javax.xml.namespace.QName TR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tr");
    private static final javax.xml.namespace.QName T$6 = 
        new javax.xml.namespace.QName("", "t");
    
    
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
     * Gets a List of "stp" elements
     */
    public java.util.List<java.lang.String> getStpList()
    {
        final class StpList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTVolTopicImpl.this.getStpArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTVolTopicImpl.this.getStpArray(i);
                CTVolTopicImpl.this.setStpArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTVolTopicImpl.this.insertStp(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTVolTopicImpl.this.getStpArray(i);
                CTVolTopicImpl.this.removeStp(i);
                return old;
            }
            
            public int size()
                { return CTVolTopicImpl.this.sizeOfStpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StpList();
        }
    }
    
    /**
     * Gets array of all "stp" elements
     */
    public java.lang.String[] getStpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STP$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "stp" element
     */
    public java.lang.String getStpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "stp" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring> xgetStpList()
    {
        final class StpList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring get(int i)
                { return CTVolTopicImpl.this.xgetStpArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring old = CTVolTopicImpl.this.xgetStpArray(i);
                CTVolTopicImpl.this.xsetStpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring o)
                { CTVolTopicImpl.this.insertNewStp(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring old = CTVolTopicImpl.this.xgetStpArray(i);
                CTVolTopicImpl.this.removeStp(i);
                return old;
            }
            
            public int size()
                { return CTVolTopicImpl.this.sizeOfStpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StpList();
        }
    }
    
    /**
     * Gets (as xml) array of all "stp" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[] xgetStpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STP$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "stp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetStpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(STP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)target;
        }
    }
    
    /**
     * Returns number of "stp" element
     */
    public int sizeOfStpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STP$2);
        }
    }
    
    /**
     * Sets array of all "stp" element
     */
    public void setStpArray(java.lang.String[] stpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stpArray, STP$2);
        }
    }
    
    /**
     * Sets ith "stp" element
     */
    public void setStpArray(int i, java.lang.String stp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(stp);
        }
    }
    
    /**
     * Sets (as xml) array of all "stp" element
     */
    public void xsetStpArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring[]stpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stpArray, STP$2);
        }
    }
    
    /**
     * Sets (as xml) ith "stp" element
     */
    public void xsetStpArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring stp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(STP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stp);
        }
    }
    
    /**
     * Inserts the value as the ith "stp" element
     */
    public void insertStp(int i, java.lang.String stp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STP$2, i);
            target.setStringValue(stp);
        }
    }
    
    /**
     * Appends the value as the last "stp" element
     */
    public void addStp(java.lang.String stp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STP$2);
            target.setStringValue(stp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring insertNewStp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().insert_element_user(STP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring addNewStp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(STP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "stp" element
     */
    public void removeStp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STP$2, i);
        }
    }
    
    /**
     * Gets a List of "tr" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef> getTrList()
    {
        final class TrList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef get(int i)
                { return CTVolTopicImpl.this.getTrArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef old = CTVolTopicImpl.this.getTrArray(i);
                CTVolTopicImpl.this.setTrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef o)
                { CTVolTopicImpl.this.insertNewTr(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef old = CTVolTopicImpl.this.getTrArray(i);
                CTVolTopicImpl.this.removeTr(i);
                return old;
            }
            
            public int size()
                { return CTVolTopicImpl.this.sizeOfTrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TrList();
        }
    }
    
    /**
     * Gets array of all "tr" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef[] getTrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TR$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef getTrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef)get_store().find_element_user(TR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tr" element
     */
    public int sizeOfTrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TR$4);
        }
    }
    
    /**
     * Sets array of all "tr" element
     */
    public void setTrArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef[] trArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(trArray, TR$4);
        }
    }
    
    /**
     * Sets ith "tr" element
     */
    public void setTrArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef tr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef)get_store().find_element_user(TR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef insertNewTr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef)get_store().insert_element_user(TR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef addNewTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolTopicRef)get_store().add_element_user(TR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "tr" element
     */
    public void removeTr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TR$4, i);
        }
    }
    
    /**
     * Gets the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType.Enum getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(T$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType)get_store().find_attribute_user(T$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType)get_default_attribute_value(T$6);
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
            return get_store().find_attribute_user(T$6) != null;
        }
    }
    
    /**
     * Sets the "t" attribute
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType.Enum t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T$6);
            }
            target.setEnumValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" attribute
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType)get_store().find_attribute_user(T$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolValueType)get_store().add_attribute_user(T$6);
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
            get_store().remove_attribute(T$6);
        }
    }
}
