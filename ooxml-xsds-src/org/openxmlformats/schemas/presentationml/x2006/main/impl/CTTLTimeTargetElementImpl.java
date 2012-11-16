/*
 * XML Type:  CT_TLTimeTargetElement
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTimeTargetElement(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTimeTargetElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement
{
    
    public CTTLTimeTargetElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDTGT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldTgt");
    private static final javax.xml.namespace.QName SNDTGT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sndTgt");
    private static final javax.xml.namespace.QName SPTGT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "spTgt");
    private static final javax.xml.namespace.QName INKTGT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "inkTgt");
    
    
    /**
     * Gets the "sldTgt" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getSldTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(SLDTGT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldTgt" element
     */
    public boolean isSetSldTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDTGT$0) != 0;
        }
    }
    
    /**
     * Sets the "sldTgt" element
     */
    public void setSldTgt(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty sldTgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(SLDTGT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(SLDTGT$0);
            }
            target.set(sldTgt);
        }
    }
    
    /**
     * Appends and returns a new empty "sldTgt" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewSldTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(SLDTGT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sldTgt" element
     */
    public void unsetSldTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDTGT$0, 0);
        }
    }
    
    /**
     * Gets the "sndTgt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile getSndTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().find_element_user(SNDTGT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sndTgt" element
     */
    public boolean isSetSndTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SNDTGT$2) != 0;
        }
    }
    
    /**
     * Sets the "sndTgt" element
     */
    public void setSndTgt(org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile sndTgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().find_element_user(SNDTGT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().add_element_user(SNDTGT$2);
            }
            target.set(sndTgt);
        }
    }
    
    /**
     * Appends and returns a new empty "sndTgt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile addNewSndTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile)get_store().add_element_user(SNDTGT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sndTgt" element
     */
    public void unsetSndTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SNDTGT$2, 0);
        }
    }
    
    /**
     * Gets the "spTgt" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement getSpTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement)get_store().find_element_user(SPTGT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spTgt" element
     */
    public boolean isSetSpTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPTGT$4) != 0;
        }
    }
    
    /**
     * Sets the "spTgt" element
     */
    public void setSpTgt(org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement spTgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement)get_store().find_element_user(SPTGT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement)get_store().add_element_user(SPTGT$4);
            }
            target.set(spTgt);
        }
    }
    
    /**
     * Appends and returns a new empty "spTgt" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement addNewSpTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLShapeTargetElement)get_store().add_element_user(SPTGT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "spTgt" element
     */
    public void unsetSpTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPTGT$4, 0);
        }
    }
    
    /**
     * Gets the "inkTgt" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId getInkTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().find_element_user(INKTGT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inkTgt" element
     */
    public boolean isSetInkTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INKTGT$6) != 0;
        }
    }
    
    /**
     * Sets the "inkTgt" element
     */
    public void setInkTgt(org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId inkTgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().find_element_user(INKTGT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().add_element_user(INKTGT$6);
            }
            target.set(inkTgt);
        }
    }
    
    /**
     * Appends and returns a new empty "inkTgt" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId addNewInkTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSubShapeId)get_store().add_element_user(INKTGT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "inkTgt" element
     */
    public void unsetInkTgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INKTGT$6, 0);
        }
    }
}
