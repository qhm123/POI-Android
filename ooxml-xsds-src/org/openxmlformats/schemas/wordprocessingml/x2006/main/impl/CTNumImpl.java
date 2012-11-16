/*
 * XML Type:  CT_Num
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Num(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum
{
    
    public CTNumImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTNUMID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "abstractNumId");
    private static final javax.xml.namespace.QName LVLOVERRIDE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlOverride");
    private static final javax.xml.namespace.QName NUMID$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numId");
    
    
    /**
     * Gets the "abstractNumId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getAbstractNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ABSTRACTNUMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractNumId" element
     */
    public void setAbstractNumId(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber abstractNumId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ABSTRACTNUMID$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(ABSTRACTNUMID$0);
            }
            target.set(abstractNumId);
        }
    }
    
    /**
     * Appends and returns a new empty "abstractNumId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewAbstractNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(ABSTRACTNUMID$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "lvlOverride" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl> getLvlOverrideList()
    {
        final class LvlOverrideList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl get(int i)
                { return CTNumImpl.this.getLvlOverrideArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl old = CTNumImpl.this.getLvlOverrideArray(i);
                CTNumImpl.this.setLvlOverrideArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl o)
                { CTNumImpl.this.insertNewLvlOverride(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl old = CTNumImpl.this.getLvlOverrideArray(i);
                CTNumImpl.this.removeLvlOverride(i);
                return old;
            }
            
            public int size()
                { return CTNumImpl.this.sizeOfLvlOverrideArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LvlOverrideList();
        }
    }
    
    /**
     * Gets array of all "lvlOverride" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl[] getLvlOverrideArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LVLOVERRIDE$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lvlOverride" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl getLvlOverrideArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl)get_store().find_element_user(LVLOVERRIDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lvlOverride" element
     */
    public int sizeOfLvlOverrideArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVLOVERRIDE$2);
        }
    }
    
    /**
     * Sets array of all "lvlOverride" element
     */
    public void setLvlOverrideArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl[] lvlOverrideArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lvlOverrideArray, LVLOVERRIDE$2);
        }
    }
    
    /**
     * Sets ith "lvlOverride" element
     */
    public void setLvlOverrideArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl lvlOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl)get_store().find_element_user(LVLOVERRIDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lvlOverride);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lvlOverride" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl insertNewLvlOverride(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl)get_store().insert_element_user(LVLOVERRIDE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lvlOverride" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl addNewLvlOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl)get_store().add_element_user(LVLOVERRIDE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "lvlOverride" element
     */
    public void removeLvlOverride(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVLOVERRIDE$2, i);
        }
    }
    
    /**
     * Gets the "numId" attribute
     */
    public java.math.BigInteger getNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMID$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numId" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(NUMID$4);
            return target;
        }
    }
    
    /**
     * Sets the "numId" attribute
     */
    public void setNumId(java.math.BigInteger numId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMID$4);
            }
            target.setBigIntegerValue(numId);
        }
    }
    
    /**
     * Sets (as xml) the "numId" attribute
     */
    public void xsetNumId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber numId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(NUMID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(NUMID$4);
            }
            target.set(numId);
        }
    }
}
