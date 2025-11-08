package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Camper: ImageVector
    get() {
        if (_camper != null) {
            return _camper!!
        }
        _camper = ImageVector.Builder(
            name = "Camper",
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
        moveTo(16f, 7f)
        horizontalLineTo(20.9383f)
        curveTo(21.4324f, 7f, 21.6794f, 7f, 21.8203f, 6.88531f)
        curveTo(21.9062f, 6.81539f, 21.9664f, 6.71959f, 21.9915f, 6.61269f)
        curveTo(22.0327f, 6.43736f, 21.9222f, 6.21984f, 21.7013f, 5.78486f)
        curveTo(21.1469f, 4.6935f, 20.8697f, 4.14783f, 20.438f, 3.76671f)
        curveTo(20.1688f, 3.529f, 19.8587f, 3.34036f, 19.5223f, 3.20962f)
        curveTo(18.9829f, 3f, 18.3631f, 3f, 17.1235f, 3f)
        horizontalLineTo(8.09555f)
        curveTo(5.22208f, 3f, 3.78535f, 3f, 2.89267f, 3.87868f)
        curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 19f)
        horizontalLineTo(15f)
        moveTo(19f, 19f)
        curveTo(20.6569f, 19f, 22f, 17.6569f, 22f, 16f)
        verticalLineTo(13f)
        horizontalLineTo(4f)
        curveTo(3.05719f, 13f, 2.58579f, 13f, 2.29289f, 13.2929f)
        curveTo(2f, 13.5858f, 2f, 14.0572f, 2f, 15f)
        verticalLineTo(16f)
        curveTo(2f, 17.4142f, 2f, 18.1213f, 2.43934f, 18.5607f)
        curveTo(2.87868f, 19f, 3.58579f, 19f, 5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        lineTo(8f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 13f)
        verticalLineTo(8.9657f)
        curveTo(14f, 8.25047f, 14f, 7.89285f, 14.123f, 7.62348f)
        curveTo(14.2146f, 7.42269f, 14.3522f, 7.25756f, 14.5196f, 7.14756f)
        curveTo(14.744f, 7f, 15.0421f, 7f, 15.6381f, 7f)
        curveTo(16.5393f, 7f, 16.9899f, 7f, 17.4041f, 7.14611f)
        curveTo(17.7159f, 7.25609f, 18.0108f, 7.42615f, 18.2772f, 7.64963f)
        curveTo(18.631f, 7.94652f, 18.9125f, 8.36875f, 19.4755f, 9.21321f)
        lineTo(22f, 13f)
        }
        }.build()

        return _camper!!
    }

private var _camper: ImageVector? = null
