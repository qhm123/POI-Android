/*
 * XML Type:  CT_GvmlGroupShape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GvmlGroupShape(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGvmlGroupShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape
{
    
    public CTGvmlGroupShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVGRPSPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "nvGrpSpPr");
    private static final javax.xml.namespace.QName GRPSPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpSpPr");
    private static final javax.xml.namespace.QName TXSP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "txSp");
    private static final javax.xml.namespace.QName SP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sp");
    private static final javax.xml.namespace.QName CXNSP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cxnSp");
    private static final javax.xml.namespace.QName PIC$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pic");
    private static final javax.xml.namespace.QName GRAPHICFRAME$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphicFrame");
    private static final javax.xml.namespace.QName GRPSP$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpSp");
    private static final javax.xml.namespace.QName EXTLST$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual getNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nvGrpSpPr" element
     */
    public void setNvGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual nvGrpSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
            }
            target.set(nvGrpSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual addNewNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "grpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties getGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties)get_store().find_element_user(GRPSPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "grpSpPr" element
     */
    public void setGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties grpSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties)get_store().find_element_user(GRPSPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties)get_store().add_element_user(GRPSPPR$2);
            }
            target.set(grpSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "grpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties addNewGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties)get_store().add_element_user(GRPSPPR$2);
            return target;
        }
    }
    
    /**
     * Gets a List of "txSp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape> getTxSpList()
    {
        final class TxSpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape get(int i)
                { return CTGvmlGroupShapeImpl.this.getTxSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape old = CTGvmlGroupShapeImpl.this.getTxSpArray(i);
                CTGvmlGroupShapeImpl.this.setTxSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape o)
                { CTGvmlGroupShapeImpl.this.insertNewTxSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape old = CTGvmlGroupShapeImpl.this.getTxSpArray(i);
                CTGvmlGroupShapeImpl.this.removeTxSp(i);
                return old;
            }
            
            public int size()
                { return CTGvmlGroupShapeImpl.this.sizeOfTxSpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TxSpList();
        }
    }
    
    /**
     * Gets array of all "txSp" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape[] getTxSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TXSP$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "txSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape getTxSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape)get_store().find_element_user(TXSP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "txSp" element
     */
    public int sizeOfTxSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXSP$4);
        }
    }
    
    /**
     * Sets array of all "txSp" element
     */
    public void setTxSpArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape[] txSpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(txSpArray, TXSP$4);
        }
    }
    
    /**
     * Sets ith "txSp" element
     */
    public void setTxSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape txSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape)get_store().find_element_user(TXSP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(txSp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "txSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape insertNewTxSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape)get_store().insert_element_user(TXSP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "txSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape addNewTxSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape)get_store().add_element_user(TXSP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "txSp" element
     */
    public void removeTxSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXSP$4, i);
        }
    }
    
    /**
     * Gets a List of "sp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape> getSpList()
    {
        final class SpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape get(int i)
                { return CTGvmlGroupShapeImpl.this.getSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape old = CTGvmlGroupShapeImpl.this.getSpArray(i);
                CTGvmlGroupShapeImpl.this.setSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape o)
                { CTGvmlGroupShapeImpl.this.insertNewSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape old = CTGvmlGroupShapeImpl.this.getSpArray(i);
                CTGvmlGroupShapeImpl.this.removeSp(i);
                return old;
            }
            
            public int size()
                { return CTGvmlGroupShapeImpl.this.sizeOfSpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SpList();
        }
    }
    
    /**
     * Gets array of all "sp" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape[] getSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SP$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape getSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape)get_store().find_element_user(SP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sp" element
     */
    public int sizeOfSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SP$6);
        }
    }
    
    /**
     * Sets array of all "sp" element
     */
    public void setSpArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape[] spArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(spArray, SP$6);
        }
    }
    
    /**
     * Sets ith "sp" element
     */
    public void setSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape sp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape)get_store().find_element_user(SP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape insertNewSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape)get_store().insert_element_user(SP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape addNewSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape)get_store().add_element_user(SP$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "sp" element
     */
    public void removeSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SP$6, i);
        }
    }
    
    /**
     * Gets a List of "cxnSp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector> getCxnSpList()
    {
        final class CxnSpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector get(int i)
                { return CTGvmlGroupShapeImpl.this.getCxnSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector old = CTGvmlGroupShapeImpl.this.getCxnSpArray(i);
                CTGvmlGroupShapeImpl.this.setCxnSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector o)
                { CTGvmlGroupShapeImpl.this.insertNewCxnSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector old = CTGvmlGroupShapeImpl.this.getCxnSpArray(i);
                CTGvmlGroupShapeImpl.this.removeCxnSp(i);
                return old;
            }
            
            public int size()
                { return CTGvmlGroupShapeImpl.this.sizeOfCxnSpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CxnSpList();
        }
    }
    
    /**
     * Gets array of all "cxnSp" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector[] getCxnSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CXNSP$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector getCxnSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector)get_store().find_element_user(CXNSP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cxnSp" element
     */
    public int sizeOfCxnSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CXNSP$8);
        }
    }
    
    /**
     * Sets array of all "cxnSp" element
     */
    public void setCxnSpArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector[] cxnSpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cxnSpArray, CXNSP$8);
        }
    }
    
    /**
     * Sets ith "cxnSp" element
     */
    public void setCxnSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector cxnSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector)get_store().find_element_user(CXNSP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cxnSp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector insertNewCxnSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector)get_store().insert_element_user(CXNSP$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector addNewCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlConnector)get_store().add_element_user(CXNSP$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "cxnSp" element
     */
    public void removeCxnSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CXNSP$8, i);
        }
    }
    
    /**
     * Gets a List of "pic" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture> getPicList()
    {
        final class PicList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture get(int i)
                { return CTGvmlGroupShapeImpl.this.getPicArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture old = CTGvmlGroupShapeImpl.this.getPicArray(i);
                CTGvmlGroupShapeImpl.this.setPicArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture o)
                { CTGvmlGroupShapeImpl.this.insertNewPic(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture old = CTGvmlGroupShapeImpl.this.getPicArray(i);
                CTGvmlGroupShapeImpl.this.removePic(i);
                return old;
            }
            
            public int size()
                { return CTGvmlGroupShapeImpl.this.sizeOfPicArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PicList();
        }
    }
    
    /**
     * Gets array of all "pic" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture[] getPicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIC$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture getPicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture)get_store().find_element_user(PIC$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pic" element
     */
    public int sizeOfPicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIC$10);
        }
    }
    
    /**
     * Sets array of all "pic" element
     */
    public void setPicArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture[] picArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(picArray, PIC$10);
        }
    }
    
    /**
     * Sets ith "pic" element
     */
    public void setPicArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture pic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture)get_store().find_element_user(PIC$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pic);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture insertNewPic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture)get_store().insert_element_user(PIC$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture addNewPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture)get_store().add_element_user(PIC$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "pic" element
     */
    public void removePic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIC$10, i);
        }
    }
    
    /**
     * Gets a List of "graphicFrame" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame> getGraphicFrameList()
    {
        final class GraphicFrameList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame get(int i)
                { return CTGvmlGroupShapeImpl.this.getGraphicFrameArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame old = CTGvmlGroupShapeImpl.this.getGraphicFrameArray(i);
                CTGvmlGroupShapeImpl.this.setGraphicFrameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame o)
                { CTGvmlGroupShapeImpl.this.insertNewGraphicFrame(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame old = CTGvmlGroupShapeImpl.this.getGraphicFrameArray(i);
                CTGvmlGroupShapeImpl.this.removeGraphicFrame(i);
                return old;
            }
            
            public int size()
                { return CTGvmlGroupShapeImpl.this.sizeOfGraphicFrameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GraphicFrameList();
        }
    }
    
    /**
     * Gets array of all "graphicFrame" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame[] getGraphicFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRAPHICFRAME$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame getGraphicFrameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "graphicFrame" element
     */
    public int sizeOfGraphicFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHICFRAME$12);
        }
    }
    
    /**
     * Sets array of all "graphicFrame" element
     */
    public void setGraphicFrameArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame[] graphicFrameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(graphicFrameArray, GRAPHICFRAME$12);
        }
    }
    
    /**
     * Sets ith "graphicFrame" element
     */
    public void setGraphicFrameArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame graphicFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(graphicFrame);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame insertNewGraphicFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame)get_store().insert_element_user(GRAPHICFRAME$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame addNewGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGraphicalObjectFrame)get_store().add_element_user(GRAPHICFRAME$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "graphicFrame" element
     */
    public void removeGraphicFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHICFRAME$12, i);
        }
    }
    
    /**
     * Gets a List of "grpSp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape> getGrpSpList()
    {
        final class GrpSpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape get(int i)
                { return CTGvmlGroupShapeImpl.this.getGrpSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape old = CTGvmlGroupShapeImpl.this.getGrpSpArray(i);
                CTGvmlGroupShapeImpl.this.setGrpSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape o)
                { CTGvmlGroupShapeImpl.this.insertNewGrpSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape old = CTGvmlGroupShapeImpl.this.getGrpSpArray(i);
                CTGvmlGroupShapeImpl.this.removeGrpSp(i);
                return old;
            }
            
            public int size()
                { return CTGvmlGroupShapeImpl.this.sizeOfGrpSpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GrpSpList();
        }
    }
    
    /**
     * Gets array of all "grpSp" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape[] getGrpSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRPSP$14, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape getGrpSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().find_element_user(GRPSP$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "grpSp" element
     */
    public int sizeOfGrpSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRPSP$14);
        }
    }
    
    /**
     * Sets array of all "grpSp" element
     */
    public void setGrpSpArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape[] grpSpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(grpSpArray, GRPSP$14);
        }
    }
    
    /**
     * Sets ith "grpSp" element
     */
    public void setGrpSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape grpSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().find_element_user(GRPSP$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(grpSp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape insertNewGrpSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().insert_element_user(GRPSP$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape addNewGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlGroupShape)get_store().add_element_user(GRPSP$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "grpSp" element
     */
    public void removeGrpSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRPSP$14, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, 0);
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
            return get_store().count_elements(EXTLST$16) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$16);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$16);
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
            get_store().remove_element(EXTLST$16, 0);
        }
    }
}
