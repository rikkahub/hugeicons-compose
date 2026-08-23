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

val HugeIcons.PanelBottomClose: ImageVector
    get() {
        if (_panelBottomClose != null) {
            return _panelBottomClose!!
        }
        _panelBottomClose = ImageVector.Builder(
            name = "PanelBottomClose",
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
            moveTo(3.5f, 16f)
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
            moveTo(9f, 8.5f)
            curveTo(9f, 8.5f, 11.2095f, 11.5f, 12f, 11.5f)
            curveTo(12.7906f, 11.5f, 15f, 8.49998f, 15f, 8.49998f)
        }
        }.build()

        return _panelBottomClose!!
    }

private var _panelBottomClose: ImageVector? = null
