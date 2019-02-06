<template>
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
</template>

<script>
import Button from "./Button.vue";
export default {
  name: "Step1",
  components: {
    Button
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
