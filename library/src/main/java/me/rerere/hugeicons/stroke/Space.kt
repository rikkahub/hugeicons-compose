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

val HugeIcons.Space: ImageVector
    get() {
        if (_space != null) {
            return _space!!
        }
        _space = ImageVector.Builder(
            name = "Space",
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
            moveTo(20.9922f, 10f)
            curveTo(20.9922f, 10.93f, 20.9922f, 11.395f, 20.89f, 11.7765f)
            curveTo(20.6126f, 12.8117f, 19.8039f, 13.6204f, 18.7686f, 13.8978f)
            curveTo(18.3871f, 14f, 17.9222f, 14f, 16.9922f, 14f)
            horizontalLineTo(6.99219f)
            curveTo(6.06222f, 14f, 5.59723f, 14f, 5.21573f, 13.8978f)
            curveTo(4.18045f, 13.6204f, 3.37181f, 12.8117f, 3.09441f, 11.7765f)
            curveTo(2.99219f, 11.395f, 2.99219f, 10.93f, 2.99219f, 10f)
        }
        }.build()

        return _space!!
    }

private var _space: ImageVector? = null
