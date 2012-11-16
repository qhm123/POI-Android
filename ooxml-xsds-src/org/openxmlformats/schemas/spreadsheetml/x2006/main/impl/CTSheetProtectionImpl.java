/*
 * XML Type:  CT_SheetProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SheetProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetProtectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection
{
    
    public CTSheetProtectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSWORD$0 = 
        new javax.xml.namespace.QName("", "password");
    private static final javax.xml.namespace.QName SHEET$2 = 
        new javax.xml.namespace.QName("", "sheet");
    private static final javax.xml.namespace.QName OBJECTS$4 = 
        new javax.xml.namespace.QName("", "objects");
    private static final javax.xml.namespace.QName SCENARIOS$6 = 
        new javax.xml.namespace.QName("", "scenarios");
    private static final javax.xml.namespace.QName FORMATCELLS$8 = 
        new javax.xml.namespace.QName("", "formatCells");
    private static final javax.xml.namespace.QName FORMATCOLUMNS$10 = 
        new javax.xml.namespace.QName("", "formatColumns");
    private static final javax.xml.namespace.QName FORMATROWS$12 = 
        new javax.xml.namespace.QName("", "formatRows");
    private static final javax.xml.namespace.QName INSERTCOLUMNS$14 = 
        new javax.xml.namespace.QName("", "insertColumns");
    private static final javax.xml.namespace.QName INSERTROWS$16 = 
        new javax.xml.namespace.QName("", "insertRows");
    private static final javax.xml.namespace.QName INSERTHYPERLINKS$18 = 
        new javax.xml.namespace.QName("", "insertHyperlinks");
    private static final javax.xml.namespace.QName DELETECOLUMNS$20 = 
        new javax.xml.namespace.QName("", "deleteColumns");
    private static final javax.xml.namespace.QName DELETEROWS$22 = 
        new javax.xml.namespace.QName("", "deleteRows");
    private static final javax.xml.namespace.QName SELECTLOCKEDCELLS$24 = 
        new javax.xml.namespace.QName("", "selectLockedCells");
    private static final javax.xml.namespace.QName SORT$26 = 
        new javax.xml.namespace.QName("", "sort");
    private static final javax.xml.namespace.QName AUTOFILTER$28 = 
        new javax.xml.namespace.QName("", "autoFilter");
    private static final javax.xml.namespace.QName PIVOTTABLES$30 = 
        new javax.xml.namespace.QName("", "pivotTables");
    private static final javax.xml.namespace.QName SELECTUNLOCKEDCELLS$32 = 
        new javax.xml.namespace.QName("", "selectUnlockedCells");
    
    
    /**
     * Gets the "password" attribute
     */
    public byte[] getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(PASSWORD$0);
            return target;
        }
    }
    
    /**
     * True if has "password" attribute
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASSWORD$0) != null;
        }
    }
    
    /**
     * Sets the "password" attribute
     */
    public void setPassword(byte[] password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSWORD$0);
            }
            target.setByteArrayValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" attribute
     */
    public void xsetPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(PASSWORD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().add_attribute_user(PASSWORD$0);
            }
            target.set(password);
        }
    }
    
    /**
     * Unsets the "password" attribute
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASSWORD$0);
        }
    }
    
    /**
     * Gets the "sheet" attribute
     */
    public boolean getSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHEET$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sheet" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHEET$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "sheet" attribute
     */
    public boolean isSetSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHEET$2) != null;
        }
    }
    
    /**
     * Sets the "sheet" attribute
     */
    public void setSheet(boolean sheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHEET$2);
            }
            target.setBooleanValue(sheet);
        }
    }
    
    /**
     * Sets (as xml) the "sheet" attribute
     */
    public void xsetSheet(org.apache.xmlbeans.XmlBoolean sheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHEET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHEET$2);
            }
            target.set(sheet);
        }
    }
    
    /**
     * Unsets the "sheet" attribute
     */
    public void unsetSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHEET$2);
        }
    }
    
    /**
     * Gets the "objects" attribute
     */
    public boolean getObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OBJECTS$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "objects" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OBJECTS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OBJECTS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "objects" attribute
     */
    public boolean isSetObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OBJECTS$4) != null;
        }
    }
    
    /**
     * Sets the "objects" attribute
     */
    public void setObjects(boolean objects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTS$4);
            }
            target.setBooleanValue(objects);
        }
    }
    
    /**
     * Sets (as xml) the "objects" attribute
     */
    public void xsetObjects(org.apache.xmlbeans.XmlBoolean objects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OBJECTS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OBJECTS$4);
            }
            target.set(objects);
        }
    }
    
    /**
     * Unsets the "objects" attribute
     */
    public void unsetObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OBJECTS$4);
        }
    }
    
    /**
     * Gets the "scenarios" attribute
     */
    public boolean getScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCENARIOS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCENARIOS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "scenarios" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCENARIOS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SCENARIOS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "scenarios" attribute
     */
    public boolean isSetScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCENARIOS$6) != null;
        }
    }
    
    /**
     * Sets the "scenarios" attribute
     */
    public void setScenarios(boolean scenarios)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCENARIOS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCENARIOS$6);
            }
            target.setBooleanValue(scenarios);
        }
    }
    
    /**
     * Sets (as xml) the "scenarios" attribute
     */
    public void xsetScenarios(org.apache.xmlbeans.XmlBoolean scenarios)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCENARIOS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SCENARIOS$6);
            }
            target.set(scenarios);
        }
    }
    
    /**
     * Unsets the "scenarios" attribute
     */
    public void unsetScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCENARIOS$6);
        }
    }
    
    /**
     * Gets the "formatCells" attribute
     */
    public boolean getFormatCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCELLS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMATCELLS$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatCells" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFormatCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATCELLS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FORMATCELLS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "formatCells" attribute
     */
    public boolean isSetFormatCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATCELLS$8) != null;
        }
    }
    
    /**
     * Sets the "formatCells" attribute
     */
    public void setFormatCells(boolean formatCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCELLS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATCELLS$8);
            }
            target.setBooleanValue(formatCells);
        }
    }
    
    /**
     * Sets (as xml) the "formatCells" attribute
     */
    public void xsetFormatCells(org.apache.xmlbeans.XmlBoolean formatCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATCELLS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORMATCELLS$8);
            }
            target.set(formatCells);
        }
    }
    
    /**
     * Unsets the "formatCells" attribute
     */
    public void unsetFormatCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATCELLS$8);
        }
    }
    
    /**
     * Gets the "formatColumns" attribute
     */
    public boolean getFormatColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCOLUMNS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMATCOLUMNS$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatColumns" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFormatColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATCOLUMNS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FORMATCOLUMNS$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "formatColumns" attribute
     */
    public boolean isSetFormatColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATCOLUMNS$10) != null;
        }
    }
    
    /**
     * Sets the "formatColumns" attribute
     */
    public void setFormatColumns(boolean formatColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATCOLUMNS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATCOLUMNS$10);
            }
            target.setBooleanValue(formatColumns);
        }
    }
    
    /**
     * Sets (as xml) the "formatColumns" attribute
     */
    public void xsetFormatColumns(org.apache.xmlbeans.XmlBoolean formatColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATCOLUMNS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORMATCOLUMNS$10);
            }
            target.set(formatColumns);
        }
    }
    
    /**
     * Unsets the "formatColumns" attribute
     */
    public void unsetFormatColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATCOLUMNS$10);
        }
    }
    
    /**
     * Gets the "formatRows" attribute
     */
    public boolean getFormatRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATROWS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMATROWS$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatRows" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFormatRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATROWS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FORMATROWS$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "formatRows" attribute
     */
    public boolean isSetFormatRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATROWS$12) != null;
        }
    }
    
    /**
     * Sets the "formatRows" attribute
     */
    public void setFormatRows(boolean formatRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATROWS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATROWS$12);
            }
            target.setBooleanValue(formatRows);
        }
    }
    
    /**
     * Sets (as xml) the "formatRows" attribute
     */
    public void xsetFormatRows(org.apache.xmlbeans.XmlBoolean formatRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMATROWS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORMATROWS$12);
            }
            target.set(formatRows);
        }
    }
    
    /**
     * Unsets the "formatRows" attribute
     */
    public void unsetFormatRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATROWS$12);
        }
    }
    
    /**
     * Gets the "insertColumns" attribute
     */
    public boolean getInsertColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTCOLUMNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSERTCOLUMNS$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertColumns" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTCOLUMNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSERTCOLUMNS$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "insertColumns" attribute
     */
    public boolean isSetInsertColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSERTCOLUMNS$14) != null;
        }
    }
    
    /**
     * Sets the "insertColumns" attribute
     */
    public void setInsertColumns(boolean insertColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTCOLUMNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSERTCOLUMNS$14);
            }
            target.setBooleanValue(insertColumns);
        }
    }
    
    /**
     * Sets (as xml) the "insertColumns" attribute
     */
    public void xsetInsertColumns(org.apache.xmlbeans.XmlBoolean insertColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTCOLUMNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSERTCOLUMNS$14);
            }
            target.set(insertColumns);
        }
    }
    
    /**
     * Unsets the "insertColumns" attribute
     */
    public void unsetInsertColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSERTCOLUMNS$14);
        }
    }
    
    /**
     * Gets the "insertRows" attribute
     */
    public boolean getInsertRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTROWS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSERTROWS$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertRows" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTROWS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSERTROWS$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "insertRows" attribute
     */
    public boolean isSetInsertRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSERTROWS$16) != null;
        }
    }
    
    /**
     * Sets the "insertRows" attribute
     */
    public void setInsertRows(boolean insertRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTROWS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSERTROWS$16);
            }
            target.setBooleanValue(insertRows);
        }
    }
    
    /**
     * Sets (as xml) the "insertRows" attribute
     */
    public void xsetInsertRows(org.apache.xmlbeans.XmlBoolean insertRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTROWS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSERTROWS$16);
            }
            target.set(insertRows);
        }
    }
    
    /**
     * Unsets the "insertRows" attribute
     */
    public void unsetInsertRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSERTROWS$16);
        }
    }
    
    /**
     * Gets the "insertHyperlinks" attribute
     */
    public boolean getInsertHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTHYPERLINKS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSERTHYPERLINKS$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertHyperlinks" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTHYPERLINKS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSERTHYPERLINKS$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "insertHyperlinks" attribute
     */
    public boolean isSetInsertHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSERTHYPERLINKS$18) != null;
        }
    }
    
    /**
     * Sets the "insertHyperlinks" attribute
     */
    public void setInsertHyperlinks(boolean insertHyperlinks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTHYPERLINKS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSERTHYPERLINKS$18);
            }
            target.setBooleanValue(insertHyperlinks);
        }
    }
    
    /**
     * Sets (as xml) the "insertHyperlinks" attribute
     */
    public void xsetInsertHyperlinks(org.apache.xmlbeans.XmlBoolean insertHyperlinks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTHYPERLINKS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSERTHYPERLINKS$18);
            }
            target.set(insertHyperlinks);
        }
    }
    
    /**
     * Unsets the "insertHyperlinks" attribute
     */
    public void unsetInsertHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSERTHYPERLINKS$18);
        }
    }
    
    /**
     * Gets the "deleteColumns" attribute
     */
    public boolean getDeleteColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETECOLUMNS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELETECOLUMNS$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "deleteColumns" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeleteColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETECOLUMNS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELETECOLUMNS$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "deleteColumns" attribute
     */
    public boolean isSetDeleteColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELETECOLUMNS$20) != null;
        }
    }
    
    /**
     * Sets the "deleteColumns" attribute
     */
    public void setDeleteColumns(boolean deleteColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETECOLUMNS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETECOLUMNS$20);
            }
            target.setBooleanValue(deleteColumns);
        }
    }
    
    /**
     * Sets (as xml) the "deleteColumns" attribute
     */
    public void xsetDeleteColumns(org.apache.xmlbeans.XmlBoolean deleteColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETECOLUMNS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELETECOLUMNS$20);
            }
            target.set(deleteColumns);
        }
    }
    
    /**
     * Unsets the "deleteColumns" attribute
     */
    public void unsetDeleteColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELETECOLUMNS$20);
        }
    }
    
    /**
     * Gets the "deleteRows" attribute
     */
    public boolean getDeleteRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETEROWS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELETEROWS$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "deleteRows" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeleteRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETEROWS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELETEROWS$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "deleteRows" attribute
     */
    public boolean isSetDeleteRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELETEROWS$22) != null;
        }
    }
    
    /**
     * Sets the "deleteRows" attribute
     */
    public void setDeleteRows(boolean deleteRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETEROWS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETEROWS$22);
            }
            target.setBooleanValue(deleteRows);
        }
    }
    
    /**
     * Sets (as xml) the "deleteRows" attribute
     */
    public void xsetDeleteRows(org.apache.xmlbeans.XmlBoolean deleteRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETEROWS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELETEROWS$22);
            }
            target.set(deleteRows);
        }
    }
    
    /**
     * Unsets the "deleteRows" attribute
     */
    public void unsetDeleteRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELETEROWS$22);
        }
    }
    
    /**
     * Gets the "selectLockedCells" attribute
     */
    public boolean getSelectLockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SELECTLOCKEDCELLS$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "selectLockedCells" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSelectLockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SELECTLOCKEDCELLS$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "selectLockedCells" attribute
     */
    public boolean isSetSelectLockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SELECTLOCKEDCELLS$24) != null;
        }
    }
    
    /**
     * Sets the "selectLockedCells" attribute
     */
    public void setSelectLockedCells(boolean selectLockedCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTLOCKEDCELLS$24);
            }
            target.setBooleanValue(selectLockedCells);
        }
    }
    
    /**
     * Sets (as xml) the "selectLockedCells" attribute
     */
    public void xsetSelectLockedCells(org.apache.xmlbeans.XmlBoolean selectLockedCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SELECTLOCKEDCELLS$24);
            }
            target.set(selectLockedCells);
        }
    }
    
    /**
     * Unsets the "selectLockedCells" attribute
     */
    public void unsetSelectLockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SELECTLOCKEDCELLS$24);
        }
    }
    
    /**
     * Gets the "sort" attribute
     */
    public boolean getSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORT$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sort" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SORT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SORT$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "sort" attribute
     */
    public boolean isSetSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORT$26) != null;
        }
    }
    
    /**
     * Sets the "sort" attribute
     */
    public void setSort(boolean sort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORT$26);
            }
            target.setBooleanValue(sort);
        }
    }
    
    /**
     * Sets (as xml) the "sort" attribute
     */
    public void xsetSort(org.apache.xmlbeans.XmlBoolean sort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SORT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SORT$26);
            }
            target.set(sort);
        }
    }
    
    /**
     * Unsets the "sort" attribute
     */
    public void unsetSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORT$26);
        }
    }
    
    /**
     * Gets the "autoFilter" attribute
     */
    public boolean getAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFILTER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOFILTER$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoFilter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOFILTER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOFILTER$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoFilter" attribute
     */
    public boolean isSetAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOFILTER$28) != null;
        }
    }
    
    /**
     * Sets the "autoFilter" attribute
     */
    public void setAutoFilter(boolean autoFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFILTER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFILTER$28);
            }
            target.setBooleanValue(autoFilter);
        }
    }
    
    /**
     * Sets (as xml) the "autoFilter" attribute
     */
    public void xsetAutoFilter(org.apache.xmlbeans.XmlBoolean autoFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOFILTER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOFILTER$28);
            }
            target.set(autoFilter);
        }
    }
    
    /**
     * Unsets the "autoFilter" attribute
     */
    public void unsetAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOFILTER$28);
        }
    }
    
    /**
     * Gets the "pivotTables" attribute
     */
    public boolean getPivotTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOTTABLES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PIVOTTABLES$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pivotTables" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPivotTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOTTABLES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PIVOTTABLES$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotTables" attribute
     */
    public boolean isSetPivotTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PIVOTTABLES$30) != null;
        }
    }
    
    /**
     * Sets the "pivotTables" attribute
     */
    public void setPivotTables(boolean pivotTables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOTTABLES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PIVOTTABLES$30);
            }
            target.setBooleanValue(pivotTables);
        }
    }
    
    /**
     * Sets (as xml) the "pivotTables" attribute
     */
    public void xsetPivotTables(org.apache.xmlbeans.XmlBoolean pivotTables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOTTABLES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PIVOTTABLES$30);
            }
            target.set(pivotTables);
        }
    }
    
    /**
     * Unsets the "pivotTables" attribute
     */
    public void unsetPivotTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PIVOTTABLES$30);
        }
    }
    
    /**
     * Gets the "selectUnlockedCells" attribute
     */
    public boolean getSelectUnlockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SELECTUNLOCKEDCELLS$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "selectUnlockedCells" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSelectUnlockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SELECTUNLOCKEDCELLS$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "selectUnlockedCells" attribute
     */
    public boolean isSetSelectUnlockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32) != null;
        }
    }
    
    /**
     * Sets the "selectUnlockedCells" attribute
     */
    public void setSelectUnlockedCells(boolean selectUnlockedCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTUNLOCKEDCELLS$32);
            }
            target.setBooleanValue(selectUnlockedCells);
        }
    }
    
    /**
     * Sets (as xml) the "selectUnlockedCells" attribute
     */
    public void xsetSelectUnlockedCells(org.apache.xmlbeans.XmlBoolean selectUnlockedCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SELECTUNLOCKEDCELLS$32);
            }
            target.set(selectUnlockedCells);
        }
    }
    
    /**
     * Unsets the "selectUnlockedCells" attribute
     */
    public void unsetSelectUnlockedCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SELECTUNLOCKEDCELLS$32);
        }
    }
}
