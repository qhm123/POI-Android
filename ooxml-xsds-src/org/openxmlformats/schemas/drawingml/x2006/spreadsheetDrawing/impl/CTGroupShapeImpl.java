/*
 * XML Type:  CT_GroupShape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;
/**
 * An XML CT_GroupShape(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public class CTGroupShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape
{
    
    public CTGroupShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVGRPSPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "nvGrpSpPr");
    private static final javax.xml.namespace.QName GRPSPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "grpSpPr");
    private static final javax.xml.namespace.QName SP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "sp");
    private static final javax.xml.namespace.QName GRPSP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "grpSp");
    private static final javax.xml.namespace.QName GRAPHICFRAME$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "graphicFrame");
    private static final javax.xml.namespace.QName CXNSP$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cxnSp");
    private static final javax.xml.namespace.QName PIC$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "pic");
    
    
    /**
     * Gets the "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual getNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
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
    public void setNvGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual nvGrpSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
            }
            target.set(nvGrpSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual addNewNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape> getSpList()
    {
        final class SpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape get(int i)
                { return CTGroupShapeImpl.this.getSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape old = CTGroupShapeImpl.this.getSpArray(i);
                CTGroupShapeImpl.this.setSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape o)
                { CTGroupShapeImpl.this.insertNewSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape old = CTGroupShapeImpl.this.getSpArray(i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape[] getSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SP$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape getSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().find_element_user(SP$4, i);
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
    public void setSpArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape[] spArray)
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
    public void setSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape sp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().find_element_user(SP$4, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape insertNewSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().insert_element_user(SP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape addNewSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape)get_store().add_element_user(SP$4);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape> getGrpSpList()
    {
        final class GrpSpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape get(int i)
                { return CTGroupShapeImpl.this.getGrpSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape old = CTGroupShapeImpl.this.getGrpSpArray(i);
                CTGroupShapeImpl.this.setGrpSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape o)
                { CTGroupShapeImpl.this.insertNewGrpSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape old = CTGroupShapeImpl.this.getGrpSpArray(i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape[] getGrpSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRPSP$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape getGrpSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, i);
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
    public void setGrpSpArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape[] grpSpArray)
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
    public void setGrpSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape grpSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().find_element_user(GRPSP$6, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape insertNewGrpSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().insert_element_user(GRPSP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grpSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape addNewGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape)get_store().add_element_user(GRPSP$6);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame> getGraphicFrameList()
    {
        final class GraphicFrameList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame get(int i)
                { return CTGroupShapeImpl.this.getGraphicFrameArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame old = CTGroupShapeImpl.this.getGraphicFrameArray(i);
                CTGroupShapeImpl.this.setGraphicFrameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame o)
                { CTGroupShapeImpl.this.insertNewGraphicFrame(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame old = CTGroupShapeImpl.this.getGraphicFrameArray(i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame[] getGraphicFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRAPHICFRAME$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame getGraphicFrameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$8, i);
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
    public void setGraphicFrameArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame[] graphicFrameArray)
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
    public void setGraphicFrameArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame graphicFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$8, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame insertNewGraphicFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().insert_element_user(GRAPHICFRAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "graphicFrame" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame addNewGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame)get_store().add_element_user(GRAPHICFRAME$8);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector> getCxnSpList()
    {
        final class CxnSpList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector get(int i)
                { return CTGroupShapeImpl.this.getCxnSpArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector old = CTGroupShapeImpl.this.getCxnSpArray(i);
                CTGroupShapeImpl.this.setCxnSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector o)
                { CTGroupShapeImpl.this.insertNewCxnSp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector old = CTGroupShapeImpl.this.getCxnSpArray(i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector[] getCxnSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CXNSP$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector getCxnSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().find_element_user(CXNSP$10, i);
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
    public void setCxnSpArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector[] cxnSpArray)
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
    public void setCxnSpArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector cxnSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().find_element_user(CXNSP$10, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector insertNewCxnSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().insert_element_user(CXNSP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxnSp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector addNewCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector)get_store().add_element_user(CXNSP$10);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture> getPicList()
    {
        final class PicList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture get(int i)
                { return CTGroupShapeImpl.this.getPicArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture old = CTGroupShapeImpl.this.getPicArray(i);
                CTGroupShapeImpl.this.setPicArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture o)
                { CTGroupShapeImpl.this.insertNewPic(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture old = CTGroupShapeImpl.this.getPicArray(i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture[] getPicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIC$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture getPicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().find_element_user(PIC$12, i);
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
    public void setPicArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture[] picArray)
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
    public void setPicArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture pic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().find_element_user(PIC$12, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture insertNewPic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().insert_element_user(PIC$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture addNewPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture)get_store().add_element_user(PIC$12);
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
