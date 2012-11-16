/*
 * XML Type:  CT_GroupItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_GroupItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTGroupItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupItems
{
    
    public CTGroupItemsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName M$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "m");
    private static final javax.xml.namespace.QName N$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "n");
    private static final javax.xml.namespace.QName B$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "b");
    private static final javax.xml.namespace.QName E$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "e");
    private static final javax.xml.namespace.QName S$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "s");
    private static final javax.xml.namespace.QName D$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "d");
    private static final javax.xml.namespace.QName COUNT$12 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "m" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing> getMList()
    {
        final class MList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing get(int i)
                { return CTGroupItemsImpl.this.getMArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing old = CTGroupItemsImpl.this.getMArray(i);
                CTGroupItemsImpl.this.setMArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing o)
                { CTGroupItemsImpl.this.insertNewM(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing old = CTGroupItemsImpl.this.getMArray(i);
                CTGroupItemsImpl.this.removeM(i);
                return old;
            }
            
            public int size()
                { return CTGroupItemsImpl.this.sizeOfMArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MList();
        }
    }
    
    /**
     * Gets array of all "m" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing[] getMArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(M$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "m" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing getMArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing)get_store().find_element_user(M$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "m" element
     */
    public int sizeOfMArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(M$0);
        }
    }
    
    /**
     * Sets array of all "m" element
     */
    public void setMArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing[] mArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mArray, M$0);
        }
    }
    
    /**
     * Sets ith "m" element
     */
    public void setMArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing m)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing)get_store().find_element_user(M$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(m);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "m" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing insertNewM(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing)get_store().insert_element_user(M$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "m" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing addNewM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing)get_store().add_element_user(M$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "m" element
     */
    public void removeM(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(M$0, i);
        }
    }
    
    /**
     * Gets a List of "n" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber> getNList()
    {
        final class NList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber get(int i)
                { return CTGroupItemsImpl.this.getNArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber old = CTGroupItemsImpl.this.getNArray(i);
                CTGroupItemsImpl.this.setNArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber o)
                { CTGroupItemsImpl.this.insertNewN(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber old = CTGroupItemsImpl.this.getNArray(i);
                CTGroupItemsImpl.this.removeN(i);
                return old;
            }
            
            public int size()
                { return CTGroupItemsImpl.this.sizeOfNArray(); }
            
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber[] getNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(N$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber getNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber)get_store().find_element_user(N$2, i);
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
            return get_store().count_elements(N$2);
        }
    }
    
    /**
     * Sets array of all "n" element
     */
    public void setNArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber[] nArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nArray, N$2);
        }
    }
    
    /**
     * Sets ith "n" element
     */
    public void setNArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber)get_store().find_element_user(N$2, i);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber insertNewN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber)get_store().insert_element_user(N$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber addNewN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber)get_store().add_element_user(N$2);
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
            get_store().remove_element(N$2, i);
        }
    }
    
    /**
     * Gets a List of "b" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean> getBList()
    {
        final class BList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean get(int i)
                { return CTGroupItemsImpl.this.getBArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean old = CTGroupItemsImpl.this.getBArray(i);
                CTGroupItemsImpl.this.setBArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean o)
                { CTGroupItemsImpl.this.insertNewB(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean old = CTGroupItemsImpl.this.getBArray(i);
                CTGroupItemsImpl.this.removeB(i);
                return old;
            }
            
            public int size()
                { return CTGroupItemsImpl.this.sizeOfBArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BList();
        }
    }
    
    /**
     * Gets array of all "b" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean[] getBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(B$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "b" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean getBArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean)get_store().find_element_user(B$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "b" element
     */
    public int sizeOfBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(B$4);
        }
    }
    
    /**
     * Sets array of all "b" element
     */
    public void setBArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean[] bArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bArray, B$4);
        }
    }
    
    /**
     * Sets ith "b" element
     */
    public void setBArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean)get_store().find_element_user(B$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(b);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "b" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean insertNewB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean)get_store().insert_element_user(B$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "b" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean addNewB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean)get_store().add_element_user(B$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "b" element
     */
    public void removeB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(B$4, i);
        }
    }
    
    /**
     * Gets a List of "e" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError> getEList()
    {
        final class EList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError get(int i)
                { return CTGroupItemsImpl.this.getEArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError old = CTGroupItemsImpl.this.getEArray(i);
                CTGroupItemsImpl.this.setEArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError o)
                { CTGroupItemsImpl.this.insertNewE(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError old = CTGroupItemsImpl.this.getEArray(i);
                CTGroupItemsImpl.this.removeE(i);
                return old;
            }
            
            public int size()
                { return CTGroupItemsImpl.this.sizeOfEArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EList();
        }
    }
    
    /**
     * Gets array of all "e" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError[] getEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(E$6, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "e" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError getEArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError)get_store().find_element_user(E$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "e" element
     */
    public int sizeOfEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(E$6);
        }
    }
    
    /**
     * Sets array of all "e" element
     */
    public void setEArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError[] eArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eArray, E$6);
        }
    }
    
    /**
     * Sets ith "e" element
     */
    public void setEArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError e)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError)get_store().find_element_user(E$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(e);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "e" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError insertNewE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError)get_store().insert_element_user(E$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "e" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError addNewE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError)get_store().add_element_user(E$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "e" element
     */
    public void removeE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(E$6, i);
        }
    }
    
    /**
     * Gets a List of "s" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString> getSList()
    {
        final class SList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString get(int i)
                { return CTGroupItemsImpl.this.getSArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString old = CTGroupItemsImpl.this.getSArray(i);
                CTGroupItemsImpl.this.setSArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString o)
                { CTGroupItemsImpl.this.insertNewS(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString old = CTGroupItemsImpl.this.getSArray(i);
                CTGroupItemsImpl.this.removeS(i);
                return old;
            }
            
            public int size()
                { return CTGroupItemsImpl.this.sizeOfSArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SList();
        }
    }
    
    /**
     * Gets array of all "s" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString[] getSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(S$8, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString getSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString)get_store().find_element_user(S$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "s" element
     */
    public int sizeOfSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(S$8);
        }
    }
    
    /**
     * Sets array of all "s" element
     */
    public void setSArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString[] sArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sArray, S$8);
        }
    }
    
    /**
     * Sets ith "s" element
     */
    public void setSArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString)get_store().find_element_user(S$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(s);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString insertNewS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString)get_store().insert_element_user(S$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString addNewS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString)get_store().add_element_user(S$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "s" element
     */
    public void removeS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(S$8, i);
        }
    }
    
    /**
     * Gets a List of "d" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime> getDList()
    {
        final class DList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime get(int i)
                { return CTGroupItemsImpl.this.getDArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime old = CTGroupItemsImpl.this.getDArray(i);
                CTGroupItemsImpl.this.setDArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime o)
                { CTGroupItemsImpl.this.insertNewD(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime old = CTGroupItemsImpl.this.getDArray(i);
                CTGroupItemsImpl.this.removeD(i);
                return old;
            }
            
            public int size()
                { return CTGroupItemsImpl.this.sizeOfDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DList();
        }
    }
    
    /**
     * Gets array of all "d" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime[] getDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(D$10, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "d" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime getDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime)get_store().find_element_user(D$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "d" element
     */
    public int sizeOfDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(D$10);
        }
    }
    
    /**
     * Sets array of all "d" element
     */
    public void setDArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime[] dArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dArray, D$10);
        }
    }
    
    /**
     * Sets ith "d" element
     */
    public void setDArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime d)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime)get_store().find_element_user(D$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(d);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "d" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime insertNewD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime)get_store().insert_element_user(D$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "d" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime addNewD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime)get_store().add_element_user(D$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "d" element
     */
    public void removeD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(D$10, i);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$12);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$12) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$12);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$12);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$12);
        }
    }
}
