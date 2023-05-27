package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;
    private List<Auction> auctions = new ArrayList<>();

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam (value = "title_like", required = false) String titleLike,
                              @RequestParam (value = "currentBid_lte", required = false) Double currentBidLte) {
        if (titleLike == null && currentBidLte == null) {
            return dao.list();
        } else if (titleLike != null && currentBidLte == null) {
            return dao.searchByTitle(titleLike);
        } else if (titleLike == null && currentBidLte != null) {
            return dao.searchByPrice(currentBidLte);
        } else {
            return dao.searchByTitleAndPrice(titleLike, currentBidLte);
        }
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return  dao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        dao.create(auction);
        return auction;
    }

}
