package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Astronaut02: ImageVector
    get() {
        if (_astronaut02 != null) {
            return _astronaut02!!
        }
        _astronaut02 = ImageVector.Builder(
            name = "Astronaut02",
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
        moveTo(5f, 13f)
        curveTo(3.34315f, 13f, 2f, 11.6569f, 2f, 10f)
        curveTo(2f, 8.34315f, 2f, 7f, 5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13f)
        curveTo(20.6569f, 13f, 22f, 11.6569f, 22f, 10f)
        curveTo(22f, 8.34315f, 22f, 7f, 19f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 7f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21f)
        curveTo(18.5523f, 21f, 19f, 20.5523f, 19f, 20f)
        curveTo(19f, 18.3431f, 17.6569f, 17f, 16f, 17f)
        horizontalLineTo(8f)
        curveTo(6.34315f, 17f, 5f, 18.3431f, 5f, 20f)
        curveTo(5f, 20.5523f, 5.44772f, 21f, 6f, 21f)
        horizontalLineTo(18f)
        }
        }.build()

        return _astronaut02!!
    }

private var _astronaut02: ImageVector? = null
