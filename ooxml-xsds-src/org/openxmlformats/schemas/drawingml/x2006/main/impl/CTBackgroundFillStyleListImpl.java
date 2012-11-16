/*
 * XML Type:  CT_BackgroundFillStyleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_BackgroundFillStyleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBackgroundFillStyleListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList
{
    
    public CTBackgroundFillStyleListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOFILL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
    private static final javax.xml.namespace.QName SOLIDFILL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
    private static final javax.xml.namespace.QName GRADFILL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
    private static final javax.xml.namespace.QName BLIPFILL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
    private static final javax.xml.namespace.QName PATTFILL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
    private static final javax.xml.namespace.QName GRPFILL$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
    
    
    /**
     * Gets a List of "noFill" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties> getNoFillList()
    {
        final class NoFillList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties get(int i)
                { return CTBackgroundFillStyleListImpl.this.getNoFillArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties old = CTBackgroundFillStyleListImpl.this.getNoFillArray(i);
                CTBackgroundFillStyleListImpl.this.setNoFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties o)
                { CTBackgroundFillStyleListImpl.this.insertNewNoFill(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties old = CTBackgroundFillStyleListImpl.this.getNoFillArray(i);
                CTBackgroundFillStyleListImpl.this.removeNoFill(i);
                return old;
            }
            
            public int size()
                { return CTBackgroundFillStyleListImpl.this.sizeOfNoFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NoFillList();
        }
    }
    
    /**
     * Gets array of all "noFill" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties[] getNoFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOFILL$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "noFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties getNoFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "noFill" element
     */
    public int sizeOfNoFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOFILL$0);
        }
    }
    
    /**
     * Sets array of all "noFill" element
     */
    public void setNoFillArray(org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties[] noFillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(noFillArray, NOFILL$0);
        }
    }
    
    /**
     * Sets ith "noFill" element
     */
    public void setNoFillArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties noFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().find_element_user(NOFILL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(noFill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "noFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties insertNewNoFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().insert_element_user(NOFILL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "noFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties addNewNoFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties)get_store().add_element_user(NOFILL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "noFill" element
     */
    public void removeNoFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOFILL$0, i);
        }
    }
    
    /**
     * Gets a List of "solidFill" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties> getSolidFillList()
    {
        final class SolidFillList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties get(int i)
                { return CTBackgroundFillStyleListImpl.this.getSolidFillArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties old = CTBackgroundFillStyleListImpl.this.getSolidFillArray(i);
                CTBackgroundFillStyleListImpl.this.setSolidFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties o)
                { CTBackgroundFillStyleListImpl.this.insertNewSolidFill(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties old = CTBackgroundFillStyleListImpl.this.getSolidFillArray(i);
                CTBackgroundFillStyleListImpl.this.removeSolidFill(i);
                return old;
            }
            
            public int size()
                { return CTBackgroundFillStyleListImpl.this.sizeOfSolidFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SolidFillList();
        }
    }
    
    /**
     * Gets array of all "solidFill" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties[] getSolidFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOLIDFILL$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "solidFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties getSolidFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "solidFill" element
     */
    public int sizeOfSolidFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLIDFILL$2);
        }
    }
    
    /**
     * Sets array of all "solidFill" element
     */
    public void setSolidFillArray(org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties[] solidFillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(solidFillArray, SOLIDFILL$2);
        }
    }
    
    /**
     * Sets ith "solidFill" element
     */
    public void setSolidFillArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties solidFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().find_element_user(SOLIDFILL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(solidFill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "solidFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties insertNewSolidFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().insert_element_user(SOLIDFILL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "solidFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties addNewSolidFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties)get_store().add_element_user(SOLIDFILL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "solidFill" element
     */
    public void removeSolidFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLIDFILL$2, i);
        }
    }
    
    /**
     * Gets a List of "gradFill" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties> getGradFillList()
    {
        final class GradFillList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties get(int i)
                { return CTBackgroundFillStyleListImpl.this.getGradFillArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties old = CTBackgroundFillStyleListImpl.this.getGradFillArray(i);
                CTBackgroundFillStyleListImpl.this.setGradFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties o)
                { CTBackgroundFillStyleListImpl.this.insertNewGradFill(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties old = CTBackgroundFillStyleListImpl.this.getGradFillArray(i);
                CTBackgroundFillStyleListImpl.this.removeGradFill(i);
                return old;
            }
            
            public int size()
                { return CTBackgroundFillStyleListImpl.this.sizeOfGradFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GradFillList();
        }
    }
    
    /**
     * Gets array of all "gradFill" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties[] getGradFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRADFILL$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gradFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties getGradFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gradFill" element
     */
    public int sizeOfGradFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRADFILL$4);
        }
    }
    
    /**
     * Sets array of all "gradFill" element
     */
    public void setGradFillArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties[] gradFillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gradFillArray, GRADFILL$4);
        }
    }
    
    /**
     * Sets ith "gradFill" element
     */
    public void setGradFillArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties gradFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().find_element_user(GRADFILL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gradFill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gradFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties insertNewGradFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().insert_element_user(GRADFILL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gradFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties addNewGradFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties)get_store().add_element_user(GRADFILL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "gradFill" element
     */
    public void removeGradFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRADFILL$4, i);
        }
    }
    
    /**
     * Gets a List of "blipFill" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties> getBlipFillList()
    {
        final class BlipFillList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties get(int i)
                { return CTBackgroundFillStyleListImpl.this.getBlipFillArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties old = CTBackgroundFillStyleListImpl.this.getBlipFillArray(i);
                CTBackgroundFillStyleListImpl.this.setBlipFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties o)
                { CTBackgroundFillStyleListImpl.this.insertNewBlipFill(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties old = CTBackgroundFillStyleListImpl.this.getBlipFillArray(i);
                CTBackgroundFillStyleListImpl.this.removeBlipFill(i);
                return old;
            }
            
            public int size()
                { return CTBackgroundFillStyleListImpl.this.sizeOfBlipFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BlipFillList();
        }
    }
    
    /**
     * Gets array of all "blipFill" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties[] getBlipFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BLIPFILL$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "blipFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties getBlipFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "blipFill" element
     */
    public int sizeOfBlipFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLIPFILL$6);
        }
    }
    
    /**
     * Sets array of all "blipFill" element
     */
    public void setBlipFillArray(org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties[] blipFillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(blipFillArray, BLIPFILL$6);
        }
    }
    
    /**
     * Sets ith "blipFill" element
     */
    public void setBlipFillArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties blipFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().find_element_user(BLIPFILL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(blipFill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blipFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties insertNewBlipFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().insert_element_user(BLIPFILL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blipFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties addNewBlipFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties)get_store().add_element_user(BLIPFILL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "blipFill" element
     */
    public void removeBlipFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLIPFILL$6, i);
        }
    }
    
    /**
     * Gets a List of "pattFill" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties> getPattFillList()
    {
        final class PattFillList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties get(int i)
                { return CTBackgroundFillStyleListImpl.this.getPattFillArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties old = CTBackgroundFillStyleListImpl.this.getPattFillArray(i);
                CTBackgroundFillStyleListImpl.this.setPattFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties o)
                { CTBackgroundFillStyleListImpl.this.insertNewPattFill(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties old = CTBackgroundFillStyleListImpl.this.getPattFillArray(i);
                CTBackgroundFillStyleListImpl.this.removePattFill(i);
                return old;
            }
            
            public int size()
                { return CTBackgroundFillStyleListImpl.this.sizeOfPattFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PattFillList();
        }
    }
    
    /**
     * Gets array of all "pattFill" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties[] getPattFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PATTFILL$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pattFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties getPattFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pattFill" element
     */
    public int sizeOfPattFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTFILL$8);
        }
    }
    
    /**
     * Sets array of all "pattFill" element
     */
    public void setPattFillArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties[] pattFillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pattFillArray, PATTFILL$8);
        }
    }
    
    /**
     * Sets ith "pattFill" element
     */
    public void setPattFillArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties pattFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().find_element_user(PATTFILL$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pattFill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties insertNewPattFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().insert_element_user(PATTFILL$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pattFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties addNewPattFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties)get_store().add_element_user(PATTFILL$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "pattFill" element
     */
    public void removePattFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTFILL$8, i);
        }
    }
    
    /**
     * Gets a List of "grpFill" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties> getGrpFillList()
    {
        final class GrpFillList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties get(int i)
                { return CTBackgroundFillStyleListImpl.this.getGrpFillArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties old = CTBackgroundFillStyleListImpl.this.getGrpFillArray(i);
                CTBackgroundFillStyleListImpl.this.setGrpFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties o)
                { CTBackgroundFillStyleListImpl.this.insertNewGrpFill(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties old = CTBackgroundFillStyleListImpl.this.getGrpFillArray(i);
                CTBackgroundFillStyleListImpl.this.removeGrpFill(i);
                return old;
            }
            
            public int size()
                { return CTBackgroundFillStyleListImpl.this.sizeOfGrpFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GrpFillList();
        }
    }
    
    /**
     * Gets array of all "grpFill" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties[] getGrpFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRPFILL$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "grpFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties getGrpFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "grpFill" element
     */
    public int sizeOfGrpFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRPFILL$10);
        }
    }
    
    /**
     * Sets array of all "grpFill" element
     */
    public void setGrpFillArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties[] grpFillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(grpFillArray, GRPFILL$10);
        }
    }
    
    /**
     * Sets ith "grpFill" element
     */
    public void setGrpFillArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties grpFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().find_element_user(GRPFILL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(grpFill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "grpFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties insertNewGrpFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().insert_element_user(GRPFILL$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grpFill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties addNewGrpFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties)get_store().add_element_user(GRPFILL$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "grpFill" element
     */
    public void removeGrpFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRPFILL$10, i);
        }
    }
}
