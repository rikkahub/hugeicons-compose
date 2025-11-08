package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SortingZA01: ImageVector
    get() {
        if (_sortingZA01 != null) {
            return _sortingZA01!!
        }
        _sortingZA01 = ImageVector.Builder(
            name = "SortingZA01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 3f)
        horizontalLineTo(8.42109f)
        curveTo(9.35119f, 3f, 9.81624f, 3f, 9.94012f, 3.28013f)
        curveTo(10.064f, 3.56026f, 9.74755f, 3.89632f, 9.11466f, 4.56842f)
        lineTo(5.47691f, 8.43158f)
        curveTo(4.84402f, 9.10368f, 4.52757f, 9.43974f, 4.65145f, 9.71987f)
        curveTo(4.77533f, 10f, 5.24038f, 10f, 6.17048f, 10f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 21f)
        lineTo(6.10557f, 16.3053f)
        curveTo(6.49585f, 15.4351f, 6.69098f, 15f, 7f, 15f)
        curveTo(7.30902f, 15f, 7.50415f, 15.4351f, 7.89443f, 16.3053f)
        lineTo(10f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 20f)
        verticalLineTo(3.99999f)
        moveTo(17.5f, 20f)
        curveTo(16.7998f, 20f, 15.4915f, 18.0057f, 15f, 17.5f)
        moveTo(17.5f, 20f)
        curveTo(18.2002f, 20f, 19.5085f, 18.0057f, 20f, 17.5f)
        }
        }.build()

        return _sortingZA01!!
    }

private var _sortingZA01: ImageVector? = null
