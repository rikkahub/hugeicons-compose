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

val HugeIcons.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = ImageVector.Builder(
            name = "Sparkle",
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
            moveTo(10.5279f, 7.13967f)
            curveTo(11.3077f, 5.71322f, 11.6977f, 5f, 11.9958f, 5f)
            curveTo(12.294f, 5f, 12.6839f, 5.71322f, 13.4638f, 7.13967f)
            curveTo(14.2665f, 8.60787f, 15.3392f, 9.69316f, 16.8489f, 10.52f)
            curveTo(18.2778f, 11.3026f, 18.9922f, 11.6938f, 18.9922f, 11.9923f)
            curveTo(18.9922f, 12.2908f, 18.2773f, 12.6825f, 16.8475f, 13.4658f)
            curveTo(15.3808f, 14.2693f, 14.2966f, 15.3432f, 13.4706f, 16.8545f)
            curveTo(12.6889f, 18.2848f, 12.298f, 19f, 11.9998f, 19f)
            curveTo(11.7017f, 19f, 11.3104f, 18.2844f, 10.5279f, 16.853f)
            curveTo(9.7252f, 15.3848f, 8.65247f, 14.2995f, 7.14272f, 13.4727f)
            curveTo(5.70903f, 12.6875f, 4.99219f, 12.2949f, 4.99219f, 11.9964f)
            curveTo(4.99219f, 11.6978f, 5.70903f, 11.3052f, 7.14272f, 10.52f)
            curveTo(8.65247f, 9.69316f, 9.7252f, 8.60787f, 10.5279f, 7.13967f)
            close()
        }
        }.build()

        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
