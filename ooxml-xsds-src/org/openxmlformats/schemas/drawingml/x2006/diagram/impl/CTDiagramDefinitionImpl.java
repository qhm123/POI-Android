/*
 * XML Type:  CT_DiagramDefinition
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_DiagramDefinition(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTDiagramDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinition
{
    
    public CTDiagramDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "title");
    private static final javax.xml.namespace.QName DESC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "desc");
    private static final javax.xml.namespace.QName CATLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "catLst");
    private static final javax.xml.namespace.QName SAMPDATA$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "sampData");
    private static final javax.xml.namespace.QName STYLEDATA$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "styleData");
    private static final javax.xml.namespace.QName CLRDATA$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "clrData");
    private static final javax.xml.namespace.QName LAYOUTNODE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "layoutNode");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName UNIQUEID$16 = 
        new javax.xml.namespace.QName("", "uniqueId");
    private static final javax.xml.namespace.QName MINVER$18 = 
        new javax.xml.namespace.QName("", "minVer");
    private static final javax.xml.namespace.QName DEFSTYLE$20 = 
        new javax.xml.namespace.QName("", "defStyle");
    
    
    /**
     * Gets a List of "title" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTName> getTitleList()
    {
        final class TitleList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTName>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTName get(int i)
                { return CTDiagramDefinitionImpl.this.getTitleArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTName set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTName o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTName old = CTDiagramDefinitionImpl.this.getTitleArray(i);
                CTDiagramDefinitionImpl.this.setTitleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTName o)
                { CTDiagramDefinitionImpl.this.insertNewTitle(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTName remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTName old = CTDiagramDefinitionImpl.this.getTitleArray(i);
                CTDiagramDefinitionImpl.this.removeTitle(i);
                return old;
            }
            
            public int size()
                { return CTDiagramDefinitionImpl.this.sizeOfTitleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TitleList();
        }
    }
    
    /**
     * Gets array of all "title" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTName[] getTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TITLE$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTName[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTName getTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTName)get_store().find_element_user(TITLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "title" element
     */
    public int sizeOfTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$0);
        }
    }
    
    /**
     * Sets array of all "title" element
     */
    public void setTitleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTName[] titleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(titleArray, TITLE$0);
        }
    }
    
    /**
     * Sets ith "title" element
     */
    public void setTitleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTName title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTName)get_store().find_element_user(TITLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(title);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTName insertNewTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTName)get_store().insert_element_user(TITLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTName addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTName)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "title" element
     */
    public void removeTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$0, i);
        }
    }
    
    /**
     * Gets a List of "desc" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription> getDescList()
    {
        final class DescList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription get(int i)
                { return CTDiagramDefinitionImpl.this.getDescArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription old = CTDiagramDefinitionImpl.this.getDescArray(i);
                CTDiagramDefinitionImpl.this.setDescArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription o)
                { CTDiagramDefinitionImpl.this.insertNewDesc(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription old = CTDiagramDefinitionImpl.this.getDescArray(i);
                CTDiagramDefinitionImpl.this.removeDesc(i);
                return old;
            }
            
            public int size()
                { return CTDiagramDefinitionImpl.this.sizeOfDescArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescList();
        }
    }
    
    /**
     * Gets array of all "desc" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription[] getDescArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESC$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription getDescArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription)get_store().find_element_user(DESC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "desc" element
     */
    public int sizeOfDescArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESC$2);
        }
    }
    
    /**
     * Sets array of all "desc" element
     */
    public void setDescArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription[] descArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descArray, DESC$2);
        }
    }
    
    /**
     * Sets ith "desc" element
     */
    public void setDescArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription)get_store().find_element_user(DESC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(desc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription insertNewDesc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription)get_store().insert_element_user(DESC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription addNewDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDescription)get_store().add_element_user(DESC$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "desc" element
     */
    public void removeDesc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESC$2, i);
        }
    }
    
    /**
     * Gets the "catLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories getCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories)get_store().find_element_user(CATLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "catLst" element
     */
    public boolean isSetCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATLST$4) != 0;
        }
    }
    
    /**
     * Sets the "catLst" element
     */
    public void setCatLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories catLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories)get_store().find_element_user(CATLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories)get_store().add_element_user(CATLST$4);
            }
            target.set(catLst);
        }
    }
    
    /**
     * Appends and returns a new empty "catLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories addNewCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories)get_store().add_element_user(CATLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "catLst" element
     */
    public void unsetCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATLST$4, 0);
        }
    }
    
    /**
     * Gets the "sampData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData getSampData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().find_element_user(SAMPDATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sampData" element
     */
    public boolean isSetSampData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMPDATA$6) != 0;
        }
    }
    
    /**
     * Sets the "sampData" element
     */
    public void setSampData(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData sampData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().find_element_user(SAMPDATA$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().add_element_user(SAMPDATA$6);
            }
            target.set(sampData);
        }
    }
    
    /**
     * Appends and returns a new empty "sampData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData addNewSampData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().add_element_user(SAMPDATA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "sampData" element
     */
    public void unsetSampData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMPDATA$6, 0);
        }
    }
    
    /**
     * Gets the "styleData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData getStyleData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().find_element_user(STYLEDATA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "styleData" element
     */
    public boolean isSetStyleData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLEDATA$8) != 0;
        }
    }
    
    /**
     * Sets the "styleData" element
     */
    public void setStyleData(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData styleData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().find_element_user(STYLEDATA$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().add_element_user(STYLEDATA$8);
            }
            target.set(styleData);
        }
    }
    
    /**
     * Appends and returns a new empty "styleData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData addNewStyleData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().add_element_user(STYLEDATA$8);
            return target;
        }
    }
    
    /**
     * Unsets the "styleData" element
     */
    public void unsetStyleData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLEDATA$8, 0);
        }
    }
    
    /**
     * Gets the "clrData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData getClrData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().find_element_user(CLRDATA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clrData" element
     */
    public boolean isSetClrData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRDATA$10) != 0;
        }
    }
    
    /**
     * Sets the "clrData" element
     */
    public void setClrData(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData clrData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().find_element_user(CLRDATA$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().add_element_user(CLRDATA$10);
            }
            target.set(clrData);
        }
    }
    
    /**
     * Appends and returns a new empty "clrData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData addNewClrData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData)get_store().add_element_user(CLRDATA$10);
            return target;
        }
    }
    
    /**
     * Unsets the "clrData" element
     */
    public void unsetClrData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRDATA$10, 0);
        }
    }
    
    /**
     * Gets the "layoutNode" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode getLayoutNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode)get_store().find_element_user(LAYOUTNODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "layoutNode" element
     */
    public void setLayoutNode(org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode layoutNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode)get_store().find_element_user(LAYOUTNODE$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutNode)get_store().add_element_user(LAYOUTNODE$12);
            }
            target.set(layoutNode);
        }
    }
    
    /**
     * Appends and returns a new empty "layoutNode" element
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
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$14, 0);
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
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$14);
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
    
    /**
     * Gets the "uniqueId" attribute
     */
    public java.lang.String getUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIQUEID$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIQUEID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(UNIQUEID$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "uniqueId" attribute
     */
    public boolean isSetUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIQUEID$16) != null;
        }
    }
    
    /**
     * Sets the "uniqueId" attribute
     */
    public void setUniqueId(java.lang.String uniqueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$16);
            }
            target.setStringValue(uniqueId);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueId" attribute
     */
    public void xsetUniqueId(org.apache.xmlbeans.XmlString uniqueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIQUEID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIQUEID$16);
            }
            target.set(uniqueId);
        }
    }
    
    /**
     * Unsets the "uniqueId" attribute
     */
    public void unsetUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIQUEID$16);
        }
    }
    
    /**
     * Gets the "minVer" attribute
     */
    public java.lang.String getMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVER$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINVER$18);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "minVer" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINVER$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(MINVER$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "minVer" attribute
     */
    public boolean isSetMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINVER$18) != null;
        }
    }
    
    /**
     * Sets the "minVer" attribute
     */
    public void setMinVer(java.lang.String minVer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVER$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINVER$18);
            }
            target.setStringValue(minVer);
        }
    }
    
    /**
     * Sets (as xml) the "minVer" attribute
     */
    public void xsetMinVer(org.apache.xmlbeans.XmlString minVer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINVER$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MINVER$18);
            }
            target.set(minVer);
        }
    }
    
    /**
     * Unsets the "minVer" attribute
     */
    public void unsetMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINVER$18);
        }
    }
    
    /**
     * Gets the "defStyle" attribute
     */
    public java.lang.String getDefStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFSTYLE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFSTYLE$20);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defStyle" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFSTYLE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(DEFSTYLE$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "defStyle" attribute
     */
    public boolean isSetDefStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFSTYLE$20) != null;
        }
    }
    
    /**
     * Sets the "defStyle" attribute
     */
    public void setDefStyle(java.lang.String defStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFSTYLE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFSTYLE$20);
            }
            target.setStringValue(defStyle);
        }
    }
    
    /**
     * Sets (as xml) the "defStyle" attribute
     */
    public void xsetDefStyle(org.apache.xmlbeans.XmlString defStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFSTYLE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFSTYLE$20);
            }
            target.set(defStyle);
        }
    }
    
    /**
     * Unsets the "defStyle" attribute
     */
    public void unsetDefStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFSTYLE$20);
        }
    }
}
