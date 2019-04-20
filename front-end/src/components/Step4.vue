<template>
  <form>
    <div class="field">
      <label>First Name</label>
      <input type="text">
    </div>
    <br>
    <div class="field">
      <label>Last Name</label>
      <input type="text">
    </div>
    <br>
    <div class="field">
      <label>Email</label>
      <input type="text">
    </div>
    <br>
    <div class="field">
      <label>Phone Number</label>
      <input type="text">
    </div>
    <br>
    <input type="radio">
    <label>Text Message Consent</label>
    <br>
    By checking, I'm providing my consent to receive text updates.<br>
    <input type="radio">
    <label>Email Consent</label>
    <br>
    By checking, I'm providing my consent to receive email updates.
  </form>
</template>

<script>
export default {
  name: "Step4"
};
</script>

<style scoped>
.field {
  margin: 20px;
}
</style>