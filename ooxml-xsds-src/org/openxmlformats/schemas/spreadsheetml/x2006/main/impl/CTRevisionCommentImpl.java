/*
 * XML Type:  CT_RevisionComment
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionComment(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionCommentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionComment
{
    
    public CTRevisionCommentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETID$0 = 
        new javax.xml.namespace.QName("", "sheetId");
    private static final javax.xml.namespace.QName CELL$2 = 
        new javax.xml.namespace.QName("", "cell");
    private static final javax.xml.namespace.QName GUID$4 = 
        new javax.xml.namespace.QName("", "guid");
    private static final javax.xml.namespace.QName ACTION$6 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName ALWAYSSHOW$8 = 
        new javax.xml.namespace.QName("", "alwaysShow");
    private static final javax.xml.namespace.QName OLD$10 = 
        new javax.xml.namespace.QName("", "old");
    private static final javax.xml.namespace.QName HIDDENROW$12 = 
        new javax.xml.namespace.QName("", "hiddenRow");
    private static final javax.xml.namespace.QName HIDDENCOLUMN$14 = 
        new javax.xml.namespace.QName("", "hiddenColumn");
    private static final javax.xml.namespace.QName AUTHOR$16 = 
        new javax.xml.namespace.QName("", "author");
    private static final javax.xml.namespace.QName OLDLENGTH$18 = 
        new javax.xml.namespace.QName("", "oldLength");
    private static final javax.xml.namespace.QName NEWLENGTH$20 = 
        new javax.xml.namespace.QName("", "newLength");
    
    
    /**
     * Gets the "sheetId" attribute
     */
    public long getSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$0);
            return target;
        }
    }
    
    /**
     * Sets the "sheetId" attribute
     */
    public void setSheetId(long sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHEETID$0);
            }
            target.setLongValue(sheetId);
        }
    }
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    public void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SHEETID$0);
            }
            target.set(sheetId);
        }
    }
    
    /**
     * Gets the "cell" attribute
     */
    public java.lang.String getCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELL$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cell" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(CELL$2);
            return target;
        }
    }
    
    /**
     * Sets the "cell" attribute
     */
    public void setCell(java.lang.String cell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELL$2);
            }
            target.setStringValue(cell);
        }
    }
    
    /**
     * Sets (as xml) the "cell" attribute
     */
    public void xsetCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef cell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(CELL$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(CELL$2);
            }
            target.set(cell);
        }
    }
    
    /**
     * Gets the "guid" attribute
     */
    public java.lang.String getGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$4);
            return target;
        }
    }
    
    /**
     * Sets the "guid" attribute
     */
    public void setGuid(java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GUID$4);
            }
            target.setStringValue(guid);
        }
    }
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    public void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(GUID$4);
            }
            target.set(guid);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTION$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction)get_default_attribute_value(ACTION$6);
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
            return get_store().find_attribute_user(ACTION$6) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$6);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction)get_store().add_attribute_user(ACTION$6);
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
            get_store().remove_attribute(ACTION$6);
        }
    }
    
    /**
     * Gets the "alwaysShow" attribute
     */
    public boolean getAlwaysShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALWAYSSHOW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALWAYSSHOW$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "alwaysShow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAlwaysShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALWAYSSHOW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ALWAYSSHOW$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "alwaysShow" attribute
     */
    public boolean isSetAlwaysShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALWAYSSHOW$8) != null;
        }
    }
    
    /**
     * Sets the "alwaysShow" attribute
     */
    public void setAlwaysShow(boolean alwaysShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALWAYSSHOW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALWAYSSHOW$8);
            }
            target.setBooleanValue(alwaysShow);
        }
    }
    
    /**
     * Sets (as xml) the "alwaysShow" attribute
     */
    public void xsetAlwaysShow(org.apache.xmlbeans.XmlBoolean alwaysShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALWAYSSHOW$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALWAYSSHOW$8);
            }
            target.set(alwaysShow);
        }
    }
    
    /**
     * Unsets the "alwaysShow" attribute
     */
    public void unsetAlwaysShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALWAYSSHOW$8);
        }
    }
    
    /**
     * Gets the "old" attribute
     */
    public boolean getOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OLD$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "old" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OLD$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "old" attribute
     */
    public boolean isSetOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLD$10) != null;
        }
    }
    
    /**
     * Sets the "old" attribute
     */
    public void setOld(boolean old)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLD$10);
            }
            target.setBooleanValue(old);
        }
    }
    
    /**
     * Sets (as xml) the "old" attribute
     */
    public void xsetOld(org.apache.xmlbeans.XmlBoolean old)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OLD$10);
            }
            target.set(old);
        }
    }
    
    /**
     * Unsets the "old" attribute
     */
    public void unsetOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLD$10);
        }
    }
    
    /**
     * Gets the "hiddenRow" attribute
     */
    public boolean getHiddenRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDENROW$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHiddenRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDENROW$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "hiddenRow" attribute
     */
    public boolean isSetHiddenRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDENROW$12) != null;
        }
    }
    
    /**
     * Sets the "hiddenRow" attribute
     */
    public void setHiddenRow(boolean hiddenRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDENROW$12);
            }
            target.setBooleanValue(hiddenRow);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenRow" attribute
     */
    public void xsetHiddenRow(org.apache.xmlbeans.XmlBoolean hiddenRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDENROW$12);
            }
            target.set(hiddenRow);
        }
    }
    
    /**
     * Unsets the "hiddenRow" attribute
     */
    public void unsetHiddenRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDENROW$12);
        }
    }
    
    /**
     * Gets the "hiddenColumn" attribute
     */
    public boolean getHiddenColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENCOLUMN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDENCOLUMN$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenColumn" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHiddenColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENCOLUMN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDENCOLUMN$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "hiddenColumn" attribute
     */
    public boolean isSetHiddenColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDENCOLUMN$14) != null;
        }
    }
    
    /**
     * Sets the "hiddenColumn" attribute
     */
    public void setHiddenColumn(boolean hiddenColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENCOLUMN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDENCOLUMN$14);
            }
            target.setBooleanValue(hiddenColumn);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenColumn" attribute
     */
    public void xsetHiddenColumn(org.apache.xmlbeans.XmlBoolean hiddenColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENCOLUMN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDENCOLUMN$14);
            }
            target.set(hiddenColumn);
        }
    }
    
    /**
     * Unsets the "hiddenColumn" attribute
     */
    public void unsetHiddenColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDENCOLUMN$14);
        }
    }
    
    /**
     * Gets the "author" attribute
     */
    public java.lang.String getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHOR$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "author" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(AUTHOR$16);
            return target;
        }
    }
    
    /**
     * Sets the "author" attribute
     */
    public void setAuthor(java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHOR$16);
            }
            target.setStringValue(author);
        }
    }
    
    /**
     * Sets (as xml) the "author" attribute
     */
    public void xsetAuthor(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(AUTHOR$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(AUTHOR$16);
            }
            target.set(author);
        }
    }
    
    /**
     * Gets the "oldLength" attribute
     */
    public long getOldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDLENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OLDLENGTH$18);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldLength" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetOldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(OLDLENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(OLDLENGTH$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "oldLength" attribute
     */
    public boolean isSetOldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDLENGTH$18) != null;
        }
    }
    
    /**
     * Sets the "oldLength" attribute
     */
    public void setOldLength(long oldLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDLENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDLENGTH$18);
            }
            target.setLongValue(oldLength);
        }
    }
    
    /**
     * Sets (as xml) the "oldLength" attribute
     */
    public void xsetOldLength(org.apache.xmlbeans.XmlUnsignedInt oldLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(OLDLENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(OLDLENGTH$18);
            }
            target.set(oldLength);
        }
    }
    
    /**
     * Unsets the "oldLength" attribute
     */
    public void unsetOldLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDLENGTH$18);
        }
    }
    
    /**
     * Gets the "newLength" attribute
     */
    public long getNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEWLENGTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NEWLENGTH$20);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "newLength" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NEWLENGTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(NEWLENGTH$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "newLength" attribute
     */
    public boolean isSetNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEWLENGTH$20) != null;
        }
    }
    
    /**
     * Sets the "newLength" attribute
     */
    public void setNewLength(long newLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEWLENGTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEWLENGTH$20);
            }
            target.setLongValue(newLength);
        }
    }
    
    /**
     * Sets (as xml) the "newLength" attribute
     */
    public void xsetNewLength(org.apache.xmlbeans.XmlUnsignedInt newLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NEWLENGTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(NEWLENGTH$20);
            }
            target.set(newLength);
        }
    }
    
    /**
     * Unsets the "newLength" attribute
     */
    public void unsetNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEWLENGTH$20);
        }
    }
}
