package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardBulkDeleteRequest;
import com.datadog.api.client.v1.model.DashboardDeleteResponse;
import com.datadog.api.client.v1.model.DashboardRestoreRequest;
import com.datadog.api.client.v1.model.DashboardSummary;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardsApi {
  private ApiClient apiClient;

  public DashboardsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public DashboardsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new dashboard.
   *
   * <p>See {@link #createDashboardWithHttpInfo}.
   *
   * @param body Create a dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard createDashboard(Dashboard body) throws ApiException {
    return createDashboardWithHttpInfo(body).getData();
  }

  /**
   * Create a new dashboard.
   *
   * <p>See {@link #createDashboardWithHttpInfoAsync}.
   *
   * @param body Create a dashboard request body. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> createDashboardAsync(Dashboard body) {
    return createDashboardWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a dashboard using the specified options. When defining queries in your widgets, take
   * note of which queries should have the <code>as_count()</code> or <code>as_rate()</code>
   * modifiers appended. Refer to the following <a
   * href="https://docs.datadoghq.com/developers/metrics/type_modifiers/?tab=count#in-application-modifiers">documentation</a>
   * for more information on these modifiers.
   *
   * @param body Create a dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> createDashboardWithHttpInfo(Dashboard body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createDashboard");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.createDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }

  /**
   * Create a new dashboard.
   *
   * <p>See {@link #createDashboardWithHttpInfo}.
   *
   * @param body Create a dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Dashboard>> createDashboardWithHttpInfoAsync(
      Dashboard body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.createDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }

  /**
   * Delete a dashboard.
   *
   * <p>See {@link #deleteDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return DashboardDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public DashboardDeleteResponse deleteDashboard(String dashboardId) throws ApiException {
    return deleteDashboardWithHttpInfo(dashboardId).getData();
  }

  /**
   * Delete a dashboard.
   *
   * <p>See {@link #deleteDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;DashboardDeleteResponse&gt;
   */
  public CompletableFuture<DashboardDeleteResponse> deleteDashboardAsync(String dashboardId) {
    return deleteDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;DashboardDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardDeleteResponse> deleteDashboardWithHttpInfo(String dashboardId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling deleteDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.deleteDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardDeleteResponse>() {});
  }

  /**
   * Delete a dashboard.
   *
   * <p>See {@link #deleteDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardDeleteResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardDeleteResponse>> deleteDashboardWithHttpInfoAsync(
      String dashboardId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<DashboardDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling deleteDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.deleteDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardDeleteResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardDeleteResponse>() {});
  }

  /**
   * Delete dashboards.
   *
   * <p>See {@link #deleteDashboardsWithHttpInfo}.
   *
   * @param body Delete dashboards request body. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboards(DashboardBulkDeleteRequest body) throws ApiException {
    deleteDashboardsWithHttpInfo(body);
  }

  /**
   * Delete dashboards.
   *
   * <p>See {@link #deleteDashboardsWithHttpInfoAsync}.
   *
   * @param body Delete dashboards request body. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteDashboardsAsync(DashboardBulkDeleteRequest body) {
    return deleteDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete dashboards using the specified IDs. If there are any failures, no dashboards will be
   * deleted (partial success is not allowed).
   *
   * @param body Delete dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteDashboardsWithHttpInfo(DashboardBulkDeleteRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling deleteDashboards");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.deleteDashboards",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete dashboards.
   *
   * <p>See {@link #deleteDashboardsWithHttpInfo}.
   *
   * @param body Delete dashboards request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteDashboardsWithHttpInfoAsync(
      DashboardBulkDeleteRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling deleteDashboards"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.deleteDashboards",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get a dashboard.
   *
   * <p>See {@link #getDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard getDashboard(String dashboardId) throws ApiException {
    return getDashboardWithHttpInfo(dashboardId).getData();
  }

  /**
   * Get a dashboard.
   *
   * <p>See {@link #getDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> getDashboardAsync(String dashboardId) {
    return getDashboardWithHttpInfoAsync(dashboardId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> getDashboardWithHttpInfo(String dashboardId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling getDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.getDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }

  /**
   * Get a dashboard.
   *
   * <p>See {@link #getDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Dashboard>> getDashboardWithHttpInfoAsync(
      String dashboardId) {
    Object localVarPostBody = null;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling getDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.getDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }

  /** Manage optional parameters to listDashboards. */
  public static class ListDashboardsOptionalParameters {
    private Boolean filterShared;
    private Boolean filterDeleted;

    /**
     * Set filterShared.
     *
     * @param filterShared When <code>true</code>, this query only returns shared custom created or
     *     cloned dashboards. (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterShared(Boolean filterShared) {
      this.filterShared = filterShared;
      return this;
    }

    /**
     * Set filterDeleted.
     *
     * @param filterDeleted When <code>true</code>, this query returns only deleted custom-created
     *     or cloned dashboards. This parameter is incompatible with <code>filter[shared]</code>.
     *     (optional)
     * @return ListDashboardsOptionalParameters
     */
    public ListDashboardsOptionalParameters filterDeleted(Boolean filterDeleted) {
      this.filterDeleted = filterDeleted;
      return this;
    }
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   */
  public DashboardSummary listDashboards() throws ApiException {
    return listDashboardsWithHttpInfo(new ListDashboardsOptionalParameters()).getData();
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;DashboardSummary&gt;
   */
  public CompletableFuture<DashboardSummary> listDashboardsAsync() {
    return listDashboardsWithHttpInfoAsync(new ListDashboardsOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return DashboardSummary
   * @throws ApiException if fails to make API call
   */
  public DashboardSummary listDashboards(ListDashboardsOptionalParameters parameters)
      throws ApiException {
    return listDashboardsWithHttpInfo(parameters).getData();
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;DashboardSummary&gt;
   */
  public CompletableFuture<DashboardSummary> listDashboardsAsync(
      ListDashboardsOptionalParameters parameters) {
    return listDashboardsWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all dashboards.
   *
   * <p><strong>Note</strong>: This query will only return custom created or cloned dashboards. This
   * query will not return preset dashboards.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;DashboardSummary&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DashboardSummary> listDashboardsWithHttpInfo(
      ListDashboardsOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Boolean filterShared = parameters.filterShared;
    Boolean filterDeleted = parameters.filterDeleted;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.listDashboards",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardSummary>() {});
  }

  /**
   * Get all dashboards.
   *
   * <p>See {@link #listDashboardsWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;DashboardSummary&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DashboardSummary>> listDashboardsWithHttpInfoAsync(
      ListDashboardsOptionalParameters parameters) {
    Object localVarPostBody = null;
    Boolean filterShared = parameters.filterShared;
    Boolean filterDeleted = parameters.filterDeleted;
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[shared]", filterShared));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[deleted]", filterDeleted));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.listDashboards",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DashboardSummary>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DashboardSummary>() {});
  }

  /**
   * Restore deleted dashboards.
   *
   * <p>See {@link #restoreDashboardsWithHttpInfo}.
   *
   * @param body Restore dashboards request body. (required)
   * @throws ApiException if fails to make API call
   */
  public void restoreDashboards(DashboardRestoreRequest body) throws ApiException {
    restoreDashboardsWithHttpInfo(body);
  }

  /**
   * Restore deleted dashboards.
   *
   * <p>See {@link #restoreDashboardsWithHttpInfoAsync}.
   *
   * @param body Restore dashboards request body. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> restoreDashboardsAsync(DashboardRestoreRequest body) {
    return restoreDashboardsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Restore dashboards using the specified IDs. If there are any failures, no dashboards will be
   * restored (partial success is not allowed).
   *
   * @param body Restore dashboards request body. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Dashboards Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> restoreDashboardsWithHttpInfo(DashboardRestoreRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling restoreDashboards");
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.restoreDashboards",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Restore deleted dashboards.
   *
   * <p>See {@link #restoreDashboardsWithHttpInfo}.
   *
   * @param body Restore dashboards request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> restoreDashboardsWithHttpInfoAsync(
      DashboardRestoreRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling restoreDashboards"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/dashboard";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.restoreDashboards",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Update a dashboard.
   *
   * <p>See {@link #updateDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard updateDashboard(String dashboardId, Dashboard body) throws ApiException {
    return updateDashboardWithHttpInfo(dashboardId, body).getData();
  }

  /**
   * Update a dashboard.
   *
   * <p>See {@link #updateDashboardWithHttpInfoAsync}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;Dashboard&gt;
   */
  public CompletableFuture<Dashboard> updateDashboardAsync(String dashboardId, Dashboard body) {
    return updateDashboardWithHttpInfoAsync(dashboardId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a dashboard using the specified ID.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Dashboard> updateDashboardWithHttpInfo(String dashboardId, Dashboard body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'dashboardId' when calling updateDashboard");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateDashboard");
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v1.DashboardsApi.updateDashboard",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }

  /**
   * Update a dashboard.
   *
   * <p>See {@link #updateDashboardWithHttpInfo}.
   *
   * @param dashboardId The ID of the dashboard. (required)
   * @param body Update Dashboard request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Dashboard&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Dashboard>> updateDashboardWithHttpInfoAsync(
      String dashboardId, Dashboard body) {
    Object localVarPostBody = body;

    // verify the required parameter 'dashboardId' is set
    if (dashboardId == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'dashboardId' when calling updateDashboard"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateDashboard"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v1/dashboard/{dashboard_id}"
            .replaceAll(
                "\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v1.DashboardsApi.updateDashboard",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Dashboard>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<Dashboard>() {});
  }
}
