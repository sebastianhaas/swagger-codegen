package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Animal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;


/**
 * MixedPropertiesAndAdditionalPropertiesClass
 */
public class MixedPropertiesAndAdditionalPropertiesClass   {
    @SerializedName("uuid")
    private String uuid = null;
    @SerializedName("dateTime")
    private Date dateTime = null;
    @SerializedName("map")
    private Map<String, Animal> map = new HashMap<String, Animal>();

    /**
     * Get uuid
     * @return uuid
     **/
    @ApiModelProperty(value = "")
    public String getUuid() {
        return uuid;
    }

    /**
     * Set uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Get dateTime
     * @return dateTime
     **/
    @ApiModelProperty(value = "")
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * Set dateTime
     *
     * @param dateTime
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Get map
     * @return map
     **/
    @ApiModelProperty(value = "")
    public Map<String, Animal> getMap() {
        return map;
    }

    /**
     * Set map
     *
     * @param map
     */
    public void setMap(Map<String, Animal> map) {
        this.map = map;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MixedPropertiesAndAdditionalPropertiesClass mixedPropertiesAndAdditionalPropertiesClass = (MixedPropertiesAndAdditionalPropertiesClass) o;
        return Objects.equals(this.uuid, mixedPropertiesAndAdditionalPropertiesClass.uuid) &&
        Objects.equals(this.dateTime, mixedPropertiesAndAdditionalPropertiesClass.dateTime) &&
        Objects.equals(this.map, mixedPropertiesAndAdditionalPropertiesClass.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, dateTime, map);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
        
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    map: ").append(toIndentedString(map)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param o Object to be converted to indented string
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

