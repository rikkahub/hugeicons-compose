package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapsSearch: ImageVector
    get() {
        if (_mapsSearch != null) {
            return _mapsSearch!!
        }
        _mapsSearch = ImageVector.Builder(
            name = "MapsSearch",
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
        moveTo(22f, 12.0889f)
        verticalLineTo(9.23578f)
        curveTo(22f, 7.29177f, 22f, 6.31978f, 21.4142f, 5.71584f)
        curveTo(20.8284f, 5.11192f, 19.8856f, 5.11192f, 18f, 5.11192f)
        horizontalLineTo(15.9214f)
        curveTo(15.004f, 5.11192f, 14.9964f, 5.11013f, 14.1715f, 4.69638f)
        lineTo(10.8399f, 3.0254f)
        curveTo(9.44884f, 2.32773f, 8.75332f, 1.97889f, 8.01238f, 2.00314f)
        curveTo(7.27143f, 2.02738f, 6.59877f, 2.42098f, 5.25345f, 3.20819f)
        lineTo(4.02558f, 3.92667f)
        curveTo(3.03739f, 4.5049f, 2.54329f, 4.79402f, 2.27164f, 5.27499f)
        curveTo(2f, 5.75596f, 2f, 6.34169f, 2f, 7.51313f)
        verticalLineTo(15.7487f)
        curveTo(2f, 17.2879f, 2f, 18.0575f, 2.34226f, 18.4859f)
        curveTo(2.57001f, 18.7708f, 2.88916f, 18.9625f, 3.242f, 19.026f)
        curveTo(3.77226f, 19.1214f, 4.42148f, 18.7416f, 5.71987f, 17.9817f)
        curveTo(6.60156f, 17.4659f, 7.45011f, 16.9301f, 8.50487f, 17.0754f)
        curveTo(9.38869f, 17.1971f, 10.21f, 17.756f, 11f, 18.1522f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2.00195f)
        verticalLineTo(17.0359f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5.00879f)
        verticalLineTo(11.0224f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.1069f, 20.1754f)
        lineTo(21.9521f, 21.9984f)
        moveTo(21.1691f, 17.6381f)
        curveTo(21.1691f, 19.6048f, 19.5752f, 21.1991f, 17.609f, 21.1991f)
        curveTo(15.6428f, 21.1991f, 14.0488f, 19.6048f, 14.0488f, 17.6381f)
        curveTo(14.0488f, 15.6714f, 15.6428f, 14.0771f, 17.609f, 14.0771f)
        curveTo(19.5752f, 14.0771f, 21.1691f, 15.6714f, 21.1691f, 17.6381f)
        }
        }.build()

        return _mapsSearch!!
    }

private var _mapsSearch: ImageVector? = null
