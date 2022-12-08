package com.org.pack;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class LambdaFunctionHandler implements RequestStreamHandler {

    @Override
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
    	context.getLogger().log("StreamEventHandler lambda is invoked");
        // TODO: Implement your stream handler. See https://docs.aws.amazon.com/lambda/latest/dg/java-handler-io-type-stream.html for more information.
        // This demo implementation capitalizes the characters from the input stream.
        int letter = 0;
        while((letter = input.read()) >= 0) {
        	int currentChar = Character.toUpperCase(letter);
        	context.getLogger().log("Current Character is "+currentChar);
            output.write(currentChar);
            context.getLogger().log("Output Object is "+output.toString());
        }
    }

}
