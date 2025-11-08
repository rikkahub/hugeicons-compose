package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DiagonalScrollPoint02: ImageVector
    get() {
        if (_diagonalScrollPoint02 != null) {
            return _diagonalScrollPoint02!!
        }
        _diagonalScrollPoint02 = ImageVector.Builder(
            name = "DiagonalScrollPoint02",
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
        moveTo(14f, 12f)
        curveTo(14f, 13.1046f, 13.1046f, 14f, 12f, 14f)
        curveTo(10.8954f, 14f, 10f, 13.1046f, 10f, 12f)
        curveTo(10f, 10.8954f, 10.8954f, 10f, 12f, 10f)
        curveTo(13.1046f, 10f, 14f, 10.8954f, 14f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 4.11735f)
        curveTo(10f, 4.11735f, 5.24049f, 3.69033f, 4.46539f, 4.46542f)
        curveTo(3.6903f, 5.2405f, 4.11739f, 10f, 4.11739f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 19.8826f)
        curveTo(14f, 19.8826f, 18.7595f, 20.3097f, 19.5346f, 19.5346f)
        curveTo(20.3097f, 18.7595f, 19.8826f, 14f, 19.8826f, 14f)
        }
        }.build()

        return _diagonalScrollPoint02!!
    }

private var _diagonalScrollPoint02: ImageVector? = null
