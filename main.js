var app = new Vue({
  el: "#app",
  data: {
    topics: []
  },
  methods: {
    addToTopics: function(event) {
      console.log(event);
    }
  }
});
