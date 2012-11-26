/*
 * XML Type:  CT_AudioCD
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AudioCD(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAudioCDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD
{
    
    public CTAudioCDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "st");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "end");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "st" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime getSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().find_element_user(ST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "st" element
     */
    public void setSt(org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime st)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().find_element_user(ST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().add_element_user(ST$0);
            }
            target.set(st);
        }
    }
    
    /**
     * Appends and returns a new empty "st" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime addNewSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().add_element_user(ST$0);
            return target;
        }
    }
    
    /**
     * Gets the "end" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().add_element_user(END$2);
            }
            target.set(end);
        }
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime)get_store().add_element_user(END$2);
            return target;
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$4) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$4, 0);
        }
    }
}
