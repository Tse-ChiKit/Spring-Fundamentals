package ch4.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class ResourceLoaderExample {

    public static void main(String args[]) throws IOException {

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        //Resource resources[] = resolver.getResources("file:**/resource/*.txt"); //1
        //Resource resources[] = resolver.getResources("file:**/src/main/java/ch4/resource/*.txt"); //1
        //Resource resources[] = resolver.getResources("file:E:/Documents/Codes/Springfundamentals/src/main/resources/conf/res.txt"); //1
        //Resource resources[] = resolver.getResources("classpath:/src/main/resources/conf/res.txt"); //1
        //Resource resources[] = resolver.getResources("classpath:src/main/resources/conf/res.txt"); //1
        //Resource resources[] = resolver.getResources("classpath:**/conf/res.txt"); //1
        //Resource resources[] = resolver.getResources("classpath:**/conf/*.txt"); //2
        //Resource resources[] = resolver.getResources("classpath:**/*.txt"); //2
        //Resource resources[] = resolver.getResources("classpath*:**/conf/*.txt"); //1
        Resource resources[] = resolver.getResources("classpath*:**/*.class"); //1



        System.out.println("res: " + resources.length);


        for (Resource resource : resources) {
            System.out.println(resource.getFilename());
        }
    }
}
