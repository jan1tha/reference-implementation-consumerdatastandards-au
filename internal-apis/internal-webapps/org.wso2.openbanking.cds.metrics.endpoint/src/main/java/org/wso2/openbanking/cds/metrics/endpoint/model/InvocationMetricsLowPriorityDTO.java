/**
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.openbanking.cds.metrics.endpoint.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;
import javax.validation.Valid;

/**
 * API call counts for the low priority tier.
 **/
@ApiModel(description = "API call counts for the low priority tier")
public class InvocationMetricsLowPriorityDTO {

    @ApiModelProperty(value = "API call counts for current day")
    @Valid
    /**
     * API call counts for current day
     **/
    private BigDecimal currentDay;

    @ApiModelProperty(value = "API call counts for previous days. The first element indicates yesterday and so on. A " +
            "maximum of seven entries is required if available")
    @Valid
    /**
     * API call counts for previous days. The first element indicates yesterday and so on. A maximum of seven entries
     * is required if available
     **/
    private List<BigDecimal> previousDays = null;

    /**
     * API call counts for current day.
     *
     * @return currentDay
     **/
    @JsonProperty("currentDay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(BigDecimal currentDay) {
        this.currentDay = currentDay;
    }

    public InvocationMetricsLowPriorityDTO currentDay(BigDecimal currentDay) {
        this.currentDay = currentDay;
        return this;
    }

    /**
     * API call counts for previous days. The first element indicates yesterday and so on. A maximum of seven entries is
     * required if available
     *
     * @return previousDays
     **/
    @JsonProperty("previousDays")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BigDecimal> getPreviousDays() {
        return previousDays;
    }

    public void setPreviousDays(List<BigDecimal> previousDays) {
        this.previousDays = previousDays;
    }

    public InvocationMetricsLowPriorityDTO previousDays(List<BigDecimal> previousDays) {
        this.previousDays = previousDays;
        return this;
    }

    public InvocationMetricsLowPriorityDTO addPreviousDaysItem(BigDecimal previousDaysItem) {
        this.previousDays.add(previousDaysItem);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvocationMetricsLowPriorityDTO {\n");

        sb.append("    currentDay: ").append(toIndentedString(currentDay)).append("\n");
        sb.append("    previousDays: ").append(toIndentedString(previousDays)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

