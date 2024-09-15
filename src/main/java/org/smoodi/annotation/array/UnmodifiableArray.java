package org.smoodi.annotation.array;

import java.lang.annotation.*;

/**
 * <p>수정 불가능한 {@link java.util.Collection Collection} 혹은 {@link java.lang.reflect.Array Array}임을 표시.</p>
 *
 * <p>아래의 경우, {@link java.util.List List} 내부에서 {@link java.util.ImmutableCollections ImmutableList}를 반환하므로 해당 어노테이션을 사용함</p>
 * <pre>
 *     &#064UnmodifiableArray
 *     public{@literal List<String>} getList() {
 *         return List.of(1, 2, 3);
 *     }
 * </pre>
 *
 * @author Daybreak312
 * @since v1.0.0
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface UnmodifiableArray {
}
