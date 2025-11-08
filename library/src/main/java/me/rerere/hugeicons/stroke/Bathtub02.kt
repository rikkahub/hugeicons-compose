package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bathtub02: ImageVector
    get() {
        if (_bathtub02 != null) {
            return _bathtub02!!
        }
        _bathtub02 = ImageVector.Builder(
            name = "Bathtub02",
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
        moveTo(22f, 12f)
        horizontalLineTo(15f)
        curveTo(14.3509f, 12f, 13.7193f, 11.7895f, 13.2f, 11.4f)
        lineTo(10.8f, 9.6f)
        curveTo(10.2807f, 9.21053f, 9.64911f, 9f, 9f, 9f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        verticalLineTo(11f)
        curveTo(3f, 14.7712f, 3f, 16.6569f, 4.17157f, 17.8284f)
        curveTo(5.34315f, 19f, 7.22876f, 19f, 11f, 19f)
        horizontalLineTo(14f)
        curveTo(16.8089f, 19f, 18.2134f, 19f, 19.2223f, 18.3259f)
        curveTo(19.659f, 18.034f, 20.034f, 17.659f, 20.3259f, 17.2223f)
        curveTo(21f, 16.2134f, 21f, 14.8089f, 21f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19f)
        verticalLineTo(21f)
        moveTo(6f, 19f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 9f)
        verticalLineTo(4.5f)
        curveTo(5f, 3.67157f, 5.67157f, 3f, 6.5f, 3f)
        curveTo(7.32843f, 3f, 8f, 3.67157f, 8f, 4.5f)
        verticalLineTo(5f)
        }
        }.build()

        return _bathtub02!!
    }

private var _bathtub02: ImageVector? = null
