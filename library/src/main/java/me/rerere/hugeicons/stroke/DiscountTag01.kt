package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DiscountTag01: ImageVector
    get() {
        if (_discountTag01 != null) {
            return _discountTag01!!
        }
        _discountTag01 = ImageVector.Builder(
            name = "DiscountTag01",
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
        moveTo(7.72852f, 15.2861f)
        horizontalLineTo(12.7285f)
        moveTo(10.2271f, 12.7861f)
        horizontalLineTo(10.2364f)
        moveTo(10.2294f, 17.7861f)
        horizontalLineTo(10.2388f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 3.69682f)
        curveTo(9.53332f, 6.78172f, 14.5357f, 0.123719f, 17.4957f, 2.53998f)
        curveTo(19.1989f, 3.93028f, 18.6605f, 7f, 16.4494f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.664f, 6.57831f)
        curveTo(19.6473f, 6.75667f, 19.8679f, 7.34313f, 20.1615f, 8.97048f)
        curveTo(20.4259f, 10.4361f, 20.5f, 12.1949f, 20.5f, 12.9436f)
        curveTo(20.4731f, 13.2195f, 20.3532f, 13.477f, 20.1615f, 13.687f)
        curveTo(18.1054f, 15.722f, 14.0251f, 19.565f, 11.9657f, 21.474f)
        curveTo(11.1575f, 22.1555f, 9.93819f, 22.1702f, 9.08045f, 21.5447f)
        curveTo(7.32407f, 20.0526f, 5.63654f, 18.366f, 3.98343f, 16.8429f)
        curveTo(3.3193f, 16.035f, 3.33487f, 14.8866f, 4.0585f, 14.1255f)
        curveTo(6.23711f, 11.9909f, 10.1793f, 8.33731f, 12.4047f, 6.31887f)
        curveTo(12.6278f, 6.1383f, 12.9012f, 6.02536f, 13.1942f, 6f)
        curveTo(13.6935f, 5.99988f, 14.5501f, 6.06327f, 15.3845f, 6.10896f)
        }
        }.build()

        return _discountTag01!!
    }

private var _discountTag01: ImageVector? = null
