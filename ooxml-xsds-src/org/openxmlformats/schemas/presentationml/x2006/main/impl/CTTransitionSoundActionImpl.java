/*
 * XML Type:  CT_TransitionSoundAction
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TransitionSoundAction(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTransitionSoundActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction
{
    
    public CTTransitionSoundActionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STSND$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "stSnd");
    private static final javax.xml.namespace.QName ENDSND$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "endSnd");
    
    
    /**
     * Gets the "stSnd" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction getStSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction)get_store().find_element_user(STSND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stSnd" element
     */
    public boolean isSetStSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STSND$0) != 0;
        }
    }
    
    /**
     * Sets the "stSnd" element
     */
    public void setStSnd(org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction stSnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction)get_store().find_element_user(STSND$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction)get_store().add_element_user(STSND$0);
            }
            target.set(stSnd);
        }
    }
    
    /**
     * Appends and returns a new empty "stSnd" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction addNewStSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction)get_store().add_element_user(STSND$0);
            return target;
        }
    }
    
    /**
     * Unsets the "stSnd" element
     */
    public void unsetStSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STSND$0, 0);
        }
    }
    
    /**
     * Gets the "endSnd" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(ENDSND$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endSnd" element
     */
    public boolean isSetEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDSND$2) != 0;
        }
    }
    
    /**
     * Sets the "endSnd" element
     */
    public void setEndSnd(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty endSnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(ENDSND$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(ENDSND$2);
            }
            target.set(endSnd);
        }
    }
    
    /**
     * Appends and returns a new empty "endSnd" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(ENDSND$2);
            return target;
        }
    }
    
    /**
     * Unsets the "endSnd" element
     */
    public void unsetEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDSND$2, 0);
        }
    }
}
