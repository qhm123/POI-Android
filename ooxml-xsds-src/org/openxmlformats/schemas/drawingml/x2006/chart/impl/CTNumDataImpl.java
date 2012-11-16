/*
 * XML Type:  CT_NumData
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_NumData(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTNumDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData
{
    
    public CTNumDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMATCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "formatCode");
    private static final javax.xml.namespace.QName PTCOUNT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ptCount");
    private static final javax.xml.namespace.QName PT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pt");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "formatCode" element
     */
    public java.lang.String getFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatCode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.STXstring xgetFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(FORMATCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "formatCode" element
     */
    public boolean isSetFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "formatCode" element
     */
    public void setFormatCode(java.lang.String formatCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMATCODE$0);
            }
            target.setStringValue(formatCode);
        }
    }
    
    /**
     * Sets (as xml) the "formatCode" element
     */
    public void xsetFormatCode(org.openxmlformats.schemas.drawingml.x2006.chart.STXstring formatCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STXstring target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().find_element_user(FORMATCODE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STXstring)get_store().add_element_user(FORMATCODE$0);
            }
            target.set(formatCode);
        }
    }
    
    /**
     * Unsets the "formatCode" element
     */
    public void unsetFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATCODE$0, 0);
        }
    }
    
    /**
     * Gets the "ptCount" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getPtCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(PTCOUNT$2, 0);
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
            return get_store().count_elements(PTCOUNT$2) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(PTCOUNT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(PTCOUNT$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(PTCOUNT$2);
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
            get_store().remove_element(PTCOUNT$2, 0);
        }
    }
    
    /**
     * Gets a List of "pt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal> getPtList()
    {
        final class PtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal get(int i)
                { return CTNumDataImpl.this.getPtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal old = CTNumDataImpl.this.getPtArray(i);
                CTNumDataImpl.this.setPtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal o)
                { CTNumDataImpl.this.insertNewPt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal old = CTNumDataImpl.this.getPtArray(i);
                CTNumDataImpl.this.removePt(i);
                return old;
            }
            
            public int size()
                { return CTNumDataImpl.this.sizeOfPtArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal[] getPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PT$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal getPtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal)get_store().find_element_user(PT$4, i);
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
            return get_store().count_elements(PT$4);
        }
    }
    
    /**
     * Sets array of all "pt" element
     */
    public void setPtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal[] ptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ptArray, PT$4);
        }
    }
    
    /**
     * Sets ith "pt" element
     */
    public void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal pt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal)get_store().find_element_user(PT$4, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal insertNewPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal)get_store().insert_element_user(PT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal addNewPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal)get_store().add_element_user(PT$4);
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
            get_store().remove_element(PT$4, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
}
