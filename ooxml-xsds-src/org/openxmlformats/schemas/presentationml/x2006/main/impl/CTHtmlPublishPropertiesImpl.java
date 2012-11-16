/*
 * XML Type:  CT_HtmlPublishProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_HtmlPublishProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTHtmlPublishPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties
{
    
    public CTHtmlPublishPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDALL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldAll");
    private static final javax.xml.namespace.QName SLDRG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldRg");
    private static final javax.xml.namespace.QName CUSTSHOW$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custShow");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SHOWSPEAKERNOTES$8 = 
        new javax.xml.namespace.QName("", "showSpeakerNotes");
    private static final javax.xml.namespace.QName PUBBROWSER$10 = 
        new javax.xml.namespace.QName("", "pubBrowser");
    private static final javax.xml.namespace.QName TITLE$12 = 
        new javax.xml.namespace.QName("", "title");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    
    
    /**
     * Gets the "sldAll" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(SLDALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldAll" element
     */
    public boolean isSetSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDALL$0) != 0;
        }
    }
    
    /**
     * Sets the "sldAll" element
     */
    public void setSldAll(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty sldAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(SLDALL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(SLDALL$0);
            }
            target.set(sldAll);
        }
    }
    
    /**
     * Appends and returns a new empty "sldAll" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(SLDALL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sldAll" element
     */
    public void unsetSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDALL$0, 0);
        }
    }
    
    /**
     * Gets the "sldRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange getSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(SLDRG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldRg" element
     */
    public boolean isSetSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDRG$2) != 0;
        }
    }
    
    /**
     * Sets the "sldRg" element
     */
    public void setSldRg(org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange sldRg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(SLDRG$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(SLDRG$2);
            }
            target.set(sldRg);
        }
    }
    
    /**
     * Appends and returns a new empty "sldRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange addNewSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(SLDRG$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sldRg" element
     */
    public void unsetSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDRG$2, 0);
        }
    }
    
    /**
     * Gets the "custShow" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId getCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().find_element_user(CUSTSHOW$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custShow" element
     */
    public boolean isSetCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTSHOW$4) != 0;
        }
    }
    
    /**
     * Sets the "custShow" element
     */
    public void setCustShow(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId custShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().find_element_user(CUSTSHOW$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().add_element_user(CUSTSHOW$4);
            }
            target.set(custShow);
        }
    }
    
    /**
     * Appends and returns a new empty "custShow" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId addNewCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().add_element_user(CUSTSHOW$4);
            return target;
        }
    }
    
    /**
     * Unsets the "custShow" element
     */
    public void unsetCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTSHOW$4, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
    
    /**
     * Gets the "showSpeakerNotes" attribute
     */
    public boolean getShowSpeakerNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSPEAKERNOTES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWSPEAKERNOTES$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showSpeakerNotes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowSpeakerNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSPEAKERNOTES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWSPEAKERNOTES$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "showSpeakerNotes" attribute
     */
    public boolean isSetShowSpeakerNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWSPEAKERNOTES$8) != null;
        }
    }
    
    /**
     * Sets the "showSpeakerNotes" attribute
     */
    public void setShowSpeakerNotes(boolean showSpeakerNotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSPEAKERNOTES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWSPEAKERNOTES$8);
            }
            target.setBooleanValue(showSpeakerNotes);
        }
    }
    
    /**
     * Sets (as xml) the "showSpeakerNotes" attribute
     */
    public void xsetShowSpeakerNotes(org.apache.xmlbeans.XmlBoolean showSpeakerNotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSPEAKERNOTES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWSPEAKERNOTES$8);
            }
            target.set(showSpeakerNotes);
        }
    }
    
    /**
     * Unsets the "showSpeakerNotes" attribute
     */
    public void unsetShowSpeakerNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWSPEAKERNOTES$8);
        }
    }
    
    /**
     * Gets the "pubBrowser" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport.Enum getPubBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBBROWSER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PUBBROWSER$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "pubBrowser" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport xgetPubBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport)get_store().find_attribute_user(PUBBROWSER$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport)get_default_attribute_value(PUBBROWSER$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "pubBrowser" attribute
     */
    public boolean isSetPubBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBBROWSER$10) != null;
        }
    }
    
    /**
     * Sets the "pubBrowser" attribute
     */
    public void setPubBrowser(org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport.Enum pubBrowser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBBROWSER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBBROWSER$10);
            }
            target.setEnumValue(pubBrowser);
        }
    }
    
    /**
     * Sets (as xml) the "pubBrowser" attribute
     */
    public void xsetPubBrowser(org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport pubBrowser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport)get_store().find_attribute_user(PUBBROWSER$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STHtmlPublishWebBrowserSupport)get_store().add_attribute_user(PUBBROWSER$10);
            }
            target.set(pubBrowser);
        }
    }
    
    /**
     * Unsets the "pubBrowser" attribute
     */
    public void unsetPubBrowser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBBROWSER$10);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TITLE$12);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TITLE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$12) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$12);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$12);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$14);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$14);
            }
            target.set(id);
        }
    }
}
