/*
 * XML Type:  CT_BuildList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_BuildList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTBuildListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList
{
    
    public CTBuildListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLDP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bldP");
    private static final javax.xml.namespace.QName BLDDGM$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bldDgm");
    private static final javax.xml.namespace.QName BLDOLECHART$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bldOleChart");
    private static final javax.xml.namespace.QName BLDGRAPHIC$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bldGraphic");
    
    
    // XXX: DD
//    /**
//     * Gets a List of "bldP" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph> getBldPList()
//    {
//        final class BldPList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph get(int i)
//                { return CTBuildListImpl.this.getBldPArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph old = CTBuildListImpl.this.getBldPArray(i);
//                CTBuildListImpl.this.setBldPArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph o)
//                { CTBuildListImpl.this.insertNewBldP(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph old = CTBuildListImpl.this.getBldPArray(i);
//                CTBuildListImpl.this.removeBldP(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTBuildListImpl.this.sizeOfBldPArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new BldPList();
//        }
//    }
//    
//    /**
//     * Gets array of all "bldP" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph[] getBldPArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(BLDP$0, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "bldP" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph getBldPArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph)get_store().find_element_user(BLDP$0, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "bldP" element
     */
    public int sizeOfBldPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDP$0);
        }
    }
    
//    /**
//     * Sets array of all "bldP" element
//     */
//    public void setBldPArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph[] bldPArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(bldPArray, BLDP$0);
//        }
//    }
//    
//    /**
//     * Sets ith "bldP" element
//     */
//    public void setBldPArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph bldP)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph)get_store().find_element_user(BLDP$0, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(bldP);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "bldP" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph insertNewBldP(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph)get_store().insert_element_user(BLDP$0, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "bldP" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph addNewBldP()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph)get_store().add_element_user(BLDP$0);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "bldP" element
     */
    public void removeBldP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDP$0, i);
        }
    }
    
//    /**
//     * Gets a List of "bldDgm" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram> getBldDgmList()
//    {
//        final class BldDgmList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram get(int i)
//                { return CTBuildListImpl.this.getBldDgmArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram old = CTBuildListImpl.this.getBldDgmArray(i);
//                CTBuildListImpl.this.setBldDgmArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram o)
//                { CTBuildListImpl.this.insertNewBldDgm(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram old = CTBuildListImpl.this.getBldDgmArray(i);
//                CTBuildListImpl.this.removeBldDgm(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTBuildListImpl.this.sizeOfBldDgmArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new BldDgmList();
//        }
//    }
//    
//    /**
//     * Gets array of all "bldDgm" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram[] getBldDgmArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(BLDDGM$2, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "bldDgm" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram getBldDgmArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram)get_store().find_element_user(BLDDGM$2, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "bldDgm" element
     */
    public int sizeOfBldDgmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDDGM$2);
        }
    }
    
//    /**
//     * Sets array of all "bldDgm" element
//     */
//    public void setBldDgmArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram[] bldDgmArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(bldDgmArray, BLDDGM$2);
//        }
//    }
//    
//    /**
//     * Sets ith "bldDgm" element
//     */
//    public void setBldDgmArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram bldDgm)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram)get_store().find_element_user(BLDDGM$2, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(bldDgm);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "bldDgm" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram insertNewBldDgm(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram)get_store().insert_element_user(BLDDGM$2, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "bldDgm" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram addNewBldDgm()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram)get_store().add_element_user(BLDDGM$2);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "bldDgm" element
     */
    public void removeBldDgm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDDGM$2, i);
        }
    }
    
//    /**
//     * Gets a List of "bldOleChart" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart> getBldOleChartList()
//    {
//        final class BldOleChartList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart get(int i)
//                { return CTBuildListImpl.this.getBldOleChartArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart old = CTBuildListImpl.this.getBldOleChartArray(i);
//                CTBuildListImpl.this.setBldOleChartArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart o)
//                { CTBuildListImpl.this.insertNewBldOleChart(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart old = CTBuildListImpl.this.getBldOleChartArray(i);
//                CTBuildListImpl.this.removeBldOleChart(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTBuildListImpl.this.sizeOfBldOleChartArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new BldOleChartList();
//        }
//    }
//    
//    /**
//     * Gets array of all "bldOleChart" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart[] getBldOleChartArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(BLDOLECHART$4, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "bldOleChart" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart getBldOleChartArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart)get_store().find_element_user(BLDOLECHART$4, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "bldOleChart" element
     */
    public int sizeOfBldOleChartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDOLECHART$4);
        }
    }
    
//    /**
//     * Sets array of all "bldOleChart" element
//     */
//    public void setBldOleChartArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart[] bldOleChartArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(bldOleChartArray, BLDOLECHART$4);
//        }
//    }
//    
//    /**
//     * Sets ith "bldOleChart" element
//     */
//    public void setBldOleChartArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart bldOleChart)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart)get_store().find_element_user(BLDOLECHART$4, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(bldOleChart);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "bldOleChart" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart insertNewBldOleChart(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart)get_store().insert_element_user(BLDOLECHART$4, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "bldOleChart" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart addNewBldOleChart()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleBuildChart)get_store().add_element_user(BLDOLECHART$4);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "bldOleChart" element
     */
    public void removeBldOleChart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDOLECHART$4, i);
        }
    }
    
//    /**
//     * Gets a List of "bldGraphic" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild> getBldGraphicList()
//    {
//        final class BldGraphicList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild get(int i)
//                { return CTBuildListImpl.this.getBldGraphicArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild old = CTBuildListImpl.this.getBldGraphicArray(i);
//                CTBuildListImpl.this.setBldGraphicArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild o)
//                { CTBuildListImpl.this.insertNewBldGraphic(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild old = CTBuildListImpl.this.getBldGraphicArray(i);
//                CTBuildListImpl.this.removeBldGraphic(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTBuildListImpl.this.sizeOfBldGraphicArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new BldGraphicList();
//        }
//    }
//    
//    /**
//     * Gets array of all "bldGraphic" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild[] getBldGraphicArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(BLDGRAPHIC$6, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "bldGraphic" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild getBldGraphicArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild)get_store().find_element_user(BLDGRAPHIC$6, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "bldGraphic" element
     */
    public int sizeOfBldGraphicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDGRAPHIC$6);
        }
    }
    
//    /**
//     * Sets array of all "bldGraphic" element
//     */
//    public void setBldGraphicArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild[] bldGraphicArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(bldGraphicArray, BLDGRAPHIC$6);
//        }
//    }
//    
//    /**
//     * Sets ith "bldGraphic" element
//     */
//    public void setBldGraphicArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild bldGraphic)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild)get_store().find_element_user(BLDGRAPHIC$6, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(bldGraphic);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "bldGraphic" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild insertNewBldGraphic(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild)get_store().insert_element_user(BLDGRAPHIC$6, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "bldGraphic" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild addNewBldGraphic()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild)get_store().add_element_user(BLDGRAPHIC$6);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "bldGraphic" element
     */
    public void removeBldGraphic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDGRAPHIC$6, i);
        }
    }
}
