package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fiverr: ImageVector
    get() {
        if (_fiverr != null) {
            return _fiverr!!
        }
        _fiverr = ImageVector.Builder(
            name = "Fiverr",
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
        moveTo(15.3517f, 3f)
        curveTo(15.3517f, 2.5286f, 15.3517f, 2.29289f, 15.2052f, 2.14645f)
        curveTo(15.0588f, 2f, 14.8231f, 2f, 14.3517f, 2f)
        horizontalLineTo(11.6173f)
        curveTo(8.89563f, 2f, 6.52177f, 4.50923f, 6.68066f, 8.5f)
        horizontalLineTo(5f)
        curveTo(4.5286f, 8.5f, 4.29289f, 8.5f, 4.14645f, 8.64645f)
        curveTo(4f, 8.79289f, 4f, 9.0286f, 4f, 9.5f)
        verticalLineTo(11f)
        curveTo(4f, 11.4714f, 4f, 11.7071f, 4.14645f, 11.8536f)
        curveTo(4.29289f, 12f, 4.5286f, 12f, 5f, 12f)
        horizontalLineTo(7f)
        verticalLineTo(21f)
        curveTo(7f, 21.4714f, 7f, 21.7071f, 7.14645f, 21.8536f)
        curveTo(7.29289f, 22f, 7.5286f, 22f, 8f, 22f)
        horizontalLineTo(10f)
        curveTo(10.4714f, 22f, 10.7071f, 22f, 10.8536f, 21.8536f)
        curveTo(11f, 21.7071f, 11f, 21.4714f, 11f, 21f)
        verticalLineTo(12f)
        horizontalLineTo(15.5306f)
        verticalLineTo(21f)
        curveTo(15.5306f, 21.4714f, 15.5306f, 21.7071f, 15.677f, 21.8536f)
        curveTo(15.8235f, 22f, 16.0592f, 22f, 16.5306f, 22f)
        horizontalLineTo(19f)
        curveTo(19.4714f, 22f, 19.7071f, 22f, 19.8536f, 21.8536f)
        curveTo(20f, 21.7071f, 20f, 21.4714f, 20f, 21f)
        verticalLineTo(10.5f)
        curveTo(20f, 9.55719f, 20f, 9.08579f, 19.7071f, 8.79289f)
        curveTo(19.4142f, 8.5f, 18.9428f, 8.5f, 18f, 8.5f)
        horizontalLineTo(11f)
        verticalLineTo(7.22923f)
        curveTo(11f, 6.5f, 11.5f, 5.5f, 12.797f, 5.5f)
        horizontalLineTo(14.3517f)
        curveTo(14.8231f, 5.5f, 15.0588f, 5.5f, 15.2052f, 5.35355f)
        curveTo(15.3517f, 5.20711f, 15.3517f, 4.9714f, 15.3517f, 4.5f)
        verticalLineTo(3f)
        }
        }.build()

        return _fiverr!!
    }

private var _fiverr: ImageVector? = null
