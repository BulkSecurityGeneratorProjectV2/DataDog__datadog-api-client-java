import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String serviceAccountId = "00000000-0000-1234-0000-000000000000"; // String | The ID of the service account.
        String appKeyId = "appKeyId_example"; // String | The ID of the application key.
        try {
            PartialApplicationKeyResponse result = apiInstance.getServiceAccountApplicationKey(serviceAccountId, appKeyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#getServiceAccountApplicationKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
