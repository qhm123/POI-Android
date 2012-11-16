/*
 * XML Type:  CT_WebPublishObjects
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_WebPublishObjects(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWebPublishObjectsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects
{
    
    public CTWebPublishObjectsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBPUBLISHOBJECT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishObject");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "webPublishObject" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject> getWebPublishObjectList()
    {
        final class WebPublishObjectList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject get(int i)
                { return CTWebPublishObjectsImpl.this.getWebPublishObjectArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject old = CTWebPublishObjectsImpl.this.getWebPublishObjectArray(i);
                CTWebPublishObjectsImpl.this.setWebPublishObjectArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject o)
                { CTWebPublishObjectsImpl.this.insertNewWebPublishObject(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject old = CTWebPublishObjectsImpl.this.getWebPublishObjectArray(i);
                CTWebPublishObjectsImpl.this.removeWebPublishObject(i);
                return old;
            }
            
            public int size()
                { return CTWebPublishObjectsImpl.this.sizeOfWebPublishObjectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WebPublishObjectList();
        }
    }
    
    /**
     * Gets array of all "webPublishObject" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject[] getWebPublishObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEBPUBLISHOBJECT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "webPublishObject" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject getWebPublishObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject)get_store().find_element_user(WEBPUBLISHOBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "webPublishObject" element
     */
    public int sizeOfWebPublishObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBPUBLISHOBJECT$0);
        }
    }
    
    /**
     * Sets array of all "webPublishObject" element
     */
    public void setWebPublishObjectArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject[] webPublishObjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(webPublishObjectArray, WEBPUBLISHOBJECT$0);
        }
    }
    
    /**
     * Sets ith "webPublishObject" element
     */
    public void setWebPublishObjectArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject webPublishObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject)get_store().find_element_user(WEBPUBLISHOBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(webPublishObject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "webPublishObject" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject insertNewWebPublishObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject)get_store().insert_element_user(WEBPUBLISHOBJECT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "webPublishObject" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject addNewWebPublishObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObject)get_store().add_element_user(WEBPUBLISHOBJECT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "webPublishObject" element
     */
    public void removeWebPublishObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBPUBLISHOBJECT$0, i);
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
