<template>
  <div>
    <div class="text-choose">Choose as many topics as you need.</div>
    <div class="button-grid">
      <TopicButton
        v-for="button in buttonData"
        :key="button.topic"
        :topic="button.topic"
        :icon="button.icon"
      ></TopicButton>
    </div>
  </div>
</template>

<script>
import TopicButton from "./TopicButton.vue";
export default {
  name: "Step1",
  components: {
    TopicButton
  },
  data() {
    return {
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

<style scoped>
.text-choose {
  margin: 10px;
  text-align: center;
}

.button-grid {
  display: inline-grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-row-gap: 12px;
  grid-column-gap: 12px;
}
</style>
