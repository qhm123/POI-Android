/*
 * XML Type:  CT_SharedItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SharedItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSharedItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems
{
    
    public CTSharedItemsImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CONTAINSSEMIMIXEDTYPES$12 = 
        new javax.xml.namespace.QName("", "containsSemiMixedTypes");
    private static final javax.xml.namespace.QName CONTAINSNONDATE$14 = 
        new javax.xml.namespace.QName("", "containsNonDate");
    private static final javax.xml.namespace.QName CONTAINSDATE$16 = 
        new javax.xml.namespace.QName("", "containsDate");
    private static final javax.xml.namespace.QName CONTAINSSTRING$18 = 
        new javax.xml.namespace.QName("", "containsString");
    private static final javax.xml.namespace.QName CONTAINSBLANK$20 = 
        new javax.xml.namespace.QName("", "containsBlank");
    private static final javax.xml.namespace.QName CONTAINSMIXEDTYPES$22 = 
        new javax.xml.namespace.QName("", "containsMixedTypes");
    private static final javax.xml.namespace.QName CONTAINSNUMBER$24 = 
        new javax.xml.namespace.QName("", "containsNumber");
    private static final javax.xml.namespace.QName CONTAINSINTEGER$26 = 
        new javax.xml.namespace.QName("", "containsInteger");
    private static final javax.xml.namespace.QName MINVALUE$28 = 
        new javax.xml.namespace.QName("", "minValue");
    private static final javax.xml.namespace.QName MAXVALUE$30 = 
        new javax.xml.namespace.QName("", "maxValue");
    private static final javax.xml.namespace.QName MINDATE$32 = 
        new javax.xml.namespace.QName("", "minDate");
    private static final javax.xml.namespace.QName MAXDATE$34 = 
        new javax.xml.namespace.QName("", "maxDate");
    private static final javax.xml.namespace.QName COUNT$36 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName LONGTEXT$38 = 
        new javax.xml.namespace.QName("", "longText");
    
    
    /**
     * Gets a List of "m" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing> getMList()
    {
        final class MList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing get(int i)
                { return CTSharedItemsImpl.this.getMArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing old = CTSharedItemsImpl.this.getMArray(i);
                CTSharedItemsImpl.this.setMArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing o)
                { CTSharedItemsImpl.this.insertNewM(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing old = CTSharedItemsImpl.this.getMArray(i);
                CTSharedItemsImpl.this.removeM(i);
                return old;
            }
            
            public int size()
                { return CTSharedItemsImpl.this.sizeOfMArray(); }
            
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
                { return CTSharedItemsImpl.this.getNArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber old = CTSharedItemsImpl.this.getNArray(i);
                CTSharedItemsImpl.this.setNArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber o)
                { CTSharedItemsImpl.this.insertNewN(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber old = CTSharedItemsImpl.this.getNArray(i);
                CTSharedItemsImpl.this.removeN(i);
                return old;
            }
            
            public int size()
                { return CTSharedItemsImpl.this.sizeOfNArray(); }
            
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
                { return CTSharedItemsImpl.this.getBArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean old = CTSharedItemsImpl.this.getBArray(i);
                CTSharedItemsImpl.this.setBArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean o)
                { CTSharedItemsImpl.this.insertNewB(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean old = CTSharedItemsImpl.this.getBArray(i);
                CTSharedItemsImpl.this.removeB(i);
                return old;
            }
            
            public int size()
                { return CTSharedItemsImpl.this.sizeOfBArray(); }
            
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
                { return CTSharedItemsImpl.this.getEArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError old = CTSharedItemsImpl.this.getEArray(i);
                CTSharedItemsImpl.this.setEArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError o)
                { CTSharedItemsImpl.this.insertNewE(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError old = CTSharedItemsImpl.this.getEArray(i);
                CTSharedItemsImpl.this.removeE(i);
                return old;
            }
            
            public int size()
                { return CTSharedItemsImpl.this.sizeOfEArray(); }
            
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
                { return CTSharedItemsImpl.this.getSArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString old = CTSharedItemsImpl.this.getSArray(i);
                CTSharedItemsImpl.this.setSArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString o)
                { CTSharedItemsImpl.this.insertNewS(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString old = CTSharedItemsImpl.this.getSArray(i);
                CTSharedItemsImpl.this.removeS(i);
                return old;
            }
            
            public int size()
                { return CTSharedItemsImpl.this.sizeOfSArray(); }
            
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
                { return CTSharedItemsImpl.this.getDArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime old = CTSharedItemsImpl.this.getDArray(i);
                CTSharedItemsImpl.this.setDArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime o)
                { CTSharedItemsImpl.this.insertNewD(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime old = CTSharedItemsImpl.this.getDArray(i);
                CTSharedItemsImpl.this.removeD(i);
                return old;
            }
            
            public int size()
                { return CTSharedItemsImpl.this.sizeOfDArray(); }
            
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
     * Gets the "containsSemiMixedTypes" attribute
     */
    public boolean getContainsSemiMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSSEMIMIXEDTYPES$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsSemiMixedTypes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsSemiMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSSEMIMIXEDTYPES$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsSemiMixedTypes" attribute
     */
    public boolean isSetContainsSemiMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12) != null;
        }
    }
    
    /**
     * Sets the "containsSemiMixedTypes" attribute
     */
    public void setContainsSemiMixedTypes(boolean containsSemiMixedTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
            }
            target.setBooleanValue(containsSemiMixedTypes);
        }
    }
    
    /**
     * Sets (as xml) the "containsSemiMixedTypes" attribute
     */
    public void xsetContainsSemiMixedTypes(org.apache.xmlbeans.XmlBoolean containsSemiMixedTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
            }
            target.set(containsSemiMixedTypes);
        }
    }
    
    /**
     * Unsets the "containsSemiMixedTypes" attribute
     */
    public void unsetContainsSemiMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSSEMIMIXEDTYPES$12);
        }
    }
    
    /**
     * Gets the "containsNonDate" attribute
     */
    public boolean getContainsNonDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSNONDATE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSNONDATE$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsNonDate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsNonDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSNONDATE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSNONDATE$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsNonDate" attribute
     */
    public boolean isSetContainsNonDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSNONDATE$14) != null;
        }
    }
    
    /**
     * Sets the "containsNonDate" attribute
     */
    public void setContainsNonDate(boolean containsNonDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSNONDATE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSNONDATE$14);
            }
            target.setBooleanValue(containsNonDate);
        }
    }
    
    /**
     * Sets (as xml) the "containsNonDate" attribute
     */
    public void xsetContainsNonDate(org.apache.xmlbeans.XmlBoolean containsNonDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSNONDATE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSNONDATE$14);
            }
            target.set(containsNonDate);
        }
    }
    
    /**
     * Unsets the "containsNonDate" attribute
     */
    public void unsetContainsNonDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSNONDATE$14);
        }
    }
    
    /**
     * Gets the "containsDate" attribute
     */
    public boolean getContainsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSDATE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSDATE$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsDate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSDATE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSDATE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsDate" attribute
     */
    public boolean isSetContainsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSDATE$16) != null;
        }
    }
    
    /**
     * Sets the "containsDate" attribute
     */
    public void setContainsDate(boolean containsDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSDATE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSDATE$16);
            }
            target.setBooleanValue(containsDate);
        }
    }
    
    /**
     * Sets (as xml) the "containsDate" attribute
     */
    public void xsetContainsDate(org.apache.xmlbeans.XmlBoolean containsDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSDATE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSDATE$16);
            }
            target.set(containsDate);
        }
    }
    
    /**
     * Unsets the "containsDate" attribute
     */
    public void unsetContainsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSDATE$16);
        }
    }
    
    /**
     * Gets the "containsString" attribute
     */
    public boolean getContainsString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSSTRING$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSSTRING$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsString" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSSTRING$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSSTRING$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsString" attribute
     */
    public boolean isSetContainsString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSSTRING$18) != null;
        }
    }
    
    /**
     * Sets the "containsString" attribute
     */
    public void setContainsString(boolean containsString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSSTRING$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSSTRING$18);
            }
            target.setBooleanValue(containsString);
        }
    }
    
    /**
     * Sets (as xml) the "containsString" attribute
     */
    public void xsetContainsString(org.apache.xmlbeans.XmlBoolean containsString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSSTRING$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSSTRING$18);
            }
            target.set(containsString);
        }
    }
    
    /**
     * Unsets the "containsString" attribute
     */
    public void unsetContainsString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSSTRING$18);
        }
    }
    
    /**
     * Gets the "containsBlank" attribute
     */
    public boolean getContainsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSBLANK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSBLANK$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsBlank" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSBLANK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSBLANK$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsBlank" attribute
     */
    public boolean isSetContainsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSBLANK$20) != null;
        }
    }
    
    /**
     * Sets the "containsBlank" attribute
     */
    public void setContainsBlank(boolean containsBlank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSBLANK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSBLANK$20);
            }
            target.setBooleanValue(containsBlank);
        }
    }
    
    /**
     * Sets (as xml) the "containsBlank" attribute
     */
    public void xsetContainsBlank(org.apache.xmlbeans.XmlBoolean containsBlank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSBLANK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSBLANK$20);
            }
            target.set(containsBlank);
        }
    }
    
    /**
     * Unsets the "containsBlank" attribute
     */
    public void unsetContainsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSBLANK$20);
        }
    }
    
    /**
     * Gets the "containsMixedTypes" attribute
     */
    public boolean getContainsMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSMIXEDTYPES$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsMixedTypes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSMIXEDTYPES$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsMixedTypes" attribute
     */
    public boolean isSetContainsMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSMIXEDTYPES$22) != null;
        }
    }
    
    /**
     * Sets the "containsMixedTypes" attribute
     */
    public void setContainsMixedTypes(boolean containsMixedTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSMIXEDTYPES$22);
            }
            target.setBooleanValue(containsMixedTypes);
        }
    }
    
    /**
     * Sets (as xml) the "containsMixedTypes" attribute
     */
    public void xsetContainsMixedTypes(org.apache.xmlbeans.XmlBoolean containsMixedTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSMIXEDTYPES$22);
            }
            target.set(containsMixedTypes);
        }
    }
    
    /**
     * Unsets the "containsMixedTypes" attribute
     */
    public void unsetContainsMixedTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSMIXEDTYPES$22);
        }
    }
    
    /**
     * Gets the "containsNumber" attribute
     */
    public boolean getContainsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSNUMBER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSNUMBER$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsNumber" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSNUMBER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSNUMBER$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsNumber" attribute
     */
    public boolean isSetContainsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSNUMBER$24) != null;
        }
    }
    
    /**
     * Sets the "containsNumber" attribute
     */
    public void setContainsNumber(boolean containsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSNUMBER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSNUMBER$24);
            }
            target.setBooleanValue(containsNumber);
        }
    }
    
    /**
     * Sets (as xml) the "containsNumber" attribute
     */
    public void xsetContainsNumber(org.apache.xmlbeans.XmlBoolean containsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSNUMBER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSNUMBER$24);
            }
            target.set(containsNumber);
        }
    }
    
    /**
     * Unsets the "containsNumber" attribute
     */
    public void unsetContainsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSNUMBER$24);
        }
    }
    
    /**
     * Gets the "containsInteger" attribute
     */
    public boolean getContainsInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSINTEGER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTAINSINTEGER$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "containsInteger" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetContainsInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSINTEGER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONTAINSINTEGER$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "containsInteger" attribute
     */
    public boolean isSetContainsInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINSINTEGER$26) != null;
        }
    }
    
    /**
     * Sets the "containsInteger" attribute
     */
    public void setContainsInteger(boolean containsInteger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINSINTEGER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINSINTEGER$26);
            }
            target.setBooleanValue(containsInteger);
        }
    }
    
    /**
     * Sets (as xml) the "containsInteger" attribute
     */
    public void xsetContainsInteger(org.apache.xmlbeans.XmlBoolean containsInteger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONTAINSINTEGER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONTAINSINTEGER$26);
            }
            target.set(containsInteger);
        }
    }
    
    /**
     * Unsets the "containsInteger" attribute
     */
    public void unsetContainsInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINSINTEGER$26);
        }
    }
    
    /**
     * Gets the "minValue" attribute
     */
    public double getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVALUE$28);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minValue" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MINVALUE$28);
            return target;
        }
    }
    
    /**
     * True if has "minValue" attribute
     */
    public boolean isSetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINVALUE$28) != null;
        }
    }
    
    /**
     * Sets the "minValue" attribute
     */
    public void setMinValue(double minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVALUE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINVALUE$28);
            }
            target.setDoubleValue(minValue);
        }
    }
    
    /**
     * Sets (as xml) the "minValue" attribute
     */
    public void xsetMinValue(org.apache.xmlbeans.XmlDouble minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MINVALUE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MINVALUE$28);
            }
            target.set(minValue);
        }
    }
    
    /**
     * Unsets the "minValue" attribute
     */
    public void unsetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINVALUE$28);
        }
    }
    
    /**
     * Gets the "maxValue" attribute
     */
    public double getMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXVALUE$30);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxValue" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAXVALUE$30);
            return target;
        }
    }
    
    /**
     * True if has "maxValue" attribute
     */
    public boolean isSetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXVALUE$30) != null;
        }
    }
    
    /**
     * Sets the "maxValue" attribute
     */
    public void setMaxValue(double maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXVALUE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXVALUE$30);
            }
            target.setDoubleValue(maxValue);
        }
    }
    
    /**
     * Sets (as xml) the "maxValue" attribute
     */
    public void xsetMaxValue(org.apache.xmlbeans.XmlDouble maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAXVALUE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAXVALUE$30);
            }
            target.set(maxValue);
        }
    }
    
    /**
     * Unsets the "maxValue" attribute
     */
    public void unsetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXVALUE$30);
        }
    }
    
    /**
     * Gets the "minDate" attribute
     */
    public java.util.Calendar getMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINDATE$32);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "minDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(MINDATE$32);
            return target;
        }
    }
    
    /**
     * True if has "minDate" attribute
     */
    public boolean isSetMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINDATE$32) != null;
        }
    }
    
    /**
     * Sets the "minDate" attribute
     */
    public void setMinDate(java.util.Calendar minDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINDATE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINDATE$32);
            }
            target.setCalendarValue(minDate);
        }
    }
    
    /**
     * Sets (as xml) the "minDate" attribute
     */
    public void xsetMinDate(org.apache.xmlbeans.XmlDateTime minDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(MINDATE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(MINDATE$32);
            }
            target.set(minDate);
        }
    }
    
    /**
     * Unsets the "minDate" attribute
     */
    public void unsetMinDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINDATE$32);
        }
    }
    
    /**
     * Gets the "maxDate" attribute
     */
    public java.util.Calendar getMaxDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXDATE$34);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetMaxDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(MAXDATE$34);
            return target;
        }
    }
    
    /**
     * True if has "maxDate" attribute
     */
    public boolean isSetMaxDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXDATE$34) != null;
        }
    }
    
    /**
     * Sets the "maxDate" attribute
     */
    public void setMaxDate(java.util.Calendar maxDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXDATE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXDATE$34);
            }
            target.setCalendarValue(maxDate);
        }
    }
    
    /**
     * Sets (as xml) the "maxDate" attribute
     */
    public void xsetMaxDate(org.apache.xmlbeans.XmlDateTime maxDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(MAXDATE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(MAXDATE$34);
            }
            target.set(maxDate);
        }
    }
    
    /**
     * Unsets the "maxDate" attribute
     */
    public void unsetMaxDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXDATE$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$36);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$36);
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
            return get_store().find_attribute_user(COUNT$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$36);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$36);
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
            get_store().remove_attribute(COUNT$36);
        }
    }
    
    /**
     * Gets the "longText" attribute
     */
    public boolean getLongText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGTEXT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LONGTEXT$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "longText" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLongText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LONGTEXT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LONGTEXT$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "longText" attribute
     */
    public boolean isSetLongText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LONGTEXT$38) != null;
        }
    }
    
    /**
     * Sets the "longText" attribute
     */
    public void setLongText(boolean longText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGTEXT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGTEXT$38);
            }
            target.setBooleanValue(longText);
        }
    }
    
    /**
     * Sets (as xml) the "longText" attribute
     */
    public void xsetLongText(org.apache.xmlbeans.XmlBoolean longText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LONGTEXT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LONGTEXT$38);
            }
            target.set(longText);
        }
    }
    
    /**
     * Unsets the "longText" attribute
     */
    public void unsetLongText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LONGTEXT$38);
        }
    }
}
