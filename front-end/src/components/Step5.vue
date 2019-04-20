<template>
  <div>
    <p>{ firstName } { lastName },</p>
    <p>Your appointment is scheduled. We'll see you soon!</p>
    <p>{ branchAddress }</p>
    <p>{ appointmentDateTime }</p>
    <p>{ topics }</p>
    <button>Change Appointment</button>
    <button>Cancel Appointment</button>
  </div>
</template>

<script>
export default {
  name: "Step5"
};
</script>

<style scoped>
button {
  padding: 5px 20px;
  margin: 5px 5px;
}
</style>
