/*
 * XML Type:  CT_MultiLvlStrRef
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_MultiLvlStrRef(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTMultiLvlStrRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrRef
{
    
    public CTMultiLvlStrRefImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName F$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "f");
    private static final javax.xml.namespace.QName MULTILVLSTRCACHE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "multiLvlStrCache");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "f" element
     */
    public java.lang.String getF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(F$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "f" element
     */
    public org.apache.xmlbeans.XmlString xgetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(F$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "f" element
     */
    public void setF(java.lang.String f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(F$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(F$0);
            }
            target.setStringValue(f);
        }
    }
    
    /**
     * Sets (as xml) the "f" element
     */
    public void xsetF(org.apache.xmlbeans.XmlString f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(F$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(F$0);
            }
            target.set(f);
        }
    }
    
    /**
     * Gets the "multiLvlStrCache" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData getMultiLvlStrCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData)get_store().find_element_user(MULTILVLSTRCACHE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "multiLvlStrCache" element
     */
    public boolean isSetMultiLvlStrCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTILVLSTRCACHE$2) != 0;
        }
    }
    
    /**
     * Sets the "multiLvlStrCache" element
     */
    public void setMultiLvlStrCache(org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData multiLvlStrCache)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData)get_store().find_element_user(MULTILVLSTRCACHE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData)get_store().add_element_user(MULTILVLSTRCACHE$2);
            }
            target.set(multiLvlStrCache);
        }
    }
    
    /**
     * Appends and returns a new empty "multiLvlStrCache" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData addNewMultiLvlStrCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTMultiLvlStrData)get_store().add_element_user(MULTILVLSTRCACHE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "multiLvlStrCache" element
     */
    public void unsetMultiLvlStrCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTILVLSTRCACHE$2, 0);
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
