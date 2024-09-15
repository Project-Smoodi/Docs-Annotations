package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>지연 로딩으로 초기화되는 변수임을 표시.</p>
 *
 * <p>아래의 경우, {@code init()}을 통해 초기화되는 필드이므로 어노테이션이 사용됨.</p>
 *
 * <pre>
 *     private String name;
 *
 *     private void init() {
 *         if (this.name == null) {
 *             this.name = "Smoodi";
 *         }
 *     }
 *
 *     public void run() {
 *         init();
 *
 *         ...
 *     }
 * </pre>
 *
 * @author Daybreak312
 * @since v1.0.0
 */
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface LazyInit {

    String value() default "";
}
