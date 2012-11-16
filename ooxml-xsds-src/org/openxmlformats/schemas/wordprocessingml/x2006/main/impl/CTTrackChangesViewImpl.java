/*
 * XML Type:  CT_TrackChangesView
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TrackChangesView(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTrackChangesViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView
{
    
    public CTTrackChangesViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MARKUP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "markup");
    private static final javax.xml.namespace.QName COMMENTS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "comments");
    private static final javax.xml.namespace.QName INSDEL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "insDel");
    private static final javax.xml.namespace.QName FORMATTING$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formatting");
    private static final javax.xml.namespace.QName INKANNOTATIONS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "inkAnnotations");
    
    
    /**
     * Gets the "markup" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getMarkup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARKUP$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "markup" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetMarkup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(MARKUP$0);
            return target;
        }
    }
    
    /**
     * True if has "markup" attribute
     */
    public boolean isSetMarkup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARKUP$0) != null;
        }
    }
    
    /**
     * Sets the "markup" attribute
     */
    public void setMarkup(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum markup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARKUP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARKUP$0);
            }
            target.setEnumValue(markup);
        }
    }
    
    /**
     * Sets (as xml) the "markup" attribute
     */
    public void xsetMarkup(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff markup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(MARKUP$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(MARKUP$0);
            }
            target.set(markup);
        }
    }
    
    /**
     * Unsets the "markup" attribute
     */
    public void unsetMarkup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARKUP$0);
        }
    }
    
    /**
     * Gets the "comments" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENTS$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "comments" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(COMMENTS$2);
            return target;
        }
    }
    
    /**
     * True if has "comments" attribute
     */
    public boolean isSetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMMENTS$2) != null;
        }
    }
    
    /**
     * Sets the "comments" attribute
     */
    public void setComments(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum comments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMENTS$2);
            }
            target.setEnumValue(comments);
        }
    }
    
    /**
     * Sets (as xml) the "comments" attribute
     */
    public void xsetComments(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff comments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(COMMENTS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(COMMENTS$2);
            }
            target.set(comments);
        }
    }
    
    /**
     * Unsets the "comments" attribute
     */
    public void unsetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMMENTS$2);
        }
    }
    
    /**
     * Gets the "insDel" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getInsDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSDEL$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "insDel" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetInsDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(INSDEL$4);
            return target;
        }
    }
    
    /**
     * True if has "insDel" attribute
     */
    public boolean isSetInsDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSDEL$4) != null;
        }
    }
    
    /**
     * Sets the "insDel" attribute
     */
    public void setInsDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum insDel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSDEL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSDEL$4);
            }
            target.setEnumValue(insDel);
        }
    }
    
    /**
     * Sets (as xml) the "insDel" attribute
     */
    public void xsetInsDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff insDel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(INSDEL$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(INSDEL$4);
            }
            target.set(insDel);
        }
    }
    
    /**
     * Unsets the "insDel" attribute
     */
    public void unsetInsDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSDEL$4);
        }
    }
    
    /**
     * Gets the "formatting" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTING$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatting" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FORMATTING$6);
            return target;
        }
    }
    
    /**
     * True if has "formatting" attribute
     */
    public boolean isSetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATTING$6) != null;
        }
    }
    
    /**
     * Sets the "formatting" attribute
     */
    public void setFormatting(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum formatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTING$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATTING$6);
            }
            target.setEnumValue(formatting);
        }
    }
    
    /**
     * Sets (as xml) the "formatting" attribute
     */
    public void xsetFormatting(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff formatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FORMATTING$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(FORMATTING$6);
            }
            target.set(formatting);
        }
    }
    
    /**
     * Unsets the "formatting" attribute
     */
    public void unsetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATTING$6);
        }
    }
    
    /**
     * Gets the "inkAnnotations" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getInkAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INKANNOTATIONS$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "inkAnnotations" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetInkAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(INKANNOTATIONS$8);
            return target;
        }
    }
    
    /**
     * True if has "inkAnnotations" attribute
     */
    public boolean isSetInkAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INKANNOTATIONS$8) != null;
        }
    }
    
    /**
     * Sets the "inkAnnotations" attribute
     */
    public void setInkAnnotations(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum inkAnnotations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INKANNOTATIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INKANNOTATIONS$8);
            }
            target.setEnumValue(inkAnnotations);
        }
    }
    
    /**
     * Sets (as xml) the "inkAnnotations" attribute
     */
    public void xsetInkAnnotations(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff inkAnnotations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(INKANNOTATIONS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(INKANNOTATIONS$8);
            }
            target.set(inkAnnotations);
        }
    }
    
    /**
     * Unsets the "inkAnnotations" attribute
     */
    public void unsetInkAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INKANNOTATIONS$8);
        }
    }
}
