/*
 * XML Type:  CT_Hyperlink
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Hyperlink(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTHyperlinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink
{
    
    public CTHyperlinkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SND$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "snd");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    private static final javax.xml.namespace.QName INVALIDURL$6 = 
        new javax.xml.namespace.QName("", "invalidUrl");
    private static final javax.xml.namespace.QName ACTION$8 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName TGTFRAME$10 = 
        new javax.xml.namespace.QName("", "tgtFrame");
    private static final javax.xml.namespace.QName TOOLTIP$12 = 
        new javax.xml.namespace.QName("", "tooltip");
    private static final javax.xml.namespace.QName HISTORY$14 = 
        new javax.xml.namespace.QName("", "history");
    private static final javax.xml.namespace.QName HIGHLIGHTCLICK$16 = 
        new javax.xml.namespace.QName("", "highlightClick");
    private static final javax.xml.namespace.QName ENDSND$18 = 
        new javax.xml.namespace.QName("", "endSnd");
    
    
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
     * True if has "snd" element
     */
    public boolean isSetSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SND$0) != 0;
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
     * Unsets the "snd" element
     */
    public void unsetSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SND$0, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
            return get_store().count_elements(EXTLST$2) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "invalidUrl" attribute
     */
    public java.lang.String getInvalidUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVALIDURL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INVALIDURL$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "invalidUrl" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInvalidUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INVALIDURL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(INVALIDURL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "invalidUrl" attribute
     */
    public boolean isSetInvalidUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INVALIDURL$6) != null;
        }
    }
    
    /**
     * Sets the "invalidUrl" attribute
     */
    public void setInvalidUrl(java.lang.String invalidUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVALIDURL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVALIDURL$6);
            }
            target.setStringValue(invalidUrl);
        }
    }
    
    /**
     * Sets (as xml) the "invalidUrl" attribute
     */
    public void xsetInvalidUrl(org.apache.xmlbeans.XmlString invalidUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INVALIDURL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INVALIDURL$6);
            }
            target.set(invalidUrl);
        }
    }
    
    /**
     * Unsets the "invalidUrl" attribute
     */
    public void unsetInvalidUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INVALIDURL$6);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public java.lang.String getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTION$8);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ACTION$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$8) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(java.lang.String action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$8);
            }
            target.setStringValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.apache.xmlbeans.XmlString action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTION$8);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$8);
        }
    }
    
    /**
     * Gets the "tgtFrame" attribute
     */
    public java.lang.String getTgtFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TGTFRAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TGTFRAME$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tgtFrame" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTgtFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TGTFRAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TGTFRAME$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "tgtFrame" attribute
     */
    public boolean isSetTgtFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TGTFRAME$10) != null;
        }
    }
    
    /**
     * Sets the "tgtFrame" attribute
     */
    public void setTgtFrame(java.lang.String tgtFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TGTFRAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TGTFRAME$10);
            }
            target.setStringValue(tgtFrame);
        }
    }
    
    /**
     * Sets (as xml) the "tgtFrame" attribute
     */
    public void xsetTgtFrame(org.apache.xmlbeans.XmlString tgtFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TGTFRAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TGTFRAME$10);
            }
            target.set(tgtFrame);
        }
    }
    
    /**
     * Unsets the "tgtFrame" attribute
     */
    public void unsetTgtFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TGTFRAME$10);
        }
    }
    
    /**
     * Gets the "tooltip" attribute
     */
    public java.lang.String getTooltip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOOLTIP$12);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tooltip" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTooltip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TOOLTIP$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "tooltip" attribute
     */
    public boolean isSetTooltip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOOLTIP$12) != null;
        }
    }
    
    /**
     * Sets the "tooltip" attribute
     */
    public void setTooltip(java.lang.String tooltip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOOLTIP$12);
            }
            target.setStringValue(tooltip);
        }
    }
    
    /**
     * Sets (as xml) the "tooltip" attribute
     */
    public void xsetTooltip(org.apache.xmlbeans.XmlString tooltip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOOLTIP$12);
            }
            target.set(tooltip);
        }
    }
    
    /**
     * Unsets the "tooltip" attribute
     */
    public void unsetTooltip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOOLTIP$12);
        }
    }
    
    /**
     * Gets the "history" attribute
     */
    public boolean getHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HISTORY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HISTORY$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "history" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HISTORY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HISTORY$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "history" attribute
     */
    public boolean isSetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HISTORY$14) != null;
        }
    }
    
    /**
     * Sets the "history" attribute
     */
    public void setHistory(boolean history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HISTORY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HISTORY$14);
            }
            target.setBooleanValue(history);
        }
    }
    
    /**
     * Sets (as xml) the "history" attribute
     */
    public void xsetHistory(org.apache.xmlbeans.XmlBoolean history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HISTORY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HISTORY$14);
            }
            target.set(history);
        }
    }
    
    /**
     * Unsets the "history" attribute
     */
    public void unsetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HISTORY$14);
        }
    }
    
    /**
     * Gets the "highlightClick" attribute
     */
    public boolean getHighlightClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHLIGHTCLICK$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIGHLIGHTCLICK$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "highlightClick" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHighlightClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIGHLIGHTCLICK$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIGHLIGHTCLICK$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "highlightClick" attribute
     */
    public boolean isSetHighlightClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIGHLIGHTCLICK$16) != null;
        }
    }
    
    /**
     * Sets the "highlightClick" attribute
     */
    public void setHighlightClick(boolean highlightClick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHLIGHTCLICK$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIGHLIGHTCLICK$16);
            }
            target.setBooleanValue(highlightClick);
        }
    }
    
    /**
     * Sets (as xml) the "highlightClick" attribute
     */
    public void xsetHighlightClick(org.apache.xmlbeans.XmlBoolean highlightClick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIGHLIGHTCLICK$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIGHLIGHTCLICK$16);
            }
            target.set(highlightClick);
        }
    }
    
    /**
     * Unsets the "highlightClick" attribute
     */
    public void unsetHighlightClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIGHLIGHTCLICK$16);
        }
    }
    
    /**
     * Gets the "endSnd" attribute
     */
    public boolean getEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDSND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENDSND$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "endSnd" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENDSND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENDSND$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "endSnd" attribute
     */
    public boolean isSetEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDSND$18) != null;
        }
    }
    
    /**
     * Sets the "endSnd" attribute
     */
    public void setEndSnd(boolean endSnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDSND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDSND$18);
            }
            target.setBooleanValue(endSnd);
        }
    }
    
    /**
     * Sets (as xml) the "endSnd" attribute
     */
    public void xsetEndSnd(org.apache.xmlbeans.XmlBoolean endSnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENDSND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENDSND$18);
            }
            target.set(endSnd);
        }
    }
    
    /**
     * Unsets the "endSnd" attribute
     */
    public void unsetEndSnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDSND$18);
        }
    }
}
