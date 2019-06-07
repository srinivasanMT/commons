package io.mosip.kernel.masterdata.dto.getresponse.extn;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DTO class for document type.
 * 
 * @author Uday Kumar
 * @author Ritesh Sinha
 * @author Neha Sinha
 * 
 * @since 1.0.0
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "DocumentType", description = "DocumentType resource representation")
public class DocumentTypeExtnDto extends BaseDto {

	@ApiModelProperty(value = "code", required = true, dataType = "java.lang.String")
	private String code;

	@ApiModelProperty(value = "name", required = true, dataType = "java.lang.String")
	private String name;

	@ApiModelProperty(value = "Application description", required = false, dataType = "java.lang.String")
	private String description;

	@ApiModelProperty(value = "Language Code", required = true, dataType = "java.lang.String")
	private String langCode;

}
