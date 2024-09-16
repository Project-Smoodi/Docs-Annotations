package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>인자로 받은 원본 객체가 수정됨을 표시.</p>
 *
 * <p>아래의 경우, 내부에서 실제로 원본 객체를 가공해 사용하므로 어노테이션 사용</p>
 * <pre>
 *     private String proxiedString = "";
 *
 *     &#064ModifyOriginal
 *     public void append(String str) {
 *         this.proxiedString.append(str);
 *     }
 * </pre>
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface ModifyOriginal {
}
