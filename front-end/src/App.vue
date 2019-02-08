<template>
  <!-- This is the core content. The Vue instance is tied to this element since it
  has the "app" id-->
  <div id="app">
    <div class="title-bar">Schedule an appointment.</div>
    <!-- Displays current step number. The curly braces {{ }} are used for
    Vue expressions. The corresponding value within main.js will be displayed in
    its place-->
    <div class="info-bar">{{ stepInfo[step - 1] }}</div>
    <div class="container">
      <!-- the v-show directive will only display the element when the given condition is
      true-->
      <Step1 v-show="step === 1"></Step1>
      <Step2 v-show="step === 2"></Step2>
      <Step3 v-show="step === 3"></Step3>
      <Step4 v-show="step === 4"></Step4>
      <Step5 v-show="step === 5"></Step5>
    </div>
    <div class="note-container" v-show="step === 1">
      <!-- This is the textarea which allows adding any notes that the user may
      wants to include-->
      <textarea class="note">Add a note</textarea>
    </div>
    <div class="continue-container">
      <!-- @click is shorthand for v-on:click. This is an event handler. The
      incrementStep function will be called when the button is clicked.-->
      <button class="continue" @click="incrementStep">Continue</button>
    </div>
  </div>
</template>

<script>
import Step1 from "./components/Step1.vue";
import Step2 from "./components/Step2.vue";
import Step3 from "./components/Step3.vue";
import Step4 from "./components/Step4.vue";
import Step5 from "./components/Step5.vue";

export default {
  name: "app",
  components: {
    Step1,
    Step2,
    Step3,
    Step4,
    Step5
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
      ]
    };
  },
  methods: {
    incrementStep: function() {
      if (this.step < 5) {
        this.step++;
      }
    }
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
  font-weight: bold;
  padding: 20px;
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
