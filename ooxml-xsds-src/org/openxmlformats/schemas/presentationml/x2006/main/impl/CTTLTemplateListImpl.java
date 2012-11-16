/*
 * XML Type:  CT_TLTemplateList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTemplateList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTemplateListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList
{
    
    public CTTLTemplateListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TMPL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tmpl");
    
    
    /**
     * Gets a List of "tmpl" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate> getTmplList()
    {
        final class TmplList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate get(int i)
                { return CTTLTemplateListImpl.this.getTmplArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate old = CTTLTemplateListImpl.this.getTmplArray(i);
                CTTLTemplateListImpl.this.setTmplArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate o)
                { CTTLTemplateListImpl.this.insertNewTmpl(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate old = CTTLTemplateListImpl.this.getTmplArray(i);
                CTTLTemplateListImpl.this.removeTmpl(i);
                return old;
            }
            
            public int size()
                { return CTTLTemplateListImpl.this.sizeOfTmplArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TmplList();
        }
    }
    
    /**
     * Gets array of all "tmpl" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate[] getTmplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TMPL$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tmpl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate getTmplArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate)get_store().find_element_user(TMPL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tmpl" element
     */
    public int sizeOfTmplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMPL$0);
        }
    }
    
    /**
     * Sets array of all "tmpl" element
     */
    public void setTmplArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate[] tmplArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tmplArray, TMPL$0);
        }
    }
    
    /**
     * Sets ith "tmpl" element
     */
    public void setTmplArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate tmpl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate)get_store().find_element_user(TMPL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tmpl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tmpl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate insertNewTmpl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate)get_store().insert_element_user(TMPL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tmpl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate addNewTmpl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplate)get_store().add_element_user(TMPL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tmpl" element
     */
    public void removeTmpl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMPL$0, i);
        }
    }
}
