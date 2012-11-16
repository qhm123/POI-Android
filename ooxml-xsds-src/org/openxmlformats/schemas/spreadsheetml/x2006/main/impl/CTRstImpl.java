/*
 * XML Type:  CT_Rst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Rst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst
{
    
    public CTRstImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName T$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "t");
    private static final javax.xml.namespace.QName R$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "r");
    private static final javax.xml.namespace.QName RPH$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rPh");
    private static final javax.xml.namespace.QName PHONETICPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "phoneticPr");
    
    
    /**
     * Gets the "t" element
     */
    public java.lang.String getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(T$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "t" element
     */
    public boolean isSetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(T$0) != 0;
        }
    }
    
    /**
     * Sets the "t" element
     */
    public void setT(java.lang.String t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(T$0);
            }
            target.setStringValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" element
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(T$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(T$0);
            }
            target.set(t);
        }
    }
    
    /**
     * Unsets the "t" element
     */
    public void unsetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(T$0, 0);
        }
    }
    
    /**
     * Gets a List of "r" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt> getRList()
    {
        final class RList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt get(int i)
                { return CTRstImpl.this.getRArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt old = CTRstImpl.this.getRArray(i);
                CTRstImpl.this.setRArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt o)
                { CTRstImpl.this.insertNewR(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt old = CTRstImpl.this.getRArray(i);
                CTRstImpl.this.removeR(i);
                return old;
            }
            
            public int size()
                { return CTRstImpl.this.sizeOfRArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RList();
        }
    }
    
    /**
     * Gets array of all "r" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[] getRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "r" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt getRArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt)get_store().find_element_user(R$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "r" element
     */
    public int sizeOfRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R$2);
        }
    }
    
    /**
     * Sets array of all "r" element
     */
    public void setRArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt[] rArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rArray, R$2);
        }
    }
    
    /**
     * Sets ith "r" element
     */
    public void setRArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt)get_store().find_element_user(R$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(r);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt insertNewR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt)get_store().insert_element_user(R$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt addNewR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt)get_store().add_element_user(R$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "r" element
     */
    public void removeR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R$2, i);
        }
    }
    
    /**
     * Gets a List of "rPh" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun> getRPhList()
    {
        final class RPhList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun get(int i)
                { return CTRstImpl.this.getRPhArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun old = CTRstImpl.this.getRPhArray(i);
                CTRstImpl.this.setRPhArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun o)
                { CTRstImpl.this.insertNewRPh(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun old = CTRstImpl.this.getRPhArray(i);
                CTRstImpl.this.removeRPh(i);
                return old;
            }
            
            public int size()
                { return CTRstImpl.this.sizeOfRPhArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RPhList();
        }
    }
    
    /**
     * Gets array of all "rPh" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun[] getRPhArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RPH$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rPh" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun getRPhArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun)get_store().find_element_user(RPH$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rPh" element
     */
    public int sizeOfRPhArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPH$4);
        }
    }
    
    /**
     * Sets array of all "rPh" element
     */
    public void setRPhArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun[] rPhArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rPhArray, RPH$4);
        }
    }
    
    /**
     * Sets ith "rPh" element
     */
    public void setRPhArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun rPh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun)get_store().find_element_user(RPH$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rPh);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rPh" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun insertNewRPh(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun)get_store().insert_element_user(RPH$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rPh" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun addNewRPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun)get_store().add_element_user(RPH$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "rPh" element
     */
    public void removeRPh(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPH$4, i);
        }
    }
    
    /**
     * Gets the "phoneticPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr getPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().find_element_user(PHONETICPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "phoneticPr" element
     */
    public boolean isSetPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONETICPR$6) != 0;
        }
    }
    
    /**
     * Sets the "phoneticPr" element
     */
    public void setPhoneticPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr phoneticPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().find_element_user(PHONETICPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().add_element_user(PHONETICPR$6);
            }
            target.set(phoneticPr);
        }
    }
    
    /**
     * Appends and returns a new empty "phoneticPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr addNewPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().add_element_user(PHONETICPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "phoneticPr" element
     */
    public void unsetPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONETICPR$6, 0);
        }
    }
}
