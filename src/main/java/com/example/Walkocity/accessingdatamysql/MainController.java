package com.example.Walkocity.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TrashcanRepository trashcanRepository;
    private UserAccountRepository userAccountRepository;

    @PostMapping(path="/add/coordinates/") // Map ONLY POST Requests
    public @ResponseBody String addNewCoordinate (@RequestParam String longitude
            , @RequestParam String latitude, @RequestParam String liter) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Double longi = Double.parseDouble(longitude);
        Double lat = Double.parseDouble(latitude);
        Double lit = Double.parseDouble(liter);

        TrashCan c = new TrashCan();
        c.setLongitude(longi);
        c.setLatitude(lat);
        c.setLiter(lit);
        trashcanRepository.save(c);
        return "Saved";
    }

    @PostMapping(path="/add/useraccount/") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String emailInput, @RequestParam String passwordInput) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        char[] password = passwordInput.toCharArray();

        UserAccount user = new UserAccount();
        user.setEmail(emailInput);
        user.setPassword(password);
        userAccountRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<TrashCan> getAllCoordinates() {
        // This returns a JSON or XML with the users
        return trashcanRepository.findAll();
    }
}