package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Oven: ImageVector
    get() {
        if (_oven != null) {
            return _oven!!
        }
        _oven = ImageVector.Builder(
            name = "Oven",
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
        moveTo(6f, 5f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 5.00895f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8f)
        lineTo(21f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        verticalLineTo(5f)
        curveTo(3f, 2.518f, 3.518f, 2f, 6f, 2f)
        horizontalLineTo(18f)
        curveTo(20.482f, 2f, 21f, 2.518f, 21f, 5f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 17f)
        verticalLineTo(13f)
        curveTo(6f, 12.0572f, 6f, 11.5858f, 6.29289f, 11.2929f)
        curveTo(6.58579f, 11f, 7.05719f, 11f, 8f, 11f)
        horizontalLineTo(16f)
        curveTo(16.9428f, 11f, 17.4142f, 11f, 17.7071f, 11.2929f)
        curveTo(18f, 11.5858f, 18f, 12.0572f, 18f, 13f)
        verticalLineTo(17f)
        curveTo(18f, 17.9428f, 18f, 18.4142f, 17.7071f, 18.7071f)
        curveTo(17.4142f, 19f, 16.9428f, 19f, 16f, 19f)
        horizontalLineTo(8f)
        curveTo(7.05719f, 19f, 6.58579f, 19f, 6.29289f, 18.7071f)
        curveTo(6f, 18.4142f, 6f, 17.9428f, 6f, 17f)
        }
        }.build()

        return _oven!!
    }

private var _oven: ImageVector? = null
