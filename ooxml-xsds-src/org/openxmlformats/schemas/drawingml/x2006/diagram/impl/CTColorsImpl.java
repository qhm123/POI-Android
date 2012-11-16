/*
 * XML Type:  CT_Colors
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Colors(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTColorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors
{
    
    public CTColorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRGBCLR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scrgbClr");
    private static final javax.xml.namespace.QName SRGBCLR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srgbClr");
    private static final javax.xml.namespace.QName HSLCLR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hslClr");
    private static final javax.xml.namespace.QName SYSCLR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sysClr");
    private static final javax.xml.namespace.QName SCHEMECLR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "schemeClr");
    private static final javax.xml.namespace.QName PRSTCLR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstClr");
    private static final javax.xml.namespace.QName METH$12 = 
        new javax.xml.namespace.QName("", "meth");
    private static final javax.xml.namespace.QName HUEDIR$14 = 
        new javax.xml.namespace.QName("", "hueDir");
    
    
    /**
     * Gets a List of "scrgbClr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor> getScrgbClrList()
    {
        final class ScrgbClrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor get(int i)
                { return CTColorsImpl.this.getScrgbClrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor old = CTColorsImpl.this.getScrgbClrArray(i);
                CTColorsImpl.this.setScrgbClrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor o)
                { CTColorsImpl.this.insertNewScrgbClr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor old = CTColorsImpl.this.getScrgbClrArray(i);
                CTColorsImpl.this.removeScrgbClr(i);
                return old;
            }
            
            public int size()
                { return CTColorsImpl.this.sizeOfScrgbClrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ScrgbClrList();
        }
    }
    
    /**
     * Gets array of all "scrgbClr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor[] getScrgbClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCRGBCLR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scrgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor getScrgbClrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().find_element_user(SCRGBCLR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scrgbClr" element
     */
    public int sizeOfScrgbClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRGBCLR$0);
        }
    }
    
    /**
     * Sets array of all "scrgbClr" element
     */
    public void setScrgbClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor[] scrgbClrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scrgbClrArray, SCRGBCLR$0);
        }
    }
    
    /**
     * Sets ith "scrgbClr" element
     */
    public void setScrgbClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor scrgbClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().find_element_user(SCRGBCLR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scrgbClr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scrgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor insertNewScrgbClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().insert_element_user(SCRGBCLR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scrgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor addNewScrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor)get_store().add_element_user(SCRGBCLR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "scrgbClr" element
     */
    public void removeScrgbClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRGBCLR$0, i);
        }
    }
    
    /**
     * Gets a List of "srgbClr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor> getSrgbClrList()
    {
        final class SrgbClrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor get(int i)
                { return CTColorsImpl.this.getSrgbClrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor old = CTColorsImpl.this.getSrgbClrArray(i);
                CTColorsImpl.this.setSrgbClrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor o)
                { CTColorsImpl.this.insertNewSrgbClr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor old = CTColorsImpl.this.getSrgbClrArray(i);
                CTColorsImpl.this.removeSrgbClr(i);
                return old;
            }
            
            public int size()
                { return CTColorsImpl.this.sizeOfSrgbClrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SrgbClrList();
        }
    }
    
    /**
     * Gets array of all "srgbClr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor[] getSrgbClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRGBCLR$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "srgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor getSrgbClrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().find_element_user(SRGBCLR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "srgbClr" element
     */
    public int sizeOfSrgbClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRGBCLR$2);
        }
    }
    
    /**
     * Sets array of all "srgbClr" element
     */
    public void setSrgbClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor[] srgbClrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srgbClrArray, SRGBCLR$2);
        }
    }
    
    /**
     * Sets ith "srgbClr" element
     */
    public void setSrgbClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor srgbClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().find_element_user(SRGBCLR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(srgbClr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "srgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor insertNewSrgbClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().insert_element_user(SRGBCLR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "srgbClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor addNewSrgbClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor)get_store().add_element_user(SRGBCLR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "srgbClr" element
     */
    public void removeSrgbClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRGBCLR$2, i);
        }
    }
    
    /**
     * Gets a List of "hslClr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor> getHslClrList()
    {
        final class HslClrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor get(int i)
                { return CTColorsImpl.this.getHslClrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor old = CTColorsImpl.this.getHslClrArray(i);
                CTColorsImpl.this.setHslClrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor o)
                { CTColorsImpl.this.insertNewHslClr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor old = CTColorsImpl.this.getHslClrArray(i);
                CTColorsImpl.this.removeHslClr(i);
                return old;
            }
            
            public int size()
                { return CTColorsImpl.this.sizeOfHslClrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HslClrList();
        }
    }
    
    /**
     * Gets array of all "hslClr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor[] getHslClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HSLCLR$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hslClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor getHslClrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().find_element_user(HSLCLR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hslClr" element
     */
    public int sizeOfHslClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HSLCLR$4);
        }
    }
    
    /**
     * Sets array of all "hslClr" element
     */
    public void setHslClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor[] hslClrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hslClrArray, HSLCLR$4);
        }
    }
    
    /**
     * Sets ith "hslClr" element
     */
    public void setHslClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor hslClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().find_element_user(HSLCLR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hslClr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hslClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor insertNewHslClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().insert_element_user(HSLCLR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hslClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor addNewHslClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor)get_store().add_element_user(HSLCLR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "hslClr" element
     */
    public void removeHslClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HSLCLR$4, i);
        }
    }
    
    /**
     * Gets a List of "sysClr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor> getSysClrList()
    {
        final class SysClrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor get(int i)
                { return CTColorsImpl.this.getSysClrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor old = CTColorsImpl.this.getSysClrArray(i);
                CTColorsImpl.this.setSysClrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor o)
                { CTColorsImpl.this.insertNewSysClr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor old = CTColorsImpl.this.getSysClrArray(i);
                CTColorsImpl.this.removeSysClr(i);
                return old;
            }
            
            public int size()
                { return CTColorsImpl.this.sizeOfSysClrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SysClrList();
        }
    }
    
    /**
     * Gets array of all "sysClr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor[] getSysClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SYSCLR$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sysClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor getSysClrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().find_element_user(SYSCLR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sysClr" element
     */
    public int sizeOfSysClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSCLR$6);
        }
    }
    
    /**
     * Sets array of all "sysClr" element
     */
    public void setSysClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor[] sysClrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sysClrArray, SYSCLR$6);
        }
    }
    
    /**
     * Sets ith "sysClr" element
     */
    public void setSysClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor sysClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().find_element_user(SYSCLR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sysClr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sysClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor insertNewSysClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().insert_element_user(SYSCLR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sysClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor addNewSysClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor)get_store().add_element_user(SYSCLR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "sysClr" element
     */
    public void removeSysClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSCLR$6, i);
        }
    }
    
    /**
     * Gets a List of "schemeClr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor> getSchemeClrList()
    {
        final class SchemeClrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor get(int i)
                { return CTColorsImpl.this.getSchemeClrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor old = CTColorsImpl.this.getSchemeClrArray(i);
                CTColorsImpl.this.setSchemeClrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor o)
                { CTColorsImpl.this.insertNewSchemeClr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor old = CTColorsImpl.this.getSchemeClrArray(i);
                CTColorsImpl.this.removeSchemeClr(i);
                return old;
            }
            
            public int size()
                { return CTColorsImpl.this.sizeOfSchemeClrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SchemeClrList();
        }
    }
    
    /**
     * Gets array of all "schemeClr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor[] getSchemeClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEMECLR$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "schemeClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor getSchemeClrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().find_element_user(SCHEMECLR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "schemeClr" element
     */
    public int sizeOfSchemeClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMECLR$8);
        }
    }
    
    /**
     * Sets array of all "schemeClr" element
     */
    public void setSchemeClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor[] schemeClrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemeClrArray, SCHEMECLR$8);
        }
    }
    
    /**
     * Sets ith "schemeClr" element
     */
    public void setSchemeClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor schemeClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().find_element_user(SCHEMECLR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(schemeClr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schemeClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor insertNewSchemeClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().insert_element_user(SCHEMECLR$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schemeClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor addNewSchemeClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor)get_store().add_element_user(SCHEMECLR$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "schemeClr" element
     */
    public void removeSchemeClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMECLR$8, i);
        }
    }
    
    /**
     * Gets a List of "prstClr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor> getPrstClrList()
    {
        final class PrstClrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor get(int i)
                { return CTColorsImpl.this.getPrstClrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor old = CTColorsImpl.this.getPrstClrArray(i);
                CTColorsImpl.this.setPrstClrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor o)
                { CTColorsImpl.this.insertNewPrstClr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor old = CTColorsImpl.this.getPrstClrArray(i);
                CTColorsImpl.this.removePrstClr(i);
                return old;
            }
            
            public int size()
                { return CTColorsImpl.this.sizeOfPrstClrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PrstClrList();
        }
    }
    
    /**
     * Gets array of all "prstClr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor[] getPrstClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRSTCLR$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prstClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor getPrstClrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().find_element_user(PRSTCLR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prstClr" element
     */
    public int sizeOfPrstClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSTCLR$10);
        }
    }
    
    /**
     * Sets array of all "prstClr" element
     */
    public void setPrstClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor[] prstClrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(prstClrArray, PRSTCLR$10);
        }
    }
    
    /**
     * Sets ith "prstClr" element
     */
    public void setPrstClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor prstClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().find_element_user(PRSTCLR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prstClr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prstClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor insertNewPrstClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().insert_element_user(PRSTCLR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prstClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor addNewPrstClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor)get_store().add_element_user(PRSTCLR$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "prstClr" element
     */
    public void removePrstClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSTCLR$10, i);
        }
    }
    
    /**
     * Gets the "meth" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod.Enum getMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(METH$12);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "meth" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod xgetMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod)get_store().find_attribute_user(METH$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod)get_default_attribute_value(METH$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "meth" attribute
     */
    public boolean isSetMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METH$12) != null;
        }
    }
    
    /**
     * Sets the "meth" attribute
     */
    public void setMeth(org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod.Enum meth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METH$12);
            }
            target.setEnumValue(meth);
        }
    }
    
    /**
     * Sets (as xml) the "meth" attribute
     */
    public void xsetMeth(org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod meth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod)get_store().find_attribute_user(METH$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STClrAppMethod)get_store().add_attribute_user(METH$12);
            }
            target.set(meth);
        }
    }
    
    /**
     * Unsets the "meth" attribute
     */
    public void unsetMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METH$12);
        }
    }
    
    /**
     * Gets the "hueDir" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir.Enum getHueDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HUEDIR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HUEDIR$14);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hueDir" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir xgetHueDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir)get_store().find_attribute_user(HUEDIR$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir)get_default_attribute_value(HUEDIR$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "hueDir" attribute
     */
    public boolean isSetHueDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HUEDIR$14) != null;
        }
    }
    
    /**
     * Sets the "hueDir" attribute
     */
    public void setHueDir(org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir.Enum hueDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HUEDIR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HUEDIR$14);
            }
            target.setEnumValue(hueDir);
        }
    }
    
    /**
     * Sets (as xml) the "hueDir" attribute
     */
    public void xsetHueDir(org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir hueDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir)get_store().find_attribute_user(HUEDIR$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STHueDir)get_store().add_attribute_user(HUEDIR$14);
            }
            target.set(hueDir);
        }
    }
    
    /**
     * Unsets the "hueDir" attribute
     */
    public void unsetHueDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HUEDIR$14);
        }
    }
}
