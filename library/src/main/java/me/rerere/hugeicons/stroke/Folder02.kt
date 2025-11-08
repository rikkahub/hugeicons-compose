package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Folder02: ImageVector
    get() {
        if (_folder02 != null) {
            return _folder02!!
        }
        _folder02 = ImageVector.Builder(
            name = "Folder02",
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
        moveTo(2f, 19f)
        verticalLineTo(7.54902f)
        curveTo(2f, 6.10516f, 2f, 5.38322f, 2.24332f, 4.81647f)
        curveTo(2.5467f, 4.10985f, 3.10985f, 3.5467f, 3.81647f, 3.24332f)
        curveTo(4.38322f, 3f, 5.09805f, 3f, 6.54902f, 3f)
        horizontalLineTo(7.04311f)
        curveTo(7.64819f, 3f, 8.22075f, 3.27394f, 8.60041f, 3.74509f)
        lineTo(10.4175f, 6f)
        moveTo(10.4175f, 6f)
        horizontalLineTo(16f)
        curveTo(17.4001f, 6f, 18.1002f, 6f, 18.635f, 6.27248f)
        curveTo(19.1054f, 6.51217f, 19.4878f, 6.89462f, 19.7275f, 7.36502f)
        curveTo(20f, 7.8998f, 20f, 8.59987f, 20f, 10f)
        verticalLineTo(11f)
        moveTo(10.4175f, 6f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.15802f, 15.5144f)
        lineTo(3.45643f, 14.7717f)
        curveTo(4.19029f, 12.9449f, 4.55723f, 12.0316f, 5.3224f, 11.5158f)
        curveTo(6.08757f, 11f, 7.07557f, 11f, 9.05157f, 11f)
        horizontalLineTo(17.1119f)
        curveTo(19.8004f, 11f, 21.1446f, 11f, 21.7422f, 11.8787f)
        curveTo(22.3397f, 12.7575f, 21.8405f, 14.0002f, 20.842f, 16.4856f)
        lineTo(20.5436f, 17.2283f)
        curveTo(19.8097f, 19.0551f, 19.4428f, 19.9684f, 18.6776f, 20.4842f)
        curveTo(17.9124f, 21f, 16.9244f, 21f, 14.9484f, 21f)
        horizontalLineTo(6.88812f)
        curveTo(4.19961f, 21f, 2.85535f, 21f, 2.25782f, 20.1213f)
        curveTo(1.66029f, 19.2425f, 2.15953f, 17.9998f, 3.15802f, 15.5144f)
        }
        }.build()

        return _folder02!!
    }

private var _folder02: ImageVector? = null
