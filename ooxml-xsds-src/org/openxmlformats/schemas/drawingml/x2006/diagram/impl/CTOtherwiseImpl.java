/*
 * XML Type:  CT_Otherwise
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Otherwise(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTOtherwiseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise
{
    
    public CTOtherwiseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "alg");
    private static final javax.xml.namespace.QName SHAPE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "shape");
    private static final javax.xml.namespace.QName PRESOF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "presOf");
    private static final javax.xml.namespace.QName CONSTRLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "constrLst");
    private static final javax.xml.namespace.QName RULELST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "ruleLst");
    private static final javax.xml.namespace.QName FOREACH$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "forEach");
    private static final javax.xml.namespace.QName LAYOUTNODE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "layoutNode");
    private static final javax.xml.namespace.QName CHOOSE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "choose");
    private static final javax.xml.namespace.QName EXTLST$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName NAME$18 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "alg" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm> getAlgList()
    {
        final class AlgList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm get(int i)
                { return CTOtherwiseImpl.this.getAlgArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm old = CTOtherwiseImpl.this.getAlgArray(i);
                CTOtherwiseImpl.this.setAlgArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm o)
                { CTOtherwiseImpl.this.insertNewAlg(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm old = CTOtherwiseImpl.this.getAlgArray(i);
                CTOtherwiseImpl.this.removeAlg(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfAlgArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlgList();
        }
    }
    
    /**
     * Gets array of all "alg" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm[] getAlgArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALG$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alg" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm getAlgArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm)get_store().find_element_user(ALG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alg" element
     */
    public int sizeOfAlgArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALG$0);
        }
    }
    
    /**
     * Sets array of all "alg" element
     */
    public void setAlgArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm[] algArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(algArray, ALG$0);
        }
    }
    
    /**
     * Sets ith "alg" element
     */
    public void setAlgArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm alg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm)get_store().find_element_user(ALG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alg);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alg" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm insertNewAlg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm)get_store().insert_element_user(ALG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alg" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm addNewAlg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm)get_store().add_element_user(ALG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "alg" element
     */
    public void removeAlg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALG$0, i);
        }
    }
    
    /**
     * Gets a List of "shape" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape> getShapeList()
    {
        final class ShapeList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape get(int i)
                { return CTOtherwiseImpl.this.getShapeArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape old = CTOtherwiseImpl.this.getShapeArray(i);
                CTOtherwiseImpl.this.setShapeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape o)
                { CTOtherwiseImpl.this.insertNewShape(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape old = CTOtherwiseImpl.this.getShapeArray(i);
                CTOtherwiseImpl.this.removeShape(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfShapeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShapeList();
        }
    }
    
    /**
     * Gets array of all "shape" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape[] getShapeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHAPE$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shape" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape getShapeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape)get_store().find_element_user(SHAPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shape" element
     */
    public int sizeOfShapeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPE$2);
        }
    }
    
    /**
     * Sets array of all "shape" element
     */
    public void setShapeArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape[] shapeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shapeArray, SHAPE$2);
        }
    }
    
    /**
     * Sets ith "shape" element
     */
    public void setShapeArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape)get_store().find_element_user(SHAPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shape);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shape" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape insertNewShape(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape)get_store().insert_element_user(SHAPE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shape" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape addNewShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape)get_store().add_element_user(SHAPE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "shape" element
     */
    public void removeShape(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPE$2, i);
        }
    }
    
    /**
     * Gets a List of "presOf" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf> getPresOfList()
    {
        final class PresOfList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf get(int i)
                { return CTOtherwiseImpl.this.getPresOfArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf old = CTOtherwiseImpl.this.getPresOfArray(i);
                CTOtherwiseImpl.this.setPresOfArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf o)
                { CTOtherwiseImpl.this.insertNewPresOf(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf old = CTOtherwiseImpl.this.getPresOfArray(i);
                CTOtherwiseImpl.this.removePresOf(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfPresOfArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PresOfList();
        }
    }
    
    /**
     * Gets array of all "presOf" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf[] getPresOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRESOF$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "presOf" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf getPresOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf)get_store().find_element_user(PRESOF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "presOf" element
     */
    public int sizeOfPresOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESOF$4);
        }
    }
    
    /**
     * Sets array of all "presOf" element
     */
    public void setPresOfArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf[] presOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(presOfArray, PRESOF$4);
        }
    }
    
    /**
     * Sets ith "presOf" element
     */
    public void setPresOfArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf presOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf)get_store().find_element_user(PRESOF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(presOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "presOf" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf insertNewPresOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf)get_store().insert_element_user(PRESOF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "presOf" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf addNewPresOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf)get_store().add_element_user(PRESOF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "presOf" element
     */
    public void removePresOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESOF$4, i);
        }
    }
    
    /**
     * Gets a List of "constrLst" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints> getConstrLstList()
    {
        final class ConstrLstList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints get(int i)
                { return CTOtherwiseImpl.this.getConstrLstArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints old = CTOtherwiseImpl.this.getConstrLstArray(i);
                CTOtherwiseImpl.this.setConstrLstArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints o)
                { CTOtherwiseImpl.this.insertNewConstrLst(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints old = CTOtherwiseImpl.this.getConstrLstArray(i);
                CTOtherwiseImpl.this.removeConstrLst(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfConstrLstArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConstrLstList();
        }
    }
    
    /**
     * Gets array of all "constrLst" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints[] getConstrLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSTRLST$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "constrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints getConstrLstArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints)get_store().find_element_user(CONSTRLST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "constrLst" element
     */
    public int sizeOfConstrLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRLST$6);
        }
    }
    
    /**
     * Sets array of all "constrLst" element
     */
    public void setConstrLstArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints[] constrLstArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(constrLstArray, CONSTRLST$6);
        }
    }
    
    /**
     * Sets ith "constrLst" element
     */
    public void setConstrLstArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints constrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints)get_store().find_element_user(CONSTRLST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(constrLst);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints insertNewConstrLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints)get_store().insert_element_user(CONSTRLST$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints addNewConstrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints)get_store().add_element_user(CONSTRLST$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "constrLst" element
     */
    public void removeConstrLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRLST$6, i);
        }
    }
    
    /**
     * Gets a List of "ruleLst" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules> getRuleLstList()
    {
        final class RuleLstList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules get(int i)
                { return CTOtherwiseImpl.this.getRuleLstArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules old = CTOtherwiseImpl.this.getRuleLstArray(i);
                CTOtherwiseImpl.this.setRuleLstArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules o)
                { CTOtherwiseImpl.this.insertNewRuleLst(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules old = CTOtherwiseImpl.this.getRuleLstArray(i);
                CTOtherwiseImpl.this.removeRuleLst(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfRuleLstArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RuleLstList();
        }
    }
    
    /**
     * Gets array of all "ruleLst" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules[] getRuleLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RULELST$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ruleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules getRuleLstArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules)get_store().find_element_user(RULELST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ruleLst" element
     */
    public int sizeOfRuleLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RULELST$8);
        }
    }
    
    /**
     * Sets array of all "ruleLst" element
     */
    public void setRuleLstArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules[] ruleLstArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ruleLstArray, RULELST$8);
        }
    }
    
    /**
     * Sets ith "ruleLst" element
     */
    public void setRuleLstArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules ruleLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules)get_store().find_element_user(RULELST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ruleLst);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ruleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules insertNewRuleLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules)get_store().insert_element_user(RULELST$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ruleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules addNewRuleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules)get_store().add_element_user(RULELST$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "ruleLst" element
     */
    public void removeRuleLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RULELST$8, i);
        }
    }
    
    /**
     * Gets a List of "forEach" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach> getForEachList()
    {
        final class ForEachList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach get(int i)
                { return CTOtherwiseImpl.this.getForEachArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach old = CTOtherwiseImpl.this.getForEachArray(i);
                CTOtherwiseImpl.this.setForEachArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach o)
                { CTOtherwiseImpl.this.insertNewForEach(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach old = CTOtherwiseImpl.this.getForEachArray(i);
                CTOtherwiseImpl.this.removeForEach(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfForEachArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ForEachList();
        }
    }
    
    /**
     * Gets array of all "forEach" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach[] getForEachArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOREACH$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "forEach" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach getForEachArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach)get_store().find_element_user(FOREACH$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "forEach" element
     */
    public int sizeOfForEachArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOREACH$10);
        }
    }
    
    /**
     * Sets array of all "forEach" element
     */
    public void setForEachArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach[] forEachArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(forEachArray, FOREACH$10);
        }
    }
    
    /**
     * Sets ith "forEach" element
     */
    public void setForEachArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach forEach)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach)get_store().find_element_user(FOREACH$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(forEach);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "forEach" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach insertNewForEach(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach)get_store().insert_element_user(FOREACH$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "forEach" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach addNewForEach()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTForEach)get_store().add_element_user(FOREACH$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "forEach" element
     */
    public void removeForEach(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOREACH$10, i);
        }
    }
    
    /**
     * Gets a List of "layoutNode" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode> getLayoutNodeList()
    {
        final class LayoutNodeList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode get(int i)
                { return CTOtherwiseImpl.this.getLayoutNodeArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode old = CTOtherwiseImpl.this.getLayoutNodeArray(i);
                CTOtherwiseImpl.this.setLayoutNodeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode o)
                { CTOtherwiseImpl.this.insertNewLayoutNode(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode old = CTOtherwiseImpl.this.getLayoutNodeArray(i);
                CTOtherwiseImpl.this.removeLayoutNode(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfLayoutNodeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LayoutNodeList();
        }
    }
    
    /**
     * Gets array of all "layoutNode" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode[] getLayoutNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAYOUTNODE$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "layoutNode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode getLayoutNodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode)get_store().find_element_user(LAYOUTNODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "layoutNode" element
     */
    public int sizeOfLayoutNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUTNODE$12);
        }
    }
    
    /**
     * Sets array of all "layoutNode" element
     */
    public void setLayoutNodeArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode[] layoutNodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(layoutNodeArray, LAYOUTNODE$12);
        }
    }
    
    /**
     * Sets ith "layoutNode" element
     */
    public void setLayoutNodeArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode layoutNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode)get_store().find_element_user(LAYOUTNODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(layoutNode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "layoutNode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode insertNewLayoutNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode)get_store().insert_element_user(LAYOUTNODE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "layoutNode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode addNewLayoutNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode)get_store().add_element_user(LAYOUTNODE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "layoutNode" element
     */
    public void removeLayoutNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUTNODE$12, i);
        }
    }
    
    /**
     * Gets a List of "choose" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose> getChooseList()
    {
        final class ChooseList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose get(int i)
                { return CTOtherwiseImpl.this.getChooseArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose old = CTOtherwiseImpl.this.getChooseArray(i);
                CTOtherwiseImpl.this.setChooseArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose o)
                { CTOtherwiseImpl.this.insertNewChoose(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose old = CTOtherwiseImpl.this.getChooseArray(i);
                CTOtherwiseImpl.this.removeChoose(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfChooseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ChooseList();
        }
    }
    
    /**
     * Gets array of all "choose" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose[] getChooseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHOOSE$14, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "choose" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose getChooseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose)get_store().find_element_user(CHOOSE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "choose" element
     */
    public int sizeOfChooseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHOOSE$14);
        }
    }
    
    /**
     * Sets array of all "choose" element
     */
    public void setChooseArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose[] chooseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(chooseArray, CHOOSE$14);
        }
    }
    
    /**
     * Sets ith "choose" element
     */
    public void setChooseArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose choose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose)get_store().find_element_user(CHOOSE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(choose);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "choose" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose insertNewChoose(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose)get_store().insert_element_user(CHOOSE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "choose" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose addNewChoose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose)get_store().add_element_user(CHOOSE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "choose" element
     */
    public void removeChoose(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHOOSE$14, i);
        }
    }
    
    /**
     * Gets a List of "extLst" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList> getExtLstList()
    {
        final class ExtLstList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList get(int i)
                { return CTOtherwiseImpl.this.getExtLstArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList old = CTOtherwiseImpl.this.getExtLstArray(i);
                CTOtherwiseImpl.this.setExtLstArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList o)
                { CTOtherwiseImpl.this.insertNewExtLst(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList old = CTOtherwiseImpl.this.getExtLstArray(i);
                CTOtherwiseImpl.this.removeExtLst(i);
                return old;
            }
            
            public int size()
                { return CTOtherwiseImpl.this.sizeOfExtLstArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExtLstList();
        }
    }
    
    /**
     * Gets array of all "extLst" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList[] getExtLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTLST$16, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLstArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extLst" element
     */
    public int sizeOfExtLstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$16);
        }
    }
    
    /**
     * Sets array of all "extLst" element
     */
    public void setExtLstArray(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList[] extLstArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extLstArray, EXTLST$16);
        }
    }
    
    /**
     * Sets ith "extLst" element
     */
    public void setExtLstArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extLst);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList insertNewExtLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().insert_element_user(EXTLST$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extLst" element
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
     * Removes the ith "extLst" element
     */
    public void removeExtLst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$16, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$18);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NAME$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$18) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$18);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$18);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$18);
        }
    }
}
