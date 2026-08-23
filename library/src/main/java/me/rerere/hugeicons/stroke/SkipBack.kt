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

val HugeIcons.SkipBack: ImageVector
    get() {
        if (_skipBack != null) {
            return _skipBack!!
        }
        _skipBack = ImageVector.Builder(
            name = "SkipBack",
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
            moveTo(8.0571f, 12.6258f)
            curveTo(8.31149f, 13.8374f, 9.66514f, 14.7077f, 12.3724f, 16.4481f)
            curveTo(15.3169f, 18.3411f, 16.7892f, 19.2876f, 17.9817f, 18.9229f)
            curveTo(18.3856f, 18.7994f, 18.7576f, 18.5823f, 19.0699f, 18.2876f)
            curveTo(19.9922f, 17.4178f, 19.9922f, 15.6118f, 19.9922f, 12f)
            curveTo(19.9922f, 8.38816f, 19.9922f, 6.58224f, 19.0699f, 5.71235f)
            curveTo(18.7576f, 5.41773f, 18.3856f, 5.20057f, 17.9817f, 5.07707f)
            curveTo(16.7892f, 4.71243f, 15.3169f, 5.6589f, 12.3724f, 7.55186f)
            curveTo(9.66514f, 9.29233f, 8.31149f, 10.1626f, 8.0571f, 11.3742f)
            curveTo(7.97055f, 11.7865f, 7.97055f, 12.2135f, 8.0571f, 12.6258f)
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
            moveTo(3.99219f, 4f)
            lineTo(3.99219f, 20f)
        }
        }.build()

        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
