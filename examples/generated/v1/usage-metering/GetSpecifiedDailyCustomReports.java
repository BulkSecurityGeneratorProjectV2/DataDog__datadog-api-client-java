import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.UsageMeteringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);
        String reportId = "reportId_example"; // String | Date of the report in the format `YYYY-MM-DD`.
        try {
            UsageSpecifiedCustomReportsResponse result = apiInstance.getSpecifiedDailyCustomReports(reportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getSpecifiedDailyCustomReports");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
