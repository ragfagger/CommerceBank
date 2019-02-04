var app = new Vue({
  /* el is for element. This Vue instance will apply to the element with the id of
  "app" in the HTML file */
  el: "#app",
  data: {
    /* Step is the current step of the appointment setting process */
    step: 1,
    /* stepInfo will be display in the info bar at step */
    stepInfo: [
      "What can we help you with?",
      "Which location works best for you?"
    ],
    /* Store button selection state for each button */
    topics: [
      {
        topicName: "Checking Account",
        isSelected: false
      },
      {
        topicName: "Savings Account",
        isSelected: false
      },
      {
        topicName: "CDs/Money Market Accounts",
        isSelected: false
      },
      {
        topicName: "Student Banking",
        isSelected: false
      },
      {
        topicName: "Auto Loans",
        isSelected: false
      },
      {
        topicName: "Home Equity",
        isSelected: false
      },
      {
        topicName: "Mortgage",
        isSelected: false
      },
      {
        topicName: "Student Loans",
        isSelected: false
      },
      {
        topicName: "Saving for Retirement",
        isSelected: false
      },
      {
        topicName: "Investment Account",
        isSelected: false
      },
      {
        topicName: "Credit Card",
        isSelected: false
      },
      {
        topicName: "Other",
        isSelected: false
      }
    ]
  }
});
