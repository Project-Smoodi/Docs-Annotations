package org.smoodi.annotation.array;

import java.lang.annotation.*;

/**
 * <p>비어있지 않은 {@link java.util.Collection Collection} 혹은 {@link java.lang.reflect.Array Array}임을 표시.</p>
 *
 * <p>아래의 경우, 반환값인 {@link java.util.Collection Collection}이 비어있을 땐 null을 반환하므로, 비어있지 않은 반환값임이 보장됨.</p>
 * <pre>
 *     &#064;NotEmptyArray
 *     &#064;Nullable
 *     public{@literal List<String>} getNames() {
 *         if (this.names.isEmpty()) {
 *             return null;
 *         }
 *         return this.names;
 *     };
 * </pre>
 *
 * @author Daybreak312
 * @since v1.1.0
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface NotEmptyArray {
}
