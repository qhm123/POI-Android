/*
 * XML Type:  CT_MailMerge
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_MailMerge(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTMailMergeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge
{
    
    public CTMailMergeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINDOCUMENTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mainDocumentType");
    private static final javax.xml.namespace.QName LINKTOQUERY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "linkToQuery");
    private static final javax.xml.namespace.QName DATATYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dataType");
    private static final javax.xml.namespace.QName CONNECTSTRING$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "connectString");
    private static final javax.xml.namespace.QName QUERY$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "query");
    private static final javax.xml.namespace.QName DATASOURCE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dataSource");
    private static final javax.xml.namespace.QName HEADERSOURCE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "headerSource");
    private static final javax.xml.namespace.QName DONOTSUPPRESSBLANKLINES$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotSuppressBlankLines");
    private static final javax.xml.namespace.QName DESTINATION$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "destination");
    private static final javax.xml.namespace.QName ADDRESSFIELDNAME$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "addressFieldName");
    private static final javax.xml.namespace.QName MAILSUBJECT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mailSubject");
    private static final javax.xml.namespace.QName MAILASATTACHMENT$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mailAsAttachment");
    private static final javax.xml.namespace.QName VIEWMERGEDDATA$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "viewMergedData");
    private static final javax.xml.namespace.QName ACTIVERECORD$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "activeRecord");
    private static final javax.xml.namespace.QName CHECKERRORS$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "checkErrors");
    private static final javax.xml.namespace.QName ODSO$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "odso");
    
    
    /**
     * Gets the "mainDocumentType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType getMainDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType)get_store().find_element_user(MAINDOCUMENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mainDocumentType" element
     */
    public void setMainDocumentType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType mainDocumentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType)get_store().find_element_user(MAINDOCUMENTTYPE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType)get_store().add_element_user(MAINDOCUMENTTYPE$0);
            }
            target.set(mainDocumentType);
        }
    }
    
    /**
     * Appends and returns a new empty "mainDocumentType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType addNewMainDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType)get_store().add_element_user(MAINDOCUMENTTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "linkToQuery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getLinkToQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LINKTOQUERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "linkToQuery" element
     */
    public boolean isSetLinkToQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKTOQUERY$2) != 0;
        }
    }
    
    /**
     * Sets the "linkToQuery" element
     */
    public void setLinkToQuery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff linkToQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LINKTOQUERY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LINKTOQUERY$2);
            }
            target.set(linkToQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "linkToQuery" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewLinkToQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LINKTOQUERY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "linkToQuery" element
     */
    public void unsetLinkToQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKTOQUERY$2, 0);
        }
    }
    
    /**
     * Gets the "dataType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType getDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType)get_store().find_element_user(DATATYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataType" element
     */
    public void setDataType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType dataType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType)get_store().find_element_user(DATATYPE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType)get_store().add_element_user(DATATYPE$4);
            }
            target.set(dataType);
        }
    }
    
    /**
     * Appends and returns a new empty "dataType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType addNewDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType)get_store().add_element_user(DATATYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "connectString" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getConnectString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(CONNECTSTRING$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "connectString" element
     */
    public boolean isSetConnectString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONNECTSTRING$6) != 0;
        }
    }
    
    /**
     * Sets the "connectString" element
     */
    public void setConnectString(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString connectString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(CONNECTSTRING$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(CONNECTSTRING$6);
            }
            target.set(connectString);
        }
    }
    
    /**
     * Appends and returns a new empty "connectString" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewConnectString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(CONNECTSTRING$6);
            return target;
        }
    }
    
    /**
     * Unsets the "connectString" element
     */
    public void unsetConnectString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONNECTSTRING$6, 0);
        }
    }
    
    /**
     * Gets the "query" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(QUERY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "query" element
     */
    public boolean isSetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$8) != 0;
        }
    }
    
    /**
     * Sets the "query" element
     */
    public void setQuery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(QUERY$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(QUERY$8);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "query" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(QUERY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "query" element
     */
    public void unsetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$8, 0);
        }
    }
    
    /**
     * Gets the "dataSource" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(DATASOURCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSource" element
     */
    public boolean isSetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "dataSource" element
     */
    public void setDataSource(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(DATASOURCE$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(DATASOURCE$10);
            }
            target.set(dataSource);
        }
    }
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(DATASOURCE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSource" element
     */
    public void unsetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCE$10, 0);
        }
    }
    
    /**
     * Gets the "headerSource" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getHeaderSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(HEADERSOURCE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "headerSource" element
     */
    public boolean isSetHeaderSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERSOURCE$12) != 0;
        }
    }
    
    /**
     * Sets the "headerSource" element
     */
    public void setHeaderSource(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel headerSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(HEADERSOURCE$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(HEADERSOURCE$12);
            }
            target.set(headerSource);
        }
    }
    
    /**
     * Appends and returns a new empty "headerSource" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewHeaderSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(HEADERSOURCE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "headerSource" element
     */
    public void unsetHeaderSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERSOURCE$12, 0);
        }
    }
    
    /**
     * Gets the "doNotSuppressBlankLines" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotSuppressBlankLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTSUPPRESSBLANKLINES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doNotSuppressBlankLines" element
     */
    public boolean isSetDoNotSuppressBlankLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTSUPPRESSBLANKLINES$14) != 0;
        }
    }
    
    /**
     * Sets the "doNotSuppressBlankLines" element
     */
    public void setDoNotSuppressBlankLines(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotSuppressBlankLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DONOTSUPPRESSBLANKLINES$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTSUPPRESSBLANKLINES$14);
            }
            target.set(doNotSuppressBlankLines);
        }
    }
    
    /**
     * Appends and returns a new empty "doNotSuppressBlankLines" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotSuppressBlankLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DONOTSUPPRESSBLANKLINES$14);
            return target;
        }
    }
    
    /**
     * Unsets the "doNotSuppressBlankLines" element
     */
    public void unsetDoNotSuppressBlankLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTSUPPRESSBLANKLINES$14, 0);
        }
    }
    
    /**
     * Gets the "destination" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest getDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest)get_store().find_element_user(DESTINATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "destination" element
     */
    public boolean isSetDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESTINATION$16) != 0;
        }
    }
    
    /**
     * Sets the "destination" element
     */
    public void setDestination(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest destination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest)get_store().find_element_user(DESTINATION$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest)get_store().add_element_user(DESTINATION$16);
            }
            target.set(destination);
        }
    }
    
    /**
     * Appends and returns a new empty "destination" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest addNewDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest)get_store().add_element_user(DESTINATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "destination" element
     */
    public void unsetDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESTINATION$16, 0);
        }
    }
    
    /**
     * Gets the "addressFieldName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getAddressFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ADDRESSFIELDNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "addressFieldName" element
     */
    public boolean isSetAddressFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSFIELDNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "addressFieldName" element
     */
    public void setAddressFieldName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addressFieldName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ADDRESSFIELDNAME$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ADDRESSFIELDNAME$18);
            }
            target.set(addressFieldName);
        }
    }
    
    /**
     * Appends and returns a new empty "addressFieldName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewAddressFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ADDRESSFIELDNAME$18);
            return target;
        }
    }
    
    /**
     * Unsets the "addressFieldName" element
     */
    public void unsetAddressFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSFIELDNAME$18, 0);
        }
    }
    
    /**
     * Gets the "mailSubject" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getMailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(MAILSUBJECT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mailSubject" element
     */
    public boolean isSetMailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAILSUBJECT$20) != 0;
        }
    }
    
    /**
     * Sets the "mailSubject" element
     */
    public void setMailSubject(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString mailSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(MAILSUBJECT$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(MAILSUBJECT$20);
            }
            target.set(mailSubject);
        }
    }
    
    /**
     * Appends and returns a new empty "mailSubject" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewMailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(MAILSUBJECT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "mailSubject" element
     */
    public void unsetMailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAILSUBJECT$20, 0);
        }
    }
    
    /**
     * Gets the "mailAsAttachment" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getMailAsAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(MAILASATTACHMENT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mailAsAttachment" element
     */
    public boolean isSetMailAsAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAILASATTACHMENT$22) != 0;
        }
    }
    
    /**
     * Sets the "mailAsAttachment" element
     */
    public void setMailAsAttachment(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff mailAsAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(MAILASATTACHMENT$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(MAILASATTACHMENT$22);
            }
            target.set(mailAsAttachment);
        }
    }
    
    /**
     * Appends and returns a new empty "mailAsAttachment" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewMailAsAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(MAILASATTACHMENT$22);
            return target;
        }
    }
    
    /**
     * Unsets the "mailAsAttachment" element
     */
    public void unsetMailAsAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAILASATTACHMENT$22, 0);
        }
    }
    
    /**
     * Gets the "viewMergedData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getViewMergedData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(VIEWMERGEDDATA$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "viewMergedData" element
     */
    public boolean isSetViewMergedData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIEWMERGEDDATA$24) != 0;
        }
    }
    
    /**
     * Sets the "viewMergedData" element
     */
    public void setViewMergedData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff viewMergedData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(VIEWMERGEDDATA$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(VIEWMERGEDDATA$24);
            }
            target.set(viewMergedData);
        }
    }
    
    /**
     * Appends and returns a new empty "viewMergedData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewViewMergedData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(VIEWMERGEDDATA$24);
            return target;
        }
    }
    
    /**
     * Unsets the "viewMergedData" element
     */
    public void unsetViewMergedData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIEWMERGEDDATA$24, 0);
        }
    }
    
    /**
     * Gets the "activeRecord" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getActiveRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ACTIVERECORD$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activeRecord" element
     */
    public boolean isSetActiveRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVERECORD$26) != 0;
        }
    }
    
    /**
     * Sets the "activeRecord" element
     */
    public void setActiveRecord(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber activeRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ACTIVERECORD$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(ACTIVERECORD$26);
            }
            target.set(activeRecord);
        }
    }
    
    /**
     * Appends and returns a new empty "activeRecord" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewActiveRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(ACTIVERECORD$26);
            return target;
        }
    }
    
    /**
     * Unsets the "activeRecord" element
     */
    public void unsetActiveRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVERECORD$26, 0);
        }
    }
    
    /**
     * Gets the "checkErrors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(CHECKERRORS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "checkErrors" element
     */
    public boolean isSetCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKERRORS$28) != 0;
        }
    }
    
    /**
     * Sets the "checkErrors" element
     */
    public void setCheckErrors(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber checkErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(CHECKERRORS$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(CHECKERRORS$28);
            }
            target.set(checkErrors);
        }
    }
    
    /**
     * Appends and returns a new empty "checkErrors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(CHECKERRORS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "checkErrors" element
     */
    public void unsetCheckErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKERRORS$28, 0);
        }
    }
    
    /**
     * Gets the "odso" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso getOdso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso)get_store().find_element_user(ODSO$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "odso" element
     */
    public boolean isSetOdso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ODSO$30) != 0;
        }
    }
    
    /**
     * Sets the "odso" element
     */
    public void setOdso(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso odso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso)get_store().find_element_user(ODSO$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso)get_store().add_element_user(ODSO$30);
            }
            target.set(odso);
        }
    }
    
    /**
     * Appends and returns a new empty "odso" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso addNewOdso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso)get_store().add_element_user(ODSO$30);
            return target;
        }
    }
    
    /**
     * Unsets the "odso" element
     */
    public void unsetOdso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ODSO$30, 0);
        }
    }
}
