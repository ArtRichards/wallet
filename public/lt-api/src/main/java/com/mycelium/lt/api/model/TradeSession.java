package com.mycelium.lt.api.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;
import com.mrd.bitlib.crypto.PublicKey;
import com.mrd.bitlib.model.Address;

public class TradeSession implements Serializable {
   private static final long serialVersionUID = 1L;

   @JsonProperty
   public final UUID id;
   @JsonProperty
   public final long creationTime;
   @JsonProperty
   public final long lastChange;
   @JsonProperty
   public final PriceFormula priceFormula;
   @JsonProperty
   public final double premium;
   @JsonProperty
   public final String currency;
   @JsonProperty
   public final int fiatTraded;
   @JsonProperty
   public final long satoshisAtMarketPrice;
   @JsonProperty
   public final long satoshisFromSeller;
   @JsonProperty
   public final long satoshisForBuyer;
   @JsonProperty
   public final Address buyerAddress;
   @JsonProperty
   public final Address feeAddress;
   @JsonProperty
   public final List<ChatEntry> chatEntries;
   @JsonProperty
   public final String ownerName;
   @JsonProperty
   public final Address ownerId;
   @JsonProperty
   public final PublicKey ownerPublicKey;
   @JsonProperty
   public final String peerName;
   @JsonProperty
   public final Address peerId;
   @JsonProperty
   public final PublicKey peerPublicKey;
   @JsonProperty
   public final boolean isOwner;
   @JsonProperty
   public final boolean isBuyer;
   @JsonProperty
   public final String statusText;
   @JsonProperty
   public final Double confidence;
   @JsonProperty
   public final ActionState acceptAction;
   @JsonProperty
   public final ActionState abortAction;
   @JsonProperty
   public final ActionState refreshRateAction;
   @JsonProperty
   public final ActionState changePriceAction;
   @JsonProperty
   public final ActionState releaseBtcAction;
   @JsonProperty
   public final ActionState sendMessageAction;
   @JsonProperty
   public final boolean isWaitingForPeerAccept;
   @JsonProperty
   public final boolean isOpen;
   @JsonProperty
   public final GpsLocation location;

   public TradeSession(@JsonProperty("id") UUID id, @JsonProperty("creationTime") long creationTime,
         @JsonProperty("lastChange") long lastChange, @JsonProperty("priceFormula") PriceFormula priceFormula,
         @JsonProperty("premium") double premium, @JsonProperty("currency") String currency,
         @JsonProperty("fiatTraded") int fiatTraded, @JsonProperty("satoshisAtMarketPrice") long satoshisAtMarketPrice,
         @JsonProperty("satoshisFromSeller") long satoshisFromSeller,
         @JsonProperty("satoshisForBuyer") long satoshisForBuyer, @JsonProperty("buyerAddress") Address buyerAddress,
         @JsonProperty("feeAddress") Address feeAddress, @JsonProperty("chatEntries") List<ChatEntry> chatEntries,
         @JsonProperty("ownerName") String ownerName, @JsonProperty("ownerId") Address ownerId,
         @JsonProperty("ownerPublicKey") PublicKey ownerPublicKey, @JsonProperty("peerName") String peerName,
         @JsonProperty("peerId") Address peerId, @JsonProperty("peerPublicKey") PublicKey peerPublicKey,
         @JsonProperty("isOwner") boolean isOwner, @JsonProperty("isBuyer") boolean isBuyer,
         @JsonProperty("statusText") String statusText, @JsonProperty("confidence") Double confidence,
         @JsonProperty("acceptAction") ActionState acceptAction, @JsonProperty("abortAction") ActionState abortAction,
         @JsonProperty("refreshRateAction") ActionState refreshRateAction,
         @JsonProperty("changePriceAction") ActionState changePriceAction,
         @JsonProperty("releaseBtcAction") ActionState releaseBtcAction,
         @JsonProperty("sendMessageAction") ActionState sendMessageAction,
         @JsonProperty("isWaitingForPeerAccept") boolean isWaitingForPeerAccept,
         @JsonProperty("isOpen") boolean isOpen, @JsonProperty("location") GpsLocation location) {
      this.id = id;
      this.creationTime = creationTime;
      this.lastChange = lastChange;
      this.priceFormula = priceFormula;
      this.premium = premium;
      this.currency = currency;
      this.fiatTraded = fiatTraded;
      this.satoshisAtMarketPrice = satoshisAtMarketPrice;
      this.satoshisFromSeller = satoshisFromSeller;
      this.satoshisForBuyer = satoshisForBuyer;
      this.buyerAddress = buyerAddress;
      this.feeAddress = feeAddress;
      this.chatEntries = chatEntries;
      this.ownerName = ownerName;
      this.ownerId = ownerId;
      this.ownerPublicKey = ownerPublicKey;
      this.peerName = peerName;
      this.peerId = peerId;
      this.peerPublicKey = peerPublicKey;
      this.isOwner = isOwner;
      this.isBuyer = isBuyer;
      this.statusText = statusText;
      this.confidence = confidence;
      this.acceptAction = acceptAction;
      this.abortAction = abortAction;
      this.refreshRateAction = refreshRateAction;
      this.changePriceAction = changePriceAction;
      this.releaseBtcAction = releaseBtcAction;
      this.sendMessageAction = sendMessageAction;
      this.isWaitingForPeerAccept = isWaitingForPeerAccept;
      this.isOpen = isOpen;
      this.location = location;
      Preconditions.checkState(satoshisFromSeller >= satoshisForBuyer);
      Preconditions.checkState(satoshisForBuyer > 0);
   }

   @Override
   public int hashCode() {
      return id.hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }
      if (!(obj instanceof TradeSession)) {
         return false;
      }
      return id.equals(((TradeSession) obj).id);
   }

}
