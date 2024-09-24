package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>정적 팩토리 메소드임을 표시.</p>
 *
 * <p>아래의 경우, 빈 {@link java.util.List List}를 반환하는 정적 팩토리 메소드임을 표시함.</p>
 *
 * <pre>
 *     &#064StaticFactoryMethod
 *     public static final{@literal <T> List<T>} emptyList() {
 *         return{@literal (List<T>) EMPTY_LIST;}
 *     }
 * </pre>
 *
 * @author Daybreak312
 * @since v1.1.1
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StaticFactoryMethod {
}
