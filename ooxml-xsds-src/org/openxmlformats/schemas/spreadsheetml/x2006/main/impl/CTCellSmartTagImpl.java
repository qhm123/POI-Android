/*
 * XML Type:  CT_CellSmartTag
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellSmartTag(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellSmartTagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTag
{
    
    public CTCellSmartTagImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLSMARTTAGPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellSmartTagPr");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DELETED$4 = 
        new javax.xml.namespace.QName("", "deleted");
    private static final javax.xml.namespace.QName XMLBASED$6 = 
        new javax.xml.namespace.QName("", "xmlBased");
    
    
    /**
     * Gets a List of "cellSmartTagPr" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr> getCellSmartTagPrList()
    {
        final class CellSmartTagPrList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr get(int i)
                { return CTCellSmartTagImpl.this.getCellSmartTagPrArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr old = CTCellSmartTagImpl.this.getCellSmartTagPrArray(i);
                CTCellSmartTagImpl.this.setCellSmartTagPrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr o)
                { CTCellSmartTagImpl.this.insertNewCellSmartTagPr(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr old = CTCellSmartTagImpl.this.getCellSmartTagPrArray(i);
                CTCellSmartTagImpl.this.removeCellSmartTagPr(i);
                return old;
            }
            
            public int size()
                { return CTCellSmartTagImpl.this.sizeOfCellSmartTagPrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CellSmartTagPrList();
        }
    }
    
    /**
     * Gets array of all "cellSmartTagPr" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr[] getCellSmartTagPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CELLSMARTTAGPR$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cellSmartTagPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr getCellSmartTagPrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr)get_store().find_element_user(CELLSMARTTAGPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cellSmartTagPr" element
     */
    public int sizeOfCellSmartTagPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLSMARTTAGPR$0);
        }
    }
    
    /**
     * Sets array of all "cellSmartTagPr" element
     */
    public void setCellSmartTagPrArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr[] cellSmartTagPrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cellSmartTagPrArray, CELLSMARTTAGPR$0);
        }
    }
    
    /**
     * Sets ith "cellSmartTagPr" element
     */
    public void setCellSmartTagPrArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr cellSmartTagPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr)get_store().find_element_user(CELLSMARTTAGPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cellSmartTagPr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cellSmartTagPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr insertNewCellSmartTagPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr)get_store().insert_element_user(CELLSMARTTAGPR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cellSmartTagPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr addNewCellSmartTagPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellSmartTagPr)get_store().add_element_user(CELLSMARTTAGPR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cellSmartTagPr" element
     */
    public void removeCellSmartTagPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLSMARTTAGPR$0, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public long getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(long type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setLongValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlUnsignedInt type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "deleted" attribute
     */
    public boolean getDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELETED$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "deleted" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELETED$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "deleted" attribute
     */
    public boolean isSetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELETED$4) != null;
        }
    }
    
    /**
     * Sets the "deleted" attribute
     */
    public void setDeleted(boolean deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETED$4);
            }
            target.setBooleanValue(deleted);
        }
    }
    
    /**
     * Sets (as xml) the "deleted" attribute
     */
    public void xsetDeleted(org.apache.xmlbeans.XmlBoolean deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELETED$4);
            }
            target.set(deleted);
        }
    }
    
    /**
     * Unsets the "deleted" attribute
     */
    public void unsetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELETED$4);
        }
    }
    
    /**
     * Gets the "xmlBased" attribute
     */
    public boolean getXmlBased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLBASED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XMLBASED$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xmlBased" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetXmlBased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XMLBASED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(XMLBASED$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "xmlBased" attribute
     */
    public boolean isSetXmlBased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XMLBASED$6) != null;
        }
    }
    
    /**
     * Sets the "xmlBased" attribute
     */
    public void setXmlBased(boolean xmlBased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLBASED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLBASED$6);
            }
            target.setBooleanValue(xmlBased);
        }
    }
    
    /**
     * Sets (as xml) the "xmlBased" attribute
     */
    public void xsetXmlBased(org.apache.xmlbeans.XmlBoolean xmlBased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XMLBASED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(XMLBASED$6);
            }
            target.set(xmlBased);
        }
    }
    
    /**
     * Unsets the "xmlBased" attribute
     */
    public void unsetXmlBased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XMLBASED$6);
        }
    }
}
