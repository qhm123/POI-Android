/*
 * XML Type:  CT_Picture
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Picture(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPictureImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTPictureBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture
{
    
    public CTPictureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVIE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "movie");
    private static final javax.xml.namespace.QName CONTROL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "control");
    
    
    /**
     * Gets the "movie" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(MOVIE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "movie" element
     */
    public boolean isSetMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVIE$0) != 0;
        }
    }
    
    /**
     * Sets the "movie" element
     */
    public void setMovie(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel movie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(MOVIE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(MOVIE$0);
            }
            target.set(movie);
        }
    }
    
    /**
     * Appends and returns a new empty "movie" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(MOVIE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "movie" element
     */
    public void unsetMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVIE$0, 0);
        }
    }
    
    /**
     * Gets the "control" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl getControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().find_element_user(CONTROL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "control" element
     */
    public boolean isSetControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROL$2) != 0;
        }
    }
    
    /**
     * Sets the "control" element
     */
    public void setControl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl control)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().find_element_user(CONTROL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().add_element_user(CONTROL$2);
            }
            target.set(control);
        }
    }
    
    /**
     * Appends and returns a new empty "control" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl addNewControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl)get_store().add_element_user(CONTROL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "control" element
     */
    public void unsetControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROL$2, 0);
        }
    }
}
