/*
 * XML Type:  CT_DocParts
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocParts(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts
{
    
    public CTDocPartsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCPART$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPart");
    
    
    /**
     * Gets a List of "docPart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart> getDocPartList()
    {
        final class DocPartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart get(int i)
                { return CTDocPartsImpl.this.getDocPartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart old = CTDocPartsImpl.this.getDocPartArray(i);
                CTDocPartsImpl.this.setDocPartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart o)
                { CTDocPartsImpl.this.insertNewDocPart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart old = CTDocPartsImpl.this.getDocPartArray(i);
                CTDocPartsImpl.this.removeDocPart(i);
                return old;
            }
            
            public int size()
                { return CTDocPartsImpl.this.sizeOfDocPartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DocPartList();
        }
    }
    
    /**
     * Gets array of all "docPart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart[] getDocPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCPART$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "docPart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart getDocPartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart)get_store().find_element_user(DOCPART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "docPart" element
     */
    public int sizeOfDocPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPART$0);
        }
    }
    
    /**
     * Sets array of all "docPart" element
     */
    public void setDocPartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart[] docPartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(docPartArray, DOCPART$0);
        }
    }
    
    /**
     * Sets ith "docPart" element
     */
    public void setDocPartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart docPart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart)get_store().find_element_user(DOCPART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(docPart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "docPart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart insertNewDocPart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart)get_store().insert_element_user(DOCPART$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "docPart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart addNewDocPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPart)get_store().add_element_user(DOCPART$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "docPart" element
     */
    public void removeDocPart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPART$0, i);
        }
    }
}
