/*
 * XML Type:  CT_LatentStyles
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_LatentStyles(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLatentStylesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles
{
    
    public CTLatentStylesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LSDEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lsdException");
    private static final javax.xml.namespace.QName DEFLOCKEDSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defLockedState");
    private static final javax.xml.namespace.QName DEFUIPRIORITY$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defUIPriority");
    private static final javax.xml.namespace.QName DEFSEMIHIDDEN$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defSemiHidden");
    private static final javax.xml.namespace.QName DEFUNHIDEWHENUSED$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defUnhideWhenUsed");
    private static final javax.xml.namespace.QName DEFQFORMAT$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defQFormat");
    private static final javax.xml.namespace.QName COUNT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "count");
    
    
    /**
     * Gets a List of "lsdException" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException> getLsdExceptionList()
    {
        final class LsdExceptionList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException get(int i)
                { return CTLatentStylesImpl.this.getLsdExceptionArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException old = CTLatentStylesImpl.this.getLsdExceptionArray(i);
                CTLatentStylesImpl.this.setLsdExceptionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException o)
                { CTLatentStylesImpl.this.insertNewLsdException(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException old = CTLatentStylesImpl.this.getLsdExceptionArray(i);
                CTLatentStylesImpl.this.removeLsdException(i);
                return old;
            }
            
            public int size()
                { return CTLatentStylesImpl.this.sizeOfLsdExceptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LsdExceptionList();
        }
    }
    
    /**
     * Gets array of all "lsdException" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException[] getLsdExceptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LSDEXCEPTION$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lsdException" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException getLsdExceptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException)get_store().find_element_user(LSDEXCEPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lsdException" element
     */
    public int sizeOfLsdExceptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LSDEXCEPTION$0);
        }
    }
    
    /**
     * Sets array of all "lsdException" element
     */
    public void setLsdExceptionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException[] lsdExceptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lsdExceptionArray, LSDEXCEPTION$0);
        }
    }
    
    /**
     * Sets ith "lsdException" element
     */
    public void setLsdExceptionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException lsdException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException)get_store().find_element_user(LSDEXCEPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lsdException);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lsdException" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException insertNewLsdException(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException)get_store().insert_element_user(LSDEXCEPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lsdException" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException addNewLsdException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException)get_store().add_element_user(LSDEXCEPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "lsdException" element
     */
    public void removeLsdException(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LSDEXCEPTION$0, i);
        }
    }
    
    /**
     * Gets the "defLockedState" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefLockedState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFLOCKEDSTATE$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "defLockedState" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefLockedState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFLOCKEDSTATE$2);
            return target;
        }
    }
    
    /**
     * True if has "defLockedState" attribute
     */
    public boolean isSetDefLockedState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFLOCKEDSTATE$2) != null;
        }
    }
    
    /**
     * Sets the "defLockedState" attribute
     */
    public void setDefLockedState(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defLockedState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFLOCKEDSTATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFLOCKEDSTATE$2);
            }
            target.setEnumValue(defLockedState);
        }
    }
    
    /**
     * Sets (as xml) the "defLockedState" attribute
     */
    public void xsetDefLockedState(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defLockedState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFLOCKEDSTATE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(DEFLOCKEDSTATE$2);
            }
            target.set(defLockedState);
        }
    }
    
    /**
     * Unsets the "defLockedState" attribute
     */
    public void unsetDefLockedState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFLOCKEDSTATE$2);
        }
    }
    
    /**
     * Gets the "defUIPriority" attribute
     */
    public java.math.BigInteger getDefUIPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFUIPRIORITY$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "defUIPriority" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetDefUIPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(DEFUIPRIORITY$4);
            return target;
        }
    }
    
    /**
     * True if has "defUIPriority" attribute
     */
    public boolean isSetDefUIPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFUIPRIORITY$4) != null;
        }
    }
    
    /**
     * Sets the "defUIPriority" attribute
     */
    public void setDefUIPriority(java.math.BigInteger defUIPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFUIPRIORITY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFUIPRIORITY$4);
            }
            target.setBigIntegerValue(defUIPriority);
        }
    }
    
    /**
     * Sets (as xml) the "defUIPriority" attribute
     */
    public void xsetDefUIPriority(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber defUIPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(DEFUIPRIORITY$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(DEFUIPRIORITY$4);
            }
            target.set(defUIPriority);
        }
    }
    
    /**
     * Unsets the "defUIPriority" attribute
     */
    public void unsetDefUIPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFUIPRIORITY$4);
        }
    }
    
    /**
     * Gets the "defSemiHidden" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFSEMIHIDDEN$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "defSemiHidden" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFSEMIHIDDEN$6);
            return target;
        }
    }
    
    /**
     * True if has "defSemiHidden" attribute
     */
    public boolean isSetDefSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFSEMIHIDDEN$6) != null;
        }
    }
    
    /**
     * Sets the "defSemiHidden" attribute
     */
    public void setDefSemiHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defSemiHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFSEMIHIDDEN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFSEMIHIDDEN$6);
            }
            target.setEnumValue(defSemiHidden);
        }
    }
    
    /**
     * Sets (as xml) the "defSemiHidden" attribute
     */
    public void xsetDefSemiHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defSemiHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFSEMIHIDDEN$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(DEFSEMIHIDDEN$6);
            }
            target.set(defSemiHidden);
        }
    }
    
    /**
     * Unsets the "defSemiHidden" attribute
     */
    public void unsetDefSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFSEMIHIDDEN$6);
        }
    }
    
    /**
     * Gets the "defUnhideWhenUsed" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "defUnhideWhenUsed" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
            return target;
        }
    }
    
    /**
     * True if has "defUnhideWhenUsed" attribute
     */
    public boolean isSetDefUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFUNHIDEWHENUSED$8) != null;
        }
    }
    
    /**
     * Sets the "defUnhideWhenUsed" attribute
     */
    public void setDefUnhideWhenUsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defUnhideWhenUsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFUNHIDEWHENUSED$8);
            }
            target.setEnumValue(defUnhideWhenUsed);
        }
    }
    
    /**
     * Sets (as xml) the "defUnhideWhenUsed" attribute
     */
    public void xsetDefUnhideWhenUsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defUnhideWhenUsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(DEFUNHIDEWHENUSED$8);
            }
            target.set(defUnhideWhenUsed);
        }
    }
    
    /**
     * Unsets the "defUnhideWhenUsed" attribute
     */
    public void unsetDefUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFUNHIDEWHENUSED$8);
        }
    }
    
    /**
     * Gets the "defQFormat" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFQFORMAT$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "defQFormat" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFQFORMAT$10);
            return target;
        }
    }
    
    /**
     * True if has "defQFormat" attribute
     */
    public boolean isSetDefQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFQFORMAT$10) != null;
        }
    }
    
    /**
     * Sets the "defQFormat" attribute
     */
    public void setDefQFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum defQFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFQFORMAT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFQFORMAT$10);
            }
            target.setEnumValue(defQFormat);
        }
    }
    
    /**
     * Sets (as xml) the "defQFormat" attribute
     */
    public void xsetDefQFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff defQFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFQFORMAT$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(DEFQFORMAT$10);
            }
            target.set(defQFormat);
        }
    }
    
    /**
     * Unsets the "defQFormat" attribute
     */
    public void unsetDefQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFQFORMAT$10);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public java.math.BigInteger getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COUNT$12);
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
    public void setCount(java.math.BigInteger count)
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
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(COUNT$12);
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
