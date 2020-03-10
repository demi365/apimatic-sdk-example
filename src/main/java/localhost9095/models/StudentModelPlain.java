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
public class StudentModelPlain 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6914158875644836203L;
    private String courseName;
    private String offeredBy;
    private String payeeId;
    private Integer studentId;
    /** GETTER
     * This refers to the value fetched from the table column CourseEntity.course_name
     */
    @JsonGetter("courseName")
    public String getCourseName ( ) { 
        return this.courseName;
    }
    
    /** SETTER
     * This refers to the value fetched from the table column CourseEntity.course_name
     */
    @JsonSetter("courseName")
    public void setCourseName (String value) { 
        this.courseName = value;
    }
 
    /** GETTER
     * This refers to the value fetched from the table column UniversityEntity.id
     */
    @JsonGetter("offeredBy")
    public String getOfferedBy ( ) { 
        return this.offeredBy;
    }
    
    /** SETTER
     * This refers to the value fetched from the table column UniversityEntity.id
     */
    @JsonSetter("offeredBy")
    public void setOfferedBy (String value) { 
        this.offeredBy = value;
    }
 
    /** GETTER
     * This refers to the value fetched from the table column StudentEntity.first_name
     */
    @JsonGetter("payeeId")
    public String getPayeeId ( ) { 
        return this.payeeId;
    }
    
    /** SETTER
     * This refers to the value fetched from the table column StudentEntity.first_name
     */
    @JsonSetter("payeeId")
    public void setPayeeId (String value) { 
        this.payeeId = value;
    }
 
    /** GETTER
     * This refers to the value fetched from the table column StudentEntity.id
     */
    @JsonGetter("studentId")
    public Integer getStudentId ( ) { 
        return this.studentId;
    }
    
    /** SETTER
     * This refers to the value fetched from the table column StudentEntity.id
     */
    @JsonSetter("studentId")
    public void setStudentId (Integer value) { 
        this.studentId = value;
    }
 
}
