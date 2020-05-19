# ArticlesRestWebServices
ArticlesRestWebServices is a Spring Boot Restful API web services where we can create, delete, and retrived(One or All) authors with articles related to them(The Authors).

Blog Articles:

Authors --> Articles

  - Retrieve all Authors    * GET "/authors/"
  - Create an Author        * POST "/authors/{id}"
  - Retrieve One Auhtor     * GET "/authors/{id}"
  - Delete an Author        * DELETE "/authors/{id}"
  
  - Retrieve All Articles for an Author   * GET "/authors/{id}/articles"
  - Create an Article for an Author       * POST "/authors/{id}/articles"
  - Retrieve details for an Article       * GET "/authors/{authorId}/articles/{articleId}"
  - Delete an Author Article              * DE:LETE "/authors/{authorId}/articles/{articleId}"
  
For more information about the ArticlesRestWebServices: 
  * Swagger Documentation links: 
    - http://localhost:8181/v2/api-docs
    - http://localhost:8181/swagger-ui.html#/
