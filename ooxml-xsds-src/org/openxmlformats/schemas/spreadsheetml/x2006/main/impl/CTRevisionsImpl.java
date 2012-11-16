/*
 * XML Type:  CT_Revisions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Revisions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisions
{
    
    public CTRevisionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RRC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rrc");
    private static final javax.xml.namespace.QName RM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rm");
    private static final javax.xml.namespace.QName RCV$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rcv");
    private static final javax.xml.namespace.QName RSNM$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rsnm");
    private static final javax.xml.namespace.QName RIS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ris");
    private static final javax.xml.namespace.QName RCC$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rcc");
    private static final javax.xml.namespace.QName RFMT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rfmt");
    private static final javax.xml.namespace.QName RAF$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "raf");
    private static final javax.xml.namespace.QName RDN$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rdn");
    private static final javax.xml.namespace.QName RCMT$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rcmt");
    private static final javax.xml.namespace.QName RQT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rqt");
    private static final javax.xml.namespace.QName RCFT$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rcft");
    
    
    /**
     * Gets a List of "rrc" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn> getRrcList()
    {
        final class RrcList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn get(int i)
                { return CTRevisionsImpl.this.getRrcArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn old = CTRevisionsImpl.this.getRrcArray(i);
                CTRevisionsImpl.this.setRrcArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn o)
                { CTRevisionsImpl.this.insertNewRrc(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn old = CTRevisionsImpl.this.getRrcArray(i);
                CTRevisionsImpl.this.removeRrc(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRrcArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RrcList();
        }
    }
    
    /**
     * Gets array of all "rrc" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn[] getRrcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RRC$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rrc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn getRrcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn)get_store().find_element_user(RRC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rrc" element
     */
    public int sizeOfRrcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RRC$0);
        }
    }
    
    /**
     * Sets array of all "rrc" element
     */
    public void setRrcArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn[] rrcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rrcArray, RRC$0);
        }
    }
    
    /**
     * Sets ith "rrc" element
     */
    public void setRrcArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn rrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn)get_store().find_element_user(RRC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rrc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rrc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn insertNewRrc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn)get_store().insert_element_user(RRC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rrc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn addNewRrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn)get_store().add_element_user(RRC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rrc" element
     */
    public void removeRrc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RRC$0, i);
        }
    }
    
    /**
     * Gets a List of "rm" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove> getRmList()
    {
        final class RmList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove get(int i)
                { return CTRevisionsImpl.this.getRmArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove old = CTRevisionsImpl.this.getRmArray(i);
                CTRevisionsImpl.this.setRmArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove o)
                { CTRevisionsImpl.this.insertNewRm(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove old = CTRevisionsImpl.this.getRmArray(i);
                CTRevisionsImpl.this.removeRm(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRmArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RmList();
        }
    }
    
    /**
     * Gets array of all "rm" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove[] getRmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RM$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rm" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove getRmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove)get_store().find_element_user(RM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rm" element
     */
    public int sizeOfRmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RM$2);
        }
    }
    
    /**
     * Sets array of all "rm" element
     */
    public void setRmArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove[] rmArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rmArray, RM$2);
        }
    }
    
    /**
     * Sets ith "rm" element
     */
    public void setRmArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove rm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove)get_store().find_element_user(RM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rm" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove insertNewRm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove)get_store().insert_element_user(RM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rm" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove addNewRm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionMove)get_store().add_element_user(RM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "rm" element
     */
    public void removeRm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RM$2, i);
        }
    }
    
    /**
     * Gets a List of "rcv" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView> getRcvList()
    {
        final class RcvList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView get(int i)
                { return CTRevisionsImpl.this.getRcvArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView old = CTRevisionsImpl.this.getRcvArray(i);
                CTRevisionsImpl.this.setRcvArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView o)
                { CTRevisionsImpl.this.insertNewRcv(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView old = CTRevisionsImpl.this.getRcvArray(i);
                CTRevisionsImpl.this.removeRcv(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRcvArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RcvList();
        }
    }
    
    /**
     * Gets array of all "rcv" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView[] getRcvArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RCV$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rcv" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView getRcvArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView)get_store().find_element_user(RCV$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rcv" element
     */
    public int sizeOfRcvArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RCV$4);
        }
    }
    
    /**
     * Sets array of all "rcv" element
     */
    public void setRcvArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView[] rcvArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rcvArray, RCV$4);
        }
    }
    
    /**
     * Sets ith "rcv" element
     */
    public void setRcvArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView rcv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView)get_store().find_element_user(RCV$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rcv);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rcv" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView insertNewRcv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView)get_store().insert_element_user(RCV$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rcv" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView addNewRcv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView)get_store().add_element_user(RCV$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "rcv" element
     */
    public void removeRcv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RCV$4, i);
        }
    }
    
    /**
     * Gets a List of "rsnm" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename> getRsnmList()
    {
        final class RsnmList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename get(int i)
                { return CTRevisionsImpl.this.getRsnmArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename old = CTRevisionsImpl.this.getRsnmArray(i);
                CTRevisionsImpl.this.setRsnmArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename o)
                { CTRevisionsImpl.this.insertNewRsnm(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename old = CTRevisionsImpl.this.getRsnmArray(i);
                CTRevisionsImpl.this.removeRsnm(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRsnmArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RsnmList();
        }
    }
    
    /**
     * Gets array of all "rsnm" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename[] getRsnmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RSNM$6, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rsnm" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename getRsnmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename)get_store().find_element_user(RSNM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rsnm" element
     */
    public int sizeOfRsnmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSNM$6);
        }
    }
    
    /**
     * Sets array of all "rsnm" element
     */
    public void setRsnmArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename[] rsnmArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rsnmArray, RSNM$6);
        }
    }
    
    /**
     * Sets ith "rsnm" element
     */
    public void setRsnmArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename rsnm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename)get_store().find_element_user(RSNM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rsnm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rsnm" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename insertNewRsnm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename)get_store().insert_element_user(RSNM$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rsnm" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename addNewRsnm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionSheetRename)get_store().add_element_user(RSNM$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "rsnm" element
     */
    public void removeRsnm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSNM$6, i);
        }
    }
    
    /**
     * Gets a List of "ris" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet> getRisList()
    {
        final class RisList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet get(int i)
                { return CTRevisionsImpl.this.getRisArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet old = CTRevisionsImpl.this.getRisArray(i);
                CTRevisionsImpl.this.setRisArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet o)
                { CTRevisionsImpl.this.insertNewRis(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet old = CTRevisionsImpl.this.getRisArray(i);
                CTRevisionsImpl.this.removeRis(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRisArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RisList();
        }
    }
    
    /**
     * Gets array of all "ris" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet[] getRisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RIS$8, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ris" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet getRisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet)get_store().find_element_user(RIS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ris" element
     */
    public int sizeOfRisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIS$8);
        }
    }
    
    /**
     * Sets array of all "ris" element
     */
    public void setRisArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet[] risArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(risArray, RIS$8);
        }
    }
    
    /**
     * Sets ith "ris" element
     */
    public void setRisArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet ris)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet)get_store().find_element_user(RIS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ris);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ris" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet insertNewRis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet)get_store().insert_element_user(RIS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ris" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet addNewRis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionInsertSheet)get_store().add_element_user(RIS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "ris" element
     */
    public void removeRis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIS$8, i);
        }
    }
    
    /**
     * Gets a List of "rcc" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange> getRccList()
    {
        final class RccList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange get(int i)
                { return CTRevisionsImpl.this.getRccArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange old = CTRevisionsImpl.this.getRccArray(i);
                CTRevisionsImpl.this.setRccArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange o)
                { CTRevisionsImpl.this.insertNewRcc(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange old = CTRevisionsImpl.this.getRccArray(i);
                CTRevisionsImpl.this.removeRcc(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRccArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RccList();
        }
    }
    
    /**
     * Gets array of all "rcc" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] getRccArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RCC$10, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rcc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange getRccArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().find_element_user(RCC$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rcc" element
     */
    public int sizeOfRccArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RCC$10);
        }
    }
    
    /**
     * Sets array of all "rcc" element
     */
    public void setRccArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] rccArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rccArray, RCC$10);
        }
    }
    
    /**
     * Sets ith "rcc" element
     */
    public void setRccArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange rcc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().find_element_user(RCC$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rcc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rcc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange insertNewRcc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().insert_element_user(RCC$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rcc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange addNewRcc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().add_element_user(RCC$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "rcc" element
     */
    public void removeRcc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RCC$10, i);
        }
    }
    
    /**
     * Gets a List of "rfmt" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting> getRfmtList()
    {
        final class RfmtList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting get(int i)
                { return CTRevisionsImpl.this.getRfmtArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting old = CTRevisionsImpl.this.getRfmtArray(i);
                CTRevisionsImpl.this.setRfmtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting o)
                { CTRevisionsImpl.this.insertNewRfmt(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting old = CTRevisionsImpl.this.getRfmtArray(i);
                CTRevisionsImpl.this.removeRfmt(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRfmtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RfmtList();
        }
    }
    
    /**
     * Gets array of all "rfmt" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] getRfmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RFMT$12, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rfmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting getRfmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().find_element_user(RFMT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rfmt" element
     */
    public int sizeOfRfmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RFMT$12);
        }
    }
    
    /**
     * Sets array of all "rfmt" element
     */
    public void setRfmtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] rfmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rfmtArray, RFMT$12);
        }
    }
    
    /**
     * Sets ith "rfmt" element
     */
    public void setRfmtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting rfmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().find_element_user(RFMT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rfmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rfmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting insertNewRfmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().insert_element_user(RFMT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rfmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting addNewRfmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().add_element_user(RFMT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "rfmt" element
     */
    public void removeRfmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RFMT$12, i);
        }
    }
    
    /**
     * Gets a List of "raf" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting> getRafList()
    {
        final class RafList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting get(int i)
                { return CTRevisionsImpl.this.getRafArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting old = CTRevisionsImpl.this.getRafArray(i);
                CTRevisionsImpl.this.setRafArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting o)
                { CTRevisionsImpl.this.insertNewRaf(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting old = CTRevisionsImpl.this.getRafArray(i);
                CTRevisionsImpl.this.removeRaf(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRafArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RafList();
        }
    }
    
    /**
     * Gets array of all "raf" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting[] getRafArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RAF$14, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "raf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting getRafArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting)get_store().find_element_user(RAF$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "raf" element
     */
    public int sizeOfRafArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RAF$14);
        }
    }
    
    /**
     * Sets array of all "raf" element
     */
    public void setRafArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting[] rafArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rafArray, RAF$14);
        }
    }
    
    /**
     * Sets ith "raf" element
     */
    public void setRafArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting raf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting)get_store().find_element_user(RAF$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(raf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "raf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting insertNewRaf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting)get_store().insert_element_user(RAF$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "raf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting addNewRaf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting)get_store().add_element_user(RAF$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "raf" element
     */
    public void removeRaf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RAF$14, i);
        }
    }
    
    /**
     * Gets a List of "rdn" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName> getRdnList()
    {
        final class RdnList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName get(int i)
                { return CTRevisionsImpl.this.getRdnArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName old = CTRevisionsImpl.this.getRdnArray(i);
                CTRevisionsImpl.this.setRdnArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName o)
                { CTRevisionsImpl.this.insertNewRdn(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName old = CTRevisionsImpl.this.getRdnArray(i);
                CTRevisionsImpl.this.removeRdn(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRdnArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RdnList();
        }
    }
    
    /**
     * Gets array of all "rdn" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName[] getRdnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RDN$16, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rdn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName getRdnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName)get_store().find_element_user(RDN$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rdn" element
     */
    public int sizeOfRdnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RDN$16);
        }
    }
    
    /**
     * Sets array of all "rdn" element
     */
    public void setRdnArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName[] rdnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rdnArray, RDN$16);
        }
    }
    
    /**
     * Sets ith "rdn" element
     */
    public void setRdnArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName rdn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName)get_store().find_element_user(RDN$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rdn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rdn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName insertNewRdn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName)get_store().insert_element_user(RDN$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rdn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName addNewRdn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName)get_store().add_element_user(RDN$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "rdn" element
     */
    public void removeRdn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RDN$16, i);
        }
    }
    
    /**
     * Gets a List of "rcmt" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment> getRcmtList()
    {
        final class RcmtList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment get(int i)
                { return CTRevisionsImpl.this.getRcmtArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment old = CTRevisionsImpl.this.getRcmtArray(i);
                CTRevisionsImpl.this.setRcmtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment o)
                { CTRevisionsImpl.this.insertNewRcmt(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment old = CTRevisionsImpl.this.getRcmtArray(i);
                CTRevisionsImpl.this.removeRcmt(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRcmtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RcmtList();
        }
    }
    
    /**
     * Gets array of all "rcmt" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment[] getRcmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RCMT$18, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rcmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment getRcmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment)get_store().find_element_user(RCMT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rcmt" element
     */
    public int sizeOfRcmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RCMT$18);
        }
    }
    
    /**
     * Sets array of all "rcmt" element
     */
    public void setRcmtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment[] rcmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rcmtArray, RCMT$18);
        }
    }
    
    /**
     * Sets ith "rcmt" element
     */
    public void setRcmtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment rcmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment)get_store().find_element_user(RCMT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rcmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rcmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment insertNewRcmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment)get_store().insert_element_user(RCMT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rcmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment addNewRcmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment)get_store().add_element_user(RCMT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "rcmt" element
     */
    public void removeRcmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RCMT$18, i);
        }
    }
    
    /**
     * Gets a List of "rqt" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField> getRqtList()
    {
        final class RqtList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField get(int i)
                { return CTRevisionsImpl.this.getRqtArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField old = CTRevisionsImpl.this.getRqtArray(i);
                CTRevisionsImpl.this.setRqtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField o)
                { CTRevisionsImpl.this.insertNewRqt(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField old = CTRevisionsImpl.this.getRqtArray(i);
                CTRevisionsImpl.this.removeRqt(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRqtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RqtList();
        }
    }
    
    /**
     * Gets array of all "rqt" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField[] getRqtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RQT$20, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rqt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField getRqtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField)get_store().find_element_user(RQT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rqt" element
     */
    public int sizeOfRqtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RQT$20);
        }
    }
    
    /**
     * Sets array of all "rqt" element
     */
    public void setRqtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField[] rqtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rqtArray, RQT$20);
        }
    }
    
    /**
     * Sets ith "rqt" element
     */
    public void setRqtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField rqt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField)get_store().find_element_user(RQT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rqt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rqt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField insertNewRqt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField)get_store().insert_element_user(RQT$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rqt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField addNewRqt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionQueryTableField)get_store().add_element_user(RQT$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "rqt" element
     */
    public void removeRqt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RQT$20, i);
        }
    }
    
    /**
     * Gets a List of "rcft" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict> getRcftList()
    {
        final class RcftList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict get(int i)
                { return CTRevisionsImpl.this.getRcftArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict old = CTRevisionsImpl.this.getRcftArray(i);
                CTRevisionsImpl.this.setRcftArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict o)
                { CTRevisionsImpl.this.insertNewRcft(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict old = CTRevisionsImpl.this.getRcftArray(i);
                CTRevisionsImpl.this.removeRcft(i);
                return old;
            }
            
            public int size()
                { return CTRevisionsImpl.this.sizeOfRcftArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RcftList();
        }
    }
    
    /**
     * Gets array of all "rcft" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict[] getRcftArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RCFT$22, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rcft" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict getRcftArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict)get_store().find_element_user(RCFT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rcft" element
     */
    public int sizeOfRcftArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RCFT$22);
        }
    }
    
    /**
     * Sets array of all "rcft" element
     */
    public void setRcftArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict[] rcftArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rcftArray, RCFT$22);
        }
    }
    
    /**
     * Sets ith "rcft" element
     */
    public void setRcftArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict rcft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict)get_store().find_element_user(RCFT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rcft);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rcft" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict insertNewRcft(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict)get_store().insert_element_user(RCFT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rcft" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict addNewRcft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionConflict)get_store().add_element_user(RCFT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "rcft" element
     */
    public void removeRcft(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RCFT$22, i);
        }
    }
}
