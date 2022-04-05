import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        TagsApi apiInstance = new TagsApi(defaultClient);
        String source = "source_example"; // String | When specified, filters host list to those tags with the specified source.
        try {
            TagToHosts result = apiInstance.listHostTags(new TagsApi.ListHostTagsOptionalParameters()
                .source(source));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#listHostTags");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
