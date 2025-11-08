package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Locker: ImageVector
    get() {
        if (_locker != null) {
            return _locker!!
        }
        _locker = ImageVector.Builder(
            name = "Locker",
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
        moveTo(2f, 11f)
        curveTo(2f, 6.75736f, 2f, 4.63604f, 3.17157f, 3.31802f)
        curveTo(4.34315f, 2f, 6.22876f, 2f, 10f, 2f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 2f, 19.6569f, 2f, 20.8284f, 3.31802f)
        curveTo(22f, 4.63604f, 22f, 6.75736f, 22f, 11f)
        curveTo(22f, 15.2426f, 22f, 17.364f, 20.8284f, 18.682f)
        curveTo(19.6569f, 20f, 17.7712f, 20f, 14f, 20f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 20f, 4.34315f, 20f, 3.17157f, 18.682f)
        curveTo(2f, 17.364f, 2f, 15.2426f, 2f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 20f)
        verticalLineTo(22f)
        moveTo(18f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 13f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(22f)
        }
        }.build()

        return _locker!!
    }

private var _locker: ImageVector? = null
