/*
 * XML Type:  CT_Columns
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Columns(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColumnsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns
{
    
    public CTColumnsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "col");
    private static final javax.xml.namespace.QName EQUALWIDTH$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "equalWidth");
    private static final javax.xml.namespace.QName SPACE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "space");
    private static final javax.xml.namespace.QName NUM$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "num");
    private static final javax.xml.namespace.QName SEP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sep");
    
    
    /**
     * Gets a List of "col" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn> getColList()
    {
        final class ColList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn get(int i)
                { return CTColumnsImpl.this.getColArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn old = CTColumnsImpl.this.getColArray(i);
                CTColumnsImpl.this.setColArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn o)
                { CTColumnsImpl.this.insertNewCol(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn old = CTColumnsImpl.this.getColArray(i);
                CTColumnsImpl.this.removeCol(i);
                return old;
            }
            
            public int size()
                { return CTColumnsImpl.this.sizeOfColArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColList();
        }
    }
    
    /**
     * Gets array of all "col" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn[] getColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COL$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn getColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn)get_store().find_element_user(COL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col" element
     */
    public int sizeOfColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COL$0);
        }
    }
    
    /**
     * Sets array of all "col" element
     */
    public void setColArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn[] colArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colArray, COL$0);
        }
    }
    
    /**
     * Sets ith "col" element
     */
    public void setColArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn col)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn)get_store().find_element_user(COL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(col);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn insertNewCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn)get_store().insert_element_user(COL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn addNewCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumn)get_store().add_element_user(COL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "col" element
     */
    public void removeCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COL$0, i);
        }
    }
    
    /**
     * Gets the "equalWidth" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getEqualWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUALWIDTH$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "equalWidth" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetEqualWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(EQUALWIDTH$2);
            return target;
        }
    }
    
    /**
     * True if has "equalWidth" attribute
     */
    public boolean isSetEqualWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EQUALWIDTH$2) != null;
        }
    }
    
    /**
     * Sets the "equalWidth" attribute
     */
    public void setEqualWidth(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum equalWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUALWIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQUALWIDTH$2);
            }
            target.setEnumValue(equalWidth);
        }
    }
    
    /**
     * Sets (as xml) the "equalWidth" attribute
     */
    public void xsetEqualWidth(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff equalWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(EQUALWIDTH$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(EQUALWIDTH$2);
            }
            target.set(equalWidth);
        }
    }
    
    /**
     * Unsets the "equalWidth" attribute
     */
    public void unsetEqualWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EQUALWIDTH$2);
        }
    }
    
    /**
     * Gets the "space" attribute
     */
    public java.math.BigInteger getSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "space" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(SPACE$4);
            return target;
        }
    }
    
    /**
     * True if has "space" attribute
     */
    public boolean isSetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPACE$4) != null;
        }
    }
    
    /**
     * Sets the "space" attribute
     */
    public void setSpace(java.math.BigInteger space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$4);
            }
            target.setBigIntegerValue(space);
        }
    }
    
    /**
     * Sets (as xml) the "space" attribute
     */
    public void xsetSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure space)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(SPACE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(SPACE$4);
            }
            target.set(space);
        }
    }
    
    /**
     * Unsets the "space" attribute
     */
    public void unsetSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPACE$4);
        }
    }
    
    /**
     * Gets the "num" attribute
     */
    public java.math.BigInteger getNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUM$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "num" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(NUM$6);
            return target;
        }
    }
    
    /**
     * True if has "num" attribute
     */
    public boolean isSetNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUM$6) != null;
        }
    }
    
    /**
     * Sets the "num" attribute
     */
    public void setNum(java.math.BigInteger num)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUM$6);
            }
            target.setBigIntegerValue(num);
        }
    }
    
    /**
     * Sets (as xml) the "num" attribute
     */
    public void xsetNum(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber num)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(NUM$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(NUM$6);
            }
            target.set(num);
        }
    }
    
    /**
     * Unsets the "num" attribute
     */
    public void unsetNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUM$6);
        }
    }
    
    /**
     * Gets the "sep" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEP$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sep" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SEP$8);
            return target;
        }
    }
    
    /**
     * True if has "sep" attribute
     */
    public boolean isSetSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEP$8) != null;
        }
    }
    
    /**
     * Sets the "sep" attribute
     */
    public void setSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum sep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEP$8);
            }
            target.setEnumValue(sep);
        }
    }
    
    /**
     * Sets (as xml) the "sep" attribute
     */
    public void xsetSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff sep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SEP$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(SEP$8);
            }
            target.set(sep);
        }
    }
    
    /**
     * Unsets the "sep" attribute
     */
    public void unsetSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEP$8);
        }
    }
}
