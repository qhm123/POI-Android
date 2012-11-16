/*
 * XML Type:  CT_TcPrInner
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TcPrInner(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTcPrInnerImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTcPrBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner
{
    
    public CTTcPrInnerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELLINS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cellIns");
    private static final javax.xml.namespace.QName CELLDEL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cellDel");
    private static final javax.xml.namespace.QName CELLMERGE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cellMerge");
    
    
    /**
     * Gets the "cellIns" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCellIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CELLINS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellIns" element
     */
    public boolean isSetCellIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLINS$0) != 0;
        }
    }
    
    /**
     * Sets the "cellIns" element
     */
    public void setCellIns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange cellIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CELLINS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CELLINS$0);
            }
            target.set(cellIns);
        }
    }
    
    /**
     * Appends and returns a new empty "cellIns" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCellIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CELLINS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "cellIns" element
     */
    public void unsetCellIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLINS$0, 0);
        }
    }
    
    /**
     * Gets the "cellDel" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCellDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CELLDEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellDel" element
     */
    public boolean isSetCellDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLDEL$2) != 0;
        }
    }
    
    /**
     * Sets the "cellDel" element
     */
    public void setCellDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange cellDel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CELLDEL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CELLDEL$2);
            }
            target.set(cellDel);
        }
    }
    
    /**
     * Appends and returns a new empty "cellDel" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCellDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CELLDEL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "cellDel" element
     */
    public void unsetCellDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLDEL$2, 0);
        }
    }
    
    /**
     * Gets the "cellMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange getCellMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange)get_store().find_element_user(CELLMERGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellMerge" element
     */
    public boolean isSetCellMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLMERGE$4) != 0;
        }
    }
    
    /**
     * Sets the "cellMerge" element
     */
    public void setCellMerge(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange cellMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange)get_store().find_element_user(CELLMERGE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange)get_store().add_element_user(CELLMERGE$4);
            }
            target.set(cellMerge);
        }
    }
    
    /**
     * Appends and returns a new empty "cellMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange addNewCellMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCellMergeTrackChange)get_store().add_element_user(CELLMERGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "cellMerge" element
     */
    public void unsetCellMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLMERGE$4, 0);
        }
    }
}
