/*
 * XML Type:  CT_Hyperlinks
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Hyperlinks(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTHyperlinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks
{
    
    public CTHyperlinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HYPERLINK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "hyperlink");
    
    
    /**
     * Gets a List of "hyperlink" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink> getHyperlinkList()
    {
        final class HyperlinkList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink get(int i)
                { return CTHyperlinksImpl.this.getHyperlinkArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink old = CTHyperlinksImpl.this.getHyperlinkArray(i);
                CTHyperlinksImpl.this.setHyperlinkArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink o)
                { CTHyperlinksImpl.this.insertNewHyperlink(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink old = CTHyperlinksImpl.this.getHyperlinkArray(i);
                CTHyperlinksImpl.this.removeHyperlink(i);
                return old;
            }
            
            public int size()
                { return CTHyperlinksImpl.this.sizeOfHyperlinkArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HyperlinkList();
        }
    }
    
    /**
     * Gets array of all "hyperlink" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink[] getHyperlinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HYPERLINK$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hyperlink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink getHyperlinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink)get_store().find_element_user(HYPERLINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hyperlink" element
     */
    public int sizeOfHyperlinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYPERLINK$0);
        }
    }
    
    /**
     * Sets array of all "hyperlink" element
     */
    public void setHyperlinkArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink[] hyperlinkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hyperlinkArray, HYPERLINK$0);
        }
    }
    
    /**
     * Sets ith "hyperlink" element
     */
    public void setHyperlinkArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink hyperlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink)get_store().find_element_user(HYPERLINK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hyperlink);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hyperlink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink insertNewHyperlink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink)get_store().insert_element_user(HYPERLINK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hyperlink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink addNewHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink)get_store().add_element_user(HYPERLINK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "hyperlink" element
     */
    public void removeHyperlink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYPERLINK$0, i);
        }
    }
}
