/*
 * XML Type:  CT_SchemaLibrary
 * Namespace: http://schemas.openxmlformats.org/schemaLibrary/2006/main
 * Java type: org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.schemaLibrary.x2006.main.impl;
/**
 * An XML CT_SchemaLibrary(@http://schemas.openxmlformats.org/schemaLibrary/2006/main).
 *
 * This is a complex type.
 */
public class CTSchemaLibraryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary
{
    
    public CTSchemaLibraryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/schemaLibrary/2006/main", "schema");
    
    
    /**
     * Gets a List of "schema" elements
     */
    public java.util.List<org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema> getSchemaList()
    {
        final class SchemaList extends java.util.AbstractList<org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema>
        {
            public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema get(int i)
                { return CTSchemaLibraryImpl.this.getSchemaArray(i); }
            
            public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema set(int i, org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema o)
            {
                org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema old = CTSchemaLibraryImpl.this.getSchemaArray(i);
                CTSchemaLibraryImpl.this.setSchemaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema o)
                { CTSchemaLibraryImpl.this.insertNewSchema(i).set(o); }
            
            public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema remove(int i)
            {
                org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema old = CTSchemaLibraryImpl.this.getSchemaArray(i);
                CTSchemaLibraryImpl.this.removeSchema(i);
                return old;
            }
            
            public int size()
                { return CTSchemaLibraryImpl.this.sizeOfSchemaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SchemaList();
        }
    }
    
    /**
     * Gets array of all "schema" elements
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema[] getSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEMA$0, targetList);
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema[] result = new org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "schema" element
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema getSchemaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema)get_store().find_element_user(SCHEMA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "schema" element
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
     * Sets array of all "schema" element
     */
    public void setSchemaArray(org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema[] schemaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemaArray, SCHEMA$0);
        }
    }
    
    /**
     * Sets ith "schema" element
     */
    public void setSchemaArray(int i, org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema schema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema)get_store().find_element_user(SCHEMA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(schema);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schema" element
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema insertNewSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema)get_store().insert_element_user(SCHEMA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schema" element
     */
    public org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema addNewSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema target = null;
            target = (org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchema)get_store().add_element_user(SCHEMA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "schema" element
     */
    public void removeSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMA$0, i);
        }
    }
}
