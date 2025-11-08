package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MilkCarton: ImageVector
    get() {
        if (_milkCarton != null) {
            return _milkCarton!!
        }
        _milkCarton = ImageVector.Builder(
            name = "MilkCarton",
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
        moveTo(5.17157f, 6.82843f)
        lineTo(7f, 5f)
        lineTo(8.82843f, 6.82843f)
        curveTo(9.40649f, 7.40649f, 9.69552f, 7.69552f, 9.84776f, 8.06306f)
        curveTo(10f, 8.4306f, 10f, 8.83935f, 10f, 9.65685f)
        verticalLineTo(22f)
        horizontalLineTo(8f)
        curveTo(6.11438f, 22f, 5.17157f, 22f, 4.58579f, 21.4142f)
        curveTo(4f, 20.8284f, 4f, 19.8856f, 4f, 18f)
        verticalLineTo(9.65685f)
        curveTo(4f, 8.83935f, 4f, 8.4306f, 4.15224f, 8.06306f)
        curveTo(4.30448f, 7.69552f, 4.59351f, 7.40649f, 5.17157f, 6.82843f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 5.00379f)
        verticalLineTo(4.60429f)
        curveTo(7f, 3.38019f, 7f, 2.76814f, 7.38076f, 2.38786f)
        curveTo(7.76152f, 2.00758f, 8.37435f, 2.00758f, 9.6f, 2.00758f)
        horizontalLineTo(15.1535f)
        curveTo(15.8599f, 2.00758f, 16.7765f, 1.89489f, 17.2487f, 2.53866f)
        curveTo(17.7502f, 3.22243f, 17.3216f, 4.1621f, 17.5388f, 4.91785f)
        curveTo(17.6049f, 5.14763f, 17.7681f, 5.32509f, 17.9184f, 5.50519f)
        lineTo(20f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        horizontalLineTo(20f)
        verticalLineTo(18f)
        curveTo(20f, 19.8856f, 20f, 20.8284f, 19.4142f, 21.4142f)
        curveTo(18.8284f, 22f, 17.8856f, 22f, 16f, 22f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 13f)
        curveTo(10.4762f, 13.5f, 11.7434f, 13.4761f, 12.4869f, 13.2789f)
        curveTo(13.0054f, 13.1415f, 13.564f, 13.3027f, 13.9154f, 13.7639f)
        lineTo(14.6025f, 14.6658f)
        curveTo(14.9978f, 15.1846f, 15.5969f, 15.4309f, 16.1871f, 15.3173f)
        lineTo(17.0567f, 15.1499f)
        curveTo(17.5352f, 15.0578f, 18.011f, 15.2904f, 18.3367f, 15.7055f)
        curveTo(19.3522f, 17f, 20f, 17f, 20f, 17f)
        }
        }.build()

        return _milkCarton!!
    }

private var _milkCarton: ImageVector? = null
