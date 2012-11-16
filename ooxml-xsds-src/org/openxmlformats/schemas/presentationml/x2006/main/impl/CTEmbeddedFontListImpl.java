/*
 * XML Type:  CT_EmbeddedFontList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_EmbeddedFontList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTEmbeddedFontListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList
{
    
    public CTEmbeddedFontListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMBEDDEDFONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "embeddedFont");
    
    
    /**
     * Gets a List of "embeddedFont" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry> getEmbeddedFontList()
    {
        final class EmbeddedFontList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry get(int i)
                { return CTEmbeddedFontListImpl.this.getEmbeddedFontArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry old = CTEmbeddedFontListImpl.this.getEmbeddedFontArray(i);
                CTEmbeddedFontListImpl.this.setEmbeddedFontArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry o)
                { CTEmbeddedFontListImpl.this.insertNewEmbeddedFont(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry old = CTEmbeddedFontListImpl.this.getEmbeddedFontArray(i);
                CTEmbeddedFontListImpl.this.removeEmbeddedFont(i);
                return old;
            }
            
            public int size()
                { return CTEmbeddedFontListImpl.this.sizeOfEmbeddedFontArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EmbeddedFontList();
        }
    }
    
    /**
     * Gets array of all "embeddedFont" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry[] getEmbeddedFontArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMBEDDEDFONT$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "embeddedFont" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry getEmbeddedFontArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry)get_store().find_element_user(EMBEDDEDFONT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "embeddedFont" element
     */
    public int sizeOfEmbeddedFontArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDDEDFONT$0);
        }
    }
    
    /**
     * Sets array of all "embeddedFont" element
     */
    public void setEmbeddedFontArray(org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry[] embeddedFontArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(embeddedFontArray, EMBEDDEDFONT$0);
        }
    }
    
    /**
     * Sets ith "embeddedFont" element
     */
    public void setEmbeddedFontArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry embeddedFont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry)get_store().find_element_user(EMBEDDEDFONT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(embeddedFont);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "embeddedFont" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry insertNewEmbeddedFont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry)get_store().insert_element_user(EMBEDDEDFONT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "embeddedFont" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry addNewEmbeddedFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry)get_store().add_element_user(EMBEDDEDFONT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "embeddedFont" element
     */
    public void removeEmbeddedFont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDDEDFONT$0, i);
        }
    }
}
