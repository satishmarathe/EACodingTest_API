package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ApiApiService;
import io.swagger.api.factories.ApiApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.MusicFestival;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/api")

@Produces({ "application/json", "text/json", "text/plain" })
@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-15T09:57:52.550Z")
public class ApiApi  {
   private final ApiApiService delegate;

   public ApiApi(@Context ServletConfig servletContext) {
      ApiApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ApiApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ApiApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ApiApiServiceFactory.getApiApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/v1/festivals")
    
    @Produces({ "application/json", "text/json", "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = MusicFestival.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "API Key")
    }, tags={ "festivals", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = MusicFestival.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Throttled", response = String.class) })
    public Response getFestivals(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFestivals(securityContext);
    }
}
