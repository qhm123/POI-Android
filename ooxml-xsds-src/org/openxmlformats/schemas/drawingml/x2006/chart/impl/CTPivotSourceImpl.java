/*
 * XML Type:  CT_PivotSource
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_PivotSource(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTPivotSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource
{
    
    public CTPivotSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "name");
    private static final javax.xml.namespace.QName FMTID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "fmtId");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.openxmlformats.schemas.drawingml.x2006.chart.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "fmtId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(FMTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmtId" element
     */
    public void setFmtId(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt fmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(FMTID$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(FMTID$2);
            }
            target.set(fmtId);
        }
    }
    
    /**
     * Appends and returns a new empty "fmtId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(FMTID$2);
            return target;
        }
    }
    
    /**
     * Gets a List of "extLst" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList> getExtLstList()
    {
        final class ExtLstList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList get(int i)
                { return CTPivotSourceImpl.this.getExtLstArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList old = CTPivotSourceImpl.this.getExtLstArray(i);
                CTPivotSourceImpl.this.setExtLstArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList o)
                { CTPivotSourceImpl.this.insertNewExtLst(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList old = CTPivotSourceImpl.this.getExtLstArray(i);
                CTPivotSourceImpl.this.removeExtLst(i);
                return old;
            }
            
            public int size()
                { return CTPivotSourceImpl.this.sizeOfExtLstArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExtLstList();
        }
    }
    
    /**
     * Gets array of all "extLst" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList[] getExtLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTLST$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLstArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extLst" element
     */
    public int sizeOfExtLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$4);
        }
    }
    
    /**
     * Sets array of all "extLst" element
     */
    public void setExtLstArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList[] extLstArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extLstArray, EXTLST$4);
        }
    }
    
    /**
     * Sets ith "extLst" element
     */
    public void setExtLstArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extLst);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList insertNewExtLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().insert_element_user(EXTLST$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "extLst" element
     */
    public void removeExtLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$4, i);
        }
    }
}
