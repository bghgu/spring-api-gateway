package tk.bghgu.apigateway.model;

import org.springframework.core.convert.converter.Converter;

import java.util.List;

/**
 * Created by ds on 2018-06-07.
 */

public interface Slice<T> extends Iterable<T> {
    int getNumber();

    int getSize();

    int getNumberOfElements();

    List<T> getContent();

    boolean hasContent();

    Sort getSort();

    boolean isFirst();

    boolean isLast();

    boolean hasNext();

    boolean hasPrevious();

    Pageable nextPageable();

    Pageable previousPageable();

    <S> Slice<S> map(Converter<? super T, ? extends S> var1);
}
