package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AspectRatio: ImageVector
    get() {
        if (_aspectRatio != null) {
            return _aspectRatio!!
        }
        _aspectRatio = ImageVector.Builder(
            name = "AspectRatio",
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
        moveTo(2f, 12f)
        curveTo(2f, 7.75736f, 2f, 5.63604f, 3.17157f, 4.31802f)
        curveTo(4.34315f, 3f, 6.22876f, 3f, 10f, 3f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 3f, 19.6569f, 3f, 20.8284f, 4.31802f)
        curveTo(22f, 5.63604f, 22f, 7.75736f, 22f, 12f)
        curveTo(22f, 16.2426f, 22f, 18.364f, 20.8284f, 19.682f)
        curveTo(19.6569f, 21f, 17.7712f, 21f, 14f, 21f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 21f, 4.34315f, 21f, 3.17157f, 19.682f)
        curveTo(2f, 18.364f, 2f, 16.2426f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        horizontalLineTo(10f)
        curveTo(12.8284f, 9f, 14.2426f, 9f, 15.1213f, 9.87868f)
        curveTo(16f, 10.7574f, 16f, 12.1716f, 16f, 15f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 21f)
        lineTo(10f, 9f)
        }
        }.build()

        return _aspectRatio!!
    }

private var _aspectRatio: ImageVector? = null
