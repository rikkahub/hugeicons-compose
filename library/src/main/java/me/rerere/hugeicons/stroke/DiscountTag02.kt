package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DiscountTag02: ImageVector
    get() {
        if (_discountTag02 != null) {
            return _discountTag02!!
        }
        _discountTag02 = ImageVector.Builder(
            name = "DiscountTag02",
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
        moveTo(10.9961f, 10f)
        horizontalLineTo(11.0111f)
        moveTo(10.9998f, 16f)
        horizontalLineTo(11.0148f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 13f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.77423f, 11.1439f)
        curveTo(1.77108f, 12.2643f, 1.7495f, 13.9546f, 2.67016f, 15.1437f)
        curveTo(4.49711f, 17.5033f, 6.49674f, 19.5029f, 8.85633f, 21.3298f)
        curveTo(10.0454f, 22.2505f, 11.7357f, 22.2289f, 12.8561f, 21.2258f)
        curveTo(15.8979f, 18.5022f, 18.6835f, 15.6559f, 21.3719f, 12.5279f)
        curveTo(21.6377f, 12.2187f, 21.8039f, 11.8397f, 21.8412f, 11.4336f)
        curveTo(22.0062f, 9.63798f, 22.3452f, 4.46467f, 20.9403f, 3.05974f)
        curveTo(19.5353f, 1.65481f, 14.362f, 1.99377f, 12.5664f, 2.15876f)
        curveTo(12.1603f, 2.19608f, 11.7813f, 2.36233f, 11.472f, 2.62811f)
        curveTo(8.34412f, 5.31646f, 5.49781f, 8.10211f, 2.77423f, 11.1439f)
        }
        }.build()

        return _discountTag02!!
    }

private var _discountTag02: ImageVector? = null
