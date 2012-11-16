/*
 * XML Type:  CT_Workbook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Workbook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWorkbookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook
{
    
    public CTWorkbookImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEVERSION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileVersion");
    private static final javax.xml.namespace.QName FILESHARING$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileSharing");
    private static final javax.xml.namespace.QName WORKBOOKPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookPr");
    private static final javax.xml.namespace.QName WORKBOOKPROTECTION$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookProtection");
    private static final javax.xml.namespace.QName BOOKVIEWS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bookViews");
    private static final javax.xml.namespace.QName SHEETS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheets");
    private static final javax.xml.namespace.QName FUNCTIONGROUPS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "functionGroups");
    private static final javax.xml.namespace.QName EXTERNALREFERENCES$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalReferences");
    private static final javax.xml.namespace.QName DEFINEDNAMES$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedNames");
    private static final javax.xml.namespace.QName CALCPR$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calcPr");
    private static final javax.xml.namespace.QName OLESIZE$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleSize");
    private static final javax.xml.namespace.QName CUSTOMWORKBOOKVIEWS$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customWorkbookViews");
    private static final javax.xml.namespace.QName PIVOTCACHES$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotCaches");
    private static final javax.xml.namespace.QName SMARTTAGPR$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTagPr");
    private static final javax.xml.namespace.QName SMARTTAGTYPES$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTagTypes");
    private static final javax.xml.namespace.QName WEBPUBLISHING$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishing");
    private static final javax.xml.namespace.QName FILERECOVERYPR$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileRecoveryPr");
    private static final javax.xml.namespace.QName WEBPUBLISHOBJECTS$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishObjects");
    private static final javax.xml.namespace.QName EXTLST$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "fileVersion" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion getFileVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion)get_store().find_element_user(FILEVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileVersion" element
     */
    public boolean isSetFileVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEVERSION$0) != 0;
        }
    }
    
    /**
     * Sets the "fileVersion" element
     */
    public void setFileVersion(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion fileVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion)get_store().find_element_user(FILEVERSION$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion)get_store().add_element_user(FILEVERSION$0);
            }
            target.set(fileVersion);
        }
    }
    
    /**
     * Appends and returns a new empty "fileVersion" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion addNewFileVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion)get_store().add_element_user(FILEVERSION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fileVersion" element
     */
    public void unsetFileVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEVERSION$0, 0);
        }
    }
    
    /**
     * Gets the "fileSharing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing getFileSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing)get_store().find_element_user(FILESHARING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileSharing" element
     */
    public boolean isSetFileSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESHARING$2) != 0;
        }
    }
    
    /**
     * Sets the "fileSharing" element
     */
    public void setFileSharing(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing fileSharing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing)get_store().find_element_user(FILESHARING$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing)get_store().add_element_user(FILESHARING$2);
            }
            target.set(fileSharing);
        }
    }
    
    /**
     * Appends and returns a new empty "fileSharing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing addNewFileSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing)get_store().add_element_user(FILESHARING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fileSharing" element
     */
    public void unsetFileSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESHARING$2, 0);
        }
    }
    
    /**
     * Gets the "workbookPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr getWorkbookPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr)get_store().find_element_user(WORKBOOKPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "workbookPr" element
     */
    public boolean isSetWorkbookPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKBOOKPR$4) != 0;
        }
    }
    
    /**
     * Sets the "workbookPr" element
     */
    public void setWorkbookPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr workbookPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr)get_store().find_element_user(WORKBOOKPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr)get_store().add_element_user(WORKBOOKPR$4);
            }
            target.set(workbookPr);
        }
    }
    
    /**
     * Appends and returns a new empty "workbookPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr addNewWorkbookPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr)get_store().add_element_user(WORKBOOKPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "workbookPr" element
     */
    public void unsetWorkbookPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKBOOKPR$4, 0);
        }
    }
    
    /**
     * Gets the "workbookProtection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection getWorkbookProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection)get_store().find_element_user(WORKBOOKPROTECTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "workbookProtection" element
     */
    public boolean isSetWorkbookProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKBOOKPROTECTION$6) != 0;
        }
    }
    
    /**
     * Sets the "workbookProtection" element
     */
    public void setWorkbookProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection workbookProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection)get_store().find_element_user(WORKBOOKPROTECTION$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection)get_store().add_element_user(WORKBOOKPROTECTION$6);
            }
            target.set(workbookProtection);
        }
    }
    
    /**
     * Appends and returns a new empty "workbookProtection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection addNewWorkbookProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection)get_store().add_element_user(WORKBOOKPROTECTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "workbookProtection" element
     */
    public void unsetWorkbookProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKBOOKPROTECTION$6, 0);
        }
    }
    
    /**
     * Gets the "bookViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews getBookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews)get_store().find_element_user(BOOKVIEWS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bookViews" element
     */
    public boolean isSetBookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKVIEWS$8) != 0;
        }
    }
    
    /**
     * Sets the "bookViews" element
     */
    public void setBookViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews bookViews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews)get_store().find_element_user(BOOKVIEWS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews)get_store().add_element_user(BOOKVIEWS$8);
            }
            target.set(bookViews);
        }
    }
    
    /**
     * Appends and returns a new empty "bookViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews addNewBookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews)get_store().add_element_user(BOOKVIEWS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "bookViews" element
     */
    public void unsetBookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKVIEWS$8, 0);
        }
    }
    
    /**
     * Gets the "sheets" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets getSheets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets)get_store().find_element_user(SHEETS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sheets" element
     */
    public void setSheets(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets sheets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets)get_store().find_element_user(SHEETS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets)get_store().add_element_user(SHEETS$10);
            }
            target.set(sheets);
        }
    }
    
    /**
     * Appends and returns a new empty "sheets" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets addNewSheets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets)get_store().add_element_user(SHEETS$10);
            return target;
        }
    }
    
    /**
     * Gets the "functionGroups" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups getFunctionGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups)get_store().find_element_user(FUNCTIONGROUPS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "functionGroups" element
     */
    public boolean isSetFunctionGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTIONGROUPS$12) != 0;
        }
    }
    
    /**
     * Sets the "functionGroups" element
     */
    public void setFunctionGroups(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups functionGroups)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups)get_store().find_element_user(FUNCTIONGROUPS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups)get_store().add_element_user(FUNCTIONGROUPS$12);
            }
            target.set(functionGroups);
        }
    }
    
    /**
     * Appends and returns a new empty "functionGroups" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups addNewFunctionGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups)get_store().add_element_user(FUNCTIONGROUPS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "functionGroups" element
     */
    public void unsetFunctionGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTIONGROUPS$12, 0);
        }
    }
    
    /**
     * Gets the "externalReferences" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences getExternalReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences)get_store().find_element_user(EXTERNALREFERENCES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalReferences" element
     */
    public boolean isSetExternalReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALREFERENCES$14) != 0;
        }
    }
    
    /**
     * Sets the "externalReferences" element
     */
    public void setExternalReferences(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences externalReferences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences)get_store().find_element_user(EXTERNALREFERENCES$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences)get_store().add_element_user(EXTERNALREFERENCES$14);
            }
            target.set(externalReferences);
        }
    }
    
    /**
     * Appends and returns a new empty "externalReferences" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences addNewExternalReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences)get_store().add_element_user(EXTERNALREFERENCES$14);
            return target;
        }
    }
    
    /**
     * Unsets the "externalReferences" element
     */
    public void unsetExternalReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALREFERENCES$14, 0);
        }
    }
    
    /**
     * Gets the "definedNames" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames getDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames)get_store().find_element_user(DEFINEDNAMES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "definedNames" element
     */
    public boolean isSetDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINEDNAMES$16) != 0;
        }
    }
    
    /**
     * Sets the "definedNames" element
     */
    public void setDefinedNames(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames definedNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames)get_store().find_element_user(DEFINEDNAMES$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames)get_store().add_element_user(DEFINEDNAMES$16);
            }
            target.set(definedNames);
        }
    }
    
    /**
     * Appends and returns a new empty "definedNames" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames addNewDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames)get_store().add_element_user(DEFINEDNAMES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "definedNames" element
     */
    public void unsetDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINEDNAMES$16, 0);
        }
    }
    
    /**
     * Gets the "calcPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr getCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr)get_store().find_element_user(CALCPR$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calcPr" element
     */
    public boolean isSetCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCPR$18) != 0;
        }
    }
    
    /**
     * Sets the "calcPr" element
     */
    public void setCalcPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr calcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr)get_store().find_element_user(CALCPR$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr)get_store().add_element_user(CALCPR$18);
            }
            target.set(calcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "calcPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr addNewCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr)get_store().add_element_user(CALCPR$18);
            return target;
        }
    }
    
    /**
     * Unsets the "calcPr" element
     */
    public void unsetCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCPR$18, 0);
        }
    }
    
    /**
     * Gets the "oleSize" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize getOleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize)get_store().find_element_user(OLESIZE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oleSize" element
     */
    public boolean isSetOleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLESIZE$20) != 0;
        }
    }
    
    /**
     * Sets the "oleSize" element
     */
    public void setOleSize(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize oleSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize)get_store().find_element_user(OLESIZE$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize)get_store().add_element_user(OLESIZE$20);
            }
            target.set(oleSize);
        }
    }
    
    /**
     * Appends and returns a new empty "oleSize" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize addNewOleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize)get_store().add_element_user(OLESIZE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "oleSize" element
     */
    public void unsetOleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLESIZE$20, 0);
        }
    }
    
    /**
     * Gets the "customWorkbookViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews getCustomWorkbookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews)get_store().find_element_user(CUSTOMWORKBOOKVIEWS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customWorkbookViews" element
     */
    public boolean isSetCustomWorkbookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMWORKBOOKVIEWS$22) != 0;
        }
    }
    
    /**
     * Sets the "customWorkbookViews" element
     */
    public void setCustomWorkbookViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews customWorkbookViews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews)get_store().find_element_user(CUSTOMWORKBOOKVIEWS$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews)get_store().add_element_user(CUSTOMWORKBOOKVIEWS$22);
            }
            target.set(customWorkbookViews);
        }
    }
    
    /**
     * Appends and returns a new empty "customWorkbookViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews addNewCustomWorkbookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews)get_store().add_element_user(CUSTOMWORKBOOKVIEWS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "customWorkbookViews" element
     */
    public void unsetCustomWorkbookViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMWORKBOOKVIEWS$22, 0);
        }
    }
    
    /**
     * Gets the "pivotCaches" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches getPivotCaches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches)get_store().find_element_user(PIVOTCACHES$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotCaches" element
     */
    public boolean isSetPivotCaches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTCACHES$24) != 0;
        }
    }
    
    /**
     * Sets the "pivotCaches" element
     */
    public void setPivotCaches(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches pivotCaches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches)get_store().find_element_user(PIVOTCACHES$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches)get_store().add_element_user(PIVOTCACHES$24);
            }
            target.set(pivotCaches);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotCaches" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches addNewPivotCaches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches)get_store().add_element_user(PIVOTCACHES$24);
            return target;
        }
    }
    
    /**
     * Unsets the "pivotCaches" element
     */
    public void unsetPivotCaches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTCACHES$24, 0);
        }
    }
    
    /**
     * Gets the "smartTagPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr getSmartTagPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr)get_store().find_element_user(SMARTTAGPR$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "smartTagPr" element
     */
    public boolean isSetSmartTagPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMARTTAGPR$26) != 0;
        }
    }
    
    /**
     * Sets the "smartTagPr" element
     */
    public void setSmartTagPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr smartTagPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr)get_store().find_element_user(SMARTTAGPR$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr)get_store().add_element_user(SMARTTAGPR$26);
            }
            target.set(smartTagPr);
        }
    }
    
    /**
     * Appends and returns a new empty "smartTagPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr addNewSmartTagPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr)get_store().add_element_user(SMARTTAGPR$26);
            return target;
        }
    }
    
    /**
     * Unsets the "smartTagPr" element
     */
    public void unsetSmartTagPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMARTTAGPR$26, 0);
        }
    }
    
    /**
     * Gets the "smartTagTypes" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes getSmartTagTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes)get_store().find_element_user(SMARTTAGTYPES$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "smartTagTypes" element
     */
    public boolean isSetSmartTagTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMARTTAGTYPES$28) != 0;
        }
    }
    
    /**
     * Sets the "smartTagTypes" element
     */
    public void setSmartTagTypes(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes smartTagTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes)get_store().find_element_user(SMARTTAGTYPES$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes)get_store().add_element_user(SMARTTAGTYPES$28);
            }
            target.set(smartTagTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "smartTagTypes" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes addNewSmartTagTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes)get_store().add_element_user(SMARTTAGTYPES$28);
            return target;
        }
    }
    
    /**
     * Unsets the "smartTagTypes" element
     */
    public void unsetSmartTagTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMARTTAGTYPES$28, 0);
        }
    }
    
    /**
     * Gets the "webPublishing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing getWebPublishing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing)get_store().find_element_user(WEBPUBLISHING$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "webPublishing" element
     */
    public boolean isSetWebPublishing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBPUBLISHING$30) != 0;
        }
    }
    
    /**
     * Sets the "webPublishing" element
     */
    public void setWebPublishing(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing webPublishing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing)get_store().find_element_user(WEBPUBLISHING$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing)get_store().add_element_user(WEBPUBLISHING$30);
            }
            target.set(webPublishing);
        }
    }
    
    /**
     * Appends and returns a new empty "webPublishing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing addNewWebPublishing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing)get_store().add_element_user(WEBPUBLISHING$30);
            return target;
        }
    }
    
    /**
     * Unsets the "webPublishing" element
     */
    public void unsetWebPublishing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBPUBLISHING$30, 0);
        }
    }
    
    /**
     * Gets a List of "fileRecoveryPr" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr> getFileRecoveryPrList()
    {
        final class FileRecoveryPrList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr get(int i)
                { return CTWorkbookImpl.this.getFileRecoveryPrArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr old = CTWorkbookImpl.this.getFileRecoveryPrArray(i);
                CTWorkbookImpl.this.setFileRecoveryPrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr o)
                { CTWorkbookImpl.this.insertNewFileRecoveryPr(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr old = CTWorkbookImpl.this.getFileRecoveryPrArray(i);
                CTWorkbookImpl.this.removeFileRecoveryPr(i);
                return old;
            }
            
            public int size()
                { return CTWorkbookImpl.this.sizeOfFileRecoveryPrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FileRecoveryPrList();
        }
    }
    
    /**
     * Gets array of all "fileRecoveryPr" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr[] getFileRecoveryPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILERECOVERYPR$32, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fileRecoveryPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr getFileRecoveryPrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr)get_store().find_element_user(FILERECOVERYPR$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fileRecoveryPr" element
     */
    public int sizeOfFileRecoveryPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILERECOVERYPR$32);
        }
    }
    
    /**
     * Sets array of all "fileRecoveryPr" element
     */
    public void setFileRecoveryPrArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr[] fileRecoveryPrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fileRecoveryPrArray, FILERECOVERYPR$32);
        }
    }
    
    /**
     * Sets ith "fileRecoveryPr" element
     */
    public void setFileRecoveryPrArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr fileRecoveryPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr)get_store().find_element_user(FILERECOVERYPR$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fileRecoveryPr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fileRecoveryPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr insertNewFileRecoveryPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr)get_store().insert_element_user(FILERECOVERYPR$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fileRecoveryPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr addNewFileRecoveryPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr)get_store().add_element_user(FILERECOVERYPR$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "fileRecoveryPr" element
     */
    public void removeFileRecoveryPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILERECOVERYPR$32, i);
        }
    }
    
    /**
     * Gets the "webPublishObjects" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects getWebPublishObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects)get_store().find_element_user(WEBPUBLISHOBJECTS$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "webPublishObjects" element
     */
    public boolean isSetWebPublishObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBPUBLISHOBJECTS$34) != 0;
        }
    }
    
    /**
     * Sets the "webPublishObjects" element
     */
    public void setWebPublishObjects(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects webPublishObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects)get_store().find_element_user(WEBPUBLISHOBJECTS$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects)get_store().add_element_user(WEBPUBLISHOBJECTS$34);
            }
            target.set(webPublishObjects);
        }
    }
    
    /**
     * Appends and returns a new empty "webPublishObjects" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects addNewWebPublishObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects)get_store().add_element_user(WEBPUBLISHOBJECTS$34);
            return target;
        }
    }
    
    /**
     * Unsets the "webPublishObjects" element
     */
    public void unsetWebPublishObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBPUBLISHOBJECTS$34, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$36, 0);
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
            return get_store().count_elements(EXTLST$36) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$36);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$36);
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
            get_store().remove_element(EXTLST$36, 0);
        }
    }
}
