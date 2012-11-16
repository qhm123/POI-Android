/*
 * XML Type:  CT_GroupShape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chartDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chartDrawing.impl;
/**
 * An XML CT_GroupShape(@http://schemas.openxmlformats.org/drawingml/2006/chartDrawing).
 *
 * This is a complex type.
 */
public class CTGroupShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape
{
    
    public CTGroupShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVGRPSPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "nvGrpSpPr");
    private static final javax.xml.namespace.QName GRPSPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "grpSpPr");
    private static final javax.xml.namespace.QName SP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "sp");
    private static final javax.xml.namespace.QName GRPSP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "grpSp");
    private static final javax.xml.namespace.QName GRAPHICFRAME$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "graphicFrame");
    private static final javax.xml.namespace.QName CXNSP$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "cxnSp");
    private static final javax.xml.namespace.QName PIC$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "pic");
    
    
    /**
     * Gets the "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual getNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
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
    public void setNvGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual nvGrpSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
            }
            target.set(nvGrpSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual addNewNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
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
     * Gets a List of "sp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape> getSpList()
    {
        final class SpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape get(int i)
                { return CTGroupShapeImpl.this.getSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape set(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape old = CTGroupShapeImpl.this.getSpArray(i);
                CTGroupShapeImpl.this.setSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape o)
                { CTGroupShapeImpl.this.insertNewSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape old = CTGroupShapeImpl.this.getSpArray(i);
                CTGroupShapeImpl.this.removeSp(i);
                return old;
            }
            
            public int size()
                { return CTGroupShapeImpl.this.sizeOfSpArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape[] getSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SP$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape[] result = new org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape getSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().find_element_user(SP$4, i);
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
            return get_store().count_elements(SP$4);
        }
    }
    
    /**
     * Sets array of all "sp" element
     */
    public void setSpArray(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape[] spArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(spArray, SP$4);
        }
    }
    
    /**
     * Sets ith "sp" element
     */
    public void setSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape sp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().find_element_user(SP$4, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape insertNewSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().insert_element_user(SP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape addNewSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTShape)get_store().add_element_user(SP$4);
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
            get_store().remove_element(SP$4, i);
        }
    }
    
    /**
     * Gets a List of "grpSp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape> getGrpSpList()
    {
        final class GrpSpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape get(int i)
                { return CTGroupShapeImpl.this.getGrpSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape set(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape old = CTGroupShapeImpl.this.getGrpSpArray(i);
                CTGroupShapeImpl.this.setGrpSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape o)
                { CTGroupShapeImpl.this.insertNewGrpSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape old = CTGroupShapeImpl.this.getGrpSpArray(i);
                CTGroupShapeImpl.this.removeGrpSp(i);
                return old;
            }
            
            public int size()
                { return CTGroupShapeImpl.this.sizeOfGrpSpArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape[] getGrpSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRPSP$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape[] result = new org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape getGrpSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, i);
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
            return get_store().count_elements(GRPSP$6);
        }
    }
    
    /**
     * Sets array of all "grpSp" element
     */
    public void setGrpSpArray(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape[] grpSpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(grpSpArray, GRPSP$6);
        }
    }
    
    /**
     * Sets ith "grpSp" element
     */
    public void setGrpSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape grpSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape insertNewGrpSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().insert_element_user(GRPSP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape addNewGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGroupShape)get_store().add_element_user(GRPSP$6);
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
            get_store().remove_element(GRPSP$6, i);
        }
    }
    
    /**
     * Gets a List of "graphicFrame" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame> getGraphicFrameList()
    {
        final class GraphicFrameList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame get(int i)
                { return CTGroupShapeImpl.this.getGraphicFrameArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame set(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame old = CTGroupShapeImpl.this.getGraphicFrameArray(i);
                CTGroupShapeImpl.this.setGraphicFrameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame o)
                { CTGroupShapeImpl.this.insertNewGraphicFrame(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame old = CTGroupShapeImpl.this.getGraphicFrameArray(i);
                CTGroupShapeImpl.this.removeGraphicFrame(i);
                return old;
            }
            
            public int size()
                { return CTGroupShapeImpl.this.sizeOfGraphicFrameArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame[] getGraphicFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRAPHICFRAME$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame[] result = new org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame getGraphicFrameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().find_element_user(GRAPHICFRAME$8, i);
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
            return get_store().count_elements(GRAPHICFRAME$8);
        }
    }
    
    /**
     * Sets array of all "graphicFrame" element
     */
    public void setGraphicFrameArray(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame[] graphicFrameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(graphicFrameArray, GRAPHICFRAME$8);
        }
    }
    
    /**
     * Sets ith "graphicFrame" element
     */
    public void setGraphicFrameArray(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame graphicFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().find_element_user(GRAPHICFRAME$8, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame insertNewGraphicFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().insert_element_user(GRAPHICFRAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame addNewGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTGraphicFrame)get_store().add_element_user(GRAPHICFRAME$8);
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
            get_store().remove_element(GRAPHICFRAME$8, i);
        }
    }
    
    /**
     * Gets a List of "cxnSp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector> getCxnSpList()
    {
        final class CxnSpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector get(int i)
                { return CTGroupShapeImpl.this.getCxnSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector set(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector old = CTGroupShapeImpl.this.getCxnSpArray(i);
                CTGroupShapeImpl.this.setCxnSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector o)
                { CTGroupShapeImpl.this.insertNewCxnSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector old = CTGroupShapeImpl.this.getCxnSpArray(i);
                CTGroupShapeImpl.this.removeCxnSp(i);
                return old;
            }
            
            public int size()
                { return CTGroupShapeImpl.this.sizeOfCxnSpArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector[] getCxnSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CXNSP$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector[] result = new org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector getCxnSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().find_element_user(CXNSP$10, i);
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
            return get_store().count_elements(CXNSP$10);
        }
    }
    
    /**
     * Sets array of all "cxnSp" element
     */
    public void setCxnSpArray(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector[] cxnSpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cxnSpArray, CXNSP$10);
        }
    }
    
    /**
     * Sets ith "cxnSp" element
     */
    public void setCxnSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector cxnSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().find_element_user(CXNSP$10, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector insertNewCxnSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().insert_element_user(CXNSP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector addNewCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTConnector)get_store().add_element_user(CXNSP$10);
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
            get_store().remove_element(CXNSP$10, i);
        }
    }
    
    /**
     * Gets a List of "pic" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture> getPicList()
    {
        final class PicList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture get(int i)
                { return CTGroupShapeImpl.this.getPicArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture set(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture old = CTGroupShapeImpl.this.getPicArray(i);
                CTGroupShapeImpl.this.setPicArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture o)
                { CTGroupShapeImpl.this.insertNewPic(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture old = CTGroupShapeImpl.this.getPicArray(i);
                CTGroupShapeImpl.this.removePic(i);
                return old;
            }
            
            public int size()
                { return CTGroupShapeImpl.this.sizeOfPicArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture[] getPicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIC$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture[] result = new org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture getPicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().find_element_user(PIC$12, i);
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
            return get_store().count_elements(PIC$12);
        }
    }
    
    /**
     * Sets array of all "pic" element
     */
    public void setPicArray(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture[] picArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(picArray, PIC$12);
        }
    }
    
    /**
     * Sets ith "pic" element
     */
    public void setPicArray(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture pic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().find_element_user(PIC$12, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture insertNewPic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().insert_element_user(PIC$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture addNewPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTPicture)get_store().add_element_user(PIC$12);
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
            get_store().remove_element(PIC$12, i);
        }
    }
}
