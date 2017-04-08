package first;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "prefix")
@Component
public class SampleProperty {
    private String stringProp1;

    public String getStringProp1() {
        return stringProp1;
    }


}