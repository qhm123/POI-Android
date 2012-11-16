/*
 * XML Type:  CT_MapInfo
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MapInfo(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMapInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo
{
    
    public CTMapInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "Schema");
    private static final javax.xml.namespace.QName MAP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "Map");
    private static final javax.xml.namespace.QName SELECTIONNAMESPACES$4 = 
        new javax.xml.namespace.QName("", "SelectionNamespaces");
    
    
    /**
     * Gets a List of "Schema" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema> getSchemaList()
    {
        final class SchemaList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema get(int i)
                { return CTMapInfoImpl.this.getSchemaArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema old = CTMapInfoImpl.this.getSchemaArray(i);
                CTMapInfoImpl.this.setSchemaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema o)
                { CTMapInfoImpl.this.insertNewSchema(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema old = CTMapInfoImpl.this.getSchemaArray(i);
                CTMapInfoImpl.this.removeSchema(i);
                return old;
            }
            
            public int size()
                { return CTMapInfoImpl.this.sizeOfSchemaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SchemaList();
        }
    }
    
    /**
     * Gets array of all "Schema" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema[] getSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEMA$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Schema" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema getSchemaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema)get_store().find_element_user(SCHEMA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Schema" element
     */
    public int sizeOfSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMA$0);
        }
    }
    
    /**
     * Sets array of all "Schema" element
     */
    public void setSchemaArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema[] schemaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemaArray, SCHEMA$0);
        }
    }
    
    /**
     * Sets ith "Schema" element
     */
    public void setSchemaArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema schema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema)get_store().find_element_user(SCHEMA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(schema);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Schema" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema insertNewSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema)get_store().insert_element_user(SCHEMA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Schema" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema addNewSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema)get_store().add_element_user(SCHEMA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Schema" element
     */
    public void removeSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMA$0, i);
        }
    }
    
    /**
     * Gets a List of "Map" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap> getMapList()
    {
        final class MapList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap get(int i)
                { return CTMapInfoImpl.this.getMapArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap old = CTMapInfoImpl.this.getMapArray(i);
                CTMapInfoImpl.this.setMapArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap o)
                { CTMapInfoImpl.this.insertNewMap(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap old = CTMapInfoImpl.this.getMapArray(i);
                CTMapInfoImpl.this.removeMap(i);
                return old;
            }
            
            public int size()
                { return CTMapInfoImpl.this.sizeOfMapArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MapList();
        }
    }
    
    /**
     * Gets array of all "Map" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap[] getMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAP$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Map" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap getMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap)get_store().find_element_user(MAP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Map" element
     */
    public int sizeOfMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$2);
        }
    }
    
    /**
     * Sets array of all "Map" element
     */
    public void setMapArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap[] mapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapArray, MAP$2);
        }
    }
    
    /**
     * Sets ith "Map" element
     */
    public void setMapArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap)get_store().find_element_user(MAP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(map);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Map" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap insertNewMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap)get_store().insert_element_user(MAP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Map" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap)get_store().add_element_user(MAP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Map" element
     */
    public void removeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$2, i);
        }
    }
    
    /**
     * Gets the "SelectionNamespaces" attribute
     */
    public java.lang.String getSelectionNamespaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTIONNAMESPACES$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelectionNamespaces" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSelectionNamespaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECTIONNAMESPACES$4);
            return target;
        }
    }
    
    /**
     * Sets the "SelectionNamespaces" attribute
     */
    public void setSelectionNamespaces(java.lang.String selectionNamespaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTIONNAMESPACES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTIONNAMESPACES$4);
            }
            target.setStringValue(selectionNamespaces);
        }
    }
    
    /**
     * Sets (as xml) the "SelectionNamespaces" attribute
     */
    public void xsetSelectionNamespaces(org.apache.xmlbeans.XmlString selectionNamespaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECTIONNAMESPACES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SELECTIONNAMESPACES$4);
            }
            target.set(selectionNamespaces);
        }
    }
}
