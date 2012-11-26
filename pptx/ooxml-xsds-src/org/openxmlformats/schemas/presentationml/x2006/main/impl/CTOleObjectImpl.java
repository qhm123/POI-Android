/*
 * XML Type:  CT_OleObject
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_OleObject(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTOleObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject
{
    
    public CTOleObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMBED$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "embed");
    private static final javax.xml.namespace.QName LINK$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "link");
    private static final javax.xml.namespace.QName SPID$4 = 
        new javax.xml.namespace.QName("", "spid");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SHOWASICON$8 = 
        new javax.xml.namespace.QName("", "showAsIcon");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    private static final javax.xml.namespace.QName IMGW$12 = 
        new javax.xml.namespace.QName("", "imgW");
    private static final javax.xml.namespace.QName IMGH$14 = 
        new javax.xml.namespace.QName("", "imgH");
    private static final javax.xml.namespace.QName PROGID$16 = 
        new javax.xml.namespace.QName("", "progId");
    
    
    /**
     * Gets the "embed" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed getEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed)get_store().find_element_user(EMBED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embed" element
     */
    public boolean isSetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBED$0) != 0;
        }
    }
    
    /**
     * Sets the "embed" element
     */
    public void setEmbed(org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed embed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed)get_store().find_element_user(EMBED$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed)get_store().add_element_user(EMBED$0);
            }
            target.set(embed);
        }
    }
    
    /**
     * Appends and returns a new empty "embed" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed addNewEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed)get_store().add_element_user(EMBED$0);
            return target;
        }
    }
    
    /**
     * Unsets the "embed" element
     */
    public void unsetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBED$0, 0);
        }
    }
    
    /**
     * Gets the "link" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink)get_store().find_element_user(LINK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "link" element
     */
    public boolean isSetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$2) != 0;
        }
    }
    
    /**
     * Sets the "link" element
     */
    public void setLink(org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink)get_store().find_element_user(LINK$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink)get_store().add_element_user(LINK$2);
            }
            target.set(link);
        }
    }
    
    /**
     * Appends and returns a new empty "link" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink)get_store().add_element_user(LINK$2);
            return target;
        }
    }
    
    /**
     * Unsets the "link" element
     */
    public void unsetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$2, 0);
        }
    }
    
    /**
     * Gets the "spid" attribute
     */
    public java.lang.String getSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STShapeID xgetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$4);
            return target;
        }
    }
    
    /**
     * Sets the "spid" attribute
     */
    public void setSpid(java.lang.String spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$4);
            }
            target.setStringValue(spid);
        }
    }
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    public void xsetSpid(org.openxmlformats.schemas.drawingml.x2006.main.STShapeID spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().add_attribute_user(SPID$4);
            }
            target.set(spid);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NAME$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
    
    /**
     * Gets the "showAsIcon" attribute
     */
    public boolean getShowAsIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWASICON$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWASICON$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAsIcon" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowAsIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWASICON$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWASICON$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "showAsIcon" attribute
     */
    public boolean isSetShowAsIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWASICON$8) != null;
        }
    }
    
    /**
     * Sets the "showAsIcon" attribute
     */
    public void setShowAsIcon(boolean showAsIcon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWASICON$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWASICON$8);
            }
            target.setBooleanValue(showAsIcon);
        }
    }
    
    /**
     * Sets (as xml) the "showAsIcon" attribute
     */
    public void xsetShowAsIcon(org.apache.xmlbeans.XmlBoolean showAsIcon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWASICON$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWASICON$8);
            }
            target.set(showAsIcon);
        }
    }
    
    /**
     * Unsets the "showAsIcon" attribute
     */
    public void unsetShowAsIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWASICON$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$10);
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
            return get_store().find_attribute_user(ID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$10);
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
            get_store().remove_attribute(ID$10);
        }
    }
    
    /**
     * Gets the "imgW" attribute
     */
    public int getImgW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMGW$12);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "imgW" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 xgetImgW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().find_attribute_user(IMGW$12);
            return target;
        }
    }
    
    /**
     * True if has "imgW" attribute
     */
    public boolean isSetImgW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMGW$12) != null;
        }
    }
    
    /**
     * Sets the "imgW" attribute
     */
    public void setImgW(int imgW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMGW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMGW$12);
            }
            target.setIntValue(imgW);
        }
    }
    
    /**
     * Sets (as xml) the "imgW" attribute
     */
    public void xsetImgW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 imgW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().find_attribute_user(IMGW$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().add_attribute_user(IMGW$12);
            }
            target.set(imgW);
        }
    }
    
    /**
     * Unsets the "imgW" attribute
     */
    public void unsetImgW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMGW$12);
        }
    }
    
    /**
     * Gets the "imgH" attribute
     */
    public int getImgH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMGH$14);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "imgH" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 xgetImgH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().find_attribute_user(IMGH$14);
            return target;
        }
    }
    
    /**
     * True if has "imgH" attribute
     */
    public boolean isSetImgH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMGH$14) != null;
        }
    }
    
    /**
     * Sets the "imgH" attribute
     */
    public void setImgH(int imgH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMGH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMGH$14);
            }
            target.setIntValue(imgH);
        }
    }
    
    /**
     * Sets (as xml) the "imgH" attribute
     */
    public void xsetImgH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 imgH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().find_attribute_user(IMGH$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().add_attribute_user(IMGH$14);
            }
            target.set(imgH);
        }
    }
    
    /**
     * Unsets the "imgH" attribute
     */
    public void unsetImgH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMGH$14);
        }
    }
    
    /**
     * Gets the "progId" attribute
     */
    public java.lang.String getProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGID$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "progId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROGID$16);
            return target;
        }
    }
    
    /**
     * True if has "progId" attribute
     */
    public boolean isSetProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROGID$16) != null;
        }
    }
    
    /**
     * Sets the "progId" attribute
     */
    public void setProgId(java.lang.String progId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROGID$16);
            }
            target.setStringValue(progId);
        }
    }
    
    /**
     * Sets (as xml) the "progId" attribute
     */
    public void xsetProgId(org.apache.xmlbeans.XmlString progId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROGID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROGID$16);
            }
            target.set(progId);
        }
    }
    
    /**
     * Unsets the "progId" attribute
     */
    public void unsetProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROGID$16);
        }
    }
}
