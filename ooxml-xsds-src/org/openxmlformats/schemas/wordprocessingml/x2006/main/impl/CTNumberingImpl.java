/*
 * XML Type:  CT_Numbering
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Numbering(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNumberingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering
{
    
    public CTNumberingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMPICBULLET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numPicBullet");
    private static final javax.xml.namespace.QName ABSTRACTNUM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "abstractNum");
    private static final javax.xml.namespace.QName NUM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "num");
    private static final javax.xml.namespace.QName NUMIDMACATCLEANUP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numIdMacAtCleanup");
    
    
    /**
     * Gets a List of "numPicBullet" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet> getNumPicBulletList()
    {
        final class NumPicBulletList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet get(int i)
                { return CTNumberingImpl.this.getNumPicBulletArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet old = CTNumberingImpl.this.getNumPicBulletArray(i);
                CTNumberingImpl.this.setNumPicBulletArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet o)
                { CTNumberingImpl.this.insertNewNumPicBullet(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet old = CTNumberingImpl.this.getNumPicBulletArray(i);
                CTNumberingImpl.this.removeNumPicBullet(i);
                return old;
            }
            
            public int size()
                { return CTNumberingImpl.this.sizeOfNumPicBulletArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NumPicBulletList();
        }
    }
    
    /**
     * Gets array of all "numPicBullet" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet[] getNumPicBulletArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NUMPICBULLET$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "numPicBullet" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet getNumPicBulletArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet)get_store().find_element_user(NUMPICBULLET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "numPicBullet" element
     */
    public int sizeOfNumPicBulletArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMPICBULLET$0);
        }
    }
    
    /**
     * Sets array of all "numPicBullet" element
     */
    public void setNumPicBulletArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet[] numPicBulletArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(numPicBulletArray, NUMPICBULLET$0);
        }
    }
    
    /**
     * Sets ith "numPicBullet" element
     */
    public void setNumPicBulletArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet numPicBullet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet)get_store().find_element_user(NUMPICBULLET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(numPicBullet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "numPicBullet" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet insertNewNumPicBullet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet)get_store().insert_element_user(NUMPICBULLET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "numPicBullet" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet addNewNumPicBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet)get_store().add_element_user(NUMPICBULLET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "numPicBullet" element
     */
    public void removeNumPicBullet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMPICBULLET$0, i);
        }
    }
    
    /**
     * Gets a List of "abstractNum" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum> getAbstractNumList()
    {
        final class AbstractNumList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum get(int i)
                { return CTNumberingImpl.this.getAbstractNumArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum old = CTNumberingImpl.this.getAbstractNumArray(i);
                CTNumberingImpl.this.setAbstractNumArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum o)
                { CTNumberingImpl.this.insertNewAbstractNum(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum old = CTNumberingImpl.this.getAbstractNumArray(i);
                CTNumberingImpl.this.removeAbstractNum(i);
                return old;
            }
            
            public int size()
                { return CTNumberingImpl.this.sizeOfAbstractNumArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AbstractNumList();
        }
    }
    
    /**
     * Gets array of all "abstractNum" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum[] getAbstractNumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTNUM$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abstractNum" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum getAbstractNumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum)get_store().find_element_user(ABSTRACTNUM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abstractNum" element
     */
    public int sizeOfAbstractNumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTNUM$2);
        }
    }
    
    /**
     * Sets array of all "abstractNum" element
     */
    public void setAbstractNumArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum[] abstractNumArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractNumArray, ABSTRACTNUM$2);
        }
    }
    
    /**
     * Sets ith "abstractNum" element
     */
    public void setAbstractNumArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum abstractNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum)get_store().find_element_user(ABSTRACTNUM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractNum);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractNum" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum insertNewAbstractNum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum)get_store().insert_element_user(ABSTRACTNUM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractNum" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum addNewAbstractNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum)get_store().add_element_user(ABSTRACTNUM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "abstractNum" element
     */
    public void removeAbstractNum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTNUM$2, i);
        }
    }
    
    /**
     * Gets a List of "num" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum> getNumList()
    {
        final class NumList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum get(int i)
                { return CTNumberingImpl.this.getNumArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum old = CTNumberingImpl.this.getNumArray(i);
                CTNumberingImpl.this.setNumArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum o)
                { CTNumberingImpl.this.insertNewNum(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum old = CTNumberingImpl.this.getNumArray(i);
                CTNumberingImpl.this.removeNum(i);
                return old;
            }
            
            public int size()
                { return CTNumberingImpl.this.sizeOfNumArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NumList();
        }
    }
    
    /**
     * Gets array of all "num" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum[] getNumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NUM$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "num" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum getNumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum)get_store().find_element_user(NUM$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "num" element
     */
    public int sizeOfNumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUM$4);
        }
    }
    
    /**
     * Sets array of all "num" element
     */
    public void setNumArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum[] numArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(numArray, NUM$4);
        }
    }
    
    /**
     * Sets ith "num" element
     */
    public void setNumArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum num)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum)get_store().find_element_user(NUM$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(num);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "num" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum insertNewNum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum)get_store().insert_element_user(NUM$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "num" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum addNewNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum)get_store().add_element_user(NUM$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "num" element
     */
    public void removeNum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUM$4, i);
        }
    }
    
    /**
     * Gets the "numIdMacAtCleanup" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getNumIdMacAtCleanup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(NUMIDMACATCLEANUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numIdMacAtCleanup" element
     */
    public boolean isSetNumIdMacAtCleanup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMIDMACATCLEANUP$6) != 0;
        }
    }
    
    /**
     * Sets the "numIdMacAtCleanup" element
     */
    public void setNumIdMacAtCleanup(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber numIdMacAtCleanup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(NUMIDMACATCLEANUP$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(NUMIDMACATCLEANUP$6);
            }
            target.set(numIdMacAtCleanup);
        }
    }
    
    /**
     * Appends and returns a new empty "numIdMacAtCleanup" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewNumIdMacAtCleanup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(NUMIDMACATCLEANUP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "numIdMacAtCleanup" element
     */
    public void unsetNumIdMacAtCleanup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMIDMACATCLEANUP$6, 0);
        }
    }
}
