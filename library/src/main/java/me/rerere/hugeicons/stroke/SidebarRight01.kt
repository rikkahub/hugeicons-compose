package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SidebarRight01: ImageVector
    get() {
        if (_sidebarRight01 != null) {
            return _sidebarRight01!!
        }
        _sidebarRight01 = ImageVector.Builder(
            name = "SidebarRight01",
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
        curveTo(22f, 8.25027f, 22f, 6.3754f, 21.0451f, 5.06107f)
        curveTo(20.7367f, 4.6366f, 20.3634f, 4.26331f, 19.9389f, 3.95491f)
        curveTo(18.6246f, 3f, 16.7497f, 3f, 13f, 3f)
        horizontalLineTo(11f)
        curveTo(7.25027f, 3f, 5.3754f, 3f, 4.06107f, 3.95491f)
        curveTo(3.6366f, 4.26331f, 3.26331f, 4.6366f, 2.95491f, 5.06107f)
        curveTo(2f, 6.3754f, 2f, 8.25027f, 2f, 12f)
        curveTo(2f, 15.7497f, 2f, 17.6246f, 2.95491f, 18.9389f)
        curveTo(3.26331f, 19.3634f, 3.6366f, 19.7367f, 4.06107f, 20.0451f)
        curveTo(5.3754f, 21f, 7.25027f, 21f, 11f, 21f)
        horizontalLineTo(13f)
        curveTo(16.7497f, 21f, 18.6246f, 21f, 19.9389f, 20.0451f)
        curveTo(20.3634f, 19.7367f, 20.7367f, 19.3634f, 21.0451f, 18.9389f)
        curveTo(22f, 17.6246f, 22f, 15.7497f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 3.5f)
        lineTo(14.5f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 7f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        lineTo(9.22654f, 11.0572f)
        curveTo(9.74218f, 11.5016f, 10f, 11.7239f, 10f, 12f)
        curveTo(10f, 12.2761f, 9.74218f, 12.4984f, 9.22654f, 12.9428f)
        lineTo(8f, 14f)
        }
        }.build()

        return _sidebarRight01!!
    }

private var _sidebarRight01: ImageVector? = null
