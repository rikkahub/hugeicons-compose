package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowDiagonal02: ImageVector
    get() {
        if (_circleArrowDiagonal02 != null) {
            return _circleArrowDiagonal02!!
        }
        _circleArrowDiagonal02 = ImageVector.Builder(
            name = "CircleArrowDiagonal02",
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
        moveTo(15.758f, 15.758f)
        lineTo(8.24202f, 8.24202f)
        moveTo(15.758f, 15.758f)
        curveTo(15.3369f, 16.179f, 13.5011f, 15.9164f, 12.9395f, 15.9459f)
        moveTo(15.758f, 15.758f)
        curveTo(16.179f, 15.3369f, 15.9164f, 13.5011f, 15.9459f, 12.9395f)
        moveTo(8.24202f, 8.24202f)
        curveTo(7.82099f, 8.66305f, 8.08361f, 10.4989f, 8.05413f, 11.0605f)
        moveTo(8.24202f, 8.24202f)
        curveTo(8.66305f, 7.82099f, 10.4989f, 8.08361f, 11.0605f, 8.05412f)
        }
        }.build()

        return _circleArrowDiagonal02!!
    }

private var _circleArrowDiagonal02: ImageVector? = null
