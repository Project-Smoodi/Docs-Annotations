package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>외부 공개 목적으로 사용되는 API임을 표시.</p>
 *
 * <p>아래의 경우, 공통 로직을 분리한 유틸리티 API이기에 사용됨.</p>
 * <pre>
 *     &#064Api
 *     public getAnnotations(Object obj,{@literal Class<? extends Annotation>})
 * </pre>
 *
 * @author Daybreak312
 * @since v1.0.0
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface Api {
}
