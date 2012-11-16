/*
 * XML Type:  CT_LayoutVariablePropertySet
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_LayoutVariablePropertySet(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTLayoutVariablePropertySetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTLayoutVariablePropertySet
{
    
    public CTLayoutVariablePropertySetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGCHART$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "orgChart");
    private static final javax.xml.namespace.QName CHMAX$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "chMax");
    private static final javax.xml.namespace.QName CHPREF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "chPref");
    private static final javax.xml.namespace.QName BULLETENABLED$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "bulletEnabled");
    private static final javax.xml.namespace.QName DIR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "dir");
    private static final javax.xml.namespace.QName HIERBRANCH$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "hierBranch");
    private static final javax.xml.namespace.QName ANIMONE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "animOne");
    private static final javax.xml.namespace.QName ANIMLVL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "animLvl");
    private static final javax.xml.namespace.QName RESIZEHANDLES$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "resizeHandles");
    
    
    /**
     * Gets the "orgChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart getOrgChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart)get_store().find_element_user(ORGCHART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orgChart" element
     */
    public boolean isSetOrgChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGCHART$0) != 0;
        }
    }
    
    /**
     * Sets the "orgChart" element
     */
    public void setOrgChart(org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart orgChart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart)get_store().find_element_user(ORGCHART$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart)get_store().add_element_user(ORGCHART$0);
            }
            target.set(orgChart);
        }
    }
    
    /**
     * Appends and returns a new empty "orgChart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart addNewOrgChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOrgChart)get_store().add_element_user(ORGCHART$0);
            return target;
        }
    }
    
    /**
     * Unsets the "orgChart" element
     */
    public void unsetOrgChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGCHART$0, 0);
        }
    }
    
    /**
     * Gets the "chMax" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax getChMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax)get_store().find_element_user(CHMAX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chMax" element
     */
    public boolean isSetChMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHMAX$2) != 0;
        }
    }
    
    /**
     * Sets the "chMax" element
     */
    public void setChMax(org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax chMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax)get_store().find_element_user(CHMAX$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax)get_store().add_element_user(CHMAX$2);
            }
            target.set(chMax);
        }
    }
    
    /**
     * Appends and returns a new empty "chMax" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax addNewChMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildMax)get_store().add_element_user(CHMAX$2);
            return target;
        }
    }
    
    /**
     * Unsets the "chMax" element
     */
    public void unsetChMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHMAX$2, 0);
        }
    }
    
    /**
     * Gets the "chPref" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref getChPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref)get_store().find_element_user(CHPREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chPref" element
     */
    public boolean isSetChPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHPREF$4) != 0;
        }
    }
    
    /**
     * Sets the "chPref" element
     */
    public void setChPref(org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref chPref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref)get_store().find_element_user(CHPREF$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref)get_store().add_element_user(CHPREF$4);
            }
            target.set(chPref);
        }
    }
    
    /**
     * Appends and returns a new empty "chPref" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref addNewChPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTChildPref)get_store().add_element_user(CHPREF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "chPref" element
     */
    public void unsetChPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHPREF$4, 0);
        }
    }
    
    /**
     * Gets the "bulletEnabled" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled getBulletEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled)get_store().find_element_user(BULLETENABLED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bulletEnabled" element
     */
    public boolean isSetBulletEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULLETENABLED$6) != 0;
        }
    }
    
    /**
     * Sets the "bulletEnabled" element
     */
    public void setBulletEnabled(org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled bulletEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled)get_store().find_element_user(BULLETENABLED$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled)get_store().add_element_user(BULLETENABLED$6);
            }
            target.set(bulletEnabled);
        }
    }
    
    /**
     * Appends and returns a new empty "bulletEnabled" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled addNewBulletEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTBulletEnabled)get_store().add_element_user(BULLETENABLED$6);
            return target;
        }
    }
    
    /**
     * Unsets the "bulletEnabled" element
     */
    public void unsetBulletEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULLETENABLED$6, 0);
        }
    }
    
    /**
     * Gets the "dir" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection getDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection)get_store().find_element_user(DIR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dir" element
     */
    public boolean isSetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIR$8) != 0;
        }
    }
    
    /**
     * Sets the "dir" element
     */
    public void setDir(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection)get_store().find_element_user(DIR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection)get_store().add_element_user(DIR$8);
            }
            target.set(dir);
        }
    }
    
    /**
     * Appends and returns a new empty "dir" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection addNewDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDirection)get_store().add_element_user(DIR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "dir" element
     */
    public void unsetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIR$8, 0);
        }
    }
    
    /**
     * Gets the "hierBranch" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle getHierBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle)get_store().find_element_user(HIERBRANCH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hierBranch" element
     */
    public boolean isSetHierBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERBRANCH$10) != 0;
        }
    }
    
    /**
     * Sets the "hierBranch" element
     */
    public void setHierBranch(org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle hierBranch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle)get_store().find_element_user(HIERBRANCH$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle)get_store().add_element_user(HIERBRANCH$10);
            }
            target.set(hierBranch);
        }
    }
    
    /**
     * Appends and returns a new empty "hierBranch" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle addNewHierBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTHierBranchStyle)get_store().add_element_user(HIERBRANCH$10);
            return target;
        }
    }
    
    /**
     * Unsets the "hierBranch" element
     */
    public void unsetHierBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERBRANCH$10, 0);
        }
    }
    
    /**
     * Gets the "animOne" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne getAnimOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne)get_store().find_element_user(ANIMONE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "animOne" element
     */
    public boolean isSetAnimOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMONE$12) != 0;
        }
    }
    
    /**
     * Sets the "animOne" element
     */
    public void setAnimOne(org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne animOne)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne)get_store().find_element_user(ANIMONE$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne)get_store().add_element_user(ANIMONE$12);
            }
            target.set(animOne);
        }
    }
    
    /**
     * Appends and returns a new empty "animOne" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne addNewAnimOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimOne)get_store().add_element_user(ANIMONE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "animOne" element
     */
    public void unsetAnimOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMONE$12, 0);
        }
    }
    
    /**
     * Gets the "animLvl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl getAnimLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl)get_store().find_element_user(ANIMLVL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "animLvl" element
     */
    public boolean isSetAnimLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMLVL$14) != 0;
        }
    }
    
    /**
     * Sets the "animLvl" element
     */
    public void setAnimLvl(org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl animLvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl)get_store().find_element_user(ANIMLVL$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl)get_store().add_element_user(ANIMLVL$14);
            }
            target.set(animLvl);
        }
    }
    
    /**
     * Appends and returns a new empty "animLvl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl addNewAnimLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAnimLvl)get_store().add_element_user(ANIMLVL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "animLvl" element
     */
    public void unsetAnimLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMLVL$14, 0);
        }
    }
    
    /**
     * Gets the "resizeHandles" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles getResizeHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles)get_store().find_element_user(RESIZEHANDLES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resizeHandles" element
     */
    public boolean isSetResizeHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESIZEHANDLES$16) != 0;
        }
    }
    
    /**
     * Sets the "resizeHandles" element
     */
    public void setResizeHandles(org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles resizeHandles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles)get_store().find_element_user(RESIZEHANDLES$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles)get_store().add_element_user(RESIZEHANDLES$16);
            }
            target.set(resizeHandles);
        }
    }
    
    /**
     * Appends and returns a new empty "resizeHandles" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles addNewResizeHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTResizeHandles)get_store().add_element_user(RESIZEHANDLES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "resizeHandles" element
     */
    public void unsetResizeHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESIZEHANDLES$16, 0);
        }
    }
}
