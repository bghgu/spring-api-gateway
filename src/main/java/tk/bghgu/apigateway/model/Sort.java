package tk.bghgu.apigateway.model;

import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.*;

/**
 * Created by ds on 2018-06-07.
 */

public class Sort implements Iterable<Sort.Order>, Serializable {
    private static final long serialVersionUID = 5737186511678863905L;
    public static final Sort.Direction DEFAULT_DIRECTION;
    private final List<Order> orders;

    public Sort(Sort.Order... orders) {
        this(Arrays.asList(orders));
    }

    public Sort(List<Sort.Order> orders) {
        if (null != orders && !orders.isEmpty()) {
            this.orders = orders;
        } else {
            throw new IllegalArgumentException("You have to provide at least one sort property to sort by!");
        }
    }

    public Sort(String... properties) {
        this(DEFAULT_DIRECTION, properties);
    }

    public Sort(Sort.Direction direction, String... properties) {
        this(direction, (List)(properties == null ? new ArrayList() : Arrays.asList(properties)));
    }

    public Sort(Sort.Direction direction, List<String> properties) {
        if (properties != null && !properties.isEmpty()) {
            this.orders = new ArrayList(properties.size());
            Iterator var3 = properties.iterator();

            while(var3.hasNext()) {
                String property = (String)var3.next();
                this.orders.add(new Sort.Order(direction, property));
            }

        } else {
            throw new IllegalArgumentException("You have to provide at least one property to sort by!");
        }
    }

    public Sort and(Sort sort) {
        if (sort == null) {
            return this;
        } else {
            ArrayList<Sort.Order> these = new ArrayList(this.orders);
            Iterator var3 = sort.iterator();

            while(var3.hasNext()) {
                Sort.Order order = (Sort.Order)var3.next();
                these.add(order);
            }

            return new Sort(these);
        }
    }

    public Sort.Order getOrderFor(String property) {
        Iterator var2 = this.iterator();

        Sort.Order order;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            order = (Sort.Order)var2.next();
        } while(!order.getProperty().equals(property));

        return order;
    }

    public Iterator<Sort.Order> iterator() {
        return this.orders.iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Sort)) {
            return false;
        } else {
            Sort that = (Sort)obj;
            return this.orders.equals(that.orders);
        }
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + this.orders.hashCode();
        return result;
    }

    public String toString() {
        return StringUtils.collectionToCommaDelimitedString(this.orders);
    }

    static {
        DEFAULT_DIRECTION = Sort.Direction.ASC;
    }

    public static class Order implements Serializable {
        private static final long serialVersionUID = 1522511010900108987L;
        private static final boolean DEFAULT_IGNORE_CASE = false;
        private final Sort.Direction direction;
        private final String property;
        private final boolean ignoreCase;
        private final Sort.NullHandling nullHandling;

        public Order(Sort.Direction direction, String property) {
            this(direction, property, false, (Sort.NullHandling)null);
        }

        public Order(Sort.Direction direction, String property, Sort.NullHandling nullHandlingHint) {
            this(direction, property, false, nullHandlingHint);
        }

        public Order(String property) {
            this(Sort.DEFAULT_DIRECTION, property);
        }

        private Order(Sort.Direction direction, String property, boolean ignoreCase, Sort.NullHandling nullHandling) {
            if (!StringUtils.hasText(property)) {
                throw new IllegalArgumentException("Property must not null or empty!");
            } else {
                this.direction = direction == null ? Sort.DEFAULT_DIRECTION : direction;
                this.property = property;
                this.ignoreCase = ignoreCase;
                this.nullHandling = nullHandling == null ? Sort.NullHandling.NATIVE : nullHandling;
            }
        }

        public Sort.Direction getDirection() {
            return this.direction;
        }

        public String getProperty() {
            return this.property;
        }

        public boolean isAscending() {
            return this.direction.isAscending();
        }

        public boolean isDescending() {
            return this.direction.isDescending();
        }

        public boolean isIgnoreCase() {
            return this.ignoreCase;
        }

        public Sort.Order with(Sort.Direction direction) {
            return new Sort.Order(direction, this.property, this.ignoreCase, this.nullHandling);
        }

        public Sort.Order withProperty(String property) {
            return new Sort.Order(this.direction, property, this.ignoreCase, this.nullHandling);
        }

        public Sort withProperties(String... properties) {
            return new Sort(this.direction, properties);
        }

        public Sort.Order ignoreCase() {
            return new Sort.Order(this.direction, this.property, true, this.nullHandling);
        }

        public Sort.Order with(Sort.NullHandling nullHandling) {
            return new Sort.Order(this.direction, this.property, this.ignoreCase, nullHandling);
        }

        public Sort.Order nullsFirst() {
            return this.with(Sort.NullHandling.NULLS_FIRST);
        }

        public Sort.Order nullsLast() {
            return this.with(Sort.NullHandling.NULLS_LAST);
        }

        public Sort.Order nullsNative() {
            return this.with(Sort.NullHandling.NATIVE);
        }

        public Sort.NullHandling getNullHandling() {
            return this.nullHandling;
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + this.direction.hashCode();
            result = 31 * result + this.property.hashCode();
            result = 31 * result + (this.ignoreCase ? 1 : 0);
            result = 31 * result + this.nullHandling.hashCode();
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (!(obj instanceof Sort.Order)) {
                return false;
            } else {
                Sort.Order that = (Sort.Order)obj;
                return this.direction.equals(that.direction) && this.property.equals(that.property) && this.ignoreCase == that.ignoreCase && this.nullHandling.equals(that.nullHandling);
            }
        }

        public String toString() {
            String result = String.format("%s: %s", this.property, this.direction);
            if (!Sort.NullHandling.NATIVE.equals(this.nullHandling)) {
                result = result + ", " + this.nullHandling;
            }

            if (this.ignoreCase) {
                result = result + ", ignoring case";
            }

            return result;
        }
    }

    public static enum NullHandling {
        NATIVE,
        NULLS_FIRST,
        NULLS_LAST;

        private NullHandling() {
        }
    }

    public static enum Direction {
        ASC,
        DESC;

        private Direction() {
        }

        public boolean isAscending() {
            return this.equals(ASC);
        }

        public boolean isDescending() {
            return this.equals(DESC);
        }

        public static Sort.Direction fromString(String value) {
            try {
                return valueOf(value.toUpperCase(Locale.US));
            } catch (Exception var2) {
                throw new IllegalArgumentException(String.format("Invalid value '%s' for orders given! Has to be either 'desc' or 'asc' (case insensitive).", value), var2);
            }
        }

        public static Sort.Direction fromStringOrNull(String value) {
            try {
                return fromString(value);
            } catch (IllegalArgumentException var2) {
                return null;
            }
        }
    }
}