package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * 오버로딩 메소드임을 표시.
 *
 * @author Daybreak312
 * @since v1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface Overload {
}
