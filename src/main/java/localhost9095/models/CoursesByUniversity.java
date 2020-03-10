/*
 * ApiDocumentationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package localhost9095.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CoursesByUniversity 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7251259001413388913L;
    private String courseDescr;
    private String univDescr;
    private String universityName;
    /** GETTER
     * This refers to the field name course_entity.descr
     */
    @JsonGetter("courseDescr")
    public String getCourseDescr ( ) { 
        return this.courseDescr;
    }
    
    /** SETTER
     * This refers to the field name course_entity.descr
     */
    @JsonSetter("courseDescr")
    public void setCourseDescr (String value) { 
        this.courseDescr = value;
    }
 
    /** GETTER
     * This refers to the field name university_entity.descr
     */
    @JsonGetter("univDescr")
    public String getUnivDescr ( ) { 
        return this.univDescr;
    }
    
    /** SETTER
     * This refers to the field name university_entity.descr
     */
    @JsonSetter("univDescr")
    public void setUnivDescr (String value) { 
        this.univDescr = value;
    }
 
    /** GETTER
     * This refers to the field name university_entity.name
     */
    @JsonGetter("universityName")
    public String getUniversityName ( ) { 
        return this.universityName;
    }
    
    /** SETTER
     * This refers to the field name university_entity.name
     */
    @JsonSetter("universityName")
    public void setUniversityName (String value) { 
        this.universityName = value;
    }
 
}
