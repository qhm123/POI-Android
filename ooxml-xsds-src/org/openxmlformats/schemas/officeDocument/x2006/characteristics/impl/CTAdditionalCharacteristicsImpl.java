/*
 * XML Type:  CT_AdditionalCharacteristics
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/characteristics
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.characteristics.impl;
/**
 * An XML CT_AdditionalCharacteristics(@http://schemas.openxmlformats.org/officeDocument/2006/characteristics).
 *
 * This is a complex type.
 */
public class CTAdditionalCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics
{
    
    public CTAdditionalCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARACTERISTIC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/characteristics", "characteristic");
    
    
    /**
     * Gets a List of "characteristic" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic> getCharacteristicList()
    {
        final class CharacteristicList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic get(int i)
                { return CTAdditionalCharacteristicsImpl.this.getCharacteristicArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic set(int i, org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic old = CTAdditionalCharacteristicsImpl.this.getCharacteristicArray(i);
                CTAdditionalCharacteristicsImpl.this.setCharacteristicArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic o)
                { CTAdditionalCharacteristicsImpl.this.insertNewCharacteristic(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic old = CTAdditionalCharacteristicsImpl.this.getCharacteristicArray(i);
                CTAdditionalCharacteristicsImpl.this.removeCharacteristic(i);
                return old;
            }
            
            public int size()
                { return CTAdditionalCharacteristicsImpl.this.sizeOfCharacteristicArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CharacteristicList();
        }
    }
    
    /**
     * Gets array of all "characteristic" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic[] getCharacteristicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHARACTERISTIC$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic[] result = new org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "characteristic" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic getCharacteristicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic)get_store().find_element_user(CHARACTERISTIC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "characteristic" element
     */
    public int sizeOfCharacteristicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERISTIC$0);
        }
    }
    
    /**
     * Sets array of all "characteristic" element
     */
    public void setCharacteristicArray(org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic[] characteristicArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(characteristicArray, CHARACTERISTIC$0);
        }
    }
    
    /**
     * Sets ith "characteristic" element
     */
    public void setCharacteristicArray(int i, org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic characteristic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic)get_store().find_element_user(CHARACTERISTIC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(characteristic);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "characteristic" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic insertNewCharacteristic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic)get_store().insert_element_user(CHARACTERISTIC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "characteristic" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic addNewCharacteristic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTCharacteristic)get_store().add_element_user(CHARACTERISTIC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "characteristic" element
     */
    public void removeCharacteristic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERISTIC$0, i);
        }
    }
}
