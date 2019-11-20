let count = 1;

function pushPhysicalActivity() {
    const form = document.querySelector('#form-add-physical-activity');
    const name = form.name.value;
    const time = form.time.value;
    const calories = form.calories.value;
    count += 1;

    $('#physical-activity-table').append(`
        <tr>
            <th>${count}</th>
            <td>${name}</td>
            <td>${time}</td>
            <td>${calories}</td>
        </tr>
    `);

    // const name = form.name.value;
    // const time = form.time.value;
    // const calories = form.calories.value;
    // count += 1;

    // const physicalActivityTr = document.createElement('tr');
    // const idTd = document.createElement('td');
    // const nameTd = document.createElement('td');
    // const timeTd = document.createElement('td');
    // const caloriesTd = document.createElement('td');

    // idTd.textContent = count;
    // nameTd.textContent = name;
    // timeTd.textContent = time;
    // caloriesTd.textContent = calories;

    // physicalActivityTr.appendChild(idTd);
    // physicalActivityTr.appendChild(nameTd);
    // physicalActivityTr.appendChild(timeTd);
    // physicalActivityTr.appendChild(caloriesTd);

    // const table = document.querySelector('#physical-activity-table');
    // table.appendChild(physicalActivityTr);

    $('#modalExemplo').modal('hide');
    document.querySelector('#form-add-physical-activity').reset();
}

// const addPhysicalActivity = document.querySelector('#button-add-physical-activity');
// addPhysicalActivity.addEventListener('click', function(event) {
//     event.preventDefault();
//     pushPhysicalActivity();
// });