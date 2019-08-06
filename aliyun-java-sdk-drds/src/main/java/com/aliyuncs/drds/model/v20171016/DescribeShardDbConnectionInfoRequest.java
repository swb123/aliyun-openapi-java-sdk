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

package com.aliyuncs.drds.model.v20171016;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeShardDbConnectionInfoRequest extends RpcAcsRequest<DescribeShardDbConnectionInfoResponse> {
	
	public DescribeShardDbConnectionInfoRequest() {
		super("Drds", "2017-10-16", "DescribeShardDbConnectionInfo", "drds");
	}

	private String dbName;

	private String drdsInstanceId;

	private String subDbName;

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getSubDbName() {
		return this.subDbName;
	}

	public void setSubDbName(String subDbName) {
		this.subDbName = subDbName;
		if(subDbName != null){
			putQueryParameter("SubDbName", subDbName);
		}
	}

	@Override
	public Class<DescribeShardDbConnectionInfoResponse> getResponseClass() {
		return DescribeShardDbConnectionInfoResponse.class;
	}

}
