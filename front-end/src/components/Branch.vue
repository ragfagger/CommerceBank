<template>
  <div>
    <button @click="getInfo">{{ info }}</button>
    <br>
  </div>
</template>

<script>
export default {
  name: "Branch",
  props: ["address1", "address2", "openings", "distance"],
  data() {
    return {
      info: "info"
    };
  },
  mounted: function() {
    this.getInfo();
  },
  methods: {
    getInfo: function() {
      this.$http
        .get("localhost/branches")
        .then(result => {
          this.info = result.data[0];
        });
    }
  }
};
</script>

<style scoped>
button {
  background-color: #9effe3;
  width: 745px;
  text-align: center;
  margin: auto;
  margin-top: 12px;
  padding: 35px;
}

button:hover {
  cursor: pointer;
}
</style>
