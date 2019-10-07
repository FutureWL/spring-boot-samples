package io.github.futurewl.prop;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;

@Configuration
public class PropConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource mySource = new ResourceBundleMessageSource();
        // 读取 src/main/resources/i18n 目录下面全部的properties
        try {
            // 获取i18n目录的路径
            URL path = PropConfig.class.getResource("/i18n");
            File file = new File(path.getPath());
            // 过滤 i18n 目录下面的文件
            File[] propFiles = file.listFiles(new FileFilter() {
                public boolean accept(File folderFile) {
                    // 只处理 properties 文件
                    if (folderFile.getName().indexOf(".properties") != -1) {
                        return true;
                    }
                    return false;
                }
            });
            String[] names = new String[propFiles.length];
            // 获取文件名，格式为“i18n/fileName”
            for (int i = 0; i < propFiles.length; i++) {
                String fileName = propFiles[i].getName();
                String fileNameWithoutSuffix = fileName.substring(0, fileName.lastIndexOf("."));
                names[i] = "i18n/" + fileNameWithoutSuffix;
            }
            // 将文件名设置为 basename
            mySource.addBasenames(names);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mySource;
    }
}
