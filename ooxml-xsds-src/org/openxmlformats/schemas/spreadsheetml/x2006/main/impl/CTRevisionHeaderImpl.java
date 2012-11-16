/*
 * XML Type:  CT_RevisionHeader
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionHeader(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader
{
    
    public CTRevisionHeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETIDMAP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetIdMap");
    private static final javax.xml.namespace.QName REVIEWEDLIST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "reviewedList");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName GUID$6 = 
        new javax.xml.namespace.QName("", "guid");
    private static final javax.xml.namespace.QName DATETIME$8 = 
        new javax.xml.namespace.QName("", "dateTime");
    private static final javax.xml.namespace.QName MAXSHEETID$10 = 
        new javax.xml.namespace.QName("", "maxSheetId");
    private static final javax.xml.namespace.QName USERNAME$12 = 
        new javax.xml.namespace.QName("", "userName");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    private static final javax.xml.namespace.QName MINRID$16 = 
        new javax.xml.namespace.QName("", "minRId");
    private static final javax.xml.namespace.QName MAXRID$18 = 
        new javax.xml.namespace.QName("", "maxRId");
    
    
    /**
     * Gets the "sheetIdMap" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap getSheetIdMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap)get_store().find_element_user(SHEETIDMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sheetIdMap" element
     */
    public void setSheetIdMap(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap sheetIdMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap)get_store().find_element_user(SHEETIDMAP$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap)get_store().add_element_user(SHEETIDMAP$0);
            }
            target.set(sheetIdMap);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetIdMap" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap addNewSheetIdMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap)get_store().add_element_user(SHEETIDMAP$0);
            return target;
        }
    }
    
    /**
     * Gets the "reviewedList" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions getReviewedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions)get_store().find_element_user(REVIEWEDLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reviewedList" element
     */
    public boolean isSetReviewedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVIEWEDLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "reviewedList" element
     */
    public void setReviewedList(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions reviewedList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions)get_store().find_element_user(REVIEWEDLIST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions)get_store().add_element_user(REVIEWEDLIST$2);
            }
            target.set(reviewedList);
        }
    }
    
    /**
     * Appends and returns a new empty "reviewedList" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions addNewReviewedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions)get_store().add_element_user(REVIEWEDLIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "reviewedList" element
     */
    public void unsetReviewedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVIEWEDLIST$2, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
    
    /**
     * Gets the "guid" attribute
     */
    public java.lang.String getGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GUID$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(GUID$6);
            }
            target.set(guid);
        }
    }
    
    /**
     * Gets the "dateTime" attribute
     */
    public java.util.Calendar getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATETIME$8);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATETIME$8);
            return target;
        }
    }
    
    /**
     * Sets the "dateTime" attribute
     */
    public void setDateTime(java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATETIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATETIME$8);
            }
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Sets (as xml) the "dateTime" attribute
     */
    public void xsetDateTime(org.apache.xmlbeans.XmlDateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATETIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATETIME$8);
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Gets the "maxSheetId" attribute
     */
    public long getMaxSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXSHEETID$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxSheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMaxSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAXSHEETID$10);
            return target;
        }
    }
    
    /**
     * Sets the "maxSheetId" attribute
     */
    public void setMaxSheetId(long maxSheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXSHEETID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXSHEETID$10);
            }
            target.setLongValue(maxSheetId);
        }
    }
    
    /**
     * Sets (as xml) the "maxSheetId" attribute
     */
    public void xsetMaxSheetId(org.apache.xmlbeans.XmlUnsignedInt maxSheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAXSHEETID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MAXSHEETID$10);
            }
            target.set(maxSheetId);
        }
    }
    
    /**
     * Gets the "userName" attribute
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(USERNAME$12);
            return target;
        }
    }
    
    /**
     * Sets the "userName" attribute
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERNAME$12);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "userName" attribute
     */
    public void xsetUserName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(USERNAME$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(USERNAME$12);
            }
            target.set(userName);
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
    
    /**
     * Gets the "minRId" attribute
     */
    public long getMinRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINRID$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "minRId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMinRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MINRID$16);
            return target;
        }
    }
    
    /**
     * True if has "minRId" attribute
     */
    public boolean isSetMinRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINRID$16) != null;
        }
    }
    
    /**
     * Sets the "minRId" attribute
     */
    public void setMinRId(long minRId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINRID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINRID$16);
            }
            target.setLongValue(minRId);
        }
    }
    
    /**
     * Sets (as xml) the "minRId" attribute
     */
    public void xsetMinRId(org.apache.xmlbeans.XmlUnsignedInt minRId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MINRID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MINRID$16);
            }
            target.set(minRId);
        }
    }
    
    /**
     * Unsets the "minRId" attribute
     */
    public void unsetMinRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINRID$16);
        }
    }
    
    /**
     * Gets the "maxRId" attribute
     */
    public long getMaxRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXRID$18);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxRId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMaxRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAXRID$18);
            return target;
        }
    }
    
    /**
     * True if has "maxRId" attribute
     */
    public boolean isSetMaxRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXRID$18) != null;
        }
    }
    
    /**
     * Sets the "maxRId" attribute
     */
    public void setMaxRId(long maxRId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXRID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXRID$18);
            }
            target.setLongValue(maxRId);
        }
    }
    
    /**
     * Sets (as xml) the "maxRId" attribute
     */
    public void xsetMaxRId(org.apache.xmlbeans.XmlUnsignedInt maxRId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAXRID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MAXRID$18);
            }
            target.set(maxRId);
        }
    }
    
    /**
     * Unsets the "maxRId" attribute
     */
    public void unsetMaxRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXRID$18);
        }
    }
}
