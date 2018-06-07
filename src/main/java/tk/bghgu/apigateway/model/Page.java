package tk.bghgu.apigateway.model;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by ds on 2018-06-07.
 */

public interface Page<T> extends Slice<T> {
    int getTotalPages();

    long getTotalElements();

    <S> Page<S> map(Converter<? super T, ? extends S> var1);
}

