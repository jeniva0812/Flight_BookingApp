@Entity
public class SpecialDeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String departureCity;
    private String arrivalCity;
    private BigDecimal cost;
    private LocalDateTime validityStart;
    private LocalDateTime validityEnd;
    
    // Getters and setters
    String getDepartureCity()
    {
        return departureCity;
    }
}
