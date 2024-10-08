package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>{@code null}임을 표시.</p>
 *
 * <p>아래의 경우, 반환값이 {@code null}임을 표시.</p>
 *
 * <pre>
 *     &#064NullValue
 *     String getAuthority();
 * </pre>
 *
 * @author Daybreak312
 * @since v1.1.0
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NullValue {
}
