<template>
  <!-- This is the core content. The Vue instance is tied to this element since it
  has the "app" id-->
  <div id="app">
    <div class="title-bar">Schedule an appointment.</div>
    <!-- Displays current step number. The curly braces {{ }} are used for
    Vue expressions. The corresponding value within main.js will be displayed in
    its place-->
    <div class="info-bar">{{ stepInfo[step - 1] }}</div>
    <div class="text-choose">Choose as many topics as you need.</div>
    <div class="container">
      <!-- This div element contains the grid of topic buttons -->
      <div class="button-grid">
        <!-- :topic is short for v-bind:topic, this binds the topic prop to what is
        in quotes-->
        <Button :topic="buttonData[0].topic" :icon="buttonData[0].icon"></Button>
        <Button :topic="buttonData[1].topic" :icon="buttonData[1].icon"></Button>
        <Button :topic="buttonData[2].topic" :icon="buttonData[2].icon"></Button>
        <Button :topic="buttonData[3].topic" :icon="buttonData[3].icon"></Button>
        <Button :topic="buttonData[4].topic" :icon="buttonData[4].icon"></Button>
        <Button :topic="buttonData[5].topic" :icon="buttonData[5].icon"></Button>
        <Button :topic="buttonData[6].topic" :icon="buttonData[6].icon"></Button>
        <Button :topic="buttonData[7].topic" :icon="buttonData[7].icon"></Button>
        <Button :topic="buttonData[8].topic" :icon="buttonData[8].icon"></Button>
        <Button :topic="buttonData[9].topic" :icon="buttonData[9].icon"></Button>
        <Button :topic="buttonData[10].topic" :icon="buttonData[10].icon"></Button>
        <Button :topic="buttonData[11].topic" :icon="buttonData[11].icon"></Button>
      </div>
    </div>
    <div class="note-container">
      <!-- This is the textarea which allows adding any notes that the user may
      wants to include-->
      <textarea class="note">Add a note</textarea>
    </div>
    <div class="continue-container">
      <button class="continue">Continue</button>
    </div>
  </div>
</template>

<script>
import Button from "./components/Button.vue";

export default {
  name: "app",
  components: {
    Button
  },
  data() {
    return {
      /* Step is the current step of the appointment setting process */
      step: 1,
      /* stepInfo will be displayed in the info bar for each step */
      stepInfo: [
        "What can we help you with?",
        "Which location works best for you?",
        "Let's find a time that works for you.",
        "Now we just need a few more details.",
        "Here's your appointment:"
      ],
      buttonData: [
        { topic: "Checking Account", icon: "fas fa-money-check-alt fa-3x" },
        { topic: "Savings Account", icon: "fas fa-piggy-bank fa-3x" },
        {
          topic: "CDs/Money Market Accounts",
          icon: "fas fa-business-time fa-3x"
        },
        { topic: "Student Banking", icon: "fas fa-school fa-3x" },
        { topic: "Auto Loans", icon: "fas fa-car-side fa-3x" },
        { topic: "Home Equity", icon: "fas fa-dollar-sign fa-3x" },
        { topic: "Mortgage", icon: "fas fa-home fa-3x" },
        { topic: "Student Loans", icon: "fas fa-graduation-cap fa-3x" },
        {
          topic: "Saving for Retirement",
          icon: "fas fa-leaf fa-3x"
        },
        { topic: "Investment Account", icon: "fas fa-briefcase fa-3x" },
        { topic: "Credit Card", icon: "fas fa-credit-card fa-3x" },
        { topic: "Other", icon: "fas fa-folder-open fa-3x" }
      ]
    };
  }
};
</script>

<!-- This is CSS. This gives the HTML file instructions on how to be formatted. "#item"
corresponds to the id of an HTML element and ".item" corresponds to the class of
an HTML element. Multiple elements can have the same class. -->
<style>
body {
  margin: 0;
}

#app {
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;
}

.title-bar {
  background-color: rgb(42, 187, 155);
  color: white;
  font-weight: bold;
  font-size: 24px;
  padding: 20px;
}

.info-bar {
  background-color: rgb(41, 241, 195);
  text-align: center;
  padding: 20px;
}

.text-choose {
  margin-top: 10px;
  text-align: center;
}

.button-grid {
  display: inline-grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-row-gap: 12px;
  grid-column-gap: 12px;
}

.container {
  text-align: center;
  margin-top: 12px;
}

.note-container {
  margin-top: 15px;
}

.note {
  display: block;
  margin: auto;
}

.continue-container {
  margin-top: 15px;
  text-align: center;
}

.continue {
  padding: 5px 20px;
}

.continue:hover {
  cursor: pointer;
}
</style>
