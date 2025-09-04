package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>지연 로딩으로 초기화되는 변수임을 표시.</p>
 *
 * <p>아래의 경우, {@code init()}을 통해 초기화되는 필드이므로 어노테이션이 사용됨.</p>
 *
 * <pre>
 *     &#064;LazyInit("init")
 *     public class Example {
 *         private String name;
 *
 *         private void init() {
 *             if (this.name == null) {
 *                 this.name = "Smoodi";
 *             }
 *         }
 *
 *         public void run() {
 *             init();
 *
 *             ...
 *         }
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

    /**
     * <p>초기화 메서드 혹은 트리거의 이름.</p>
     *
     * <p>기본값은 빈 문자열이며, 이 경우 초기화 메서드가 없음을 의미.</p>
     *
     * @return 초기화 메서드 이름
     */
    String value() default "";
}
