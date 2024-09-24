package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>{@code null}일 수도 있음을 표시.</p>
 *
 * <p>아래의 경우, 반환값이 {@code null}일 수 있음을 표시.</p>
 *
 * <pre>
 *     &#064Nullable
 *     String getName();
 * </pre>
 *
 * @author Daybreak312
 * @since v1.1.1
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Nullable {
}
