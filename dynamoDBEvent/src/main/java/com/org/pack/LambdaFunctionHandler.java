package com.org.pack;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.DynamodbEvent;
import com.amazonaws.services.lambda.runtime.events.DynamodbEvent.DynamodbStreamRecord;

public class LambdaFunctionHandler implements RequestHandler<DynamodbEvent, Integer> {

    @Override
    public Integer handleRequest(DynamodbEvent event, Context context) {
        context.getLogger().log("Received Dynamodb event: " + event);

        for (DynamodbStreamRecord record : event.getRecords()) {
            context.getLogger().log("ecord.getEventID() "+record.getEventID());
            context.getLogger().log("record.getEventName() "+record.getEventName());
            context.getLogger().log("record.getDynamodb().toString() "+record.getDynamodb().toString());
        }
        context.getLogger().log("event.getRecords().size() "+event.getRecords().size());
        return event.getRecords().size();
    }
}