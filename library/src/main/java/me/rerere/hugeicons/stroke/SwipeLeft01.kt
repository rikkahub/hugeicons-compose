package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwipeLeft01: ImageVector
    get() {
        if (_swipeLeft01 != null) {
            return _swipeLeft01!!
        }
        _swipeLeft01 = ImageVector.Builder(
            name = "SwipeLeft01",
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
        moveTo(15.0039f, 4.49902f)
        horizontalLineTo(21.0029f)
        moveTo(15.0039f, 4.49902f)
        curveTo(15.0039f, 3.79906f, 16.9979f, 2.49134f, 17.5035f, 2f)
        moveTo(15.0039f, 4.49902f)
        curveTo(15.0039f, 5.19898f, 16.9979f, 6.5067f, 17.5035f, 6.99804f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8899f, 21.9882f)
        curveTo(16.8382f, 20.0749f, 16.9671f, 19.8446f, 17.1038f, 19.419f)
        curveTo(17.2405f, 18.9933f, 18.1967f, 17.4585f, 18.535f, 16.3619f)
        curveTo(19.6295f, 12.814f, 18.6094f, 12.0594f, 17.2493f, 11.0533f)
        curveTo(15.741f, 9.93751f, 12.8962f, 9.37244f, 11.4853f, 9.49477f)
        verticalLineTo(3.74357f)
        curveTo(11.4853f, 2.78062f, 10.7045f, 2f, 9.74133f, 2f)
        curveTo(8.77816f, 2f, 7.99736f, 2.78062f, 7.99736f, 3.74357f)
        verticalLineTo(14.0031f)
        lineTo(5.93753f, 11.8236f)
        curveTo(5.29802f, 11.1302f, 4.27027f, 11.0599f, 3.56885f, 11.6907f)
        curveTo(2.90415f, 12.2885f, 2.80714f, 13.2952f, 3.34548f, 14.0089f)
        lineTo(4.63762f, 15.7218f)
        moveTo(7.86803f, 22f)
        lineTo(7.8485f, 20.9496f)
        curveTo(7.89144f, 19.7183f, 6.99559f, 18.9149f, 5.8272f, 17.3087f)
        curveTo(5.74302f, 17.193f, 5.66111f, 17.0811f, 5.58135f, 16.9729f)
        moveTo(5.58135f, 16.9729f)
        curveTo(5.22735f, 16.4924f, 4.91587f, 16.0831f, 4.63762f, 15.7218f)
        moveTo(5.58135f, 16.9729f)
        lineTo(6.75058f, 18.5229f)
        moveTo(5.58135f, 16.9729f)
        lineTo(4.63762f, 15.7218f)
        moveTo(4.63762f, 15.7218f)
        curveTo(4.06634f, 14.9801f, 3.63509f, 14.441f, 3.26331f, 13.9055f)
        }
        }.build()

        return _swipeLeft01!!
    }

private var _swipeLeft01: ImageVector? = null
