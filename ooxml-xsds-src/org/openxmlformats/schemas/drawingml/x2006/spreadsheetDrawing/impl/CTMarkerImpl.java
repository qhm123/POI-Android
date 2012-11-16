/*
 * XML Type:  CT_Marker
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;
/**
 * An XML CT_Marker(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public class CTMarkerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker
{
    
    public CTMarkerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "col");
    private static final javax.xml.namespace.QName COLOFF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "colOff");
    private static final javax.xml.namespace.QName ROW$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "row");
    private static final javax.xml.namespace.QName ROWOFF$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "rowOff");
    
    
    /**
     * Gets the "col" element
     */
    public int getCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "col" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID xgetCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID)get_store().find_element_user(COL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "col" element
     */
    public void setCol(int col)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COL$0);
            }
            target.setIntValue(col);
        }
    }
    
    /**
     * Sets (as xml) the "col" element
     */
    public void xsetCol(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID col)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID)get_store().find_element_user(COL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID)get_store().add_element_user(COL$0);
            }
            target.set(col);
        }
    }
    
    /**
     * Gets the "colOff" element
     */
    public long getColOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLOFF$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "colOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetColOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_element_user(COLOFF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "colOff" element
     */
    public void setColOff(long colOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLOFF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLOFF$2);
            }
            target.setLongValue(colOff);
        }
    }
    
    /**
     * Sets (as xml) the "colOff" element
     */
    public void xsetColOff(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate colOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_element_user(COLOFF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_element_user(COLOFF$2);
            }
            target.set(colOff);
        }
    }
    
    /**
     * Gets the "row" element
     */
    public int getRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROW$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "row" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID xgetRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID)get_store().find_element_user(ROW$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "row" element
     */
    public void setRow(int row)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROW$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROW$4);
            }
            target.setIntValue(row);
        }
    }
    
    /**
     * Sets (as xml) the "row" element
     */
    public void xsetRow(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID row)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID)get_store().find_element_user(ROW$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID)get_store().add_element_user(ROW$4);
            }
            target.set(row);
        }
    }
    
    /**
     * Gets the "rowOff" element
     */
    public long getRowOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWOFF$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetRowOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_element_user(ROWOFF$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rowOff" element
     */
    public void setRowOff(long rowOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWOFF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWOFF$6);
            }
            target.setLongValue(rowOff);
        }
    }
    
    /**
     * Sets (as xml) the "rowOff" element
     */
    public void xsetRowOff(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate rowOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_element_user(ROWOFF$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_element_user(ROWOFF$6);
            }
            target.set(rowOff);
        }
    }
}
