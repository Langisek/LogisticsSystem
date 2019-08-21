package com.langi.logisticssystem.filter;

import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Převzato z RRP AIS
 */
public class OffsetBasedPageRequest implements Pageable {

    private int limit;
    private int offset;
    private final Sort sort;

    public OffsetBasedPageRequest(int offset, int limit, Sort sort) {
        if (offset < 0) {
            throw new IllegalArgumentException("Offset index must not be less than zero!");
        }

        if (limit < 1) {
            throw new IllegalArgumentException("Limit must not be less than one!");
        }
        this.limit = limit;
        this.offset = offset;
        this.sort = sort;
    }

    public OffsetBasedPageRequest(int offset, int limit, Sort.Direction direction, String... properties) {
        this(offset, limit, new Sort(direction, properties));
    }

    public OffsetBasedPageRequest(int offset, int limit) {
        this(offset, limit, new Sort(Sort.Direction.ASC, "id"));
    }

    @Override
    public int getPageNumber() {
        return offset / limit;
    }

    @Override
    public int getPageSize() {
        return limit;
    }

    @Override
    public Sort getSort() {
        return sort;
    }

    @Override
    public Pageable next() {
        return new OffsetBasedPageRequest((int) (getOffset() + getPageSize()), getPageSize(), getSort());
    }

    public OffsetBasedPageRequest previous() {
        return hasPrevious() ? new OffsetBasedPageRequest((int) (getOffset() - getPageSize()), getPageSize(), getSort()) : this;
    }

    @Override
    public Pageable previousOrFirst() {
        return hasPrevious() ? previous() : first();
    }

    @Override
    public Pageable first() {
        return new OffsetBasedPageRequest(0, getPageSize(), getSort());
    }

    @Override
    public boolean hasPrevious() {
        return offset > limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.limit;
        hash = 37 * hash + this.offset;
        hash = 37 * hash + (this.sort != null ? this.sort.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OffsetBasedPageRequest other = (OffsetBasedPageRequest) obj;
        if (this.limit != other.limit) {
            return false;
        }
        if (this.offset != other.offset) {
            return false;
        }
        if (this.sort != other.sort && (this.sort == null || !this.sort.equals(other.sort))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OffsetBasedPageRequest{" + "limit=" + limit + ", offset=" + offset + ", sort=" + sort + '}';
    }

    @Override
    public boolean isPaged() {
        return Pageable.super.isPaged(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isUnpaged() {
        return Pageable.super.isUnpaged(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getOffset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sort getSortOr(Sort sort) {
        return Pageable.super.getSortOr(sort); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Pageable> toOptional() {
        return Pageable.super.toOptional(); //To change body of generated methods, choose Tools | Templates.
    }

}
