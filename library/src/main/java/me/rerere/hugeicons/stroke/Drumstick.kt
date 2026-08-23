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

val HugeIcons.Drumstick: ImageVector
    get() {
        if (_drumstick != null) {
            return _drumstick!!
        }
        _drumstick = ImageVector.Builder(
            name = "Drumstick",
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
            moveTo(7.62879f, 14.2156f)
            lineTo(6.17884f, 15.6655f)
            curveTo(5.91287f, 15.9315f, 5.77988f, 16.0645f, 5.64591f, 16.0982f)
            curveTo(5.51194f, 16.1318f, 5.21548f, 16.0425f, 4.62258f, 15.8637f)
            curveTo(3.92834f, 15.6544f, 3.14427f, 15.824f, 2.59565f, 16.3726f)
            curveTo(1.80145f, 17.1668f, 1.80145f, 18.4545f, 2.59565f, 19.2487f)
            curveTo(2.73887f, 19.3919f, 2.89812f, 19.5091f, 3.06762f, 19.6003f)
            curveTo(3.60058f, 19.8871f, 3.86708f, 20.0305f, 3.91902f, 20.0824f)
            curveTo(3.97096f, 20.1343f, 4.11436f, 20.4008f, 4.40116f, 20.9338f)
            curveTo(4.49237f, 21.1033f, 4.60949f, 21.2625f, 4.75271f, 21.4058f)
            curveTo(5.54692f, 22.2f, 6.83458f, 22.2f, 7.62879f, 21.4058f)
            curveTo(8.1774f, 20.8572f, 8.34705f, 20.0731f, 8.13773f, 19.3788f)
            curveTo(7.95897f, 18.7859f, 7.86958f, 18.4895f, 7.90326f, 18.3555f)
            curveTo(7.93694f, 18.2215f, 8.06993f, 18.0886f, 8.3359f, 17.8226f)
            lineTo(9.78585f, 16.3726f)
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
            moveTo(16.0612f, 14.2f)
            curveTo(14.9727f, 14.2287f, 13.8455f, 14.4693f, 13.0755f, 15.2393f)
            curveTo(12.7416f, 15.5976f, 12.5747f, 15.7768f, 12.4113f, 15.9026f)
            curveTo(11.5479f, 16.5673f, 10.3534f, 16.5962f, 9.45886f, 15.9741f)
            curveTo(9.2895f, 15.8564f, 9.11409f, 15.6855f, 8.76325f, 15.3437f)
            lineTo(8.70941f, 15.2913f)
            lineTo(8.64251f, 15.2227f)
            curveTo(8.313f, 14.8851f, 8.14825f, 14.7163f, 8.03389f, 14.5545f)
            curveTo(7.39361f, 13.6482f, 7.42736f, 12.4283f, 8.11678f, 11.5587f)
            curveTo(8.23991f, 11.4034f, 8.41374f, 11.244f, 8.76141f, 10.9252f)
            curveTo(9.53141f, 10.1552f, 9.77198f, 9.028f, 9.80065f, 7.93944f)
            curveTo(9.84035f, 6.43235f, 10.4353f, 4.93716f, 11.5855f, 3.78696f)
            curveTo(13.9681f, 1.40434f, 17.8311f, 1.40435f, 20.2137f, 3.78696f)
            curveTo(22.5963f, 6.16958f, 22.5963f, 10.0326f, 20.2137f, 12.4152f)
            curveTo(19.0635f, 13.5654f, 17.5683f, 14.1603f, 16.0612f, 14.2f)
            close()
        }
        }.build()

        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
