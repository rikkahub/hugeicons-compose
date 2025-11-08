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
        moveTo(7.00003f, 6f)
        curveTo(7.00003f, 7.65685f, 8.34318f, 9f, 10f, 9f)
        curveTo(11.6569f, 9f, 13f, 7.65685f, 13f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.1118f, 3f)
        horizontalLineTo(8.88827f)
        curveTo(6.21723f, 3f, 4.88171f, 3f, 4.01971f, 3.82064f)
        curveTo(3.15772f, 4.64128f, 3.08364f, 5.98325f, 2.93548f, 8.66719f)
        lineTo(2.60427f, 14.6672f)
        curveTo(2.44028f, 17.6379f, 2.35829f, 19.1233f, 3.24033f, 20.0616f)
        curveTo(4.12238f, 21f, 5.60061f, 21f, 8.55706f, 21f)
        horizontalLineTo(11.443f)
        curveTo(14.3995f, 21f, 15.8777f, 21f, 16.7597f, 20.0616f)
        curveTo(17.6418f, 19.1233f, 17.5598f, 17.6379f, 17.3958f, 14.6672f)
        lineTo(17.0645f, 8.66717f)
        curveTo(16.9164f, 5.98324f, 16.8423f, 4.64127f, 15.9803f, 3.82064f)
        curveTo(15.1183f, 3f, 13.7828f, 3f, 11.1118f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.8883f, 3f)
        horizontalLineTo(15.1118f)
        curveTo(17.7828f, 3f, 19.1183f, 3f, 19.9803f, 3.82064f)
        curveTo(20.8423f, 4.64127f, 20.9164f, 5.98324f, 21.0645f, 8.66717f)
        lineTo(21.3958f, 14.6672f)
        curveTo(21.5598f, 17.6379f, 21.6418f, 19.1233f, 20.7597f, 20.0616f)
        curveTo(19.8777f, 21f, 18.3995f, 21f, 15.443f, 21f)
        horizontalLineTo(12.5571f)
        }
        }.build()

        return _shoppingBag03!!
    }

private var _shoppingBag03: ImageVector? = null
