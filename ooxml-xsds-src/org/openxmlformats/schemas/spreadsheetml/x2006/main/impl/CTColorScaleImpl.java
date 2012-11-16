/*
 * XML Type:  CT_ColorScale
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ColorScale(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorScaleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale
{
    
    public CTColorScaleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CFVO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfvo");
    private static final javax.xml.namespace.QName COLOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
    
    
    /**
     * Gets a List of "cfvo" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo> getCfvoList()
    {
        final class CfvoList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo get(int i)
                { return CTColorScaleImpl.this.getCfvoArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo old = CTColorScaleImpl.this.getCfvoArray(i);
                CTColorScaleImpl.this.setCfvoArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo o)
                { CTColorScaleImpl.this.insertNewCfvo(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo old = CTColorScaleImpl.this.getCfvoArray(i);
                CTColorScaleImpl.this.removeCfvo(i);
                return old;
            }
            
            public int size()
                { return CTColorScaleImpl.this.sizeOfCfvoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CfvoList();
        }
    }
    
    /**
     * Gets array of all "cfvo" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] getCfvoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CFVO$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cfvo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo getCfvoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().find_element_user(CFVO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cfvo" element
     */
    public int sizeOfCfvoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CFVO$0);
        }
    }
    
    /**
     * Sets array of all "cfvo" element
     */
    public void setCfvoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo[] cfvoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cfvoArray, CFVO$0);
        }
    }
    
    /**
     * Sets ith "cfvo" element
     */
    public void setCfvoArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo cfvo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().find_element_user(CFVO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cfvo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cfvo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo insertNewCfvo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().insert_element_user(CFVO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cfvo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo addNewCfvo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo)get_store().add_element_user(CFVO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cfvo" element
     */
    public void removeCfvo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CFVO$0, i);
        }
    }
    
    /**
     * Gets a List of "color" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor> getColorList()
    {
        final class ColorList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor get(int i)
                { return CTColorScaleImpl.this.getColorArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor old = CTColorScaleImpl.this.getColorArray(i);
                CTColorScaleImpl.this.setColorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor o)
                { CTColorScaleImpl.this.insertNewColor(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor old = CTColorScaleImpl.this.getColorArray(i);
                CTColorScaleImpl.this.removeColor(i);
                return old;
            }
            
            public int size()
                { return CTColorScaleImpl.this.sizeOfColorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColorList();
        }
    }
    
    /**
     * Gets array of all "color" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] getColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLOR$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getColorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "color" element
     */
    public int sizeOfColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLOR$2);
        }
    }
    
    /**
     * Sets array of all "color" element
     */
    public void setColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] colorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colorArray, COLOR$2);
        }
    }
    
    /**
     * Sets ith "color" element
     */
    public void setColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(color);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor insertNewColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().insert_element_user(COLOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(COLOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "color" element
     */
    public void removeColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLOR$2, i);
        }
    }
}
