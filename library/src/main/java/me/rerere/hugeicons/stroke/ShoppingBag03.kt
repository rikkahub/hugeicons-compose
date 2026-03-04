package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShoppingBag03: ImageVector
    get() {
        if (_shoppingBag03 != null) {
            return _shoppingBag03!!
        }
        _shoppingBag03 = ImageVector.Builder(
            name = "ShoppingBag03",
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
        moveTo(7f, 6f)
        curveTo(7f, 7.65685f, 8.34315f, 9f, 10f, 9f)
        curveTo(11.6569f, 9f, 13f, 7.65685f, 13f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.1117f, 3f)
        horizontalLineTo(8.88824f)
        curveTo(6.2172f, 3f, 4.88168f, 3f, 4.01968f, 3.82064f)
        curveTo(3.15769f, 4.64128f, 3.08361f, 5.98325f, 2.93545f, 8.66719f)
        lineTo(2.60424f, 14.6672f)
        curveTo(2.44025f, 17.6379f, 2.35826f, 19.1233f, 3.2403f, 20.0616f)
        curveTo(4.12235f, 21f, 5.60058f, 21f, 8.55703f, 21f)
        horizontalLineTo(11.443f)
        curveTo(14.3994f, 21f, 15.8777f, 21f, 16.7597f, 20.0616f)
        curveTo(17.6417f, 19.1233f, 17.5597f, 17.6379f, 17.3957f, 14.6672f)
        lineTo(17.0645f, 8.66717f)
        curveTo(16.9163f, 5.98324f, 16.8423f, 4.64127f, 15.9803f, 3.82064f)
        curveTo(15.1183f, 3f, 13.7828f, 3f, 11.1117f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.8882f, 3f)
        horizontalLineTo(15.1117f)
        curveTo(17.7827f, 3f, 19.1182f, 3f, 19.9802f, 3.82064f)
        curveTo(20.8422f, 4.64127f, 20.9163f, 5.98324f, 21.0645f, 8.66717f)
        lineTo(21.3957f, 14.6672f)
        curveTo(21.5597f, 17.6379f, 21.6417f, 19.1233f, 20.7597f, 20.0616f)
        curveTo(19.8776f, 21f, 18.3994f, 21f, 15.4429f, 21f)
        horizontalLineTo(12.557f)
        }
        }.build()

        return _shoppingBag03!!
    }

private var _shoppingBag03: ImageVector? = null
