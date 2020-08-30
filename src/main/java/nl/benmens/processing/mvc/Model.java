package nl.benmens.processing.mvc;

import nl.benmens.processing.observer.SubscriptionManager;

public class Model {

  protected SubscriptionManager subscriptionManager = new SubscriptionManager();

  public Model() {
  }

  public final void destroy() {
    onDestroy();
  }

  public void onDestroy() {
  }
}