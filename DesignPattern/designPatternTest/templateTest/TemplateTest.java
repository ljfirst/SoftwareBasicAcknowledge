package templateTest;

import org.junit.Test;
import template.SubTemplate;
import template.TemplateDemo;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/4/10
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class TemplateTest {

    SubTemplate subTemplate = new SubTemplate();

    @Test
    public void testTemplate() {
        subTemplate.template();
    }
}
