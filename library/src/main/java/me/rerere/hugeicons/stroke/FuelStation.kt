package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FuelStation: ImageVector
    get() {
        if (_fuelStation != null) {
            return _fuelStation!!
        }
        _fuelStation = ImageVector.Builder(
            name = "FuelStation",
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
        moveTo(10.4626f, 13f)
        lineTo(9.06858f, 14.8124f)
        curveTo(8.91919f, 15.0066f, 9.02626f, 15.2861f, 9.26987f, 15.3378f)
        lineTo(10.7301f, 15.6477f)
        curveTo(10.9899f, 15.7028f, 11.0889f, 16.0122f, 10.9073f, 16.2011f)
        lineTo(9.17773f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 10f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 21f)
        lineTo(4f, 9f)
        curveTo(4f, 6.17157f, 4f, 4.75736f, 4.87868f, 3.87868f)
        curveTo(5.75736f, 3f, 7.17157f, 3f, 10f, 3f)
        curveTo(12.8284f, 3f, 14.2426f, 3f, 15.1213f, 3.87868f)
        curveTo(16f, 4.75736f, 16f, 6.17157f, 16f, 9f)
        lineTo(16f, 21f)
        horizontalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 14f)
        horizontalLineTo(17.6667f)
        curveTo(17.9767f, 14f, 18.1317f, 14f, 18.2588f, 14.0341f)
        curveTo(18.6039f, 14.1265f, 18.8735f, 14.3961f, 18.9659f, 14.7412f)
        curveTo(19f, 14.8683f, 19f, 15.0233f, 19f, 15.3333f)
        verticalLineTo(16.5f)
        curveTo(19f, 17.3284f, 19.6716f, 18f, 20.5f, 18f)
        curveTo(21.3284f, 18f, 22f, 17.3284f, 22f, 16.5f)
        verticalLineTo(10.2111f)
        curveTo(22f, 9.60998f, 22f, 9.30941f, 21.9142f, 9.02598f)
        curveTo(21.8284f, 8.74255f, 21.6616f, 8.49247f, 21.3282f, 7.9923f)
        lineTo(20.5547f, 6.83205f)
        curveTo(20.2082f, 6.31223f, 19.6247f, 6f, 19f, 6f)
        }
        }.build()

        return _fuelStation!!
    }

private var _fuelStation: ImageVector? = null
