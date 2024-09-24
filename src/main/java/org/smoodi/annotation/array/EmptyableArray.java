package org.smoodi.annotation.array;

import java.lang.annotation.*;

/**
 * <p>비어있을 수 있는 {@link java.util.Collection Collection} 혹은 {@link java.lang.reflect.Array Array}임을 표시.</p>
 *
 * <p>아래 경우, 반환값인 {@literal List<String>}이 비어있을 수 있음을 표시함.</p>
 * <pre>
 *     &#064;EmptyableArray
 *     public{@literal List<String>} getNames();
 * </pre>
 *
 * <p>아래 경우, 필드가 비어있을 수 있음을 표시함.</p>
 * <pre>
 *     &#064;EmptyableArray
 *     public{@literal Set<String>} names ={@literal new Set<>()};
 * </pre>
 *
 * @author Daybreak312
 * @since v1.1.0
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface EmptyableArray {
}
