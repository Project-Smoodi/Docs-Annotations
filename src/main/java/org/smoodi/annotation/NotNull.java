package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>{@code null}이 아님을 표시.</p>
 *
 * <p>아래의 경우, 매개변수가 {@code null}일 수 없음을 표시.</p>
 *
 * <pre>
 *     void run(
 *         &#064NotNull
 *         Object obj
 *     );
 * </pre>
 *
 * @author Daybreak312
 * @since v1.1.1
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotNull {
}
