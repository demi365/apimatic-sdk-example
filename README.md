# Getting started

Api Documentation

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

## How to Use

The following section explains how to use the ApiDocumentation library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *ApiDocumentationLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

Clicking the ``` Add ``` button will open a dialog where you need to specify ApiDocumentation in ``` Group Id ``` and ApiDocumentationLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Api%20Documentation-Java&workspaceName=ApiDocumentation&projectName=ApiDocumentationLib&rootNamespace=localhost9095)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *ApiDocumentationLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

ApiDocumentationClient client = new ApiDocumentationClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [AdvantagesController](#advantages_controller)
* [DemoController](#demo_controller)
* [SaveTestDataController](#save_test_data_controller)

## <a name="advantages_controller"></a>![Class: ](https://apidocs.io/img/class.png "localhost9095.controllers.AdvantagesController") AdvantagesController

### Get singleton instance

The singleton instance of the ``` AdvantagesController ``` class can be accessed from the API Client.

```java
AdvantagesController advantages = client.getAdvantages();
```

### <a name="fetch_second_level_of_inheritance_branch1_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.AdvantagesController.fetchSecondLevelOfInheritanceBranch1UsingGETAsync") fetchSecondLevelOfInheritanceBranch1UsingGETAsync

> This approach is the test of building models based on model self-aware approach


```java
void fetchSecondLevelOfInheritanceBranch1UsingGETAsync(
        final int id,
        final APICallBack<ClaimsDisbursementModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | id |


#### Example Usage

```java
int id = 25;
// Invoking the API call with sample inputs
advantages.fetchSecondLevelOfInheritanceBranch1UsingGETAsync(id, new APICallBack<ClaimsDisbursementModel>() {
    public void onSuccess(HttpContext context, ClaimsDisbursementModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="fetch_second_level_of_inheritance_branch2_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.AdvantagesController.fetchSecondLevelOfInheritanceBranch2UsingGETAsync") fetchSecondLevelOfInheritanceBranch2UsingGETAsync

> This approach is the test of building models based on model self-aware approach


```java
void fetchSecondLevelOfInheritanceBranch2UsingGETAsync(
        final int id,
        final APICallBack<MaturityDisbursementModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | id |


#### Example Usage

```java
int id = 25;
// Invoking the API call with sample inputs
advantages.fetchSecondLevelOfInheritanceBranch2UsingGETAsync(id, new APICallBack<MaturityDisbursementModel>() {
    public void onSuccess(HttpContext context, MaturityDisbursementModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="fetch_first_level_of_inheritance_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.AdvantagesController.fetchFirstLevelOfInheritanceUsingGETAsync") fetchFirstLevelOfInheritanceUsingGETAsync

> This approach is the test of building models based on model self-aware approach


```java
void fetchFirstLevelOfInheritanceUsingGETAsync(
        final int id,
        final APICallBack<DisbursementPayeeModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | id |


#### Example Usage

```java
int id = 25;
// Invoking the API call with sample inputs
advantages.fetchFirstLevelOfInheritanceUsingGETAsync(id, new APICallBack<DisbursementPayeeModel>() {
    public void onSuccess(HttpContext context, DisbursementPayeeModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="fetch_only_one_table_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.AdvantagesController.fetchOnlyOneTableUsingGETAsync") fetchOnlyOneTableUsingGETAsync

> This approach is the test of building models based on model self-aware approach


```java
void fetchOnlyOneTableUsingGETAsync(
        final int id,
        final APICallBack<PayeePaymentModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | id |


#### Example Usage

```java
int id = 25;
// Invoking the API call with sample inputs
advantages.fetchOnlyOneTableUsingGETAsync(id, new APICallBack<PayeePaymentModel>() {
    public void onSuccess(HttpContext context, PayeePaymentModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="fetch_second_level_of_inheritance_branch3_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.AdvantagesController.fetchSecondLevelOfInheritanceBranch3UsingGETAsync") fetchSecondLevelOfInheritanceBranch3UsingGETAsync

> This approach is the test of building models based on model self-aware approach


```java
void fetchSecondLevelOfInheritanceBranch3UsingGETAsync(
        final int id,
        final APICallBack<SalaryDisbursementModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | id |


#### Example Usage

```java
int id = 25;
// Invoking the API call with sample inputs
advantages.fetchSecondLevelOfInheritanceBranch3UsingGETAsync(id, new APICallBack<SalaryDisbursementModel>() {
    public void onSuccess(HttpContext context, SalaryDisbursementModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



[Back to List of Controllers](#list_of_controllers)

## <a name="demo_controller"></a>![Class: ](https://apidocs.io/img/class.png "localhost9095.controllers.DemoController") DemoController

### Get singleton instance

The singleton instance of the ``` DemoController ``` class can be accessed from the API Client.

```java
DemoController demo = client.getDemo();
```

### <a name="get_create_using_join_info_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.DemoController.getCreateUsingJoinInfoUsingGETAsync") getCreateUsingJoinInfoUsingGETAsync

> This approach removes almost all the info of joins from the code area, only the where and predicates need to be given here and placed here, the rest of the info will be held in the model only.The returned object in the code JoinedQuery is an user defined one.


```java
void getCreateUsingJoinInfoUsingGETAsync(
        final String univ,
        final APICallBack<CoursesByUniversity> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| univ |  ``` Required ```  | univ |


#### Example Usage

```java
String univ = "univ";
// Invoking the API call with sample inputs
demo.getCreateUsingJoinInfoUsingGETAsync(univ, new APICallBack<CoursesByUniversity>() {
    public void onSuccess(HttpContext context, CoursesByUniversity response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="get_create_using_type_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.DemoController.getCreateUsingTypeUsingGETAsync") getCreateUsingTypeUsingGETAsync

> This approach is using jpa select, where there is freedom in changing the field names and also we can write code upto 100 field selects, but the code is going to be less manageable, and exactly what fields are being mapped to what model field is going to be again fixed in this place only, instead of the model holding the field information of what value it accepts


```java
void getCreateUsingTypeUsingGETAsync(
        final int gradYear,
        final String univ,
        final APICallBack<StudentModelPlain> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| gradYear |  ``` Required ```  | grad_year |
| univ |  ``` Required ```  | univ |


#### Example Usage

```java
int gradYear = 25;
String univ = "univ";
// Invoking the API call with sample inputs
demo.getCreateUsingTypeUsingGETAsync(gradYear, univ, new APICallBack<StudentModelPlain>() {
    public void onSuccess(HttpContext context, StudentModelPlain response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="get_create_using_custom_annotation_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.DemoController.getCreateUsingCustomAnnotationUsingGETAsync") getCreateUsingCustomAnnotationUsingGETAsync

> This approach removes almost all the info of joins from the code area, only the where and predicates need to be given here and placed here, the rest of the info will be held in the model only.The returned object in the code JoinedQuery is an user defined one.


```java
void getCreateUsingCustomAnnotationUsingGETAsync(
        final int gradYear,
        final String univ,
        final APICallBack<StudentModelWithJoinInfo> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| gradYear |  ``` Required ```  | grad_year |
| univ |  ``` Required ```  | univ |


#### Example Usage

```java
int gradYear = 25;
String univ = "univ";
// Invoking the API call with sample inputs
demo.getCreateUsingCustomAnnotationUsingGETAsync(gradYear, univ, new APICallBack<StudentModelWithJoinInfo>() {
    public void onSuccess(HttpContext context, StudentModelWithJoinInfo response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="get_mapping_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.DemoController.getMappingUsingGETAsync") getMappingUsingGETAsync

> This approach is not recommended, as we have to know sql grammar and also it has to be written perfectly to provide the entire information inside the query, the table name cannot be changed later, the field name should be fixed here, then again if we use more than 100 fields to fetch, this is not the best approach. This could potentially open up sql injection and does not provide even first level of type safety


```java
void getMappingUsingGETAsync(
        final int gradYear,
        final String univ,
        final APICallBack<StudentModelPlain> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| gradYear |  ``` Required ```  | grad_year |
| univ |  ``` Required ```  | univ |


#### Example Usage

```java
int gradYear = 25;
String univ = "univ";
// Invoking the API call with sample inputs
demo.getMappingUsingGETAsync(gradYear, univ, new APICallBack<StudentModelPlain>() {
    public void onSuccess(HttpContext context, StudentModelPlain response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="get_create_using_inherited_annotations_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.DemoController.getCreateUsingInheritedAnnotationsUsingGETAsync") getCreateUsingInheritedAnnotationsUsingGETAsync

> This approach removes almost all the info of joins from the code area, only the where and predicates need to be given here and placed here, the rest of the info will be held in the model only.The returned object in the code JoinedQuery is an user defined one.


```java
void getCreateUsingInheritedAnnotationsUsingGETAsync(
        final int gradYear,
        final String univ,
        final APICallBack<StudentsUnderCourses> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| gradYear |  ``` Required ```  | grad_year |
| univ |  ``` Required ```  | univ |


#### Example Usage

```java
int gradYear = 25;
String univ = "univ";
// Invoking the API call with sample inputs
demo.getCreateUsingInheritedAnnotationsUsingGETAsync(gradYear, univ, new APICallBack<StudentsUnderCourses>() {
    public void onSuccess(HttpContext context, StudentsUnderCourses response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="get_create_using_root_alone_using_get_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.DemoController.getCreateUsingRootAloneUsingGETAsync") getCreateUsingRootAloneUsingGETAsync

> This approach removes almost all the info of joins from the code area, only the where and predicates need to be given here and placed here, the rest of the info will be held in the model only.The returned object in the code JoinedQuery is an user defined one. The joins only happen for objects which are included in the class, not on objects which are fetched form DB


```java
void getCreateUsingRootAloneUsingGETAsync(
        final int gradYear,
        final APICallBack<StudentsUnderCourses> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| gradYear |  ``` Required ```  | grad_year |


#### Example Usage

```java
int gradYear = 25;
// Invoking the API call with sample inputs
demo.getCreateUsingRootAloneUsingGETAsync(gradYear, new APICallBack<StudentsUnderCourses>() {
    public void onSuccess(HttpContext context, StudentsUnderCourses response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



[Back to List of Controllers](#list_of_controllers)

## <a name="save_test_data_controller"></a>![Class: ](https://apidocs.io/img/class.png "localhost9095.controllers.SaveTestDataController") SaveTestDataController

### Get singleton instance

The singleton instance of the ``` SaveTestDataController ``` class can be accessed from the API Client.

```java
SaveTestDataController saveTestData = client.getSaveTestData();
```

### <a name="create_save_payment_info_using_post_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.SaveTestDataController.createSavePaymentInfoUsingPOSTAsync") createSavePaymentInfoUsingPOSTAsync

> This method saves claims using ClaimsDisbursementModel


```java
void createSavePaymentInfoUsingPOSTAsync(
        final ClaimsDisbursementModel claimsDisbursementModel,
        final APICallBack<ClaimsDisbursementModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| claimsDisbursementModel |  ``` Required ```  | claimsDisbursementModel |


#### Example Usage

```java
try {
    ClaimsDisbursementModel claimsDisbursementModel = new ClaimsDisbursementModel();
    // Invoking the API call with sample inputs
    saveTestData.createSavePaymentInfoUsingPOSTAsync(claimsDisbursementModel, new APICallBack<ClaimsDisbursementModel>() {
        public void onSuccess(HttpContext context, ClaimsDisbursementModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="create_save_payment_info_using_post1_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.SaveTestDataController.createSavePaymentInfoUsingPOST1Async") createSavePaymentInfoUsingPOST1Async

> This method saves maturity using MaturityDisbursementModel


```java
void createSavePaymentInfoUsingPOST1Async(
        final MaturityDisbursementModel maturityDisbursementModel,
        final APICallBack<MaturityDisbursementModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| maturityDisbursementModel |  ``` Required ```  | maturityDisbursementModel |


#### Example Usage

```java
try {
    MaturityDisbursementModel maturityDisbursementModel = new MaturityDisbursementModel();
    // Invoking the API call with sample inputs
    saveTestData.createSavePaymentInfoUsingPOST1Async(maturityDisbursementModel, new APICallBack<MaturityDisbursementModel>() {
        public void onSuccess(HttpContext context, MaturityDisbursementModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



### <a name="create_save_payment_info_using_post2_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost9095.controllers.SaveTestDataController.createSavePaymentInfoUsingPOST2Async") createSavePaymentInfoUsingPOST2Async

> This method saves salary using SalaryDisbursementModel


```java
void createSavePaymentInfoUsingPOST2Async(
        final SalaryDisbursementModel salaryDisbursementModel,
        final APICallBack<SalaryDisbursementModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| salaryDisbursementModel |  ``` Required ```  | salaryDisbursementModel |


#### Example Usage

```java
try {
    SalaryDisbursementModel salaryDisbursementModel = new SalaryDisbursementModel();
    // Invoking the API call with sample inputs
    saveTestData.createSavePaymentInfoUsingPOST2Async(salaryDisbursementModel, new APICallBack<SalaryDisbursementModel>() {
        public void onSuccess(HttpContext context, SalaryDisbursementModel response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |



[Back to List of Controllers](#list_of_controllers)



