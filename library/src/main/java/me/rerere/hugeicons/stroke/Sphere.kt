package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = ImageVector.Builder(
            name = "Sphere",
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
        moveTo(12f, 10.5f)
        curveTo(11.1716f, 10.5f, 10.5f, 11.1716f, 10.5f, 12f)
        curveTo(10.5f, 12.8284f, 11.1716f, 13.5f, 12f, 13.5f)
        curveTo(12.8284f, 13.5f, 13.5f, 12.8284f, 13.5f, 12f)
        curveTo(13.5f, 11.1716f, 12.8284f, 10.5f, 12f, 10.5f)
        moveTo(12f, 10.5f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8f)
        curveTo(19.0571f, 8.52165f, 22f, 10.0733f, 22f, 11.9063f)
        curveTo(22f, 14.1672f, 17.5228f, 16f, 12f, 16f)
        curveTo(6.47715f, 16f, 2f, 14.1672f, 2f, 11.9063f)
        curveTo(2f, 10.0733f, 4.94289f, 8.52165f, 9f, 8f)
        }
        }.build()

        return _sphere!!
    }

private var _sphere: ImageVector? = null
