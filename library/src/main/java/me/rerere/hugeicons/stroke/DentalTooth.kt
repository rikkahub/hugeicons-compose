package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DentalTooth: ImageVector
    get() {
        if (_dentalTooth != null) {
            return _dentalTooth!!
        }
        _dentalTooth = ImageVector.Builder(
            name = "DentalTooth",
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
        moveTo(9f, 6f)
        curveTo(9.5f, 6.5f, 10.5033f, 6.41228f, 12f, 5.17632f)
        moveTo(12f, 5.17632f)
        curveTo(11.7786f, 4.99352f, 11.5486f, 4.78582f, 11.311f, 4.55032f)
        curveTo(9.0053f, 2.2656f, 5.86519f, 2.71292f, 4.39399f, 4.55032f)
        curveTo(3.37784f, 5.8194f, 0.777521f, 8.97857f, 7.14215f, 20.2396f)
        curveTo(7.40566f, 20.7058f, 7.9306f, 21f, 8.49601f, 21f)
        curveTo(9.398f, 21f, 10.103f, 20.2801f, 10.1323f, 19.4399f)
        curveTo(10.1945f, 17.6579f, 10.5397f, 15.6035f, 12f, 15.6035f)
        curveTo(13.4603f, 15.6035f, 13.8055f, 17.6579f, 13.8677f, 19.4399f)
        curveTo(13.897f, 20.2801f, 14.602f, 21f, 15.504f, 21f)
        curveTo(16.0694f, 21f, 16.5943f, 20.7058f, 16.8578f, 20.2396f)
        curveTo(23.2225f, 8.97857f, 20.6222f, 5.8194f, 19.606f, 4.55032f)
        curveTo(18.1348f, 2.71292f, 14.9947f, 2.2656f, 12.689f, 4.55032f)
        curveTo(12.4514f, 4.78582f, 12.2214f, 4.99352f, 12f, 5.17632f)
        }
        }.build()

        return _dentalTooth!!
    }

private var _dentalTooth: ImageVector? = null
