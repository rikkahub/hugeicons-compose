package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = ImageVector.Builder(
            name = "Eraser",
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
        moveTo(8.73792f, 7.78021f)
        lineTo(4.84693f, 11.7574f)
        curveTo(3.67722f, 12.953f, 3.09236f, 13.5508f, 3.01263f, 14.2802f)
        curveTo(2.99579f, 14.4343f, 2.99579f, 14.5899f, 3.01263f, 14.744f)
        curveTo(3.09236f, 15.4733f, 3.67722f, 16.0711f, 4.84693f, 17.2668f)
        lineTo(4.99601f, 17.4191f)
        curveTo(5.62049f, 18.0575f, 5.93274f, 18.3766f, 6.30638f, 18.5911f)
        curveTo(6.5236f, 18.7157f, 6.75482f, 18.8134f, 6.99505f, 18.882f)
        curveTo(7.40827f, 19f, 7.85149f, 19f, 8.73792f, 19f)
        curveTo(9.62436f, 19f, 10.0676f, 19f, 10.4808f, 18.882f)
        curveTo(10.721f, 18.8134f, 10.9522f, 18.7157f, 11.1695f, 18.5911f)
        curveTo(11.5431f, 18.3766f, 11.8554f, 18.0575f, 12.4798f, 17.4191f)
        lineTo(15.3239f, 14.5121f)
        moveTo(8.73792f, 7.78021f)
        lineTo(12.3199f, 4.12313f)
        curveTo(13.7065f, 2.70754f, 14.3997f, 1.99974f, 15.2627f, 2f)
        curveTo(16.1256f, 2.00026f, 16.8185f, 2.70846f, 18.2042f, 4.12487f)
        lineTo(18.9473f, 4.8845f)
        curveTo(20.3159f, 6.28342f, 21.0002f, 6.98288f, 21f, 7.85008f)
        curveTo(20.9997f, 8.71728f, 20.315f, 9.41633f, 18.9456f, 10.8144f)
        lineTo(15.3239f, 14.5121f)
        moveTo(8.73792f, 7.78021f)
        lineTo(15.3239f, 14.5121f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 22f)
        lineTo(21f, 22f)
        }
        }.build()

        return _eraser!!
    }

private var _eraser: ImageVector? = null
