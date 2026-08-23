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

val HugeIcons.AppWindow: ImageVector
    get() {
        if (_appWindow != null) {
            return _appWindow!!
        }
        _appWindow = ImageVector.Builder(
            name = "AppWindow",
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
            moveTo(3.49609f, 9f)
            lineTo(20.4961f, 9f)
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
            moveTo(18.25f, 5.8125f)
            verticalLineTo(6f)
            moveTo(18.5f, 6f)
            curveTo(18.5f, 6.13807f, 18.3881f, 6.25f, 18.25f, 6.25f)
            curveTo(18.1119f, 6.25f, 18f, 6.13807f, 18f, 6f)
            curveTo(18f, 5.86193f, 18.1119f, 5.75f, 18.25f, 5.75f)
            curveTo(18.3881f, 5.75f, 18.5f, 5.86193f, 18.5f, 6f)
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
            moveTo(15.25f, 5.8125f)
            verticalLineTo(6f)
            moveTo(15.5f, 6f)
            curveTo(15.5f, 6.13807f, 15.3881f, 6.25f, 15.25f, 6.25f)
            curveTo(15.1119f, 6.25f, 15f, 6.13807f, 15f, 6f)
            curveTo(15f, 5.86193f, 15.1119f, 5.75f, 15.25f, 5.75f)
            curveTo(15.3881f, 5.75f, 15.5f, 5.86193f, 15.5f, 6f)
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
            moveTo(12.25f, 5.8125f)
            verticalLineTo(6f)
            moveTo(12.5f, 6f)
            curveTo(12.5f, 6.13807f, 12.3881f, 6.25f, 12.25f, 6.25f)
            curveTo(12.1119f, 6.25f, 12f, 6.13807f, 12f, 6f)
            curveTo(12f, 5.86193f, 12.1119f, 5.75f, 12.25f, 5.75f)
            curveTo(12.3881f, 5.75f, 12.5f, 5.86193f, 12.5f, 6f)
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
            moveTo(3f, 12f)
            curveTo(3f, 7.75736f, 3f, 5.63604f, 4.31802f, 4.31802f)
            curveTo(5.63604f, 3f, 7.75736f, 3f, 12f, 3f)
            curveTo(16.2426f, 3f, 18.364f, 3f, 19.682f, 4.31802f)
            curveTo(21f, 5.63604f, 21f, 7.75736f, 21f, 12f)
            curveTo(21f, 16.2426f, 21f, 18.364f, 19.682f, 19.682f)
            curveTo(18.364f, 21f, 16.2426f, 21f, 12f, 21f)
            curveTo(7.75736f, 21f, 5.63604f, 21f, 4.31802f, 19.682f)
            curveTo(3f, 18.364f, 3f, 16.2426f, 3f, 12f)
            close()
        }
        }.build()

        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
