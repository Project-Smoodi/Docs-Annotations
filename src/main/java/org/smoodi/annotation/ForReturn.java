package org.smoodi.annotation;

import java.lang.annotation.*;

/**
 * <p>&#xBC18;&#xD658;&#xC6A9;&#xC73C;&#xB85C; &#xC0AC;&#xC6A9;&#xB420; &#xBCC0;&#xC218;&#xC784;&#xC744; &#xD45C;&#xC2DC;.</p>
 *
 * <p>&#xC544;&#xB798;&#xC758; &#xACBD;&#xC6B0;, &#xCD5C;&#xC885; &#xACC4;&#xC0B0; &#xACB0;&#xACFC;&#xAC12;&#xC744; &#xC800;&#xC7A5;&#xD558;&#xB294; &#xBCC0;&#xC218;&#xC774;&#xAE30;&#xC5D0; &#xC5B4;&#xB178;&#xD14C;&#xC774;&#xC158;&#xC774; &#xC0AC;&#xC6A9;&#xB428;.</p>
 * <pre>
 *     public int doOperation(int param) {
 *
 *         &#064;ForReturn
 *         int result = 0;
 *
 *         for (int i = 0; i &lt; 10; i++) {
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
