/*
 * XML Type:  CT_TransitionStartSoundAction
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TransitionStartSoundAction(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTransitionStartSoundActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction
{
    
    public CTTransitionStartSoundActionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SND$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "snd");
    private static final javax.xml.namespace.QName LOOP$2 = 
        new javax.xml.namespace.QName("", "loop");
    
    
    /**
     * Gets the "snd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile getSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().find_element_user(SND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "snd" element
     */
    public void setSnd(org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile snd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().find_element_user(SND$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().add_element_user(SND$0);
            }
            target.set(snd);
        }
    }
    
    /**
     * Appends and returns a new empty "snd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile addNewSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().add_element_user(SND$0);
            return target;
        }
    }
    
    /**
     * Gets the "loop" attribute
     */
    public boolean getLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOOP$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "loop" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOOP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOOP$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "loop" attribute
     */
    public boolean isSetLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOOP$2) != null;
        }
    }
    
    /**
     * Sets the "loop" attribute
     */
    public void setLoop(boolean loop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOOP$2);
            }
            target.setBooleanValue(loop);
        }
    }
    
    /**
     * Sets (as xml) the "loop" attribute
     */
    public void xsetLoop(org.apache.xmlbeans.XmlBoolean loop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOOP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOOP$2);
            }
            target.set(loop);
        }
    }
    
    /**
     * Unsets the "loop" attribute
     */
    public void unsetLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOOP$2);
        }
    }
}
