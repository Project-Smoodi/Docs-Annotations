package org.smoodi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>{@link java.util.Collection Collection} 혹은 {@link java.lang.reflect.Array Array} 등의 타입을 가진 메소드 반환값이 새로 복사되어 반환되었음을 표시.</p>
 *
 * <p>아래 경우, 반환값인 {@literal List<String>}이 새로 복사되어 반환되었음을 표시함.</p>
 * <pre>
 *     &#064;EmptyableArray
 *     public{@literal List<String>} getNames();
 * </pre>
 * 그리고 구현체는 아래와 같이 실제로 복사된 새로운 객체를 반환해야 함.
 * <pre>
 *     &#064;EmptyableArray
 *     public{@literal List<String>} getNames() {
 *         return List.copyOf(this.names);
 *     }
 * </pre>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface ClonedArray {
}
