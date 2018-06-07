package tk.bghgu.apigateway.model;

/**
 * Created by ds on 2018-06-07.
 */

public interface Pageable {
    int getPageNumber();

    int getPageSize();

    int getOffset();

    Sort getSort();

    Pageable next();

    Pageable previousOrFirst();

    Pageable first();

    boolean hasPrevious();
}
