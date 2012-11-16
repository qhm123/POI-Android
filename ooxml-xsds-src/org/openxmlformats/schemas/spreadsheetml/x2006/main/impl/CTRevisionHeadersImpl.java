/*
 * XML Type:  CT_RevisionHeaders
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionHeaders(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionHeadersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders
{
    
    public CTRevisionHeadersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "header");
    private static final javax.xml.namespace.QName GUID$2 = 
        new javax.xml.namespace.QName("", "guid");
    private static final javax.xml.namespace.QName LASTGUID$4 = 
        new javax.xml.namespace.QName("", "lastGuid");
    private static final javax.xml.namespace.QName SHARED$6 = 
        new javax.xml.namespace.QName("", "shared");
    private static final javax.xml.namespace.QName DISKREVISIONS$8 = 
        new javax.xml.namespace.QName("", "diskRevisions");
    private static final javax.xml.namespace.QName HISTORY$10 = 
        new javax.xml.namespace.QName("", "history");
    private static final javax.xml.namespace.QName TRACKREVISIONS$12 = 
        new javax.xml.namespace.QName("", "trackRevisions");
    private static final javax.xml.namespace.QName EXCLUSIVE$14 = 
        new javax.xml.namespace.QName("", "exclusive");
    private static final javax.xml.namespace.QName REVISIONID$16 = 
        new javax.xml.namespace.QName("", "revisionId");
    private static final javax.xml.namespace.QName VERSION$18 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName KEEPCHANGEHISTORY$20 = 
        new javax.xml.namespace.QName("", "keepChangeHistory");
    private static final javax.xml.namespace.QName PROTECTED$22 = 
        new javax.xml.namespace.QName("", "protected");
    private static final javax.xml.namespace.QName PRESERVEHISTORY$24 = 
        new javax.xml.namespace.QName("", "preserveHistory");
    
    
    /**
     * Gets a List of "header" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader> getHeaderList()
    {
        final class HeaderList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader get(int i)
                { return CTRevisionHeadersImpl.this.getHeaderArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader old = CTRevisionHeadersImpl.this.getHeaderArray(i);
                CTRevisionHeadersImpl.this.setHeaderArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader o)
                { CTRevisionHeadersImpl.this.insertNewHeader(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader old = CTRevisionHeadersImpl.this.getHeaderArray(i);
                CTRevisionHeadersImpl.this.removeHeader(i);
                return old;
            }
            
            public int size()
                { return CTRevisionHeadersImpl.this.sizeOfHeaderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HeaderList();
        }
    }
    
    /**
     * Gets array of all "header" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader[] getHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HEADER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "header" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader getHeaderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader)get_store().find_element_user(HEADER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "header" element
     */
    public int sizeOfHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADER$0);
        }
    }
    
    /**
     * Sets array of all "header" element
     */
    public void setHeaderArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader[] headerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(headerArray, HEADER$0);
        }
    }
    
    /**
     * Sets ith "header" element
     */
    public void setHeaderArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader)get_store().find_element_user(HEADER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(header);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "header" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader insertNewHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader)get_store().insert_element_user(HEADER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "header" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "header" element
     */
    public void removeHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADER$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GUID$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(GUID$2);
            }
            target.set(guid);
        }
    }
    
    /**
     * Gets the "lastGuid" attribute
     */
    public java.lang.String getLastGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTGUID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastGuid" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetLastGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(LASTGUID$4);
            return target;
        }
    }
    
    /**
     * True if has "lastGuid" attribute
     */
    public boolean isSetLastGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTGUID$4) != null;
        }
    }
    
    /**
     * Sets the "lastGuid" attribute
     */
    public void setLastGuid(java.lang.String lastGuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTGUID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTGUID$4);
            }
            target.setStringValue(lastGuid);
        }
    }
    
    /**
     * Sets (as xml) the "lastGuid" attribute
     */
    public void xsetLastGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid lastGuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(LASTGUID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(LASTGUID$4);
            }
            target.set(lastGuid);
        }
    }
    
    /**
     * Unsets the "lastGuid" attribute
     */
    public void unsetLastGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTGUID$4);
        }
    }
    
    /**
     * Gets the "shared" attribute
     */
    public boolean getShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHARED$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "shared" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHARED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHARED$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "shared" attribute
     */
    public boolean isSetShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHARED$6) != null;
        }
    }
    
    /**
     * Sets the "shared" attribute
     */
    public void setShared(boolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHARED$6);
            }
            target.setBooleanValue(shared);
        }
    }
    
    /**
     * Sets (as xml) the "shared" attribute
     */
    public void xsetShared(org.apache.xmlbeans.XmlBoolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHARED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHARED$6);
            }
            target.set(shared);
        }
    }
    
    /**
     * Unsets the "shared" attribute
     */
    public void unsetShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHARED$6);
        }
    }
    
    /**
     * Gets the "diskRevisions" attribute
     */
    public boolean getDiskRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISKREVISIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISKREVISIONS$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "diskRevisions" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDiskRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISKREVISIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DISKREVISIONS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "diskRevisions" attribute
     */
    public boolean isSetDiskRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISKREVISIONS$8) != null;
        }
    }
    
    /**
     * Sets the "diskRevisions" attribute
     */
    public void setDiskRevisions(boolean diskRevisions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISKREVISIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISKREVISIONS$8);
            }
            target.setBooleanValue(diskRevisions);
        }
    }
    
    /**
     * Sets (as xml) the "diskRevisions" attribute
     */
    public void xsetDiskRevisions(org.apache.xmlbeans.XmlBoolean diskRevisions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISKREVISIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISKREVISIONS$8);
            }
            target.set(diskRevisions);
        }
    }
    
    /**
     * Unsets the "diskRevisions" attribute
     */
    public void unsetDiskRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISKREVISIONS$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HISTORY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HISTORY$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HISTORY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HISTORY$10);
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
            return get_store().find_attribute_user(HISTORY$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HISTORY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HISTORY$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HISTORY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HISTORY$10);
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
            get_store().remove_attribute(HISTORY$10);
        }
    }
    
    /**
     * Gets the "trackRevisions" attribute
     */
    public boolean getTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKREVISIONS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRACKREVISIONS$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "trackRevisions" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRACKREVISIONS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRACKREVISIONS$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "trackRevisions" attribute
     */
    public boolean isSetTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRACKREVISIONS$12) != null;
        }
    }
    
    /**
     * Sets the "trackRevisions" attribute
     */
    public void setTrackRevisions(boolean trackRevisions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKREVISIONS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRACKREVISIONS$12);
            }
            target.setBooleanValue(trackRevisions);
        }
    }
    
    /**
     * Sets (as xml) the "trackRevisions" attribute
     */
    public void xsetTrackRevisions(org.apache.xmlbeans.XmlBoolean trackRevisions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRACKREVISIONS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRACKREVISIONS$12);
            }
            target.set(trackRevisions);
        }
    }
    
    /**
     * Unsets the "trackRevisions" attribute
     */
    public void unsetTrackRevisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRACKREVISIONS$12);
        }
    }
    
    /**
     * Gets the "exclusive" attribute
     */
    public boolean getExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLUSIVE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXCLUSIVE$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "exclusive" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXCLUSIVE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXCLUSIVE$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "exclusive" attribute
     */
    public boolean isSetExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXCLUSIVE$14) != null;
        }
    }
    
    /**
     * Sets the "exclusive" attribute
     */
    public void setExclusive(boolean exclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLUSIVE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXCLUSIVE$14);
            }
            target.setBooleanValue(exclusive);
        }
    }
    
    /**
     * Sets (as xml) the "exclusive" attribute
     */
    public void xsetExclusive(org.apache.xmlbeans.XmlBoolean exclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXCLUSIVE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXCLUSIVE$14);
            }
            target.set(exclusive);
        }
    }
    
    /**
     * Unsets the "exclusive" attribute
     */
    public void unsetExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXCLUSIVE$14);
        }
    }
    
    /**
     * Gets the "revisionId" attribute
     */
    public long getRevisionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISIONID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REVISIONID$16);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "revisionId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRevisionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(REVISIONID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(REVISIONID$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "revisionId" attribute
     */
    public boolean isSetRevisionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REVISIONID$16) != null;
        }
    }
    
    /**
     * Sets the "revisionId" attribute
     */
    public void setRevisionId(long revisionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISIONID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVISIONID$16);
            }
            target.setLongValue(revisionId);
        }
    }
    
    /**
     * Sets (as xml) the "revisionId" attribute
     */
    public void xsetRevisionId(org.apache.xmlbeans.XmlUnsignedInt revisionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(REVISIONID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(REVISIONID$16);
            }
            target.set(revisionId);
        }
    }
    
    /**
     * Unsets the "revisionId" attribute
     */
    public void unsetRevisionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REVISIONID$16);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public int getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$18);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(VERSION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(VERSION$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$18) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(int version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$18);
            }
            target.setIntValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlInt version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(VERSION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(VERSION$18);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$18);
        }
    }
    
    /**
     * Gets the "keepChangeHistory" attribute
     */
    public boolean getKeepChangeHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEEPCHANGEHISTORY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KEEPCHANGEHISTORY$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "keepChangeHistory" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetKeepChangeHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEEPCHANGEHISTORY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(KEEPCHANGEHISTORY$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "keepChangeHistory" attribute
     */
    public boolean isSetKeepChangeHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEEPCHANGEHISTORY$20) != null;
        }
    }
    
    /**
     * Sets the "keepChangeHistory" attribute
     */
    public void setKeepChangeHistory(boolean keepChangeHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEEPCHANGEHISTORY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEEPCHANGEHISTORY$20);
            }
            target.setBooleanValue(keepChangeHistory);
        }
    }
    
    /**
     * Sets (as xml) the "keepChangeHistory" attribute
     */
    public void xsetKeepChangeHistory(org.apache.xmlbeans.XmlBoolean keepChangeHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEEPCHANGEHISTORY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(KEEPCHANGEHISTORY$20);
            }
            target.set(keepChangeHistory);
        }
    }
    
    /**
     * Unsets the "keepChangeHistory" attribute
     */
    public void unsetKeepChangeHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEEPCHANGEHISTORY$20);
        }
    }
    
    /**
     * Gets the "protected" attribute
     */
    public boolean getProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTECTED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROTECTED$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "protected" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROTECTED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROTECTED$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "protected" attribute
     */
    public boolean isSetProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROTECTED$22) != null;
        }
    }
    
    /**
     * Sets the "protected" attribute
     */
    public void setProtected(boolean xprotected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTECTED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROTECTED$22);
            }
            target.setBooleanValue(xprotected);
        }
    }
    
    /**
     * Sets (as xml) the "protected" attribute
     */
    public void xsetProtected(org.apache.xmlbeans.XmlBoolean xprotected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROTECTED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROTECTED$22);
            }
            target.set(xprotected);
        }
    }
    
    /**
     * Unsets the "protected" attribute
     */
    public void unsetProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROTECTED$22);
        }
    }
    
    /**
     * Gets the "preserveHistory" attribute
     */
    public long getPreserveHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEHISTORY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRESERVEHISTORY$24);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "preserveHistory" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPreserveHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PRESERVEHISTORY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(PRESERVEHISTORY$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "preserveHistory" attribute
     */
    public boolean isSetPreserveHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESERVEHISTORY$24) != null;
        }
    }
    
    /**
     * Sets the "preserveHistory" attribute
     */
    public void setPreserveHistory(long preserveHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEHISTORY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVEHISTORY$24);
            }
            target.setLongValue(preserveHistory);
        }
    }
    
    /**
     * Sets (as xml) the "preserveHistory" attribute
     */
    public void xsetPreserveHistory(org.apache.xmlbeans.XmlUnsignedInt preserveHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PRESERVEHISTORY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PRESERVEHISTORY$24);
            }
            target.set(preserveHistory);
        }
    }
    
    /**
     * Unsets the "preserveHistory" attribute
     */
    public void unsetPreserveHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESERVEHISTORY$24);
        }
    }
}
