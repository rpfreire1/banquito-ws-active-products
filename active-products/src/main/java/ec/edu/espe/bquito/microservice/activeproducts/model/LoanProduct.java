package ec.edu.espe.bquito.microservice.activeproducts.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "loan_product")

public class LoanProduct {
    @Id
    private String id;
    @Indexed(unique = true)
    private String uniqueId;
    private String interestType;
    private String nameProduct;
    private String description;
    private BigDecimal defaulLoanAmount;
    private BigDecimal minLoanAmount;
    private BigDecimal maxLoanAmount;
    private Integer defaultNumInstallments;
    private Integer minNumInstallments;
    private Integer maxNumInstallments;
    private Integer defaultGracePeriod;
    private Integer minGracePeriod;
    private Integer maxGracePeriod;
    private String gracePeriodType;
    private BigDecimal defaultPenaltyRate;
    private BigDecimal minPenaltyRate;
    private BigDecimal maxPenaltyRate;
    private List<LoanRequirement> loanRequirement;
    private ProductArrearsSetting productArrearsSetting;
    private Date created_at;
    private String created_by;
    private Date modified_at;
    private String modified_by;
    private Date valid_to;
    @Version
    private Long version;


}
