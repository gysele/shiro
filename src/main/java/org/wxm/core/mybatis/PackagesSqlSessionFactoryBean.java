package org.wxm.core.mybatis;

import java.io.IOException;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.wxm.core.util.PackageUtils;

/**
 * <b>标题: </b>通过通配符方式配置typeAliasesPackage <br/>
 * <b>描述: </b> <br/>
 * <b>作者: </b>Cybele 398600198@qq.com <br/>
 * <b>时间: </b>2015-2-23 下午11:56:45 <br/>
 * <b>版本: </b>V1.0
 */
public class PackagesSqlSessionFactoryBean extends SqlSessionFactoryBean {
    private final static Logger log = LoggerFactory.getLogger(PackagesSqlSessionFactoryBean.class);

    /**
     * 
     * <b>标题: </b>使mybatis配置文件支持通配符 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>1.0 <br/>
     * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
     * <b>时间: </b>2016-8-15 下午6:51:52 <br/>
     * <b>修改记录: </b>
     * 
     * @param typeAliasesPackage
     */
    @Override
    public void setTypeAliasesPackage(String typeAliasesPackage) {
        try {
            String allTypeAliasesPackage = PackageUtils.getPackageWildcards(typeAliasesPackage);
            if (StringUtils.hasLength(allTypeAliasesPackage)) {
                super.setTypeAliasesPackage(allTypeAliasesPackage);
            } else {
                log.warn("参数typeAliasesPackage:" + typeAliasesPackage + "，未找到任何包");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setPlugins(Interceptor[] plugins) {
        super.setPlugins(plugins);
    }
}
