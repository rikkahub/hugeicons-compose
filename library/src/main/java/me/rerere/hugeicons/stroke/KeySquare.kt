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

val HugeIcons.KeySquare: ImageVector
    get() {
        if (_keySquare != null) {
            return _keySquare!!
        }
        _keySquare = ImageVector.Builder(
            name = "KeySquare",
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
            moveTo(13.2124f, 14.2847f)
            lineTo(9.80113f, 17.7174f)
            horizontalLineTo(7.77746f)
            verticalLineTo(19.7538f)
            horizontalLineTo(5.75379f)
            verticalLineTo(21.7901f)
            horizontalLineTo(2.21237f)
            verticalLineTo(19.9071f)
            curveTo(2.21237f, 19.0782f, 2.21237f, 18.6637f, 2.36852f, 18.2921f)
            curveTo(2.52467f, 17.9204f, 2.82077f, 17.6303f, 3.41297f, 17.05f)
            lineTo(9.21237f, 11.3671f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(18.9972f, 5.26071f)
            curveTo(18.7789f, 5.04288f, 18.5606f, 4.82505f, 18.3435f, 4.60847f)
            curveTo(16.916f, 3.18405f, 16.2022f, 2.47184f, 15.3534f, 2.28211f)
            curveTo(14.924f, 2.18613f, 14.4792f, 2.18575f, 14.0496f, 2.28097f)
            curveTo(13.2004f, 2.46923f, 12.4856f, 3.18005f, 11.0559f, 4.60168f)
            curveTo(9.61818f, 6.03125f, 8.89934f, 6.74603f, 8.70747f, 7.59848f)
            curveTo(8.61047f, 8.02944f, 8.60984f, 8.47651f, 8.70562f, 8.90775f)
            curveTo(8.89509f, 9.76074f, 9.61191f, 10.4775f, 11.0456f, 11.9112f)
            lineTo(12.0815f, 12.9471f)
            curveTo(13.5177f, 14.3833f, 14.2359f, 15.1014f, 15.0904f, 15.2904f)
            curveTo(15.5208f, 15.3856f, 15.9668f, 15.3848f, 16.3967f, 15.288f)
            curveTo(17.2506f, 15.0959f, 17.9661f, 14.3752f, 19.3971f, 12.9338f)
            curveTo(20.8195f, 11.501f, 21.5308f, 10.7846f, 21.7178f, 9.93331f)
            curveTo(21.812f, 9.50466f, 21.8109f, 9.06025f, 21.7147f, 8.63205f)
            curveTo(21.5237f, 7.78161f, 20.8092f, 7.06873f, 19.3803f, 5.64298f)
            curveTo(19.2528f, 5.51573f, 19.125f, 5.38822f, 18.9972f, 5.26071f)
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
            moveTo(15.2124f, 5.79016f)
            lineTo(18.2124f, 8.79016f)
        }
        }.build()

        return _keySquare!!
    }

private var _keySquare: ImageVector? = null
