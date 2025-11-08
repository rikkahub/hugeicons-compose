package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiEraser: ImageVector
    get() {
        if (_aiEraser != null) {
            return _aiEraser!!
        }
        _aiEraser = ImageVector.Builder(
            name = "AiEraser",
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
        moveTo(9.73792f, 10.7802f)
        lineTo(5.84693f, 14.7574f)
        curveTo(4.67722f, 15.953f, 4.09236f, 16.5508f, 4.01263f, 17.2802f)
        curveTo(3.99579f, 17.4343f, 3.99579f, 17.5899f, 4.01263f, 17.744f)
        curveTo(4.09236f, 18.4733f, 4.67722f, 19.0711f, 5.84693f, 20.2668f)
        lineTo(5.99601f, 20.4191f)
        curveTo(6.62049f, 21.0575f, 6.93274f, 21.3766f, 7.30638f, 21.5911f)
        curveTo(7.5236f, 21.7157f, 7.75482f, 21.8134f, 7.99505f, 21.882f)
        curveTo(8.40827f, 22f, 8.85149f, 22f, 9.73792f, 22f)
        curveTo(10.6244f, 22f, 11.0676f, 22f, 11.4808f, 21.882f)
        curveTo(11.721f, 21.8134f, 11.9522f, 21.7157f, 12.1695f, 21.5911f)
        curveTo(12.5431f, 21.3766f, 12.8554f, 21.0575f, 13.4798f, 20.4191f)
        lineTo(16.3239f, 17.5121f)
        moveTo(9.73792f, 10.7802f)
        lineTo(13.3199f, 7.12313f)
        curveTo(14.7065f, 5.70754f, 15.3997f, 4.99974f, 16.2627f, 5f)
        curveTo(17.1256f, 5.00026f, 17.8185f, 5.70846f, 19.2042f, 7.12487f)
        lineTo(19.9473f, 7.8845f)
        curveTo(21.3159f, 9.28342f, 22.0002f, 9.98288f, 22f, 10.8501f)
        curveTo(21.9997f, 11.7173f, 21.315f, 12.4163f, 19.9456f, 13.8144f)
        lineTo(16.3239f, 17.5121f)
        moveTo(9.73792f, 10.7802f)
        lineTo(16.3239f, 17.5121f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 2f)
        lineTo(5.75792f, 2.69703f)
        curveTo(6.09613f, 3.61102f, 6.26524f, 4.06802f, 6.59861f, 4.40139f)
        curveTo(6.93198f, 4.73477f, 7.38898f, 4.90387f, 8.30297f, 5.24208f)
        lineTo(9f, 5.5f)
        lineTo(8.30297f, 5.75792f)
        curveTo(7.38898f, 6.09613f, 6.93198f, 6.26524f, 6.59861f, 6.59861f)
        curveTo(6.26524f, 6.93198f, 6.09613f, 7.38898f, 5.75792f, 8.30297f)
        lineTo(5.5f, 9f)
        lineTo(5.24208f, 8.30297f)
        curveTo(4.90387f, 7.38898f, 4.73476f, 6.93198f, 4.40139f, 6.59861f)
        curveTo(4.06802f, 6.26524f, 3.61102f, 6.09613f, 2.69703f, 5.75792f)
        lineTo(2f, 5.5f)
        lineTo(2.69703f, 5.24208f)
        curveTo(3.61102f, 4.90387f, 4.06802f, 4.73477f, 4.40139f, 4.40139f)
        curveTo(4.73477f, 4.06802f, 4.90387f, 3.61102f, 5.24208f, 2.69703f)
        lineTo(5.5f, 2f)
        }
        }.build()

        return _aiEraser!!
    }

private var _aiEraser: ImageVector? = null
