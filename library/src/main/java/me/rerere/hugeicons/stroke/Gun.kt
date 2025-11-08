package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gun: ImageVector
    get() {
        if (_gun != null) {
            return _gun!!
        }
        _gun = ImageVector.Builder(
            name = "Gun",
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
        moveTo(10.3882f, 10.5688f)
        lineTo(8.79732f, 17.2511f)
        curveTo(8.75319f, 17.4365f, 8.73112f, 17.5292f, 8.71527f, 17.6205f)
        curveTo(8.61639f, 18.1898f, 8.68403f, 18.7755f, 8.91005f, 19.3073f)
        curveTo(8.9463f, 19.3926f, 8.9889f, 19.4778f, 9.07412f, 19.6482f)
        curveTo(9.1303f, 19.7606f, 9.15839f, 19.8168f, 9.17103f, 19.8601f)
        curveTo(9.25397f, 20.1449f, 9.07232f, 20.4388f, 8.78058f, 20.4919f)
        curveTo(8.73614f, 20.5f, 8.67371f, 20.5f, 8.54885f, 20.5f)
        curveTo(7.40755f, 20.5f, 5.5236f, 20.5f, 4.52785f, 20.5f)
        curveTo(3.36423f, 20.5f, 2.78242f, 20.5f, 2.48609f, 20.1181f)
        curveTo(2.18976f, 19.7361f, 2.33087f, 19.1681f, 2.61309f, 18.032f)
        lineTo(3.96647f, 12.5841f)
        curveTo(4.22077f, 11.5604f, 3.45143f, 10.5688f, 2.40292f, 10.5688f)
        curveTo(2.18039f, 10.5688f, 2f, 10.3872f, 2f, 10.1633f)
        verticalLineTo(7.58942f)
        curveTo(2f, 5.12449f, 2.51119f, 4.61005f, 4.96053f, 4.61005f)
        horizontalLineTo(18.1677f)
        curveTo(18.7887f, 4.61005f, 19.257f, 4.46352f, 19.7632f, 4.1239f)
        curveTo(20.3544f, 3.72724f, 21.0829f, 3.00608f, 21.6191f, 4.00889f)
        curveTo(22.1576f, 5.0161f, 22.187f, 9.24315f, 21.3033f, 10.1325f)
        curveTo(20.8698f, 10.5688f, 20.172f, 10.5688f, 18.7764f, 10.5688f)
        horizontalLineTo(10.3882f)
        moveTo(10.3882f, 10.5688f)
        horizontalLineTo(8.90791f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 14.5f)
        horizontalLineTo(9.87689f)
        curveTo(10.8276f, 14.5f, 11.303f, 14.5f, 11.7196f, 14.4102f)
        curveTo(12.9146f, 14.1527f, 13.9263f, 13.3628f, 14.466f, 12.2659f)
        curveTo(14.6541f, 11.8835f, 14.7694f, 11.4224f, 15f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7.5f)
        horizontalLineTo(4.02786f)
        curveTo(5.23068f, 7.5f, 5.83209f, 7.5f, 6.31539f, 7.2013f)
        curveTo(6.7987f, 6.9026f, 7.06766f, 6.36469f, 7.60557f, 5.28885f)
        lineTo(8f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7.5f)
        lineTo(19f, 7.5f)
        }
        }.build()

        return _gun!!
    }

private var _gun: ImageVector? = null
