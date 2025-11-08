package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SidebarLeft01: ImageVector
    get() {
        if (_sidebarLeft01 != null) {
            return _sidebarLeft01!!
        }
        _sidebarLeft01 = ImageVector.Builder(
            name = "SidebarLeft01",
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
        curveTo(2f, 8.25027f, 2f, 6.3754f, 2.95491f, 5.06107f)
        curveTo(3.26331f, 4.6366f, 3.6366f, 4.26331f, 4.06107f, 3.95491f)
        curveTo(5.3754f, 3f, 7.25027f, 3f, 11f, 3f)
        horizontalLineTo(13f)
        curveTo(16.7497f, 3f, 18.6246f, 3f, 19.9389f, 3.95491f)
        curveTo(20.3634f, 4.26331f, 20.7367f, 4.6366f, 21.0451f, 5.06107f)
        curveTo(22f, 6.3754f, 22f, 8.25027f, 22f, 12f)
        curveTo(22f, 15.7497f, 22f, 17.6246f, 21.0451f, 18.9389f)
        curveTo(20.7367f, 19.3634f, 20.3634f, 19.7367f, 19.9389f, 20.0451f)
        curveTo(18.6246f, 21f, 16.7497f, 21f, 13f, 21f)
        horizontalLineTo(11f)
        curveTo(7.25027f, 21f, 5.3754f, 21f, 4.06107f, 20.0451f)
        curveTo(3.6366f, 19.7367f, 3.26331f, 19.3634f, 2.95491f, 18.9389f)
        curveTo(2f, 17.6246f, 2f, 15.7497f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 3.5f)
        lineTo(9.5f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 7f)
        curveTo(5f, 7f, 5.91421f, 7f, 6.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 11f)
        horizontalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 10f)
        lineTo(15.7735f, 11.0572f)
        curveTo(15.2578f, 11.5016f, 15f, 11.7239f, 15f, 12f)
        curveTo(15f, 12.2761f, 15.2578f, 12.4984f, 15.7735f, 12.9428f)
        lineTo(17f, 14f)
        }
        }.build()

        return _sidebarLeft01!!
    }

private var _sidebarLeft01: ImageVector? = null
