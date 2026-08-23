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

val HugeIcons.StepBack: ImageVector
    get() {
        if (_stepBack != null) {
            return _stepBack!!
        }
        _stepBack = ImageVector.Builder(
            name = "StepBack",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.0571f, 12.6258f)
            curveTo(4.31149f, 13.8374f, 5.66514f, 14.7077f, 8.37243f, 16.4481f)
            curveTo(11.3169f, 18.3411f, 12.7892f, 19.2876f, 13.9817f, 18.9229f)
            curveTo(14.3856f, 18.7994f, 14.7576f, 18.5823f, 15.0699f, 18.2876f)
            curveTo(15.9922f, 17.4178f, 15.9922f, 15.6118f, 15.9922f, 12f)
            curveTo(15.9922f, 8.38816f, 15.9922f, 6.58224f, 15.0699f, 5.71235f)
            curveTo(14.7576f, 5.41773f, 14.3856f, 5.20057f, 13.9817f, 5.07707f)
            curveTo(12.7892f, 4.71243f, 11.3169f, 5.6589f, 8.37243f, 7.55186f)
            curveTo(5.66514f, 9.29233f, 4.31149f, 10.1626f, 4.0571f, 11.3742f)
            curveTo(3.97055f, 11.7865f, 3.97055f, 12.2135f, 4.0571f, 12.6258f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9922f, 5f)
            verticalLineTo(19f)
        }
        }.build()

        return _stepBack!!
    }

private var _stepBack: ImageVector? = null
