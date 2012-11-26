/*
 * XML Type:  CT_GuideList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_GuideList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTGuideListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList
{
    
    public CTGuideListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GUIDE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "guide");
    
    
    /**
     * Gets a List of "guide" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTGuide> getGuideList()
    {
        final class GuideList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTGuide>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGuide get(int i)
                { return CTGuideListImpl.this.getGuideArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGuide set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGuide o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTGuide old = CTGuideListImpl.this.getGuideArray(i);
                CTGuideListImpl.this.setGuideArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGuide o)
                { CTGuideListImpl.this.insertNewGuide(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGuide remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTGuide old = CTGuideListImpl.this.getGuideArray(i);
                CTGuideListImpl.this.removeGuide(i);
                return old;
            }
            
            public int size()
                { return CTGuideListImpl.this.sizeOfGuideArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GuideList();
        }
    }
    
    /**
     * Gets array of all "guide" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGuide[] getGuideArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUIDE$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuide[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTGuide[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "guide" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGuide getGuideArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuide)get_store().find_element_user(GUIDE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "guide" element
     */
    public int sizeOfGuideArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUIDE$0);
        }
    }
    
    /**
     * Sets array of all "guide" element
     */
    public void setGuideArray(org.openxmlformats.schemas.presentationml.x2006.main.CTGuide[] guideArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(guideArray, GUIDE$0);
        }
    }
    
    /**
     * Sets ith "guide" element
     */
    public void setGuideArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGuide guide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuide)get_store().find_element_user(GUIDE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(guide);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guide" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGuide insertNewGuide(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuide)get_store().insert_element_user(GUIDE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guide" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGuide addNewGuide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGuide target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGuide)get_store().add_element_user(GUIDE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "guide" element
     */
    public void removeGuide(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUIDE$0, i);
        }
    }
}
