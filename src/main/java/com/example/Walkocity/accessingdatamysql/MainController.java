package com.example.Walkocity.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.Optional;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private StationRepository stationRepository;
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserAccountRepository userAccountRepository;
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @PostMapping(path= "/add/station") // Map ONLY POST Requests
    public @ResponseBody String addNewStation(@RequestParam String longitude
            , @RequestParam String latitude) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Station station = new Station();
        station.setLongitude(Double.parseDouble(longitude));
        station.setLatitude(Double.parseDouble(latitude));
        stationRepository.save(station);
        return "Saved";
    }

    @PostMapping(path="/add/useraccount") // Map ONLY POST Requests
    public @ResponseBody
    Optional<UserAccount> addNewUserAccount (@RequestParam String email, @RequestParam String password, @RequestParam String facebookId) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        UserAccount userAccount = new UserAccount();
        userAccount.setEmail(email);
        userAccount.setPassword(password);
        userAccount.setStartDate(LocalDate.now());
        userAccount.setFacebookId(facebookId);
        userAccountRepository.save(userAccount);
        return userAccountRepository.findById(userAccount.getId());
    }

    @PostMapping(path="/add/user") // Map ONLY POST Requests
    public @ResponseBody
    Optional<User> addNewUserProfile (@RequestParam String id, @RequestParam String firstName, @RequestParam String lastName,
                                      @RequestParam String age, @RequestParam String genderIdentity, @RequestParam String genderSearch, @RequestParam String country, @RequestParam String languages, @RequestParam String photo) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(Integer.parseInt(age));
        user.setGenderIdentity(genderIdentity);
        user.setGenderSearch(genderSearch);
        user.setCountry(country);
        user.setLanguages(languages);
        user.setPhoto(photo);
        userRepository.save(user);
        return userRepository.findById(Integer.parseInt(id));
    }

    @GetMapping(path="/all/stations")
    public @ResponseBody Iterable<Station> getAllStations() {
        // This returns a JSON or XML with the users
        return stationRepository.findAll();
    }


    @GetMapping(path="/all/useraccounts")
    public @ResponseBody Iterable<UserAccount> getAllUserAccounts() {
        // This returns a JSON or XML with the users
        return userAccountRepository.findAll();
    }


    @GetMapping(path="/all/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }



    @GetMapping(path="/user/byId")
    public @ResponseBody User getUser(@RequestParam String id) {
        User user = new User();
        user.setId(-1);
        for (User u: userRepository.findAll()) {
            if (u.getId().equals(Integer.parseInt(id))) {
                user = u;
            }
        } return user;
    }

    @GetMapping(path="/useraccount/byEmail")
    public @ResponseBody UserAccount getUserAccount(@RequestParam String email) {
        UserAccount user = new UserAccount();
        user.setId(-1);
        for (UserAccount userAccount: userAccountRepository.findAll()) {
            if (userAccount.getEmail().equals(email)) {
                user.setId(userAccount.getId());
            }
        } return user;
    }

    @GetMapping(path="/useraccount/byFacebookId")
    public @ResponseBody UserAccount getUserAccountByFacebook(@RequestParam String facebookId) {
        UserAccount user = new UserAccount();
        user.setId(-1);
        for (UserAccount userAccount: userAccountRepository.findAll()) {
            if (userAccount.getFacebookId().equals(facebookId)) {
                user.setId(userAccount.getId());
            }
        } return user;
    }

    @GetMapping(path="/login")
    public @ResponseBody UserAccount getUserAccount(@RequestParam String email, @RequestParam String password) {
        UserAccount user = new UserAccount();
        user.setId(-1);
        for (UserAccount userAccount: userAccountRepository.findAll()) {
            if (userAccount.getEmail().equals(email) && userAccount.getPassword().equals(password)) {
                user.setId(userAccount.getId());
            }
        } return user;
    }


}