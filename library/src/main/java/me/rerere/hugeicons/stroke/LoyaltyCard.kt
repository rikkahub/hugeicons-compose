package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoyaltyCard: ImageVector
    get() {
        if (_loyaltyCard != null) {
            return _loyaltyCard!!
        }
        _loyaltyCard = ImageVector.Builder(
            name = "LoyaltyCard",
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
        moveTo(2f, 12f)
        curveTo(2f, 7.99306f, 2f, 5.98959f, 3.17157f, 4.7448f)
        curveTo(4.34315f, 3.5f, 6.22876f, 3.5f, 10f, 3.5f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 3.5f, 19.6569f, 3.5f, 20.8284f, 4.7448f)
        curveTo(22f, 5.98959f, 22f, 7.99306f, 22f, 12f)
        curveTo(22f, 16.0069f, 22f, 18.0104f, 20.8284f, 19.2552f)
        curveTo(19.6569f, 20.5f, 17.7712f, 20.5f, 14f, 20.5f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 20.5f, 4.34315f, 20.5f, 3.17157f, 19.2552f)
        curveTo(2f, 18.0104f, 2f, 16.0069f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.8881f, 10.8314f)
        curveTo(7.82668f, 10.2831f, 8.64587f, 10.504f, 9.13798f, 10.856f)
        curveTo(9.33975f, 11.0003f, 9.44064f, 11.0725f, 9.5f, 11.0725f)
        curveTo(9.55936f, 11.0725f, 9.66025f, 11.0003f, 9.86202f, 10.856f)
        curveTo(10.3541f, 10.504f, 11.1733f, 10.2831f, 12.1119f, 10.8314f)
        curveTo(13.3437f, 11.551f, 13.6224f, 13.925f, 10.7812f, 15.9278f)
        curveTo(10.24f, 16.3093f, 9.96942f, 16.5f, 9.5f, 16.5f)
        curveTo(9.03058f, 16.5f, 8.76f, 16.3093f, 8.21884f, 15.9278f)
        curveTo(5.3776f, 13.925f, 5.65632f, 11.551f, 6.8881f, 10.8314f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16.5f)
        horizontalLineTo(15f)
        }
        }.build()

        return _loyaltyCard!!
    }

private var _loyaltyCard: ImageVector? = null
