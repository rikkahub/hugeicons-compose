package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Security: ImageVector
    get() {
        if (_security != null) {
            return _security!!
        }
        _security = ImageVector.Builder(
            name = "Security",
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
        moveTo(18.7088f, 3.49546f)
        curveTo(16.8165f, 2.55394f, 14.5009f, 2.00012f, 12f, 2.00012f)
        curveTo(9.4991f, 2.00012f, 7.1835f, 2.55394f, 5.29116f, 3.49547f)
        curveTo(4.36318f, 3.95718f, 3.89919f, 4.18804f, 3.4496f, 4.91391f)
        curveTo(3f, 5.63978f, 3f, 6.3426f, 3f, 7.74826f)
        verticalLineTo(11.2372f)
        curveTo(3f, 16.9206f, 7.54236f, 20.0805f, 10.173f, 21.4339f)
        curveTo(10.9067f, 21.8114f, 11.2735f, 22.0001f, 12f, 22.0001f)
        curveTo(12.7265f, 22.0001f, 13.0933f, 21.8114f, 13.8269f, 21.4339f)
        curveTo(16.4576f, 20.0805f, 21f, 16.9206f, 21f, 11.2372f)
        lineTo(21f, 7.74827f)
        curveTo(21f, 6.34261f, 21f, 5.63978f, 20.5504f, 4.91391f)
        curveTo(20.1008f, 4.18804f, 19.6368f, 3.95718f, 18.7088f, 3.49546f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9.00012f)
        verticalLineTo(10.0001f)
        moveTo(11f, 9.50012f)
        curveTo(11f, 9.76534f, 11.1054f, 10.0197f, 11.2929f, 10.2072f)
        curveTo(11.4804f, 10.3948f, 11.7348f, 10.5001f, 12f, 10.5001f)
        curveTo(12.2652f, 10.5001f, 12.5196f, 10.3948f, 12.7071f, 10.2072f)
        curveTo(12.8946f, 10.0197f, 13f, 9.76534f, 13f, 9.50012f)
        curveTo(13f, 9.23491f, 12.8946f, 8.98055f, 12.7071f, 8.79302f)
        curveTo(12.5196f, 8.60548f, 12.2652f, 8.50012f, 12f, 8.50012f)
        curveTo(11.7348f, 8.50012f, 11.4804f, 8.60548f, 11.2929f, 8.79302f)
        curveTo(11.1054f, 8.98055f, 11f, 9.23491f, 11f, 9.50012f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.75f, 14.0001f)
        horizontalLineTo(11.25f)
        lineTo(12f, 10.5001f)
        lineTo(12.75f, 14.0001f)
        }
        }.build()

        return _security!!
    }

private var _security: ImageVector? = null
