package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coupon01: ImageVector
    get() {
        if (_coupon01 != null) {
            return _coupon01!!
        }
        _coupon01 = ImageVector.Builder(
            name = "Coupon01",
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
        moveTo(10.8738f, 21.5123f)
        lineTo(8.84345f, 20.3072f)
        curveTo(8.32816f, 20.0014f, 8.07051f, 19.8484f, 7.78457f, 19.8396f)
        curveTo(7.47557f, 19.83f, 7.21336f, 19.9767f, 6.65655f, 20.3072f)
        curveTo(6.03294f, 20.6774f, 4.79293f, 21.697f, 3.99083f, 21.2108f)
        curveTo(3.5f, 20.9132f, 3.5f, 20.1574f, 3.5f, 18.6457f)
        verticalLineTo(8f)
        curveTo(3.5f, 5.17157f, 3.5f, 3.75736f, 4.37868f, 2.87868f)
        curveTo(5.25736f, 2f, 6.67157f, 2f, 9.5f, 2f)
        horizontalLineTo(14.5f)
        curveTo(17.3284f, 2f, 18.7426f, 2f, 19.6213f, 2.87868f)
        curveTo(20.5f, 3.75736f, 20.5f, 5.17157f, 20.5f, 8f)
        verticalLineTo(18.6457f)
        curveTo(20.5f, 20.1574f, 20.5f, 20.9132f, 20.0092f, 21.2108f)
        curveTo(19.2071f, 21.697f, 17.9671f, 20.6774f, 17.3434f, 20.3072f)
        curveTo(16.8282f, 20.0014f, 16.5705f, 19.8484f, 16.2846f, 19.8396f)
        curveTo(15.9756f, 19.83f, 15.7134f, 19.9767f, 15.1566f, 20.3072f)
        lineTo(13.1262f, 21.5123f)
        curveTo(12.5786f, 21.8374f, 12.3047f, 21.9999f, 12f, 21.9999f)
        curveTo(11.6953f, 21.9999f, 11.4214f, 21.8374f, 10.8738f, 21.5123f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8f)
        lineTo(9f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        horizontalLineTo(14.991f)
        moveTo(9.00897f, 8f)
        horizontalLineTo(9f)
        }
        }.build()

        return _coupon01!!
    }

private var _coupon01: ImageVector? = null
