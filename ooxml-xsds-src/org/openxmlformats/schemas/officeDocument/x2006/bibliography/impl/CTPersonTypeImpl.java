/*
 * XML Type:  CT_PersonType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography.impl;
/**
 * An XML CT_PersonType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public class CTPersonTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType
{
    
    public CTPersonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Last");
    private static final javax.xml.namespace.QName FIRST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "First");
    private static final javax.xml.namespace.QName MIDDLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Middle");
    
    
    /**
     * Gets a List of "Last" elements
     */
    public java.util.List<java.lang.String> getLastList()
    {
        final class LastList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTPersonTypeImpl.this.getLastArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTPersonTypeImpl.this.getLastArray(i);
                CTPersonTypeImpl.this.setLastArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTPersonTypeImpl.this.insertLast(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTPersonTypeImpl.this.getLastArray(i);
                CTPersonTypeImpl.this.removeLast(i);
                return old;
            }
            
            public int size()
                { return CTPersonTypeImpl.this.sizeOfLastArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LastList();
        }
    }
    
    /**
     * Gets array of all "Last" elements
     */
    public java.lang.String[] getLastArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAST$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Last" element
     */
    public java.lang.String getLastArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "Last" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255> xgetLastList()
    {
        final class LastList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 get(int i)
                { return CTPersonTypeImpl.this.xgetLastArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 old = CTPersonTypeImpl.this.xgetLastArray(i);
                CTPersonTypeImpl.this.xsetLastArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 o)
                { CTPersonTypeImpl.this.insertNewLast(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 old = CTPersonTypeImpl.this.xgetLastArray(i);
                CTPersonTypeImpl.this.removeLast(i);
                return old;
            }
            
            public int size()
                { return CTPersonTypeImpl.this.sizeOfLastArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LastList();
        }
    }
    
    /**
     * Gets (as xml) array of all "Last" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[] xgetLastArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAST$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Last" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetLastArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(LAST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)target;
        }
    }
    
    /**
     * Returns number of "Last" element
     */
    public int sizeOfLastArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAST$0);
        }
    }
    
    /**
     * Sets array of all "Last" element
     */
    public void setLastArray(java.lang.String[] lastArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lastArray, LAST$0);
        }
    }
    
    /**
     * Sets ith "Last" element
     */
    public void setLastArray(int i, java.lang.String last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(last);
        }
    }
    
    /**
     * Sets (as xml) array of all "Last" element
     */
    public void xsetLastArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[]lastArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lastArray, LAST$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Last" element
     */
    public void xsetLastArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(LAST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(last);
        }
    }
    
    /**
     * Inserts the value as the ith "Last" element
     */
    public void insertLast(int i, java.lang.String last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LAST$0, i);
            target.setStringValue(last);
        }
    }
    
    /**
     * Appends the value as the last "Last" element
     */
    public void addLast(java.lang.String last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST$0);
            target.setStringValue(last);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Last" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 insertNewLast(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().insert_element_user(LAST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Last" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 addNewLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().add_element_user(LAST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Last" element
     */
    public void removeLast(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAST$0, i);
        }
    }
    
    /**
     * Gets a List of "First" elements
     */
    public java.util.List<java.lang.String> getFirstList()
    {
        final class FirstList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTPersonTypeImpl.this.getFirstArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTPersonTypeImpl.this.getFirstArray(i);
                CTPersonTypeImpl.this.setFirstArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTPersonTypeImpl.this.insertFirst(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTPersonTypeImpl.this.getFirstArray(i);
                CTPersonTypeImpl.this.removeFirst(i);
                return old;
            }
            
            public int size()
                { return CTPersonTypeImpl.this.sizeOfFirstArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FirstList();
        }
    }
    
    /**
     * Gets array of all "First" elements
     */
    public java.lang.String[] getFirstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIRST$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "First" element
     */
    public java.lang.String getFirstArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "First" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255> xgetFirstList()
    {
        final class FirstList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 get(int i)
                { return CTPersonTypeImpl.this.xgetFirstArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 old = CTPersonTypeImpl.this.xgetFirstArray(i);
                CTPersonTypeImpl.this.xsetFirstArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 o)
                { CTPersonTypeImpl.this.insertNewFirst(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 old = CTPersonTypeImpl.this.xgetFirstArray(i);
                CTPersonTypeImpl.this.removeFirst(i);
                return old;
            }
            
            public int size()
                { return CTPersonTypeImpl.this.sizeOfFirstArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FirstList();
        }
    }
    
    /**
     * Gets (as xml) array of all "First" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[] xgetFirstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIRST$2, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "First" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetFirstArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(FIRST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)target;
        }
    }
    
    /**
     * Returns number of "First" element
     */
    public int sizeOfFirstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRST$2);
        }
    }
    
    /**
     * Sets array of all "First" element
     */
    public void setFirstArray(java.lang.String[] firstArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(firstArray, FIRST$2);
        }
    }
    
    /**
     * Sets ith "First" element
     */
    public void setFirstArray(int i, java.lang.String first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(first);
        }
    }
    
    /**
     * Sets (as xml) array of all "First" element
     */
    public void xsetFirstArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[]firstArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(firstArray, FIRST$2);
        }
    }
    
    /**
     * Sets (as xml) ith "First" element
     */
    public void xsetFirstArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(FIRST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(first);
        }
    }
    
    /**
     * Inserts the value as the ith "First" element
     */
    public void insertFirst(int i, java.lang.String first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FIRST$2, i);
            target.setStringValue(first);
        }
    }
    
    /**
     * Appends the value as the last "First" element
     */
    public void addFirst(java.lang.String first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRST$2);
            target.setStringValue(first);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "First" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 insertNewFirst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().insert_element_user(FIRST$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "First" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 addNewFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().add_element_user(FIRST$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "First" element
     */
    public void removeFirst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRST$2, i);
        }
    }
    
    /**
     * Gets a List of "Middle" elements
     */
    public java.util.List<java.lang.String> getMiddleList()
    {
        final class MiddleList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTPersonTypeImpl.this.getMiddleArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTPersonTypeImpl.this.getMiddleArray(i);
                CTPersonTypeImpl.this.setMiddleArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTPersonTypeImpl.this.insertMiddle(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTPersonTypeImpl.this.getMiddleArray(i);
                CTPersonTypeImpl.this.removeMiddle(i);
                return old;
            }
            
            public int size()
                { return CTPersonTypeImpl.this.sizeOfMiddleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MiddleList();
        }
    }
    
    /**
     * Gets array of all "Middle" elements
     */
    public java.lang.String[] getMiddleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MIDDLE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Middle" element
     */
    public java.lang.String getMiddleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "Middle" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255> xgetMiddleList()
    {
        final class MiddleList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 get(int i)
                { return CTPersonTypeImpl.this.xgetMiddleArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 old = CTPersonTypeImpl.this.xgetMiddleArray(i);
                CTPersonTypeImpl.this.xsetMiddleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 o)
                { CTPersonTypeImpl.this.insertNewMiddle(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 old = CTPersonTypeImpl.this.xgetMiddleArray(i);
                CTPersonTypeImpl.this.removeMiddle(i);
                return old;
            }
            
            public int size()
                { return CTPersonTypeImpl.this.sizeOfMiddleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MiddleList();
        }
    }
    
    /**
     * Gets (as xml) array of all "Middle" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[] xgetMiddleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MIDDLE$4, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Middle" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetMiddleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(MIDDLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)target;
        }
    }
    
    /**
     * Returns number of "Middle" element
     */
    public int sizeOfMiddleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIDDLE$4);
        }
    }
    
    /**
     * Sets array of all "Middle" element
     */
    public void setMiddleArray(java.lang.String[] middleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(middleArray, MIDDLE$4);
        }
    }
    
    /**
     * Sets ith "Middle" element
     */
    public void setMiddleArray(int i, java.lang.String middle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(middle);
        }
    }
    
    /**
     * Sets (as xml) array of all "Middle" element
     */
    public void xsetMiddleArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255[]middleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(middleArray, MIDDLE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "Middle" element
     */
    public void xsetMiddleArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 middle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_element_user(MIDDLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(middle);
        }
    }
    
    /**
     * Inserts the value as the ith "Middle" element
     */
    public void insertMiddle(int i, java.lang.String middle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MIDDLE$4, i);
            target.setStringValue(middle);
        }
    }
    
    /**
     * Appends the value as the last "Middle" element
     */
    public void addMiddle(java.lang.String middle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLE$4);
            target.setStringValue(middle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Middle" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 insertNewMiddle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().insert_element_user(MIDDLE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Middle" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 addNewMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().add_element_user(MIDDLE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Middle" element
     */
    public void removeMiddle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIDDLE$4, i);
        }
    }
}
