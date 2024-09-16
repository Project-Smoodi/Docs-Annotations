package org.smoodi.annotation.array;

import java.lang.annotation.*;

/**
 * <p>수정 가능한 {@link java.util.Collection Collection} 혹은 {@link java.lang.reflect.Array Array}임을 표시.</p>
 *
 * <p>아래의 경우, {@link java.util.List List}로 {@code TypeCasting}된 {@link java.util.ArrayList ArrayList}를 반환하므로 해당 어노테이션을 사용함</p>
 * <pre>
 *     &#064ModifiableArray
 *     public{@literal List<Object>} getList() {
 *        {@literal return new ArrayList<Object>()}
 *     }
 * </pre>
 *
 * @author Daybreak312
 * @since v1.0.0
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface ModifiableArray {
}
