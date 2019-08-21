package com.langi.logisticssystem.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Převzato z AIS RPP
 * Předek filtrů. Podpora pro stránkování a řazení.
 */
public class BaseFilter {

    /** Logger. */
    private static final Logger LOG = LoggerFactory.getLogger(BaseFilter.class);

    private Integer start = null;
    private Integer pocet = null;
    private List<String> razeni = null;
    private List<String> vychoziRazeni = null;

    /**
     * Stránkování, řazení, default řazení.
     *
     * @param start
     * @param pocet
     * @param razeni
     * @param vychoziRazeni např.: "id" nebo "-id" nebo "kod,-id" atd.
     */
    public BaseFilter(Integer start, Integer pocet, List<String> razeni, String vychoziRazeni) {
        this.start = start;
        this.pocet = pocet;
        this.razeni = razeni;
        this.vychoziRazeni = StringUtils.isBlank(vychoziRazeni) ? (null) : (Arrays.asList(vychoziRazeni.split(",")));
    }

    /**
     * Stránkování, řazení, bez default řazení.
     *
     * @param start
     * @param pocet
     * @param razeni
     */
    public BaseFilter(Integer start, Integer pocet, List<String> razeni) {
        this(start, pocet, razeni, null);
    }

    /**
     * Bez stránkování, bez řazení, bez default řazení.
     */
    public BaseFilter() {
        this(null, null, null, null);
    }

    /**
     * Stránkování, bez řazení, bez default řazení.
     *
     * @param start
     * @param pocet
     */
    public BaseFilter(Integer start, Integer pocet) {
        this(start, pocet, null, null);
    }

    /**
     * Bez stránkování, řazení, default řazení.
     *
     * @param razeni
     * @param vychoziRazeni
     */
    public BaseFilter(List<String> razeni, String vychoziRazeni) {
        this(null, null, razeni, vychoziRazeni);
    }


    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPocet() {
        return pocet;
    }

    public void setPocet(Integer pocet) {
        this.pocet = pocet;
    }

    public List<String> getRazeni() {
        return razeni;
    }

    public void setRazeni(List<String> razeni) {
        this.razeni = razeni;
    }

    public boolean isPageable() {
        return start != null || pocet != null;
    }

    /**
     * Vrátí implementaci interface Pageable, pro stránkování a řazení.
     *
     * @return Pageable
     */
    public Pageable getPageable() {
        int offset = 0;
        int limit = Integer.MAX_VALUE;

        if (start != null) {
            offset = start;
        }
        if (pocet != null) {
            limit = pocet;
        }

        return new OffsetBasedPageRequest(offset, limit, getSort());
    }

    public Sort getSort() {

        // v pripade, ze razeni neni specifikovano, vraci se default razeni
        if (razeni.isEmpty()) {
            return getDefaultSort();
        }
        
        return getSortFromList(razeni);
    }

    private Sort getDefaultSort() {
        if (vychoziRazeni.isEmpty()) {
            return null;
        }

        return getSortFromList(vychoziRazeni);
    }

    private Sort getSortFromList(List<String> list) {
        List<Sort.Order> orders = new ArrayList<Sort.Order>();

        for (String param : list) {
            if (StringUtils.isNotBlank(param)) {
                Sort.Order order;
                if (param.trim().startsWith("-")) {
                    order = new Sort.Order(Sort.Direction.DESC, param.trim().substring(1));
                } else {
                    order = new Sort.Order(Sort.Direction.ASC, param.trim());
                }
                orders.add(order);
            } else {
                LOG.warn("Prázdný parametr pro řazení.");
            }
        }

        if (orders.isEmpty()) {
            return null;
        }

        return new Sort(orders);
    }

    @Override
    public String toString() {
        return "BaseFilter{" + "start=" + start + ", pocet=" + pocet + ", razeni=" + razeni + ", vychoziRazeni="
            + vychoziRazeni + '}';
    }

}

