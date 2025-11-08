package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChatBlocked: ImageVector
    get() {
        if (_chatBlocked != null) {
            return _chatBlocked!!
        }
        _chatBlocked = ImageVector.Builder(
            name = "ChatBlocked",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.64014f, 2.64016f)
        curveTo(6.98163f, 2.62133f, 7.35218f, 2.60547f, 7.75617f, 2.58819f)
        curveTo(9.09514f, 2.5309f, 10.5209f, 2.5f, 12f, 2.5f)
        curveTo(13.4791f, 2.5f, 14.9048f, 2.5309f, 16.2438f, 2.58819f)
        curveTo(18.6843f, 2.6926f, 19.9045f, 2.74481f, 20.8699f, 3.71745f)
        curveTo(21.8353f, 4.69009f, 21.8772f, 5.87683f, 21.9609f, 8.2503f)
        curveTo(21.9865f, 8.97679f, 22f, 9.72921f, 22f, 10.5f)
        curveTo(22f, 11.2708f, 21.9865f, 12.0232f, 21.9609f, 12.7497f)
        curveTo(21.8832f, 14.9504f, 21.8416f, 16.1309f, 21.0664f, 17.0664f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.13007f, 3.71875f)
        curveTo(2.16469f, 4.69139f, 2.12282f, 5.87813f, 2.03909f, 8.2516f)
        curveTo(2.01346f, 8.97809f, 2f, 9.73051f, 2f, 10.5013f)
        curveTo(2f, 11.2721f, 2.01346f, 12.0245f, 2.03909f, 12.751f)
        curveTo(2.12282f, 15.1245f, 2.16469f, 16.3112f, 3.13007f, 17.2838f)
        curveTo(4.09545f, 18.2565f, 5.31569f, 18.3087f, 7.75619f, 18.4131f)
        curveTo(7.83715f, 18.4166f, 7.91842f, 18.4199f, 8f, 18.4232f)
        verticalLineTo(20.7714f)
        curveTo(8f, 21.1745f, 8.32679f, 21.5013f, 8.72991f, 21.5013f)
        curveTo(8.90419f, 21.5013f, 9.07273f, 21.4389f, 9.20503f, 21.3255f)
        lineTo(11.3845f, 19.4566f)
        curveTo(11.9325f, 18.9868f, 12.2064f, 18.7519f, 12.532f, 18.6279f)
        curveTo(12.8576f, 18.5039f, 13.2282f, 18.4968f, 13.9693f, 18.4828f)
        curveTo(14.7498f, 18.468f, 15.5098f, 18.4445f, 16.2437f, 18.4131f)
        curveTo(17.0714f, 18.3777f, 17.7587f, 18.3483f, 18.3433f, 18.287f)
        }
        }.build()

        return _chatBlocked!!
    }

private var _chatBlocked: ImageVector? = null
