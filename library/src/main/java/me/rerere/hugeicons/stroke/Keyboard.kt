package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = ImageVector.Builder(
            name = "Keyboard",
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
        moveTo(14.5f, 7f)
        horizontalLineTo(9.5f)
        curveTo(6.21252f, 7f, 4.56878f, 7f, 3.46243f, 7.90796f)
        curveTo(3.25989f, 8.07418f, 3.07418f, 8.25989f, 2.90796f, 8.46243f)
        curveTo(2f, 9.56878f, 2f, 11.2125f, 2f, 14.5f)
        curveTo(2f, 17.7875f, 2f, 19.4312f, 2.90796f, 20.5376f)
        curveTo(3.07418f, 20.7401f, 3.25989f, 20.9258f, 3.46243f, 21.092f)
        curveTo(4.56878f, 22f, 6.21252f, 22f, 9.5f, 22f)
        horizontalLineTo(14.5f)
        curveTo(17.7875f, 22f, 19.4312f, 22f, 20.5376f, 21.092f)
        curveTo(20.7401f, 20.9258f, 20.9258f, 20.7401f, 21.092f, 20.5376f)
        curveTo(22f, 19.4312f, 22f, 17.7875f, 22f, 14.5f)
        curveTo(22f, 11.2125f, 22f, 9.56878f, 21.092f, 8.46243f)
        curveTo(20.9258f, 8.25989f, 20.7401f, 8.07418f, 20.5376f, 7.90796f)
        curveTo(19.4312f, 7f, 17.7875f, 7f, 14.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(5f)
        curveTo(12f, 4.44772f, 12.4477f, 4f, 13f, 4f)
        curveTo(13.5523f, 4f, 14f, 3.55228f, 14f, 3f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        lineTo(8f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 12f)
        lineTo(12.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        lineTo(17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17f)
        lineTo(17f, 17f)
        }
        }.build()

        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
