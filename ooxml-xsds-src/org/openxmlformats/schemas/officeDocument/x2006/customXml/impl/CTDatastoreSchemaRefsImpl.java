/*
 * XML Type:  CT_DatastoreSchemaRefs
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/customXml
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customXml.impl;
/**
 * An XML CT_DatastoreSchemaRefs(@http://schemas.openxmlformats.org/officeDocument/2006/customXml).
 *
 * This is a complex type.
 */
public class CTDatastoreSchemaRefsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRefs
{
    
    public CTDatastoreSchemaRefsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMAREF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/customXml", "schemaRef");
    
    
    /**
     * Gets a List of "schemaRef" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef> getSchemaRefList()
    {
        final class SchemaRefList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef get(int i)
                { return CTDatastoreSchemaRefsImpl.this.getSchemaRefArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef set(int i, org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef old = CTDatastoreSchemaRefsImpl.this.getSchemaRefArray(i);
                CTDatastoreSchemaRefsImpl.this.setSchemaRefArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef o)
                { CTDatastoreSchemaRefsImpl.this.insertNewSchemaRef(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef old = CTDatastoreSchemaRefsImpl.this.getSchemaRefArray(i);
                CTDatastoreSchemaRefsImpl.this.removeSchemaRef(i);
                return old;
            }
            
            public int size()
                { return CTDatastoreSchemaRefsImpl.this.sizeOfSchemaRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SchemaRefList();
        }
    }
    
    /**
     * Gets array of all "schemaRef" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef[] getSchemaRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEMAREF$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef[] result = new org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "schemaRef" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef getSchemaRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef)get_store().find_element_user(SCHEMAREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "schemaRef" element
     */
    public int sizeOfSchemaRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMAREF$0);
        }
    }
    
    /**
     * Sets array of all "schemaRef" element
     */
    public void setSchemaRefArray(org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef[] schemaRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemaRefArray, SCHEMAREF$0);
        }
    }
    
    /**
     * Sets ith "schemaRef" element
     */
    public void setSchemaRefArray(int i, org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef schemaRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef)get_store().find_element_user(SCHEMAREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(schemaRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schemaRef" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef insertNewSchemaRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef)get_store().insert_element_user(SCHEMAREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schemaRef" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef addNewSchemaRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customXml.CTDatastoreSchemaRef)get_store().add_element_user(SCHEMAREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "schemaRef" element
     */
    public void removeSchemaRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMAREF$0, i);
        }
    }
}
