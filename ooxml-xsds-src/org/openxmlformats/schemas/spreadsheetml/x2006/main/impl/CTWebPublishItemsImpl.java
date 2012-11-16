/*
 * XML Type:  CT_WebPublishItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_WebPublishItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWebPublishItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems
{
    
    public CTWebPublishItemsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBPUBLISHITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishItem");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "webPublishItem" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem> getWebPublishItemList()
    {
        final class WebPublishItemList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem get(int i)
                { return CTWebPublishItemsImpl.this.getWebPublishItemArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem old = CTWebPublishItemsImpl.this.getWebPublishItemArray(i);
                CTWebPublishItemsImpl.this.setWebPublishItemArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem o)
                { CTWebPublishItemsImpl.this.insertNewWebPublishItem(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem old = CTWebPublishItemsImpl.this.getWebPublishItemArray(i);
                CTWebPublishItemsImpl.this.removeWebPublishItem(i);
                return old;
            }
            
            public int size()
                { return CTWebPublishItemsImpl.this.sizeOfWebPublishItemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WebPublishItemList();
        }
    }
    
    /**
     * Gets array of all "webPublishItem" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem[] getWebPublishItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEBPUBLISHITEM$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "webPublishItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem getWebPublishItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem)get_store().find_element_user(WEBPUBLISHITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "webPublishItem" element
     */
    public int sizeOfWebPublishItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBPUBLISHITEM$0);
        }
    }
    
    /**
     * Sets array of all "webPublishItem" element
     */
    public void setWebPublishItemArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem[] webPublishItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(webPublishItemArray, WEBPUBLISHITEM$0);
        }
    }
    
    /**
     * Sets ith "webPublishItem" element
     */
    public void setWebPublishItemArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem webPublishItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem)get_store().find_element_user(WEBPUBLISHITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(webPublishItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "webPublishItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem insertNewWebPublishItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem)get_store().insert_element_user(WEBPUBLISHITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "webPublishItem" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem addNewWebPublishItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItem)get_store().add_element_user(WEBPUBLISHITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "webPublishItem" element
     */
    public void removeWebPublishItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBPUBLISHITEM$0, i);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$2) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$2);
        }
    }
}
