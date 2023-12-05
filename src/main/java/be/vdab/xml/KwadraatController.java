package be.vdab.xml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kwadraat")
public class KwadraatController {
    private final KwadraatService kwadraatService;

    public KwadraatController(KwadraatService kwadraatService) {
        this.kwadraatService = kwadraatService;
    }
    @GetMapping("{getal}")
    int kwadraat (@PathVariable int getal){
        return kwadraatService.kwadraat(getal);
    }
}
