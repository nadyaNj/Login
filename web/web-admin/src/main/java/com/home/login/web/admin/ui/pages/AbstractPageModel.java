package com.home.login.web.admin.ui.pages;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/27/15
 * TIME:    12:17 AM
 */
public class AbstractPageModel implements Serializable {

    private static final long serialVersionUID = -8399732694390993429L;

    /*Properties*/
    private Long id;

    private LocalDateTime created;

    private LocalDateTime updated;

    private LocalDateTime removed;


    /*Constructor*/
    public AbstractPageModel() {
    }

    /*Getters and setters*/
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(final LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(final LocalDateTime updated) {
        this.updated = updated;
    }

    public LocalDateTime getRemoved() {
        return removed;
    }

    public void setRemoved(final LocalDateTime removed) {
        this.removed = removed;
    }


    /*Overrides equals, hash code and toStrings*/
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        AbstractPageModel rhs = (AbstractPageModel) obj;
        return new EqualsBuilder()
                .append(this.getId(), rhs.getId())
                .append(this.getCreated(), rhs.getCreated())
                .append(this.getUpdated(), rhs.getUpdated())
                .append(this.getRemoved(), rhs.getRemoved())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .append(getCreated())
                .append(getUpdated())
                .append(getRemoved())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("created", getCreated())
                .append("updated", getUpdated())
                .append("removed", getRemoved())
                .toString();
    }
}
