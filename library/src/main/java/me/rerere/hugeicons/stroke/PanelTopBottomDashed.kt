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

val HugeIcons.PanelTopBottomDashed: ImageVector
    get() {
        if (_panelTopBottomDashed != null) {
            return _panelTopBottomDashed!!
        }
        _panelTopBottomDashed = ImageVector.Builder(
            name = "PanelTopBottomDashed",
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
            moveTo(3.50003f, 9f)
            horizontalLineTo(4.99997f)
            moveTo(8.99997f, 9f)
            horizontalLineTo(9.99997f)
            moveTo(14f, 9f)
            horizontalLineTo(15f)
            moveTo(19f, 9f)
            horizontalLineTo(20.5f)
            moveTo(3.50003f, 15f)
            horizontalLineTo(4.99997f)
            moveTo(8.99997f, 15f)
            horizontalLineTo(9.99997f)
            moveTo(14f, 15f)
            horizontalLineTo(15f)
            moveTo(19f, 15f)
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
            moveTo(12f, 21f)
            horizontalLineTo(12f)
            horizontalLineTo(12f)
            curveTo(16.2427f, 21f, 18.364f, 21f, 19.682f, 19.682f)
            curveTo(21f, 18.364f, 21f, 16.2426f, 21f, 12f)
            verticalLineTo(12f)
            verticalLineTo(12f)
            curveTo(21f, 7.75735f, 21f, 5.63604f, 19.682f, 4.31802f)
            curveTo(18.364f, 3f, 16.2427f, 3f, 12f, 3f)
            curveTo(7.75739f, 3f, 5.63607f, 3f, 4.31805f, 4.31802f)
            curveTo(3.00003f, 5.63604f, 3.00003f, 7.75736f, 3.00003f, 12f)
            curveTo(3.00003f, 16.2426f, 3.00003f, 18.364f, 4.31805f, 19.682f)
            curveTo(5.63607f, 21f, 7.75738f, 21f, 12f, 21f)
            close()
        }
        }.build()

        return _panelTopBottomDashed!!
    }

private var _panelTopBottomDashed: ImageVector? = null
