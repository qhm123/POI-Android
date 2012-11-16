/*
 * XML Type:  CT_MetadataType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MetadataType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMetadataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType
{
    
    public CTMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName MINSUPPORTEDVERSION$2 = 
        new javax.xml.namespace.QName("", "minSupportedVersion");
    private static final javax.xml.namespace.QName GHOSTROW$4 = 
        new javax.xml.namespace.QName("", "ghostRow");
    private static final javax.xml.namespace.QName GHOSTCOL$6 = 
        new javax.xml.namespace.QName("", "ghostCol");
    private static final javax.xml.namespace.QName EDIT$8 = 
        new javax.xml.namespace.QName("", "edit");
    private static final javax.xml.namespace.QName DELETE$10 = 
        new javax.xml.namespace.QName("", "delete");
    private static final javax.xml.namespace.QName COPY$12 = 
        new javax.xml.namespace.QName("", "copy");
    private static final javax.xml.namespace.QName PASTEALL$14 = 
        new javax.xml.namespace.QName("", "pasteAll");
    private static final javax.xml.namespace.QName PASTEFORMULAS$16 = 
        new javax.xml.namespace.QName("", "pasteFormulas");
    private static final javax.xml.namespace.QName PASTEVALUES$18 = 
        new javax.xml.namespace.QName("", "pasteValues");
    private static final javax.xml.namespace.QName PASTEFORMATS$20 = 
        new javax.xml.namespace.QName("", "pasteFormats");
    private static final javax.xml.namespace.QName PASTECOMMENTS$22 = 
        new javax.xml.namespace.QName("", "pasteComments");
    private static final javax.xml.namespace.QName PASTEDATAVALIDATION$24 = 
        new javax.xml.namespace.QName("", "pasteDataValidation");
    private static final javax.xml.namespace.QName PASTEBORDERS$26 = 
        new javax.xml.namespace.QName("", "pasteBorders");
    private static final javax.xml.namespace.QName PASTECOLWIDTHS$28 = 
        new javax.xml.namespace.QName("", "pasteColWidths");
    private static final javax.xml.namespace.QName PASTENUMBERFORMATS$30 = 
        new javax.xml.namespace.QName("", "pasteNumberFormats");
    private static final javax.xml.namespace.QName MERGE$32 = 
        new javax.xml.namespace.QName("", "merge");
    private static final javax.xml.namespace.QName SPLITFIRST$34 = 
        new javax.xml.namespace.QName("", "splitFirst");
    private static final javax.xml.namespace.QName SPLITALL$36 = 
        new javax.xml.namespace.QName("", "splitAll");
    private static final javax.xml.namespace.QName ROWCOLSHIFT$38 = 
        new javax.xml.namespace.QName("", "rowColShift");
    private static final javax.xml.namespace.QName CLEARALL$40 = 
        new javax.xml.namespace.QName("", "clearAll");
    private static final javax.xml.namespace.QName CLEARFORMATS$42 = 
        new javax.xml.namespace.QName("", "clearFormats");
    private static final javax.xml.namespace.QName CLEARCONTENTS$44 = 
        new javax.xml.namespace.QName("", "clearContents");
    private static final javax.xml.namespace.QName CLEARCOMMENTS$46 = 
        new javax.xml.namespace.QName("", "clearComments");
    private static final javax.xml.namespace.QName ASSIGN$48 = 
        new javax.xml.namespace.QName("", "assign");
    private static final javax.xml.namespace.QName COERCE$50 = 
        new javax.xml.namespace.QName("", "coerce");
    private static final javax.xml.namespace.QName ADJUST$52 = 
        new javax.xml.namespace.QName("", "adjust");
    private static final javax.xml.namespace.QName CELLMETA$54 = 
        new javax.xml.namespace.QName("", "cellMeta");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "minSupportedVersion" attribute
     */
    public long getMinSupportedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINSUPPORTEDVERSION$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "minSupportedVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMinSupportedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MINSUPPORTEDVERSION$2);
            return target;
        }
    }
    
    /**
     * Sets the "minSupportedVersion" attribute
     */
    public void setMinSupportedVersion(long minSupportedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINSUPPORTEDVERSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINSUPPORTEDVERSION$2);
            }
            target.setLongValue(minSupportedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "minSupportedVersion" attribute
     */
    public void xsetMinSupportedVersion(org.apache.xmlbeans.XmlUnsignedInt minSupportedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MINSUPPORTEDVERSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MINSUPPORTEDVERSION$2);
            }
            target.set(minSupportedVersion);
        }
    }
    
    /**
     * Gets the "ghostRow" attribute
     */
    public boolean getGhostRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GHOSTROW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GHOSTROW$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ghostRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGhostRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GHOSTROW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GHOSTROW$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "ghostRow" attribute
     */
    public boolean isSetGhostRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GHOSTROW$4) != null;
        }
    }
    
    /**
     * Sets the "ghostRow" attribute
     */
    public void setGhostRow(boolean ghostRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GHOSTROW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GHOSTROW$4);
            }
            target.setBooleanValue(ghostRow);
        }
    }
    
    /**
     * Sets (as xml) the "ghostRow" attribute
     */
    public void xsetGhostRow(org.apache.xmlbeans.XmlBoolean ghostRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GHOSTROW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GHOSTROW$4);
            }
            target.set(ghostRow);
        }
    }
    
    /**
     * Unsets the "ghostRow" attribute
     */
    public void unsetGhostRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GHOSTROW$4);
        }
    }
    
    /**
     * Gets the "ghostCol" attribute
     */
    public boolean getGhostCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GHOSTCOL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GHOSTCOL$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ghostCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGhostCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GHOSTCOL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GHOSTCOL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "ghostCol" attribute
     */
    public boolean isSetGhostCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GHOSTCOL$6) != null;
        }
    }
    
    /**
     * Sets the "ghostCol" attribute
     */
    public void setGhostCol(boolean ghostCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GHOSTCOL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GHOSTCOL$6);
            }
            target.setBooleanValue(ghostCol);
        }
    }
    
    /**
     * Sets (as xml) the "ghostCol" attribute
     */
    public void xsetGhostCol(org.apache.xmlbeans.XmlBoolean ghostCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GHOSTCOL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GHOSTCOL$6);
            }
            target.set(ghostCol);
        }
    }
    
    /**
     * Unsets the "ghostCol" attribute
     */
    public void unsetGhostCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GHOSTCOL$6);
        }
    }
    
    /**
     * Gets the "edit" attribute
     */
    public boolean getEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EDIT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "edit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EDIT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "edit" attribute
     */
    public boolean isSetEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDIT$8) != null;
        }
    }
    
    /**
     * Sets the "edit" attribute
     */
    public void setEdit(boolean edit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDIT$8);
            }
            target.setBooleanValue(edit);
        }
    }
    
    /**
     * Sets (as xml) the "edit" attribute
     */
    public void xsetEdit(org.apache.xmlbeans.XmlBoolean edit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EDIT$8);
            }
            target.set(edit);
        }
    }
    
    /**
     * Unsets the "edit" attribute
     */
    public void unsetEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDIT$8);
        }
    }
    
    /**
     * Gets the "delete" attribute
     */
    public boolean getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELETE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "delete" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELETE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "delete" attribute
     */
    public boolean isSetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELETE$10) != null;
        }
    }
    
    /**
     * Sets the "delete" attribute
     */
    public void setDelete(boolean delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETE$10);
            }
            target.setBooleanValue(delete);
        }
    }
    
    /**
     * Sets (as xml) the "delete" attribute
     */
    public void xsetDelete(org.apache.xmlbeans.XmlBoolean delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELETE$10);
            }
            target.set(delete);
        }
    }
    
    /**
     * Unsets the "delete" attribute
     */
    public void unsetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELETE$10);
        }
    }
    
    /**
     * Gets the "copy" attribute
     */
    public boolean getCopy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COPY$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "copy" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCopy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COPY$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "copy" attribute
     */
    public boolean isSetCopy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COPY$12) != null;
        }
    }
    
    /**
     * Sets the "copy" attribute
     */
    public void setCopy(boolean copy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPY$12);
            }
            target.setBooleanValue(copy);
        }
    }
    
    /**
     * Sets (as xml) the "copy" attribute
     */
    public void xsetCopy(org.apache.xmlbeans.XmlBoolean copy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COPY$12);
            }
            target.set(copy);
        }
    }
    
    /**
     * Unsets the "copy" attribute
     */
    public void unsetCopy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COPY$12);
        }
    }
    
    /**
     * Gets the "pasteAll" attribute
     */
    public boolean getPasteAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEALL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTEALL$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteAll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEALL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTEALL$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteAll" attribute
     */
    public boolean isSetPasteAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTEALL$14) != null;
        }
    }
    
    /**
     * Sets the "pasteAll" attribute
     */
    public void setPasteAll(boolean pasteAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEALL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTEALL$14);
            }
            target.setBooleanValue(pasteAll);
        }
    }
    
    /**
     * Sets (as xml) the "pasteAll" attribute
     */
    public void xsetPasteAll(org.apache.xmlbeans.XmlBoolean pasteAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEALL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTEALL$14);
            }
            target.set(pasteAll);
        }
    }
    
    /**
     * Unsets the "pasteAll" attribute
     */
    public void unsetPasteAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTEALL$14);
        }
    }
    
    /**
     * Gets the "pasteFormulas" attribute
     */
    public boolean getPasteFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEFORMULAS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTEFORMULAS$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteFormulas" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEFORMULAS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTEFORMULAS$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteFormulas" attribute
     */
    public boolean isSetPasteFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTEFORMULAS$16) != null;
        }
    }
    
    /**
     * Sets the "pasteFormulas" attribute
     */
    public void setPasteFormulas(boolean pasteFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEFORMULAS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTEFORMULAS$16);
            }
            target.setBooleanValue(pasteFormulas);
        }
    }
    
    /**
     * Sets (as xml) the "pasteFormulas" attribute
     */
    public void xsetPasteFormulas(org.apache.xmlbeans.XmlBoolean pasteFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEFORMULAS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTEFORMULAS$16);
            }
            target.set(pasteFormulas);
        }
    }
    
    /**
     * Unsets the "pasteFormulas" attribute
     */
    public void unsetPasteFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTEFORMULAS$16);
        }
    }
    
    /**
     * Gets the "pasteValues" attribute
     */
    public boolean getPasteValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEVALUES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTEVALUES$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteValues" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEVALUES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTEVALUES$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteValues" attribute
     */
    public boolean isSetPasteValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTEVALUES$18) != null;
        }
    }
    
    /**
     * Sets the "pasteValues" attribute
     */
    public void setPasteValues(boolean pasteValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEVALUES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTEVALUES$18);
            }
            target.setBooleanValue(pasteValues);
        }
    }
    
    /**
     * Sets (as xml) the "pasteValues" attribute
     */
    public void xsetPasteValues(org.apache.xmlbeans.XmlBoolean pasteValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEVALUES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTEVALUES$18);
            }
            target.set(pasteValues);
        }
    }
    
    /**
     * Unsets the "pasteValues" attribute
     */
    public void unsetPasteValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTEVALUES$18);
        }
    }
    
    /**
     * Gets the "pasteFormats" attribute
     */
    public boolean getPasteFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEFORMATS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTEFORMATS$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEFORMATS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTEFORMATS$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteFormats" attribute
     */
    public boolean isSetPasteFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTEFORMATS$20) != null;
        }
    }
    
    /**
     * Sets the "pasteFormats" attribute
     */
    public void setPasteFormats(boolean pasteFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEFORMATS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTEFORMATS$20);
            }
            target.setBooleanValue(pasteFormats);
        }
    }
    
    /**
     * Sets (as xml) the "pasteFormats" attribute
     */
    public void xsetPasteFormats(org.apache.xmlbeans.XmlBoolean pasteFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEFORMATS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTEFORMATS$20);
            }
            target.set(pasteFormats);
        }
    }
    
    /**
     * Unsets the "pasteFormats" attribute
     */
    public void unsetPasteFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTEFORMATS$20);
        }
    }
    
    /**
     * Gets the "pasteComments" attribute
     */
    public boolean getPasteComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTECOMMENTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTECOMMENTS$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteComments" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTECOMMENTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTECOMMENTS$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteComments" attribute
     */
    public boolean isSetPasteComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTECOMMENTS$22) != null;
        }
    }
    
    /**
     * Sets the "pasteComments" attribute
     */
    public void setPasteComments(boolean pasteComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTECOMMENTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTECOMMENTS$22);
            }
            target.setBooleanValue(pasteComments);
        }
    }
    
    /**
     * Sets (as xml) the "pasteComments" attribute
     */
    public void xsetPasteComments(org.apache.xmlbeans.XmlBoolean pasteComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTECOMMENTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTECOMMENTS$22);
            }
            target.set(pasteComments);
        }
    }
    
    /**
     * Unsets the "pasteComments" attribute
     */
    public void unsetPasteComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTECOMMENTS$22);
        }
    }
    
    /**
     * Gets the "pasteDataValidation" attribute
     */
    public boolean getPasteDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEDATAVALIDATION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTEDATAVALIDATION$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteDataValidation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEDATAVALIDATION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTEDATAVALIDATION$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteDataValidation" attribute
     */
    public boolean isSetPasteDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTEDATAVALIDATION$24) != null;
        }
    }
    
    /**
     * Sets the "pasteDataValidation" attribute
     */
    public void setPasteDataValidation(boolean pasteDataValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEDATAVALIDATION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTEDATAVALIDATION$24);
            }
            target.setBooleanValue(pasteDataValidation);
        }
    }
    
    /**
     * Sets (as xml) the "pasteDataValidation" attribute
     */
    public void xsetPasteDataValidation(org.apache.xmlbeans.XmlBoolean pasteDataValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEDATAVALIDATION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTEDATAVALIDATION$24);
            }
            target.set(pasteDataValidation);
        }
    }
    
    /**
     * Unsets the "pasteDataValidation" attribute
     */
    public void unsetPasteDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTEDATAVALIDATION$24);
        }
    }
    
    /**
     * Gets the "pasteBorders" attribute
     */
    public boolean getPasteBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEBORDERS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTEBORDERS$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteBorders" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEBORDERS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTEBORDERS$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteBorders" attribute
     */
    public boolean isSetPasteBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTEBORDERS$26) != null;
        }
    }
    
    /**
     * Sets the "pasteBorders" attribute
     */
    public void setPasteBorders(boolean pasteBorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTEBORDERS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTEBORDERS$26);
            }
            target.setBooleanValue(pasteBorders);
        }
    }
    
    /**
     * Sets (as xml) the "pasteBorders" attribute
     */
    public void xsetPasteBorders(org.apache.xmlbeans.XmlBoolean pasteBorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTEBORDERS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTEBORDERS$26);
            }
            target.set(pasteBorders);
        }
    }
    
    /**
     * Unsets the "pasteBorders" attribute
     */
    public void unsetPasteBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTEBORDERS$26);
        }
    }
    
    /**
     * Gets the "pasteColWidths" attribute
     */
    public boolean getPasteColWidths()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTECOLWIDTHS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTECOLWIDTHS$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteColWidths" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteColWidths()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTECOLWIDTHS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTECOLWIDTHS$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteColWidths" attribute
     */
    public boolean isSetPasteColWidths()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTECOLWIDTHS$28) != null;
        }
    }
    
    /**
     * Sets the "pasteColWidths" attribute
     */
    public void setPasteColWidths(boolean pasteColWidths)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTECOLWIDTHS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTECOLWIDTHS$28);
            }
            target.setBooleanValue(pasteColWidths);
        }
    }
    
    /**
     * Sets (as xml) the "pasteColWidths" attribute
     */
    public void xsetPasteColWidths(org.apache.xmlbeans.XmlBoolean pasteColWidths)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTECOLWIDTHS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTECOLWIDTHS$28);
            }
            target.set(pasteColWidths);
        }
    }
    
    /**
     * Unsets the "pasteColWidths" attribute
     */
    public void unsetPasteColWidths()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTECOLWIDTHS$28);
        }
    }
    
    /**
     * Gets the "pasteNumberFormats" attribute
     */
    public boolean getPasteNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTENUMBERFORMATS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PASTENUMBERFORMATS$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pasteNumberFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPasteNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTENUMBERFORMATS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PASTENUMBERFORMATS$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "pasteNumberFormats" attribute
     */
    public boolean isSetPasteNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASTENUMBERFORMATS$30) != null;
        }
    }
    
    /**
     * Sets the "pasteNumberFormats" attribute
     */
    public void setPasteNumberFormats(boolean pasteNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASTENUMBERFORMATS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASTENUMBERFORMATS$30);
            }
            target.setBooleanValue(pasteNumberFormats);
        }
    }
    
    /**
     * Sets (as xml) the "pasteNumberFormats" attribute
     */
    public void xsetPasteNumberFormats(org.apache.xmlbeans.XmlBoolean pasteNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PASTENUMBERFORMATS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PASTENUMBERFORMATS$30);
            }
            target.set(pasteNumberFormats);
        }
    }
    
    /**
     * Unsets the "pasteNumberFormats" attribute
     */
    public void unsetPasteNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASTENUMBERFORMATS$30);
        }
    }
    
    /**
     * Gets the "merge" attribute
     */
    public boolean getMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MERGE$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "merge" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MERGE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MERGE$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "merge" attribute
     */
    public boolean isSetMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MERGE$32) != null;
        }
    }
    
    /**
     * Sets the "merge" attribute
     */
    public void setMerge(boolean merge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MERGE$32);
            }
            target.setBooleanValue(merge);
        }
    }
    
    /**
     * Sets (as xml) the "merge" attribute
     */
    public void xsetMerge(org.apache.xmlbeans.XmlBoolean merge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MERGE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MERGE$32);
            }
            target.set(merge);
        }
    }
    
    /**
     * Unsets the "merge" attribute
     */
    public void unsetMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MERGE$32);
        }
    }
    
    /**
     * Gets the "splitFirst" attribute
     */
    public boolean getSplitFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPLITFIRST$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPLITFIRST$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "splitFirst" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSplitFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPLITFIRST$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SPLITFIRST$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "splitFirst" attribute
     */
    public boolean isSetSplitFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPLITFIRST$34) != null;
        }
    }
    
    /**
     * Sets the "splitFirst" attribute
     */
    public void setSplitFirst(boolean splitFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPLITFIRST$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPLITFIRST$34);
            }
            target.setBooleanValue(splitFirst);
        }
    }
    
    /**
     * Sets (as xml) the "splitFirst" attribute
     */
    public void xsetSplitFirst(org.apache.xmlbeans.XmlBoolean splitFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPLITFIRST$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SPLITFIRST$34);
            }
            target.set(splitFirst);
        }
    }
    
    /**
     * Unsets the "splitFirst" attribute
     */
    public void unsetSplitFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPLITFIRST$34);
        }
    }
    
    /**
     * Gets the "splitAll" attribute
     */
    public boolean getSplitAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPLITALL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPLITALL$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "splitAll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSplitAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPLITALL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SPLITALL$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "splitAll" attribute
     */
    public boolean isSetSplitAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPLITALL$36) != null;
        }
    }
    
    /**
     * Sets the "splitAll" attribute
     */
    public void setSplitAll(boolean splitAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPLITALL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPLITALL$36);
            }
            target.setBooleanValue(splitAll);
        }
    }
    
    /**
     * Sets (as xml) the "splitAll" attribute
     */
    public void xsetSplitAll(org.apache.xmlbeans.XmlBoolean splitAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPLITALL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SPLITALL$36);
            }
            target.set(splitAll);
        }
    }
    
    /**
     * Unsets the "splitAll" attribute
     */
    public void unsetSplitAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPLITALL$36);
        }
    }
    
    /**
     * Gets the "rowColShift" attribute
     */
    public boolean getRowColShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOLSHIFT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROWCOLSHIFT$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowColShift" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRowColShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROWCOLSHIFT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ROWCOLSHIFT$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "rowColShift" attribute
     */
    public boolean isSetRowColShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWCOLSHIFT$38) != null;
        }
    }
    
    /**
     * Sets the "rowColShift" attribute
     */
    public void setRowColShift(boolean rowColShift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOLSHIFT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWCOLSHIFT$38);
            }
            target.setBooleanValue(rowColShift);
        }
    }
    
    /**
     * Sets (as xml) the "rowColShift" attribute
     */
    public void xsetRowColShift(org.apache.xmlbeans.XmlBoolean rowColShift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROWCOLSHIFT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ROWCOLSHIFT$38);
            }
            target.set(rowColShift);
        }
    }
    
    /**
     * Unsets the "rowColShift" attribute
     */
    public void unsetRowColShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWCOLSHIFT$38);
        }
    }
    
    /**
     * Gets the "clearAll" attribute
     */
    public boolean getClearAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARALL$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLEARALL$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "clearAll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetClearAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARALL$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CLEARALL$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "clearAll" attribute
     */
    public boolean isSetClearAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLEARALL$40) != null;
        }
    }
    
    /**
     * Sets the "clearAll" attribute
     */
    public void setClearAll(boolean clearAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARALL$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLEARALL$40);
            }
            target.setBooleanValue(clearAll);
        }
    }
    
    /**
     * Sets (as xml) the "clearAll" attribute
     */
    public void xsetClearAll(org.apache.xmlbeans.XmlBoolean clearAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARALL$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CLEARALL$40);
            }
            target.set(clearAll);
        }
    }
    
    /**
     * Unsets the "clearAll" attribute
     */
    public void unsetClearAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLEARALL$40);
        }
    }
    
    /**
     * Gets the "clearFormats" attribute
     */
    public boolean getClearFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARFORMATS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLEARFORMATS$42);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "clearFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetClearFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARFORMATS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CLEARFORMATS$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "clearFormats" attribute
     */
    public boolean isSetClearFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLEARFORMATS$42) != null;
        }
    }
    
    /**
     * Sets the "clearFormats" attribute
     */
    public void setClearFormats(boolean clearFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARFORMATS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLEARFORMATS$42);
            }
            target.setBooleanValue(clearFormats);
        }
    }
    
    /**
     * Sets (as xml) the "clearFormats" attribute
     */
    public void xsetClearFormats(org.apache.xmlbeans.XmlBoolean clearFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARFORMATS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CLEARFORMATS$42);
            }
            target.set(clearFormats);
        }
    }
    
    /**
     * Unsets the "clearFormats" attribute
     */
    public void unsetClearFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLEARFORMATS$42);
        }
    }
    
    /**
     * Gets the "clearContents" attribute
     */
    public boolean getClearContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARCONTENTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLEARCONTENTS$44);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "clearContents" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetClearContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARCONTENTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CLEARCONTENTS$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "clearContents" attribute
     */
    public boolean isSetClearContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLEARCONTENTS$44) != null;
        }
    }
    
    /**
     * Sets the "clearContents" attribute
     */
    public void setClearContents(boolean clearContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARCONTENTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLEARCONTENTS$44);
            }
            target.setBooleanValue(clearContents);
        }
    }
    
    /**
     * Sets (as xml) the "clearContents" attribute
     */
    public void xsetClearContents(org.apache.xmlbeans.XmlBoolean clearContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARCONTENTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CLEARCONTENTS$44);
            }
            target.set(clearContents);
        }
    }
    
    /**
     * Unsets the "clearContents" attribute
     */
    public void unsetClearContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLEARCONTENTS$44);
        }
    }
    
    /**
     * Gets the "clearComments" attribute
     */
    public boolean getClearComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARCOMMENTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLEARCOMMENTS$46);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "clearComments" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetClearComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARCOMMENTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CLEARCOMMENTS$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "clearComments" attribute
     */
    public boolean isSetClearComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLEARCOMMENTS$46) != null;
        }
    }
    
    /**
     * Sets the "clearComments" attribute
     */
    public void setClearComments(boolean clearComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLEARCOMMENTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLEARCOMMENTS$46);
            }
            target.setBooleanValue(clearComments);
        }
    }
    
    /**
     * Sets (as xml) the "clearComments" attribute
     */
    public void xsetClearComments(org.apache.xmlbeans.XmlBoolean clearComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLEARCOMMENTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CLEARCOMMENTS$46);
            }
            target.set(clearComments);
        }
    }
    
    /**
     * Unsets the "clearComments" attribute
     */
    public void unsetClearComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLEARCOMMENTS$46);
        }
    }
    
    /**
     * Gets the "assign" attribute
     */
    public boolean getAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ASSIGN$48);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "assign" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ASSIGN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ASSIGN$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "assign" attribute
     */
    public boolean isSetAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASSIGN$48) != null;
        }
    }
    
    /**
     * Sets the "assign" attribute
     */
    public void setAssign(boolean assign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGN$48);
            }
            target.setBooleanValue(assign);
        }
    }
    
    /**
     * Sets (as xml) the "assign" attribute
     */
    public void xsetAssign(org.apache.xmlbeans.XmlBoolean assign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ASSIGN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ASSIGN$48);
            }
            target.set(assign);
        }
    }
    
    /**
     * Unsets the "assign" attribute
     */
    public void unsetAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASSIGN$48);
        }
    }
    
    /**
     * Gets the "coerce" attribute
     */
    public boolean getCoerce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COERCE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COERCE$50);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "coerce" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCoerce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COERCE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COERCE$50);
            }
            return target;
        }
    }
    
    /**
     * True if has "coerce" attribute
     */
    public boolean isSetCoerce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COERCE$50) != null;
        }
    }
    
    /**
     * Sets the "coerce" attribute
     */
    public void setCoerce(boolean coerce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COERCE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COERCE$50);
            }
            target.setBooleanValue(coerce);
        }
    }
    
    /**
     * Sets (as xml) the "coerce" attribute
     */
    public void xsetCoerce(org.apache.xmlbeans.XmlBoolean coerce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COERCE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COERCE$50);
            }
            target.set(coerce);
        }
    }
    
    /**
     * Unsets the "coerce" attribute
     */
    public void unsetCoerce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COERCE$50);
        }
    }
    
    /**
     * Gets the "adjust" attribute
     */
    public boolean getAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADJUST$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADJUST$52);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "adjust" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADJUST$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ADJUST$52);
            }
            return target;
        }
    }
    
    /**
     * True if has "adjust" attribute
     */
    public boolean isSetAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADJUST$52) != null;
        }
    }
    
    /**
     * Sets the "adjust" attribute
     */
    public void setAdjust(boolean adjust)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADJUST$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADJUST$52);
            }
            target.setBooleanValue(adjust);
        }
    }
    
    /**
     * Sets (as xml) the "adjust" attribute
     */
    public void xsetAdjust(org.apache.xmlbeans.XmlBoolean adjust)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADJUST$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADJUST$52);
            }
            target.set(adjust);
        }
    }
    
    /**
     * Unsets the "adjust" attribute
     */
    public void unsetAdjust()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADJUST$52);
        }
    }
    
    /**
     * Gets the "cellMeta" attribute
     */
    public boolean getCellMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLMETA$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CELLMETA$54);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cellMeta" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCellMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CELLMETA$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CELLMETA$54);
            }
            return target;
        }
    }
    
    /**
     * True if has "cellMeta" attribute
     */
    public boolean isSetCellMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CELLMETA$54) != null;
        }
    }
    
    /**
     * Sets the "cellMeta" attribute
     */
    public void setCellMeta(boolean cellMeta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLMETA$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLMETA$54);
            }
            target.setBooleanValue(cellMeta);
        }
    }
    
    /**
     * Sets (as xml) the "cellMeta" attribute
     */
    public void xsetCellMeta(org.apache.xmlbeans.XmlBoolean cellMeta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CELLMETA$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CELLMETA$54);
            }
            target.set(cellMeta);
        }
    }
    
    /**
     * Unsets the "cellMeta" attribute
     */
    public void unsetCellMeta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CELLMETA$54);
        }
    }
}
