/*
 * XML Type:  CT_GroupShape
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_GroupShape(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTGroupShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape
{
    
    public CTGroupShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVGRPSPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvGrpSpPr");
    private static final javax.xml.namespace.QName GRPSPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "grpSpPr");
    private static final javax.xml.namespace.QName SP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sp");
    private static final javax.xml.namespace.QName GRPSP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "grpSp");
    private static final javax.xml.namespace.QName GRAPHICFRAME$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "graphicFrame");
    private static final javax.xml.namespace.QName CXNSP$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cxnSp");
    private static final javax.xml.namespace.QName PIC$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "pic");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    
    
    /**
     * Gets the "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual getNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
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
    public void setNvGrpSpPr(org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual nvGrpSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual)get_store().find_element_user(NVGRPSPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
            }
            target.set(nvGrpSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvGrpSpPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual addNewNvGrpSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual)get_store().add_element_user(NVGRPSPPR$0);
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
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTShape> getSpList()
    {
        final class SpList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTShape>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTShape get(int i)
                { return CTGroupShapeImpl.this.getSpArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTShape set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTShape o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTShape old = CTGroupShapeImpl.this.getSpArray(i);
                CTGroupShapeImpl.this.setSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTShape o)
                { CTGroupShapeImpl.this.insertNewSp(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTShape remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTShape old = CTGroupShapeImpl.this.getSpArray(i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShape[] getSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SP$4, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTShape[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShape getSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShape)get_store().find_element_user(SP$4, i);
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
    public void setSpArray(org.openxmlformats.schemas.presentationml.x2006.main.CTShape[] spArray)
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
    public void setSpArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTShape sp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShape)get_store().find_element_user(SP$4, i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShape insertNewSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShape)get_store().insert_element_user(SP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShape addNewSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShape)get_store().add_element_user(SP$4);
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
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape> getGrpSpList()
    {
        final class GrpSpList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape get(int i)
                { return CTGroupShapeImpl.this.getGrpSpArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape old = CTGroupShapeImpl.this.getGrpSpArray(i);
                CTGroupShapeImpl.this.setGrpSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape o)
                { CTGroupShapeImpl.this.insertNewGrpSp(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape old = CTGroupShapeImpl.this.getGrpSpArray(i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape[] getGrpSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRPSP$6, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "grpSp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape getGrpSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().find_element_user(GRPSP$6, i);
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
    public void setGrpSpArray(org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape[] grpSpArray)
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
    public void setGrpSpArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape grpSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().find_element_user(GRPSP$6, i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape insertNewGrpSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().insert_element_user(GRPSP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grpSp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape addNewGrpSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().add_element_user(GRPSP$6);
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
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame> getGraphicFrameList()
    {
        final class GraphicFrameList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame get(int i)
                { return CTGroupShapeImpl.this.getGraphicFrameArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame old = CTGroupShapeImpl.this.getGraphicFrameArray(i);
                CTGroupShapeImpl.this.setGraphicFrameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame o)
                { CTGroupShapeImpl.this.insertNewGraphicFrame(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame old = CTGroupShapeImpl.this.getGraphicFrameArray(i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame[] getGraphicFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRAPHICFRAME$8, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "graphicFrame" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame getGraphicFrameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$8, i);
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
    public void setGraphicFrameArray(org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame[] graphicFrameArray)
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
    public void setGraphicFrameArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame graphicFrame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame)get_store().find_element_user(GRAPHICFRAME$8, i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame insertNewGraphicFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame)get_store().insert_element_user(GRAPHICFRAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "graphicFrame" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame addNewGraphicFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame)get_store().add_element_user(GRAPHICFRAME$8);
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
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTConnector> getCxnSpList()
    {
        final class CxnSpList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTConnector>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTConnector get(int i)
                { return CTGroupShapeImpl.this.getCxnSpArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTConnector set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTConnector o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTConnector old = CTGroupShapeImpl.this.getCxnSpArray(i);
                CTGroupShapeImpl.this.setCxnSpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTConnector o)
                { CTGroupShapeImpl.this.insertNewCxnSp(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTConnector remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTConnector old = CTGroupShapeImpl.this.getCxnSpArray(i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTConnector[] getCxnSpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CXNSP$10, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTConnector[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTConnector[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cxnSp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTConnector getCxnSpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTConnector target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTConnector)get_store().find_element_user(CXNSP$10, i);
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
    public void setCxnSpArray(org.openxmlformats.schemas.presentationml.x2006.main.CTConnector[] cxnSpArray)
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
    public void setCxnSpArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTConnector cxnSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTConnector target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTConnector)get_store().find_element_user(CXNSP$10, i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTConnector insertNewCxnSp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTConnector target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTConnector)get_store().insert_element_user(CXNSP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxnSp" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTConnector addNewCxnSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTConnector target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTConnector)get_store().add_element_user(CXNSP$10);
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
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTPicture> getPicList()
    {
        final class PicList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTPicture>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTPicture get(int i)
                { return CTGroupShapeImpl.this.getPicArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTPicture set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTPicture o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTPicture old = CTGroupShapeImpl.this.getPicArray(i);
                CTGroupShapeImpl.this.setPicArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTPicture o)
                { CTGroupShapeImpl.this.insertNewPic(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTPicture remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTPicture old = CTGroupShapeImpl.this.getPicArray(i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPicture[] getPicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIC$12, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTPicture[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTPicture[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pic" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPicture getPicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPicture)get_store().find_element_user(PIC$12, i);
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
    public void setPicArray(org.openxmlformats.schemas.presentationml.x2006.main.CTPicture[] picArray)
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
    public void setPicArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTPicture pic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPicture)get_store().find_element_user(PIC$12, i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPicture insertNewPic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPicture)get_store().insert_element_user(PIC$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pic" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPicture addNewPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPicture)get_store().add_element_user(PIC$12);
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
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$14, 0);
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
            return get_store().count_elements(EXTLST$14) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$14);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$14);
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
            get_store().remove_element(EXTLST$14, 0);
        }
    }
}
