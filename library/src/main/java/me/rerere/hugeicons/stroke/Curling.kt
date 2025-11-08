package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Curling: ImageVector
    get() {
        if (_curling != null) {
            return _curling!!
        }
        _curling = ImageVector.Builder(
            name = "Curling",
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
        moveTo(2f, 15f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00232f, 20f)
        horizontalLineTo(16.9977f)
        curveTo(18.8661f, 20f, 19.8002f, 20f, 20.4961f, 19.5981f)
        curveTo(22.162f, 18.6358f, 21.9954f, 16.6878f, 21.9954f, 15f)
        curveTo(21.9954f, 13.3122f, 22.162f, 11.3642f, 20.4961f, 10.4019f)
        curveTo(20.2312f, 10.2489f, 19.9318f, 10.1542f, 19.5594f, 10.0955f)
        curveTo(19.262f, 10.0486f, 19.1132f, 10.0251f, 19.0161f, 9.95468f)
        curveTo(18.9189f, 9.88421f, 18.8587f, 9.7663f, 18.7383f, 9.53049f)
        lineTo(17.6078f, 7.31672f)
        curveTo(16.189f, 4.57414f, 15.2278f, 4f, 12.0551f, 4f)
        horizontalLineTo(7.6144f)
        curveTo(7.02446f, 4f, 6.40472f, 4.00228f, 6.14112f, 4.61732f)
        curveTo(5.95569f, 5.04998f, 5.95569f, 5.95002f, 6.14112f, 6.38268f)
        curveTo(6.40472f, 6.99772f, 7.02446f, 7f, 7.6144f, 7f)
        horizontalLineTo(11.718f)
        curveTo(13.3971f, 7f, 13.7145f, 7.81197f, 13.774f, 8.9998f)
        verticalLineTo(8.99981f)
        curveTo(13.797f, 9.45941f, 13.8085f, 9.68921f, 13.6606f, 9.84461f)
        curveTo(13.5128f, 10f, 13.271f, 10f, 12.7874f, 10f)
        horizontalLineTo(7.00232f)
        curveTo(5.13395f, 10f, 4.19977f, 10f, 3.50394f, 10.4019f)
        curveTo(1.83797f, 11.3642f, 2.00463f, 13.3122f, 2.00463f, 15f)
        curveTo(2.00463f, 16.6878f, 1.83797f, 18.6358f, 3.50394f, 19.5981f)
        curveTo(4.19977f, 20f, 5.13395f, 20f, 7.00232f, 20f)
        }
        }.build()

        return _curling!!
    }

private var _curling: ImageVector? = null
