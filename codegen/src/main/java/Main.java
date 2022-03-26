import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.Generator;
import org.openapitools.codegen.config.CodegenConfigurator;

public class Main {
    public static void main(String... args) {
        //String petStore = "https://raw.githubusercontent.com/swagger-api/swagger-petstore/master/src/main/resources/openapi.yaml";
        CodegenConfigurator configurator = new CodegenConfigurator();
        configurator.setInputSpec("openapi.yaml");
        configurator.setGeneratorName("go");
        configurator.setTemplateDir("go");
        configurator.setOutputDir("out");
        Generator generator = new DefaultGenerator();
        generator.opts(configurator.toClientOptInput()).generate();
    }
}
