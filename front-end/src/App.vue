<template>
  <div id="app">
    <div class="title-bar">Schedule an appointment.</div>
    <div class="info-bar">{{ stepInfo[step - 1] }}</div>
    <div class="left-margin">
      <span class="circle">{{ step }}</span>
    </div>
    <div class="container">
      <Step1 v-if="step === 1"></Step1>
      <Step2 v-if="step === 2"></Step2>
      <Step3 v-if="step === 3"></Step3>
      <Step4 v-if="step === 4"></Step4>
      <Step5 v-if="step === 5"></Step5>
    </div>
    <div class="note-container" v-show="step === 1">
      <textarea class="note">Add a note</textarea>
    </div>
    <div class="continue-container">
      <button v-if="step != 5" class="continue" @click="incrementStep">Continue</button>
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
      step: 1,
      stepInfo: [
        "What can we help you with?",
        "Which location works best for you?",
        "Let's find a time that works for you.",
        "Now we just need a few more details.",
        "Here's your appointment:"
      ],
      selectedTopics: []
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
  margin-bottom: 15px;
}

.continue:hover {
  cursor: pointer;
}

.circle {
  border-radius: 50%;
  background-color: rgb(42, 187, 155);
  padding: 50px 55px;
  margin: 250px;
}
</style>
