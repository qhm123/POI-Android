/*
 * XML Type:  CT_Location
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Location(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation
{
    
    public CTLocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REF$0 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName FIRSTHEADERROW$2 = 
        new javax.xml.namespace.QName("", "firstHeaderRow");
    private static final javax.xml.namespace.QName FIRSTDATAROW$4 = 
        new javax.xml.namespace.QName("", "firstDataRow");
    private static final javax.xml.namespace.QName FIRSTDATACOL$6 = 
        new javax.xml.namespace.QName("", "firstDataCol");
    private static final javax.xml.namespace.QName ROWPAGECOUNT$8 = 
        new javax.xml.namespace.QName("", "rowPageCount");
    private static final javax.xml.namespace.QName COLPAGECOUNT$10 = 
        new javax.xml.namespace.QName("", "colPageCount");
    
    
    /**
     * Gets the "ref" attribute
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$0);
            return target;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef(java.lang.String ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$0);
            }
            target.setStringValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$0);
            }
            target.set(ref);
        }
    }
    
    /**
     * Gets the "firstHeaderRow" attribute
     */
    public long getFirstHeaderRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTHEADERROW$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstHeaderRow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFirstHeaderRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTHEADERROW$2);
            return target;
        }
    }
    
    /**
     * Sets the "firstHeaderRow" attribute
     */
    public void setFirstHeaderRow(long firstHeaderRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTHEADERROW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTHEADERROW$2);
            }
            target.setLongValue(firstHeaderRow);
        }
    }
    
    /**
     * Sets (as xml) the "firstHeaderRow" attribute
     */
    public void xsetFirstHeaderRow(org.apache.xmlbeans.XmlUnsignedInt firstHeaderRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTHEADERROW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIRSTHEADERROW$2);
            }
            target.set(firstHeaderRow);
        }
    }
    
    /**
     * Gets the "firstDataRow" attribute
     */
    public long getFirstDataRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTDATAROW$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstDataRow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFirstDataRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTDATAROW$4);
            return target;
        }
    }
    
    /**
     * Sets the "firstDataRow" attribute
     */
    public void setFirstDataRow(long firstDataRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTDATAROW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTDATAROW$4);
            }
            target.setLongValue(firstDataRow);
        }
    }
    
    /**
     * Sets (as xml) the "firstDataRow" attribute
     */
    public void xsetFirstDataRow(org.apache.xmlbeans.XmlUnsignedInt firstDataRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTDATAROW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIRSTDATAROW$4);
            }
            target.set(firstDataRow);
        }
    }
    
    /**
     * Gets the "firstDataCol" attribute
     */
    public long getFirstDataCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTDATACOL$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstDataCol" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFirstDataCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTDATACOL$6);
            return target;
        }
    }
    
    /**
     * Sets the "firstDataCol" attribute
     */
    public void setFirstDataCol(long firstDataCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTDATACOL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTDATACOL$6);
            }
            target.setLongValue(firstDataCol);
        }
    }
    
    /**
     * Sets (as xml) the "firstDataCol" attribute
     */
    public void xsetFirstDataCol(org.apache.xmlbeans.XmlUnsignedInt firstDataCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIRSTDATACOL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIRSTDATACOL$6);
            }
            target.set(firstDataCol);
        }
    }
    
    /**
     * Gets the "rowPageCount" attribute
     */
    public long getRowPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWPAGECOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROWPAGECOUNT$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowPageCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRowPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ROWPAGECOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ROWPAGECOUNT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "rowPageCount" attribute
     */
    public boolean isSetRowPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWPAGECOUNT$8) != null;
        }
    }
    
    /**
     * Sets the "rowPageCount" attribute
     */
    public void setRowPageCount(long rowPageCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWPAGECOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWPAGECOUNT$8);
            }
            target.setLongValue(rowPageCount);
        }
    }
    
    /**
     * Sets (as xml) the "rowPageCount" attribute
     */
    public void xsetRowPageCount(org.apache.xmlbeans.XmlUnsignedInt rowPageCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ROWPAGECOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ROWPAGECOUNT$8);
            }
            target.set(rowPageCount);
        }
    }
    
    /**
     * Unsets the "rowPageCount" attribute
     */
    public void unsetRowPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWPAGECOUNT$8);
        }
    }
    
    /**
     * Gets the "colPageCount" attribute
     */
    public long getColPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLPAGECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLPAGECOUNT$10);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "colPageCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetColPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLPAGECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COLPAGECOUNT$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "colPageCount" attribute
     */
    public boolean isSetColPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLPAGECOUNT$10) != null;
        }
    }
    
    /**
     * Sets the "colPageCount" attribute
     */
    public void setColPageCount(long colPageCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLPAGECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLPAGECOUNT$10);
            }
            target.setLongValue(colPageCount);
        }
    }
    
    /**
     * Sets (as xml) the "colPageCount" attribute
     */
    public void xsetColPageCount(org.apache.xmlbeans.XmlUnsignedInt colPageCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLPAGECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COLPAGECOUNT$10);
            }
            target.set(colPageCount);
        }
    }
    
    /**
     * Unsets the "colPageCount" attribute
     */
    public void unsetColPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLPAGECOUNT$10);
        }
    }
}
