/*
 * XML Type:  CT_MultiLvlStrData
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_MultiLvlStrData(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTMultiLvlStrDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData
{
    
    public CTMultiLvlStrDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PTCOUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ptCount");
    private static final javax.xml.namespace.QName LVL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "lvl");
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
     * Gets a List of "lvl" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl> getLvlList()
    {
        final class LvlList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl get(int i)
                { return CTMultiLvlStrDataImpl.this.getLvlArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl old = CTMultiLvlStrDataImpl.this.getLvlArray(i);
                CTMultiLvlStrDataImpl.this.setLvlArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl o)
                { CTMultiLvlStrDataImpl.this.insertNewLvl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl old = CTMultiLvlStrDataImpl.this.getLvlArray(i);
                CTMultiLvlStrDataImpl.this.removeLvl(i);
                return old;
            }
            
            public int size()
                { return CTMultiLvlStrDataImpl.this.sizeOfLvlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LvlList();
        }
    }
    
    /**
     * Gets array of all "lvl" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl[] getLvlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LVL$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lvl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl getLvlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl)get_store().find_element_user(LVL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lvl" element
     */
    public int sizeOfLvlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL$2);
        }
    }
    
    /**
     * Sets array of all "lvl" element
     */
    public void setLvlArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl[] lvlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lvlArray, LVL$2);
        }
    }
    
    /**
     * Sets ith "lvl" element
     */
    public void setLvlArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl lvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl)get_store().find_element_user(LVL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lvl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lvl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl insertNewLvl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl)get_store().insert_element_user(LVL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lvl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl addNewLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl)get_store().add_element_user(LVL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "lvl" element
     */
    public void removeLvl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL$2, i);
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
