package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>반환용으로 사용될 변수임을 표시.</p>
 *
 * <p>아래의 경우, 최종 계산 결과값을 저장하는 변수이기에 어노테이션이 사용됨.</p>
 * <pre>
 *     public int doOperation(int param) {
 *
 *         &#064ForReturn
 *         int result = 0;
 *
 *         for (int i = 0; i < 10; i++) {
 *             result += operate(i);
 *         }
 *
 *         return result;
 *     }
 * </pre>
 *
 * @author Daybreak312
 * @since v1.0.0
 */
@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface ForReturn {
}
