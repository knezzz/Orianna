package com.robrua.orianna.type.dto.staticdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.robrua.orianna.type.dto.OriannaDto;

@Entity
@Table(name = "masterytreeitem")
public class MasteryTreeItem extends OriannaDto {
    private static final long serialVersionUID = 9217327838180557829L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dbId;
    private Integer masteryId;

    private String prereq;

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof MasteryTreeItem)) {
            return false;
        }
        final MasteryTreeItem other = (MasteryTreeItem)obj;
        if(masteryId == null) {
            if(other.masteryId != null) {
                return false;
            }
        }
        else if(!masteryId.equals(other.masteryId)) {
            return false;
        }
        if(prereq == null) {
            if(other.prereq != null) {
                return false;
            }
        }
        else if(!prereq.equals(other.prereq)) {
            return false;
        }
        return true;
    }

    /**
     * @return the masteryId
     */
    public Integer getMasteryId() {
        return masteryId;
    }

    /**
     * @return the prereq
     */
    public String getPrereq() {
        return prereq;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (masteryId == null ? 0 : masteryId.hashCode());
        result = prime * result + (prereq == null ? 0 : prereq.hashCode());
        return result;
    }

    /**
     * @param masteryId
     *            the masteryId to set
     */
    public void setMasteryId(final Integer masteryId) {
        this.masteryId = masteryId;
    }

    /**
     * @param prereq
     *            the prereq to set
     */
    public void setPrereq(final String prereq) {
        this.prereq = prereq;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "MasteryTreeItem [masteryId=" + masteryId + ", prereq=" + prereq + "]";
    }
}