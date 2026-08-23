package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DashboardBrowsing: ImageVector
    get() {
        if (_dashboardBrowsing != null) {
            return _dashboardBrowsing!!
        }
        _dashboardBrowsing = ImageVector.Builder(
            name = "DashboardBrowsing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 12f)
            curveTo(3f, 7.75737f, 3f, 5.63605f, 4.31802f, 4.31803f)
            curveTo(5.63604f, 3.00002f, 7.75736f, 3.00002f, 12f, 3.00002f)
            curveTo(16.2426f, 3.00002f, 18.364f, 3.00002f, 19.682f, 4.31803f)
            curveTo(21f, 5.63605f, 21f, 7.75737f, 21f, 12f)
            curveTo(21f, 16.2427f, 21f, 18.364f, 19.682f, 19.682f)
            curveTo(18.364f, 21f, 16.2426f, 21f, 12f, 21f)
            curveTo(7.75736f, 21f, 5.63604f, 21f, 4.31802f, 19.682f)
            curveTo(3f, 18.364f, 3f, 16.2427f, 3f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3.5f, 8.00002f)
            horizontalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 17f)
            curveTo(17f, 14.2386f, 14.7614f, 12f, 12f, 12f)
            curveTo(9.23858f, 12f, 7f, 14.2386f, 7f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.707f, 15.293f)
            lineTo(11.2928f, 16.7072f)
        }
        }.build()

        return _dashboardBrowsing!!
    }

private var _dashboardBrowsing: ImageVector? = null
