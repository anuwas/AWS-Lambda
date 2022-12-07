# AWS-Lambda

This lambda can access s3 bucket.

1. Create new role and attach the following ploicy
	a) S3bucket_fullAccess
	b)CloudwatchLog_fullAccess
	
2.Map this role for this lambda function
3. Lambda funciton and s3 bucket shold be in same region
4. Lambda trigger should be S3 bucket.

Test
1. Upload any file to the S3 bucket and then check choluwatch log. The lambda shold log the log record which is mentioned in lambda funciton.	