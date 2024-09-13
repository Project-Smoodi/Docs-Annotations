package org.smoodi.annotation.array;

import java.lang.annotation.*;

/**
 * <p>{@link java.util.Collection Collection} 혹은 {@link java.lang.reflect.Array Array} 등의 타입을 가진 메소드 반환값이 새로 복사되어 반환되었음을 표시.</p>
 *
 * <p>아래 경우, 반환값인 {@literal List<String>}이 새로 복사되어 반환되었음을 표시함.</p>
 * <pre>
 *     &#064;CopiedArray
 *     public{@literal List<String>} getNames();
 * </pre>
 * 그리고 구현체는 아래와 같이 실제로 복사된 새로운 객체를 반환해야 함.
 * <pre>
 *     &#064;CopiedArray
 *     public{@literal List<String>} getNames() {
 *         return List.copyOf(this.names);
 *     }
 * </pre>
 *
 * @since v1.0.0
 * @author Daybreak312
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface CopiedArray {
}
