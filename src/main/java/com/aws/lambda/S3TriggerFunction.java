package com.aws.lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.event.S3EventNotification;

/**
 * AWS Lambda function with S3 trigger.
 * 
 */
public class S3TriggerFunction implements RequestHandler<S3EventNotification, String> {
	
	static final Logger log = LoggerFactory.getLogger(S3TriggerFunction.class);

	@Override
	public String handleRequest(S3EventNotification s3EventNotification, Context context) {
		log.info("Lambda function is invoked:" + s3EventNotification.toJson());

		return null;
	}

}

