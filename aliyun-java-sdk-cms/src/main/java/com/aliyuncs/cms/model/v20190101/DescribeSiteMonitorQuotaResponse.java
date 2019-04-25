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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeSiteMonitorQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorQuotaResponse extends AcsResponse {

	private String code;

	private String message;

	private String success;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer siteMonitorIdcQuota;

		private Integer siteMonitorOperatorQuotaQuota;

		private Integer siteMonitorTaskQuota;

		private Integer siteMonitorQuotaTaskUsed;

		private String siteMonitorVersion;

		public Integer getSiteMonitorIdcQuota() {
			return this.siteMonitorIdcQuota;
		}

		public void setSiteMonitorIdcQuota(Integer siteMonitorIdcQuota) {
			this.siteMonitorIdcQuota = siteMonitorIdcQuota;
		}

		public Integer getSiteMonitorOperatorQuotaQuota() {
			return this.siteMonitorOperatorQuotaQuota;
		}

		public void setSiteMonitorOperatorQuotaQuota(Integer siteMonitorOperatorQuotaQuota) {
			this.siteMonitorOperatorQuotaQuota = siteMonitorOperatorQuotaQuota;
		}

		public Integer getSiteMonitorTaskQuota() {
			return this.siteMonitorTaskQuota;
		}

		public void setSiteMonitorTaskQuota(Integer siteMonitorTaskQuota) {
			this.siteMonitorTaskQuota = siteMonitorTaskQuota;
		}

		public Integer getSiteMonitorQuotaTaskUsed() {
			return this.siteMonitorQuotaTaskUsed;
		}

		public void setSiteMonitorQuotaTaskUsed(Integer siteMonitorQuotaTaskUsed) {
			this.siteMonitorQuotaTaskUsed = siteMonitorQuotaTaskUsed;
		}

		public String getSiteMonitorVersion() {
			return this.siteMonitorVersion;
		}

		public void setSiteMonitorVersion(String siteMonitorVersion) {
			this.siteMonitorVersion = siteMonitorVersion;
		}
	}

	@Override
	public DescribeSiteMonitorQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeSiteMonitorQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}