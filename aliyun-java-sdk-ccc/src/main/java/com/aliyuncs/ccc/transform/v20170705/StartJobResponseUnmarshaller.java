/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.StartJobResponse;
import com.aliyuncs.ccc.model.v20170705.StartJobResponse.KeyValuePair;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartJobResponseUnmarshaller {

	public static StartJobResponse unmarshall(StartJobResponse startJobResponse, UnmarshallerContext context) {
		
		startJobResponse.setRequestId(context.stringValue("StartJobResponse.RequestId"));
		startJobResponse.setSuccess(context.booleanValue("StartJobResponse.Success"));
		startJobResponse.setCode(context.stringValue("StartJobResponse.Code"));
		startJobResponse.setMessage(context.stringValue("StartJobResponse.Message"));
		startJobResponse.setHttpStatusCode(context.integerValue("StartJobResponse.HttpStatusCode"));

		List<KeyValuePair> taskIds = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("StartJobResponse.TaskIds.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("StartJobResponse.TaskIds["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("StartJobResponse.TaskIds["+ i +"].Value"));

			taskIds.add(keyValuePair);
		}
		startJobResponse.setTaskIds(taskIds);
	 
	 	return startJobResponse;
	}
}