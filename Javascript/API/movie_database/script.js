// using fetch
const searchButton = document.querySelector(".search-button");
const randomSearch = false
let inputKeyword = ''
searchButton.addEventListener("click", function () {
  if (randomSearch == false) {
    inputKeyword = document.querySelector(".input-keyword");
  } else {
    const inputKeyword = Math.floor(Math.random() * 20)
  }
  fetch("http://www.omdbapi.com/?apikey=709dc5&s=" + inputKeyword.value)
    .then((response) => response.json())
    .then((response) => {
      const movies = response.Search;
      let cards = "";
      movies.forEach((m) => (cards += showCards(m)));
      const movieContainer = document.querySelector(".movie-container");
      movieContainer.innerHTML = cards;

      // when show details button clicked
      const modalDetailButtton = document.querySelectorAll(".modal-detail-button");
      modalDetailButtton.forEach((btn) => {
        btn.addEventListener("click", function () {
          const imdbid = this.dataset.imdbid;
          fetch("http://www.omdbapi.com/?apikey=709dc5&i=" + imdbid)
            .then((response) => response.json())
            .then((m) => {
              const movieDetail = showMovieDetails(m);
              const modalBody = document.querySelector(".modal-body");
              modalBody.innerHTML = movieDetail;
            });
        });
      });
    });
});

const randomSearchButton = document.querySelector('.randomSearch-button')
randomSearchButton.addEventListener('click', function () {

})


function showCards(m) {
  return `<div class="col-md-3 my-3 ">
            <div class="card ">
              <img src=${m.Poster} class="card-img-top" alt=""  style="height: 24rem;">
              <div class="card-body">
                <h5 class="card-title fs-6">${m.Title}</h5>
                <h6 class="card-subtitle mb-2 text-muted" style="font-weight: 300;">${m.Year}</h6>
                <a href="#" class="btn btn-dark  modal-detail-button" 
                data-bs-toggle="modal" data-bs-target="#movieDetailModal" 
                data-imdbid='${m.imdbID}'>Show details</a>
              </div>
            </div>
            </div>`;
}

function showMovieDetails(m) {
  return `<div class="container-fluid">
            <div class="row">
              <div class="col-md-3">
                <img src='${m.Poster}' class="img-fluid" />
              </div>
              <div class="col-md">
                <ul class="list-group">
                  <li class="list-group-item"><h4>${m.Title} (${m.Year})</h4></li>
                  <li class="list-group-item">
                    <strong>Director : </strong> ${m.Director}
                  </li>
                  <li class="list-group-item">
                    <strong>Actors : </strong> ${m.Actors}
                  </li>
                  <li class="list-group-item">
                    <strong>Writer : </strong> ${m.Writer}
                  </li>
                  <li class="list-group-item">
                    <strong>Plot : </strong> <br />
                    ${m.Plot}
                  </li>
                </ul>
              </div>
            </div>
          </div>`;
}
