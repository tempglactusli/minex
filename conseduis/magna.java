  .removalListener(notification -> {
      System.out.println("Removed: " + notification.getKey() + ", cause: " + notification.getCause());
  }) // Adds a listener to handle removal notifications
  