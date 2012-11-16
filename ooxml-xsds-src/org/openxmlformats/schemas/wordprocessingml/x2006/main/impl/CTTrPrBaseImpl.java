/*
 * XML Type:  CT_TrPrBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TrPrBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTrPrBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase
{
    
    public CTTrPrBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CNFSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cnfStyle");
    private static final javax.xml.namespace.QName DIVID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "divId");
    private static final javax.xml.namespace.QName GRIDBEFORE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridBefore");
    private static final javax.xml.namespace.QName GRIDAFTER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridAfter");
    private static final javax.xml.namespace.QName WBEFORE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "wBefore");
    private static final javax.xml.namespace.QName WAFTER$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "wAfter");
    private static final javax.xml.namespace.QName CANTSPLIT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cantSplit");
    private static final javax.xml.namespace.QName TRHEIGHT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trHeight");
    private static final javax.xml.namespace.QName TBLHEADER$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblHeader");
    private static final javax.xml.namespace.QName TBLCELLSPACING$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellSpacing");
    private static final javax.xml.namespace.QName JC$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "jc");
    private static final javax.xml.namespace.QName HIDDEN$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hidden");
    
    
    /**
     * Gets a List of "cnfStyle" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf> getCnfStyleList()
    {
        final class CnfStyleList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf get(int i)
                { return CTTrPrBaseImpl.this.getCnfStyleArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf old = CTTrPrBaseImpl.this.getCnfStyleArray(i);
                CTTrPrBaseImpl.this.setCnfStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf o)
                { CTTrPrBaseImpl.this.insertNewCnfStyle(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf old = CTTrPrBaseImpl.this.getCnfStyleArray(i);
                CTTrPrBaseImpl.this.removeCnfStyle(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfCnfStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CnfStyleList();
        }
    }
    
    /**
     * Gets array of all "cnfStyle" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf[] getCnfStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CNFSTYLE$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cnfStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf getCnfStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().find_element_user(CNFSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cnfStyle" element
     */
    public int sizeOfCnfStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CNFSTYLE$0);
        }
    }
    
    /**
     * Sets array of all "cnfStyle" element
     */
    public void setCnfStyleArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf[] cnfStyleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cnfStyleArray, CNFSTYLE$0);
        }
    }
    
    /**
     * Sets ith "cnfStyle" element
     */
    public void setCnfStyleArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf cnfStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().find_element_user(CNFSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cnfStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cnfStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf insertNewCnfStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().insert_element_user(CNFSTYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cnfStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf addNewCnfStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().add_element_user(CNFSTYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cnfStyle" element
     */
    public void removeCnfStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CNFSTYLE$0, i);
        }
    }
    
    /**
     * Gets a List of "divId" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber> getDivIdList()
    {
        final class DivIdList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber get(int i)
                { return CTTrPrBaseImpl.this.getDivIdArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTTrPrBaseImpl.this.getDivIdArray(i);
                CTTrPrBaseImpl.this.setDivIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
                { CTTrPrBaseImpl.this.insertNewDivId(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTTrPrBaseImpl.this.getDivIdArray(i);
                CTTrPrBaseImpl.this.removeDivId(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfDivIdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DivIdList();
        }
    }
    
    /**
     * Gets array of all "divId" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] getDivIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIVID$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "divId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getDivIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DIVID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "divId" element
     */
    public int sizeOfDivIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIVID$2);
        }
    }
    
    /**
     * Sets array of all "divId" element
     */
    public void setDivIdArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] divIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(divIdArray, DIVID$2);
        }
    }
    
    /**
     * Sets ith "divId" element
     */
    public void setDivIdArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber divId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(DIVID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(divId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "divId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber insertNewDivId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().insert_element_user(DIVID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "divId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewDivId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(DIVID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "divId" element
     */
    public void removeDivId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIVID$2, i);
        }
    }
    
    /**
     * Gets a List of "gridBefore" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber> getGridBeforeList()
    {
        final class GridBeforeList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber get(int i)
                { return CTTrPrBaseImpl.this.getGridBeforeArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTTrPrBaseImpl.this.getGridBeforeArray(i);
                CTTrPrBaseImpl.this.setGridBeforeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
                { CTTrPrBaseImpl.this.insertNewGridBefore(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTTrPrBaseImpl.this.getGridBeforeArray(i);
                CTTrPrBaseImpl.this.removeGridBefore(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfGridBeforeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GridBeforeList();
        }
    }
    
    /**
     * Gets array of all "gridBefore" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] getGridBeforeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRIDBEFORE$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gridBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getGridBeforeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(GRIDBEFORE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gridBefore" element
     */
    public int sizeOfGridBeforeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDBEFORE$4);
        }
    }
    
    /**
     * Sets array of all "gridBefore" element
     */
    public void setGridBeforeArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] gridBeforeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gridBeforeArray, GRIDBEFORE$4);
        }
    }
    
    /**
     * Sets ith "gridBefore" element
     */
    public void setGridBeforeArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber gridBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(GRIDBEFORE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gridBefore);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gridBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber insertNewGridBefore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().insert_element_user(GRIDBEFORE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gridBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewGridBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(GRIDBEFORE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "gridBefore" element
     */
    public void removeGridBefore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDBEFORE$4, i);
        }
    }
    
    /**
     * Gets a List of "gridAfter" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber> getGridAfterList()
    {
        final class GridAfterList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber get(int i)
                { return CTTrPrBaseImpl.this.getGridAfterArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTTrPrBaseImpl.this.getGridAfterArray(i);
                CTTrPrBaseImpl.this.setGridAfterArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
                { CTTrPrBaseImpl.this.insertNewGridAfter(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTTrPrBaseImpl.this.getGridAfterArray(i);
                CTTrPrBaseImpl.this.removeGridAfter(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfGridAfterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GridAfterList();
        }
    }
    
    /**
     * Gets array of all "gridAfter" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] getGridAfterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRIDAFTER$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gridAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getGridAfterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(GRIDAFTER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gridAfter" element
     */
    public int sizeOfGridAfterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDAFTER$6);
        }
    }
    
    /**
     * Sets array of all "gridAfter" element
     */
    public void setGridAfterArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] gridAfterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gridAfterArray, GRIDAFTER$6);
        }
    }
    
    /**
     * Sets ith "gridAfter" element
     */
    public void setGridAfterArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber gridAfter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(GRIDAFTER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gridAfter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gridAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber insertNewGridAfter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().insert_element_user(GRIDAFTER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gridAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewGridAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(GRIDAFTER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "gridAfter" element
     */
    public void removeGridAfter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDAFTER$6, i);
        }
    }
    
    /**
     * Gets a List of "wBefore" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth> getWBeforeList()
    {
        final class WBeforeList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth get(int i)
                { return CTTrPrBaseImpl.this.getWBeforeArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth old = CTTrPrBaseImpl.this.getWBeforeArray(i);
                CTTrPrBaseImpl.this.setWBeforeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth o)
                { CTTrPrBaseImpl.this.insertNewWBefore(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth old = CTTrPrBaseImpl.this.getWBeforeArray(i);
                CTTrPrBaseImpl.this.removeWBefore(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfWBeforeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WBeforeList();
        }
    }
    
    /**
     * Gets array of all "wBefore" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] getWBeforeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WBEFORE$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getWBeforeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(WBEFORE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wBefore" element
     */
    public int sizeOfWBeforeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WBEFORE$8);
        }
    }
    
    /**
     * Sets array of all "wBefore" element
     */
    public void setWBeforeArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] wBeforeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wBeforeArray, WBEFORE$8);
        }
    }
    
    /**
     * Sets ith "wBefore" element
     */
    public void setWBeforeArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth wBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(WBEFORE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wBefore);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth insertNewWBefore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().insert_element_user(WBEFORE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wBefore" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth addNewWBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(WBEFORE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "wBefore" element
     */
    public void removeWBefore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WBEFORE$8, i);
        }
    }
    
    /**
     * Gets a List of "wAfter" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth> getWAfterList()
    {
        final class WAfterList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth get(int i)
                { return CTTrPrBaseImpl.this.getWAfterArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth old = CTTrPrBaseImpl.this.getWAfterArray(i);
                CTTrPrBaseImpl.this.setWAfterArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth o)
                { CTTrPrBaseImpl.this.insertNewWAfter(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth old = CTTrPrBaseImpl.this.getWAfterArray(i);
                CTTrPrBaseImpl.this.removeWAfter(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfWAfterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WAfterList();
        }
    }
    
    /**
     * Gets array of all "wAfter" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] getWAfterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WAFTER$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getWAfterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(WAFTER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wAfter" element
     */
    public int sizeOfWAfterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAFTER$10);
        }
    }
    
    /**
     * Sets array of all "wAfter" element
     */
    public void setWAfterArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] wAfterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wAfterArray, WAFTER$10);
        }
    }
    
    /**
     * Sets ith "wAfter" element
     */
    public void setWAfterArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth wAfter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(WAFTER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wAfter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth insertNewWAfter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().insert_element_user(WAFTER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wAfter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth addNewWAfter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(WAFTER$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "wAfter" element
     */
    public void removeWAfter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAFTER$10, i);
        }
    }
    
    /**
     * Gets a List of "cantSplit" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getCantSplitList()
    {
        final class CantSplitList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTTrPrBaseImpl.this.getCantSplitArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTTrPrBaseImpl.this.getCantSplitArray(i);
                CTTrPrBaseImpl.this.setCantSplitArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTTrPrBaseImpl.this.insertNewCantSplit(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTTrPrBaseImpl.this.getCantSplitArray(i);
                CTTrPrBaseImpl.this.removeCantSplit(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfCantSplitArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CantSplitList();
        }
    }
    
    /**
     * Gets array of all "cantSplit" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getCantSplitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CANTSPLIT$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cantSplit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getCantSplitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CANTSPLIT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cantSplit" element
     */
    public int sizeOfCantSplitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANTSPLIT$12);
        }
    }
    
    /**
     * Sets array of all "cantSplit" element
     */
    public void setCantSplitArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] cantSplitArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cantSplitArray, CANTSPLIT$12);
        }
    }
    
    /**
     * Sets ith "cantSplit" element
     */
    public void setCantSplitArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff cantSplit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CANTSPLIT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cantSplit);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cantSplit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewCantSplit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(CANTSPLIT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cantSplit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewCantSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(CANTSPLIT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "cantSplit" element
     */
    public void removeCantSplit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANTSPLIT$12, i);
        }
    }
    
    /**
     * Gets a List of "trHeight" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight> getTrHeightList()
    {
        final class TrHeightList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight get(int i)
                { return CTTrPrBaseImpl.this.getTrHeightArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight old = CTTrPrBaseImpl.this.getTrHeightArray(i);
                CTTrPrBaseImpl.this.setTrHeightArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight o)
                { CTTrPrBaseImpl.this.insertNewTrHeight(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight old = CTTrPrBaseImpl.this.getTrHeightArray(i);
                CTTrPrBaseImpl.this.removeTrHeight(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfTrHeightArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TrHeightList();
        }
    }
    
    /**
     * Gets array of all "trHeight" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight[] getTrHeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRHEIGHT$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "trHeight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight getTrHeightArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight)get_store().find_element_user(TRHEIGHT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "trHeight" element
     */
    public int sizeOfTrHeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRHEIGHT$14);
        }
    }
    
    /**
     * Sets array of all "trHeight" element
     */
    public void setTrHeightArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight[] trHeightArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(trHeightArray, TRHEIGHT$14);
        }
    }
    
    /**
     * Sets ith "trHeight" element
     */
    public void setTrHeightArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight trHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight)get_store().find_element_user(TRHEIGHT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(trHeight);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "trHeight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight insertNewTrHeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight)get_store().insert_element_user(TRHEIGHT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "trHeight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight addNewTrHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight)get_store().add_element_user(TRHEIGHT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "trHeight" element
     */
    public void removeTrHeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRHEIGHT$14, i);
        }
    }
    
    /**
     * Gets a List of "tblHeader" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getTblHeaderList()
    {
        final class TblHeaderList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTTrPrBaseImpl.this.getTblHeaderArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTTrPrBaseImpl.this.getTblHeaderArray(i);
                CTTrPrBaseImpl.this.setTblHeaderArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTTrPrBaseImpl.this.insertNewTblHeader(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTTrPrBaseImpl.this.getTblHeaderArray(i);
                CTTrPrBaseImpl.this.removeTblHeader(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfTblHeaderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TblHeaderList();
        }
    }
    
    /**
     * Gets array of all "tblHeader" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getTblHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TBLHEADER$16, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tblHeader" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getTblHeaderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TBLHEADER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tblHeader" element
     */
    public int sizeOfTblHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLHEADER$16);
        }
    }
    
    /**
     * Sets array of all "tblHeader" element
     */
    public void setTblHeaderArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] tblHeaderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tblHeaderArray, TBLHEADER$16);
        }
    }
    
    /**
     * Sets ith "tblHeader" element
     */
    public void setTblHeaderArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff tblHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TBLHEADER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tblHeader);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tblHeader" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewTblHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(TBLHEADER$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tblHeader" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewTblHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TBLHEADER$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "tblHeader" element
     */
    public void removeTblHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLHEADER$16, i);
        }
    }
    
    /**
     * Gets a List of "tblCellSpacing" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth> getTblCellSpacingList()
    {
        final class TblCellSpacingList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth get(int i)
                { return CTTrPrBaseImpl.this.getTblCellSpacingArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth old = CTTrPrBaseImpl.this.getTblCellSpacingArray(i);
                CTTrPrBaseImpl.this.setTblCellSpacingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth o)
                { CTTrPrBaseImpl.this.insertNewTblCellSpacing(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth old = CTTrPrBaseImpl.this.getTblCellSpacingArray(i);
                CTTrPrBaseImpl.this.removeTblCellSpacing(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfTblCellSpacingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TblCellSpacingList();
        }
    }
    
    /**
     * Gets array of all "tblCellSpacing" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] getTblCellSpacingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TBLCELLSPACING$18, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tblCellSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getTblCellSpacingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLCELLSPACING$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tblCellSpacing" element
     */
    public int sizeOfTblCellSpacingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLCELLSPACING$18);
        }
    }
    
    /**
     * Sets array of all "tblCellSpacing" element
     */
    public void setTblCellSpacingArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth[] tblCellSpacingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tblCellSpacingArray, TBLCELLSPACING$18);
        }
    }
    
    /**
     * Sets ith "tblCellSpacing" element
     */
    public void setTblCellSpacingArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth tblCellSpacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLCELLSPACING$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tblCellSpacing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tblCellSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth insertNewTblCellSpacing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().insert_element_user(TBLCELLSPACING$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tblCellSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth addNewTblCellSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLCELLSPACING$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "tblCellSpacing" element
     */
    public void removeTblCellSpacing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLCELLSPACING$18, i);
        }
    }
    
    /**
     * Gets a List of "jc" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc> getJcList()
    {
        final class JcList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc get(int i)
                { return CTTrPrBaseImpl.this.getJcArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc old = CTTrPrBaseImpl.this.getJcArray(i);
                CTTrPrBaseImpl.this.setJcArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc o)
                { CTTrPrBaseImpl.this.insertNewJc(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc old = CTTrPrBaseImpl.this.getJcArray(i);
                CTTrPrBaseImpl.this.removeJc(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfJcArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JcList();
        }
    }
    
    /**
     * Gets array of all "jc" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc[] getJcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(JC$20, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "jc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc getJcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(JC$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "jc" element
     */
    public int sizeOfJcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JC$20);
        }
    }
    
    /**
     * Sets array of all "jc" element
     */
    public void setJcArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc[] jcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jcArray, JC$20);
        }
    }
    
    /**
     * Sets ith "jc" element
     */
    public void setJcArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc jc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(JC$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(jc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc insertNewJc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().insert_element_user(JC$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc addNewJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().add_element_user(JC$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "jc" element
     */
    public void removeJc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JC$20, i);
        }
    }
    
    /**
     * Gets a List of "hidden" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getHiddenList()
    {
        final class HiddenList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTTrPrBaseImpl.this.getHiddenArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTTrPrBaseImpl.this.getHiddenArray(i);
                CTTrPrBaseImpl.this.setHiddenArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTTrPrBaseImpl.this.insertNewHidden(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTTrPrBaseImpl.this.getHiddenArray(i);
                CTTrPrBaseImpl.this.removeHidden(i);
                return old;
            }
            
            public int size()
                { return CTTrPrBaseImpl.this.sizeOfHiddenArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HiddenList();
        }
    }
    
    /**
     * Gets array of all "hidden" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getHiddenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIDDEN$22, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getHiddenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDDEN$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hidden" element
     */
    public int sizeOfHiddenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDDEN$22);
        }
    }
    
    /**
     * Sets array of all "hidden" element
     */
    public void setHiddenArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] hiddenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hiddenArray, HIDDEN$22);
        }
    }
    
    /**
     * Sets ith "hidden" element
     */
    public void setHiddenArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDDEN$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hidden);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewHidden(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(HIDDEN$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDDEN$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "hidden" element
     */
    public void removeHidden(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDDEN$22, i);
        }
    }
}
