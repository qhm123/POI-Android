/*
 * XML Type:  CT_StrData
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_StrData(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTStrDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData
{
    
    public CTStrDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PTCOUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ptCount");
    private static final javax.xml.namespace.QName PT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pt");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "ptCount" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getPtCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(PTCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ptCount" element
     */
    public boolean isSetPtCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PTCOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "ptCount" element
     */
    public void setPtCount(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt ptCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(PTCOUNT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(PTCOUNT$0);
            }
            target.set(ptCount);
        }
    }
    
    /**
     * Appends and returns a new empty "ptCount" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewPtCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(PTCOUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ptCount" element
     */
    public void unsetPtCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PTCOUNT$0, 0);
        }
    }
    
    /**
     * Gets a List of "pt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal> getPtList()
    {
        final class PtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal get(int i)
                { return CTStrDataImpl.this.getPtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal old = CTStrDataImpl.this.getPtArray(i);
                CTStrDataImpl.this.setPtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal o)
                { CTStrDataImpl.this.insertNewPt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal old = CTStrDataImpl.this.getPtArray(i);
                CTStrDataImpl.this.removePt(i);
                return old;
            }
            
            public int size()
                { return CTStrDataImpl.this.sizeOfPtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PtList();
        }
    }
    
    /**
     * Gets array of all "pt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] getPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PT$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal getPtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().find_element_user(PT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pt" element
     */
    public int sizeOfPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PT$2);
        }
    }
    
    /**
     * Sets array of all "pt" element
     */
    public void setPtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] ptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ptArray, PT$2);
        }
    }
    
    /**
     * Sets ith "pt" element
     */
    public void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal pt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().find_element_user(PT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal insertNewPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().insert_element_user(PT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal addNewPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().add_element_user(PT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "pt" element
     */
    public void removePt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PT$2, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$4) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
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
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$4, 0);
        }
    }
}
