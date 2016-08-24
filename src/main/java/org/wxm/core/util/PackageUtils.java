package org.wxm.core.util;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.StringUtils;

/**
 * <b>标题: </b>包体工具类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>Cybele 398600198@qq.com <br/>
 * <b>时间: </b>2015-2-23 下午11:59:03 <br/>
 * <b>修改记录: </b>
 */
public class PackageUtils {
    final static Logger logger = LoggerFactory.getLogger(PackageUtils.class); // 简单日记门面

    /**
     * 
     * <b>标题: </b>根据指定的、包含通配符的包，获取所有包 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-24 下午1:27:19 <br/>
     * <b>修改记录: </b>
     * 
     * @param str
     * @return
     * @throws IOException
     */
    public static String getPackageWildcards(String str) throws IOException {
        if (!StringUtils.hasLength(str)) {
            logger.debug("********************映射别名的包路径为空！！！********************");
            return null;
        }
        StringBuilder resultPackages = new StringBuilder(); // 指定的所有包
        String[] packages = StringUtils.split(str, ","); // 分离多个指定包

        if (packages == null || packages.length <= 0) {
            logger.debug("********************映射别名的包路径不存在或路径错误！！！********************");
            return null;
        }

        logger.debug("********************[START]根据指定的、包含通配符的包，扫描所有包********************\n源包配置为：{}", str);

        String classPath = PackageUtils.class.getClassLoader().getResource("").getPath(); // ClassPath的绝对URI路径

        // ClassPath的绝对URI路径加入"file:"前缀
        StringBuilder uriClassPathBuilder = new StringBuilder();
        uriClassPathBuilder.append("file:");
        uriClassPathBuilder.append(classPath);

        // ClassPath路径
        String uriClassPath = uriClassPathBuilder.toString();
        logger.debug("ClassPath路径：{}", str);
        logger.debug("包的绝对URI路径与包的相对URI路径：\n");

        for (String pkg : packages) {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            // 将加载多个模式匹配的Resource
            Resource[] resources = resolver.getResources(pkg);
            for (Resource resource : resources) {
                String uri = resource.getURI().toString();
                if (uri.startsWith(uriClassPath)) {
                    logger.debug(uri);
                    // 去掉ClassPath路径，并将“/”替换为“.”
                    String packageUri = uri.replace(uriClassPath, "").replace("/", ".");
                    // 去掉最后一个“.”
                    packageUri = packageUri.substring(0, packageUri.length() - 1);
                    logger.debug(packageUri);
                    if (resultPackages != null && resultPackages.length() > 0) {
                        // 若resultPackages不为空，则添加“,”
                        resultPackages.append(",");
                    }
                    // 将获取的包路径加入结果变量（指定的所有包）中
                    resultPackages.append(packageUri);
                }
            }
        }
        // 包名获取结果
        // System.out.println("包名获取结果\n" + resultPackages.toString());
        logger.debug("********************[END]根据指定的、包含通配符的包，扫描所有包********************");
        return resultPackages.toString();
    }
}
