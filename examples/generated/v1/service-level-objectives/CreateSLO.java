import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        ServiceLevelObjectiveRequest body = new ServiceLevelObjectiveRequest(); // ServiceLevelObjectiveRequest | Service level objective request object.
        try {
            SLOListResponse result = apiInstance.createSLO(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#createSLO");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
