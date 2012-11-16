/*
 * XML Type:  CT_Captions
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Captions(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTCaptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions
{
    
    public CTCaptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "caption");
    private static final javax.xml.namespace.QName AUTOCAPTIONS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoCaptions");
    
    
    /**
     * Gets a List of "caption" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption> getCaptionList()
    {
        final class CaptionList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption get(int i)
                { return CTCaptionsImpl.this.getCaptionArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption old = CTCaptionsImpl.this.getCaptionArray(i);
                CTCaptionsImpl.this.setCaptionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption o)
                { CTCaptionsImpl.this.insertNewCaption(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption old = CTCaptionsImpl.this.getCaptionArray(i);
                CTCaptionsImpl.this.removeCaption(i);
                return old;
            }
            
            public int size()
                { return CTCaptionsImpl.this.sizeOfCaptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CaptionList();
        }
    }
    
    /**
     * Gets array of all "caption" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption[] getCaptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPTION$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "caption" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption getCaptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption)get_store().find_element_user(CAPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "caption" element
     */
    public int sizeOfCaptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPTION$0);
        }
    }
    
    /**
     * Sets array of all "caption" element
     */
    public void setCaptionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption[] captionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(captionArray, CAPTION$0);
        }
    }
    
    /**
     * Sets ith "caption" element
     */
    public void setCaptionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption)get_store().find_element_user(CAPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(caption);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "caption" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption insertNewCaption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption)get_store().insert_element_user(CAPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "caption" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption addNewCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption)get_store().add_element_user(CAPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "caption" element
     */
    public void removeCaption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPTION$0, i);
        }
    }
    
    /**
     * Gets the "autoCaptions" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions getAutoCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions)get_store().find_element_user(AUTOCAPTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoCaptions" element
     */
    public boolean isSetAutoCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOCAPTIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "autoCaptions" element
     */
    public void setAutoCaptions(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions autoCaptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions)get_store().find_element_user(AUTOCAPTIONS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions)get_store().add_element_user(AUTOCAPTIONS$2);
            }
            target.set(autoCaptions);
        }
    }
    
    /**
     * Appends and returns a new empty "autoCaptions" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions addNewAutoCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAutoCaptions)get_store().add_element_user(AUTOCAPTIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "autoCaptions" element
     */
    public void unsetAutoCaptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOCAPTIONS$2, 0);
        }
    }
}
