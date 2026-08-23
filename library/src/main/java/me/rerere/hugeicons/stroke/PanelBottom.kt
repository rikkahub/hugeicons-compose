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

val HugeIcons.PanelBottom: ImageVector
    get() {
        if (_panelBottom != null) {
            return _panelBottom!!
        }
        _panelBottom = ImageVector.Builder(
            name = "PanelBottom",
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
            moveTo(2.99219f, 15.0001f)
            horizontalLineTo(20.9922f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.49219f, 12.0001f)
            curveTo(2.49219f, 7.52178f, 2.49219f, 5.28261f, 3.88343f, 3.89136f)
            curveTo(5.27467f, 2.50012f, 7.51384f, 2.50012f, 11.9922f, 2.50012f)
            curveTo(16.4705f, 2.50012f, 18.7097f, 2.50012f, 20.1009f, 3.89136f)
            curveTo(21.4922f, 5.28261f, 21.4922f, 7.52178f, 21.4922f, 12.0001f)
            curveTo(21.4922f, 16.4785f, 21.4922f, 18.7176f, 20.1009f, 20.1089f)
            curveTo(18.7097f, 21.5001f, 16.4705f, 21.5001f, 11.9922f, 21.5001f)
            curveTo(7.51384f, 21.5001f, 5.27467f, 21.5001f, 3.88343f, 20.1089f)
            curveTo(2.49219f, 18.7176f, 2.49219f, 16.4785f, 2.49219f, 12.0001f)
            close()
        }
        }.build()

        return _panelBottom!!
    }

private var _panelBottom: ImageVector? = null
