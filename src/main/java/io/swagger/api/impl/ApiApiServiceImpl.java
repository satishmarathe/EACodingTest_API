package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.MusicFestival;
import io.swagger.model.Band;

import io.swagger.api.common.ConstantsIfc;

import java.util.List;
import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-15T09:57:52.550Z")
public class ApiApiServiceImpl extends ApiApiService {
    @Override
    public Response getFestivals(SecurityContext securityContext) throws NotFoundException {
		if(ConstantsIfc.rateLimitCount.size() > 0 && ConstantsIfc.rateLimitCount.get(0) >=3){
			/** layman implementation of rate limit where after 3 requests we will send a 429 limit response 
			  * and then again the counter to 0 to allow next requests to be processed
			  */
			  ConstantsIfc.rateLimitCount.clear();
			  //ConstantsIfc.rateLimitCount
			return Response.status(429).build();
		}else{
			/** increment the count of requests processed for rate limit **/
			Integer count = 0;
			if(ConstantsIfc.rateLimitCount.size() > 0){
				count = ConstantsIfc.rateLimitCount.get(0);
			}			
			ConstantsIfc.rateLimitCount.clear();
			ConstantsIfc.rateLimitCount.add(count+1);

			List<MusicFestival> musicFestivalList = new ArrayList<>();

			MusicFestival festival1 = new MusicFestival();
			festival1.setName("Spring festival");
			Band b1 = new Band();
			b1.setName("ACDC");
			b1.setRecordLabel("Elektra Records");

			Band b2 = new Band();
			b2.setName("Sting");
			b2.setRecordLabel("Interscope");

			List<Band> bandList = new ArrayList<>();
			bandList.add(b1);
			bandList.add(b2);

			festival1.setBands(bandList);

			musicFestivalList.add(festival1);
			return Response.ok(musicFestivalList).build();
		}
		
        // do some magic!

    }
}
