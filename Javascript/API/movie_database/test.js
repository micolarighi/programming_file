const searchButton = document.querySelector(".search-button");
searchButton.addEventListener("click", function () {
  const inputKeyword = document.querySelector(".input-keyword");
  fetch("http://www.omdbapi.com/?apikey=709dc5&s=" + inputKeyword.value)
    .then((response) => response.json())
    .then((response) => {
      const movies = movies.Search;
      let cards = "";
      movies.forEach((m) => {
        cards += showCards();
      });
      const movieContainer = document.querySelector(".movie-container");
      movieContainer.innerHTML = cards;
    });
});

function showCards(m) {
  return `<div class="col-md-3 my-3 ">
            <div class="card ">
              <img src=${m.Poster} class="card-img-top" alt=""  style="height: 24rem;">
              <div class="card-body">
                <h5 class="card-title fs-6">${m.Title}</h5>
                <h6 class="card-subtitle mb-2 text-muted">${m.Year}</h6>
                <a href="#" class="btn btn-primary  modal-detail-button" 
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
